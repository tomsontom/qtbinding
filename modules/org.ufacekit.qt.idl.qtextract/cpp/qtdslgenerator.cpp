
#include <QFile>

#include "qtdslgenerator.h"
#include "codemarker.h"
#include "tree.h"
#include <iostream>

QT_BEGIN_NAMESPACE

static QString indentStr(int indent)
{
    QString str;
    str.fill(QLatin1Char(' '), indent * 4);
    return str;
}

static bool lessThanName(Node *node1, Node *node2)
{
    return node1->name() < node2->name();
}

QString QtDslGenerator::format()
{
    return QLatin1String("tom");
}

void QtDslGenerator::generateTree(const Tree *tree, CodeMarker *marker)
{
    //QFile outFile(QLatin1String("/tmp/tom-api"));
    //outFile.open(QIODevice::WriteOnly);
    //out.setDevice(&outFile);
    // generateNode(tree->root(), marker);

    if (tree->root()->isInnerNode()) {
        const InnerNode *inner = static_cast<const InnerNode *>(tree->root());
        NodeList nodes = inner->childNodes();
        qSort(nodes.begin(), nodes.end(), lessThanName);
        foreach (const Node *child, nodes)
            generateNode(child, marker);
    }
    //out.flush();
}

int QtDslGenerator::enumValueToInt(const EnumItem &item, const EnumNode *enume) {
    if( item.value().startsWith("0x") ) {
        return QString(item.value()).remove(0,2).toInt(0,16);
    } else if( item.value().size() > 0 && item.value().at(0).isDigit() ) {
        return item.value().toInt();
    } else if( item.value().size() > 0 ) {
        QStringList l = item.value().split("|");
        int value = 0;

        foreach ( const QString &n, l ) {
            if( n.contains("::") ) {
                //TODO Fixme
                return -1;
            } else {
                foreach (const EnumItem &subitem, enume->items()) {
                    if( subitem.name() == n.trimmed() ) {
                        value += enumValueToInt(subitem,enume);
                    }
                }
            }
        }

        return value;
    }

    return -1;
}

void QtDslGenerator::generateNodeContent(const Node *node, CodeMarker *marker, QTextStream & stream, int indent) {
    bool close;
    const EnumNode *enume;
    const PropertyNode * property;
    const FunctionNode *func;

    switch (node->type()) {
        case Node::Namespace:
            stream << indentStr(indent) << "namespace " << node->name() << " {" << "\n";
            close = true;
            ++indent;
            break;
        case Node::Class:
            stream << indentStr(indent) << "class " << node->name() << " {"<< "\n";
            close = true;
            ++indent;
            break;
        case Node::Enum:
            enume = static_cast<const EnumNode *>(node);
            stream << indentStr(indent) << "enumeration " << node->name() << " {" << "\n";

            foreach (const EnumItem &item, enume->items()) {
                int value = enumValueToInt(item,enume);
                stream << (value == -1 ? "//" : "") << indentStr(indent + 1) << item.name() << " = " << value << "\n";
            }

            stream << indentStr(indent) << "}\n\n";

            ++indent;

            break;
        case Node::Function:
        case Node::QmlSignal:
        case Node::QmlMethod:
            func = (const FunctionNode *) node;

            if (func->metaness() == FunctionNode::Signal) {

            } else if (func->metaness() == FunctionNode::Slot) {

            } else {
                if( func->access() == Node::Protected || func->access() == Node::Public ) {
                    stream << indentStr(indent);
                    if( func->access() == Node::Protected ) {
                        stream << "protected ";
                    } else {
                        stream << "public ";
                    }

                    if( func->isConst() ) {
                        stream << "const ";
                    }

                    if (func->virtualness() != FunctionNode::NonVirtual) {
                        if (func->virtualness() == FunctionNode::PureVirtual) {
                            stream << "purevirtual ";
                        } else {
                            stream << "virtual ";
                        }
                    }

                    if( func->isStatic() ) {
                        stream << "class ";
                    } else {
                        stream << "member ";
                    }

                    stream << "function ";

                    stream << func->name();
                    stream << "(";
                    stream << ") : ";

                    if( func->returnType().endsWith('*') ) {
                        stream << "pointer " << QString(func->returnType()).remove("*") << ";\n";
                    } else {
                        stream << func->returnType() << ";\n";
                    }
                }
            }


            /*{
            out << indentStr(indent) << "Function: "
                << plainCode(marker->markedUpSynopsis(node, 0, CodeMarker::Detailed)) << "\n";
            ++indent;
            }*/
            break;
        case Node::Property:
            property = static_cast<const PropertyNode *>(node);
            stream << indentStr(indent) << "property ";

            if( property->isConstant() ) {
                stream << "const ";
            }

            stream << property->qualifiedDataType() << " " << node->name() << ";\n";

            break;
     }

    if (node->isInnerNode()) {
        const InnerNode *inner = static_cast<const InnerNode *>(node);
        NodeList nodes = inner->childNodes();
        qSort(nodes.begin(), nodes.end(), lessThanName);

        QList<const Node *> namespaceNodes;
        QList<const Node *> classNodes;
        QList<const Node *> enumNodes;
        QList<const Node *> properties;
        QList<const Node *> publicMethods;
        QList<const Node *> protectedMethods;
        QList<const Node *> slotMethods;
        QList<const Node *> signalMethods;

        foreach (const Node *child, nodes) {
            if( child->type() == Node::Namespace ) {
                namespaceNodes.append(child);
            } else if( child->type() == Node::Class ) {
                classNodes.append(child);
            } else if( child->type() == Node::Enum ) {
                enumNodes.append(child);
            } else if( child->type() == Node::Property ) {
                properties.append(child);
            } else if( child->type() == Node::Function ) {
                const FunctionNode * func = (const FunctionNode *) child;
                if( func->isReimp() ) {
                    continue;
                }

                if( func->parent() && ( func->name() == func->parent()->name() || func->name() == QString("~").append( func->parent()->name() ) )) {

                } else {
                    if( func->metaness() == FunctionNode::Signal ) {
                        signalMethods.append(child);
                     } else if( func->metaness() == FunctionNode::Slot ) {
                        slotMethods.append(child);
                     } else {
                        if( func->access() == Node::Protected ) {
                            protectedMethods.append(child);
                        } else if( func->access() == Node::Public ) {
                            publicMethods.append(child);
                        }
                     }
                }
            }
        }

        foreach( const Node *child, namespaceNodes ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! namespaceNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, enumNodes ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! enumNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, classNodes ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! classNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, properties ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! properties.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, publicMethods ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! publicMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, protectedMethods ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! protectedMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, slotMethods ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! slotMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, signalMethods ) {
            generateNodeContent(child, marker,stream, indent);
        }

        if( ! signalMethods.isEmpty() ) {
            stream << "\n";
        }
    }

    if( close )
        stream << "\n" << indentStr(indent - 1) << "}\n\n";
}

void QtDslGenerator::generateNode(const Node *node, CodeMarker *marker)
{
    if (node->access() == Node::Private)
        return;

    std::cout << "Generating: " << node->name().toStdString() << std::endl;

    if( node->type() == Node::Namespace ) {
        QTextStream stream;
        QFile outfile( QString("/Users/tomschindl/qtbinding/modules/org.eclipse.ufacekit.qt.idl/src-auto/").append(node->name()).append(".qnamespace"));
        outfile.open(QIODevice::WriteOnly);
        stream.setDevice(&outfile);

        generateNodeContent(node,marker,stream);
        outfile.flush();
    } else if( node->type() == Node::Class )  {
        QTextStream stream;
        QFile outfile( QString("/Users/tomschindl/qtbinding/modules/org.eclipse.ufacekit.qt.idl/src-auto/").append(node->name()).append(".qclass"));
        outfile.open(QIODevice::WriteOnly);
        stream.setDevice(&outfile);

        generateNodeContent(node,marker,stream);
        outfile.flush();
    }

    /*
    switch (node->type()) {
    case Node::Namespace:
        if (!node->name().isEmpty()) {
            out << indentStr(indent) << "Namespace: " << node->name() << "\n";
            ++indent;
        }
        break;
    case Node::Class:
        {
            const ClassNode *classe = static_cast<const ClassNode *>(node);
            out << indentStr(indent) << "Class: " << node->name();
            foreach (const RelatedClass &baseClass, classe->baseClasses()) {
                if (baseClass.access == Node::Public)
                    out << " inherits " << baseClass.dataTypeWithTemplateArgs;
            }
            out << "\n";
            ++indent;
        }
        break;
    case Node::Enum:
        {
            const EnumNode *enume = static_cast<const EnumNode *>(node);
            out << indentStr(indent) << "Enum: " << node->name() << "\n";
            ++indent;

            QStringList enumNames;
            foreach (const EnumItem &item, enume->items())
                enumNames << item.name();
            qSort(enumNames);

            foreach (const QString &name, enumNames)
                out << indentStr(indent) << "Enum value: " << name << "\n";
        }
        break;
    case Node::Typedef:
        out << indentStr(indent) << "Typedef: " << node->name() << "\n";
        ++indent;
        break;
    case Node::Function:
        {
            out << indentStr(indent) << "Function: "
                << plainCode(marker->markedUpSynopsis(node, 0, CodeMarker::Detailed)) << "\n";
            ++indent;
        }
        break;
    case Node::Property:
        {
            const PropertyNode *property = static_cast<const PropertyNode *>(node);
            out << indentStr(indent) << "Property: " << property->name()
                << " type " << property->dataType() << "\n";
            ++indent;
        }
        break;
    default:
        ;
    }

    out.flush();*/
}

QT_END_NAMESPACE

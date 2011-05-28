
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
            generateNode(tree, child, marker);
    }
    //out.flush();
}

const QString QtDslGenerator::enumValueDslValue(const Tree *tree, const EnumItem &item, const EnumNode *enume) {
    if( item.value().trimmed().startsWith("0x") ) {
        return QString::number(QString(item.value().trimmed()).remove(0,2).toLong(0,16));
    } else if( item.value().size() > 0 && item.value().at(0).isDigit() ) {
        return item.value();
    } else if( item.value().size() > 0 ) {
        QStringList l = item.value().split("|");
        QString rv;

        foreach ( const QString &n, l ) {
            if( n.trimmed().startsWith("0x") ) {
                if( rv.size() > 0 ) {
                    rv.append(" | ");
                }
                rv.append(QString::number(QString(n.trimmed()).remove(0,2).toLong(0,16)));
            } else if( n.contains("::") ) {
                return qualifiedEnumValuePath(tree,n);
            } else {
                if( rv.size() > 0 ) {
                    rv.append(" | ");
                }
                rv.append(n);
            }
        }

        if( rv.size() > 0 ) {
            return rv;
        }

        return "__UNKNOWN__";
    }

    return "__UNKNOWN__";
}

const QString QtDslGenerator::qualifiedEnumValuePath(const Tree *tree, const QString cppValuePath) {
    foreach( QString s, cppValuePath.split("::") ) {

    }

    return "__UNKNOWN__";
}

const QString QtDslGenerator::typeConverter(QString type) {
    QString rv;
    type = type.trimmed();
    /*if( type.endsWith('*') ) {
        rv = QString("pointer " + type.remove("*").replace("::","."));
    } else if( type.endsWith('&') ) {
        rv = QString("reference " + type.remove("&").replace("::","."));
    } else {*/
        rv = QString(type.replace("::","."));
    //}

    if( rv.contains("const ") ) {
        rv = rv.replace("const ","");
        rv = rv.prepend("const ");
    }

    if( rv.contains(" const") ) {
        rv = rv.replace(" const","");
        rv = rv.prepend("const ");
    }

    //rv = rv.replace(QRegExp("\\s+")," ");
    rv = rv.trimmed();

    return rv;
}

void QtDslGenerator::generateNodeContent(const Tree *tree, const Node *node, CodeMarker *marker, QTextStream & stream, int indent) {
    bool close;
    const EnumNode *enume;
    const PropertyNode * property;
    const FunctionNode *func;
    const TypedefNode *typeDef;
    const ClassNode *classe;
    int i = 0;

    switch (node->type()) {
        case Node::Typedef:
            typeDef = static_cast<const TypedefNode *>(node);

            // std::cout << " => " << node->name().toStdString() << ":" << typeDef->isInnerNode() << std::endl;
            // std::cout << " => " << typeDef->location().toStdString() << std::endl;
            // std::cout << " => " << typeDef->pageType() << std::endl;
            stream << indentStr(indent) << "q_typedef " << node->name() << " : " << "___UNKNOWN___" << ";\n\n";
            break;
        case Node::Namespace:
            stream << indentStr(indent) << "q_namespace " << node->name() << " {" << "\n";
            close = true;
            ++indent;
            break;
        case Node::Class:
            classe = static_cast<const ClassNode *>(node);

            stream << indentStr(indent) << "q_class " << node->name();
            if( ! classe->baseClasses().isEmpty() ) {
                stream << " extends ";
            }

            // std::cout << " ==> " << classe->templateStuff().toStdString() << std::endl;

            foreach (const RelatedClass &baseClass, classe->baseClasses()) {
                if( i > 0 ) {
                    stream << ", ";
                }

                stream << baseClass.dataTypeWithTemplateArgs;

                i++;
            }

            stream << " {"<< "\n";
            close = true;
            ++indent;
            break;
        case Node::Enum:
            enume = static_cast<const EnumNode *>(node);

            stream << indentStr(indent) << "q_enumeration " << node->name() << " {" << "\n";

            foreach (const EnumItem &item, enume->items()) {
                QString value = enumValueDslValue(tree,item,enume);
                stream << (value == NULL ? "//" : "") << indentStr(indent + 1) << item.name() << " = " << value << "\n";
            }

            stream << indentStr(indent) << "}\n\n";

            if( enume->flagsType() ) {
                stream << indentStr(indent) << "q_flags " << enume->flagsType()->name() << " : " << node->name() << ";\n\n";
            }

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

                    if( func->isStatic() || func->parent()->type() == Node::Namespace ) {
                        stream << "class ";
                    } else {
                        stream << "member ";
                    }

                    stream << "q_function ";

                    stream << func->name();
                    stream << "(";

                    foreach( Parameter param, func->parameters() ) {
                        if( i > 0 ) {
                            stream << ", ";
                        }

                        stream << typeConverter(param.leftType()) << " " << param.name();
                        if( param.defaultValue() != NULL ) {
                            stream << " = " << typeConverter(param.defaultValue());
                        }

                        i++;
                    }

                    stream << ") : ";

                    stream << typeConverter(func->returnType()) << ";\n";

                    /*QString val(func->returnType().trimmed());
                    if( val.startsWith("const ") ) {
                        stream << "const ";
                        val = val.remove(0, QString("const ").size());
                        val = val.trimmed();
                    }



                    if( val.contains('*') ) {
                        stream << "pointer " << val.remove("*").replace("::",".") << ";\n";
                    } else if( func->returnType().trimmed().contains('&') ) {
                        stream << "reference " << val.remove("&").replace("::",".") << ";\n";
                    } else {
                        stream << val.replace("::",".") << ";\n";
                    }*/
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
            stream << indentStr(indent) << "q_property ";

            if( property->isConstant() ) {
                stream << "const ";
            }

            stream << typeConverter( property->qualifiedDataType() );

            /*if( property->qualifiedDataType().trimmed().contains('*') ) {
                stream << "pointer " << QString(property->qualifiedDataType().trimmed()).remove("*");
            } else if( property->qualifiedDataType().trimmed().contains('&') ) {
                stream << "pointer " << QString(property->qualifiedDataType().trimmed()).remove("&");
            } else {
                stream << QString(property->qualifiedDataType()).replace("::",".");
            }*/

            stream << " " << node->name() << ";\n";

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
        QList<const Node *> typeDefs;

        foreach (const Node *child, nodes) {
            if( child->type() == Node::Namespace ) {
                namespaceNodes.append(child);
            } else if( child->type() == Node::Class ) {
                classNodes.append(child);
            } else if( child->type() == Node::Typedef ) {
                const TypedefNode * typeDef = static_cast<const TypedefNode *>(child);
                if( ! typeDef->associatedEnum() ) {
                    typeDefs.append(child);
                    // std::cout << "Not Enum " << typeDef->name().toStdString() << std::endl;
                } else {
                    // std::cout << "Enum: " << typeDef->name().toStdString() << std::endl;
                }
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
                        if( ! child->name().startsWith("operator") ) {
                            if( func->access() == Node::Protected ) {
                                protectedMethods.append(child);
                            } else if( func->access() == Node::Public ) {
                                publicMethods.append(child);
                            }
                        }
                     }
                }
            }
        }

        foreach( const Node *child, namespaceNodes ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! namespaceNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, enumNodes ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! enumNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, typeDefs ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! typeDefs.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, classNodes ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! classNodes.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, properties ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! properties.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, publicMethods ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! publicMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, protectedMethods ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! protectedMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, slotMethods ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! slotMethods.isEmpty() ) {
            stream << "\n";
        }

        foreach( const Node *child, signalMethods ) {
            generateNodeContent(tree, child, marker,stream, indent);
        }

        if( ! signalMethods.isEmpty() ) {
            stream << "\n";
        }
    }

    if( close )
        stream << "\n" << indentStr(indent - 1) << "}\n\n";
}

void QtDslGenerator::generateNode(const Tree *tree, const Node *node, CodeMarker *marker)
{
    if (node->access() == Node::Private)
        return;

    // std::cout << "Generating: " << node->name().toStdString() << std::endl;

    if( node->type() == Node::Namespace ) {
        std::cout << "Working for " << node->moduleName().toStdString() <<  "::" << node->name().toStdString();
        QTextStream stream;
        QFile outfile( QString("/Users/tomschindl/model-qt/modules/org.ufacekit.qt.idl/src-gen/org/ufacekit/qt/idl/").append(node->moduleName().toLower()).append("/").append(node->name()).append(".qnamespace"));

        outfile.open(QIODevice::WriteOnly);
        stream.setDevice(&outfile);

        generateNodeContent(tree, node,marker,stream);
        outfile.flush();
        std::cout << "Done" << std::endl;
    } else if( node->type() == Node::Class )  {
        std::cout << "Working for " << node->moduleName().toStdString() <<  "::" << node->name().toStdString();
        QTextStream stream;
        QFile outfile( QString("/Users/tomschindl/model-qt/modules/org.ufacekit.qt.idl/src-gen/org/ufacekit/qt/idl/").append(node->moduleName().toLower()).append("/").append(node->name()).append(".qclass"));
        outfile.open(QIODevice::WriteOnly);
        stream.setDevice(&outfile);

        generateNodeContent(tree, node,marker,stream);
        outfile.flush();
        std::cout << " Done" << std::endl;
    } else if( node->type() == Node::Typedef ) {
        /*QTextStream stream;
        QFile outfile( QString("/Users/tomschindl/model-qt/modules/org.ufacekit.qt.idl/src-gen/org/ufacekit/qt/idl/").append(node->moduleName().toLower()).append("/").append(node->name()).append(".qtypedef"));
        outfile.open(QIODevice::WriteOnly);
        stream.setDevice(&outfile);

        generateNodeContent(tree, node,marker,stream);
        outfile.flush();*/
    } else if( node->type() == Node::Variable ) {
        // const FakeNode *inner = static_cast<const FakeNode *>(node);
        //std::cout << "Variable:" << node->name().toStdString() << std::endl;
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

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ufacekit.qt.idl.dsl.qIdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QIdlFactoryImpl extends EFactoryImpl implements QIdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QIdlFactory init()
  {
    try
    {
      QIdlFactory theQIdlFactory = (QIdlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ufacekit.org/qt/idl/dsl/QIdl"); 
      if (theQIdlFactory != null)
      {
        return theQIdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QIdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QIdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QIdlPackage.QT_IDL_TYP: return createQtIdlTyp();
      case QIdlPackage.QT_NAMESPACE: return createQtNamespace();
      case QIdlPackage.QT_TYPE: return createQtType();
      case QIdlPackage.QT_OPERATIONS: return createQtOperations();
      case QIdlPackage.QT_CLASS: return createQtClass();
      case QIdlPackage.QT_CONSTRUCTOR: return createQtConstructor();
      case QIdlPackage.QT_PROPERTY: return createQtProperty();
      case QIdlPackage.QT_ENUM: return createQtEnum();
      case QIdlPackage.QT_FLAGS: return createQtFlags();
      case QIdlPackage.QT_ENUM_VALUE: return createQtEnumValue();
      case QIdlPackage.QT_LITERAL_VALUE: return createQtLiteralValue();
      case QIdlPackage.QT_BUITIN_TYPE: return createQtBuitinType();
      case QIdlPackage.QT_FUNCTION: return createQtFunction();
      case QIdlPackage.QT_VALUE: return createQtValue();
      case QIdlPackage.QT_RETURN_VALUE: return createQtReturnValue();
      case QIdlPackage.QT_SIGNAL: return createQtSignal();
      case QIdlPackage.QT_SLOT: return createQtSlot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QIdlPackage.VIRTUALITY:
        return createVirtualityFromString(eDataType, initialValue);
      case QIdlPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      case QIdlPackage.OWNER:
        return createOwnerFromString(eDataType, initialValue);
      case QIdlPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QIdlPackage.VIRTUALITY:
        return convertVirtualityToString(eDataType, instanceValue);
      case QIdlPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      case QIdlPackage.OWNER:
        return convertOwnerToString(eDataType, instanceValue);
      case QIdlPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtIdlTyp createQtIdlTyp()
  {
    QtIdlTypImpl qtIdlTyp = new QtIdlTypImpl();
    return qtIdlTyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtNamespace createQtNamespace()
  {
    QtNamespaceImpl qtNamespace = new QtNamespaceImpl();
    return qtNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtType createQtType()
  {
    QtTypeImpl qtType = new QtTypeImpl();
    return qtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtOperations createQtOperations()
  {
    QtOperationsImpl qtOperations = new QtOperationsImpl();
    return qtOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtClass createQtClass()
  {
    QtClassImpl qtClass = new QtClassImpl();
    return qtClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtConstructor createQtConstructor()
  {
    QtConstructorImpl qtConstructor = new QtConstructorImpl();
    return qtConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtProperty createQtProperty()
  {
    QtPropertyImpl qtProperty = new QtPropertyImpl();
    return qtProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnum createQtEnum()
  {
    QtEnumImpl qtEnum = new QtEnumImpl();
    return qtEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtFlags createQtFlags()
  {
    QtFlagsImpl qtFlags = new QtFlagsImpl();
    return qtFlags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnumValue createQtEnumValue()
  {
    QtEnumValueImpl qtEnumValue = new QtEnumValueImpl();
    return qtEnumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtLiteralValue createQtLiteralValue()
  {
    QtLiteralValueImpl qtLiteralValue = new QtLiteralValueImpl();
    return qtLiteralValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtBuitinType createQtBuitinType()
  {
    QtBuitinTypeImpl qtBuitinType = new QtBuitinTypeImpl();
    return qtBuitinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtFunction createQtFunction()
  {
    QtFunctionImpl qtFunction = new QtFunctionImpl();
    return qtFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtValue createQtValue()
  {
    QtValueImpl qtValue = new QtValueImpl();
    return qtValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtReturnValue createQtReturnValue()
  {
    QtReturnValueImpl qtReturnValue = new QtReturnValueImpl();
    return qtReturnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtSignal createQtSignal()
  {
    QtSignalImpl qtSignal = new QtSignalImpl();
    return qtSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtSlot createQtSlot()
  {
    QtSlotImpl qtSlot = new QtSlotImpl();
    return qtSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virtuality createVirtualityFromString(EDataType eDataType, String initialValue)
  {
    Virtuality result = Virtuality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVirtualityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owner createOwnerFromString(EDataType eDataType, String initialValue)
  {
    Owner result = Owner.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOwnerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QIdlPackage getQIdlPackage()
  {
    return (QIdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QIdlPackage getPackage()
  {
    return QIdlPackage.eINSTANCE;
  }

} //QIdlFactoryImpl

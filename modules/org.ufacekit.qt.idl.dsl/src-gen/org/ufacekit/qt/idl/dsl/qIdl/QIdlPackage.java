/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlFactory
 * @model kind="package"
 * @generated
 */
public interface QIdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qIdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufacekit.org/qt/idl/dsl/QIdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qIdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QIdlPackage eINSTANCE = org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtIdlTypImpl <em>Qt Idl Typ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtIdlTypImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtIdlTyp()
   * @generated
   */
  int QT_IDL_TYP = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_IDL_TYP__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Qt Idl Typ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_IDL_TYP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl <em>Qt Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtNamespace()
   * @generated
   */
  int QT_NAMESPACE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__NAMESPACES = 1;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__ENUMS = 2;

  /**
   * The feature id for the '<em><b>Flags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__FLAGS = 3;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__CLASSES = 4;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE__OPERATIONS = 5;

  /**
   * The number of structural features of the '<em>Qt Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_NAMESPACE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeImpl <em>Qt Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtType()
   * @generated
   */
  int QT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Qt Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtOperationImpl <em>Qt Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtOperationImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtOperation()
   * @generated
   */
  int QT_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_OPERATION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_OPERATION__RETURN_VALUE = 2;

  /**
   * The number of structural features of the '<em>Qt Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_OPERATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl <em>Qt Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtClass()
   * @generated
   */
  int QT_CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__NAME = QT_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__SUPER_TYPES = QT_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__ENUMS = QT_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Flags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__FLAGS = QT_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__CLASSES = QT_TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__PROPERTIES = QT_TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__CONSTRUCTORS = QT_TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS__OPERATIONS = QT_TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Qt Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CLASS_FEATURE_COUNT = QT_TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtConstructorImpl <em>Qt Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtConstructorImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtConstructor()
   * @generated
   */
  int QT_CONSTRUCTOR = 5;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CONSTRUCTOR__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Qt Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_CONSTRUCTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtPropertyImpl <em>Qt Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtPropertyImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtProperty()
   * @generated
   */
  int QT_PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PROPERTY__TYPE = 0;

  /**
   * The number of structural features of the '<em>Qt Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumImpl <em>Qt Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnum()
   * @generated
   */
  int QT_ENUM = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM__NAME = QT_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM__VALUES = QT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qt Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_FEATURE_COUNT = QT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl <em>Qt Flags</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtFlags()
   * @generated
   */
  int QT_FLAGS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FLAGS__NAME = 0;

  /**
   * The feature id for the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FLAGS__ENUMERATION = 1;

  /**
   * The number of structural features of the '<em>Qt Flags</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FLAGS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl <em>Qt Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnumValue()
   * @generated
   */
  int QT_ENUM_VALUE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Enum Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE__ENUM_MASK = 1;

  /**
   * The feature id for the '<em><b>Numeric Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE__NUMERIC_VALUE = 2;

  /**
   * The number of structural features of the '<em>Qt Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl <em>Qt Enum Value Mask</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnumValueMask()
   * @generated
   */
  int QT_ENUM_VALUE_MASK = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE_MASK__VALUE = 0;

  /**
   * The number of structural features of the '<em>Qt Enum Value Mask</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_ENUM_VALUE_MASK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtBuitinTypeImpl <em>Qt Buitin Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtBuitinTypeImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtBuitinType()
   * @generated
   */
  int QT_BUITIN_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_BUITIN_TYPE__NAME = QT_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_BUITIN_TYPE__VALUE = QT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qt Buitin Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_BUITIN_TYPE_FEATURE_COUNT = QT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl <em>Qt Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtFunction()
   * @generated
   */
  int QT_FUNCTION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__NAME = QT_OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__PARAMS = QT_OPERATION__PARAMS;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__RETURN_VALUE = QT_OPERATION__RETURN_VALUE;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__VISIBILITY = QT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__CONST = QT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Virtual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__VIRTUAL = QT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION__OWNER = QT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Qt Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_FUNCTION_FEATURE_COUNT = QT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl <em>Qt Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtValue()
   * @generated
   */
  int QT_VALUE = 13;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_VALUE__CONST = 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_VALUE__VALUE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_VALUE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_VALUE__NAME = 3;

  /**
   * The number of structural features of the '<em>Qt Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl <em>Qt Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtParameter()
   * @generated
   */
  int QT_PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PARAMETER__VALUE = 0;

  /**
   * The feature id for the '<em><b>Default Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PARAMETER__DEFAULT_INT = 1;

  /**
   * The feature id for the '<em><b>Default Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PARAMETER__DEFAULT_ENUM = 2;

  /**
   * The number of structural features of the '<em>Qt Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl <em>Qt Return Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtReturnValue()
   * @generated
   */
  int QT_RETURN_VALUE = 15;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_RETURN_VALUE__CONST = 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_RETURN_VALUE__VALUE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_RETURN_VALUE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Qt Return Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_RETURN_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtSignalImpl <em>Qt Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtSignalImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtSignal()
   * @generated
   */
  int QT_SIGNAL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SIGNAL__NAME = QT_OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SIGNAL__PARAMS = QT_OPERATION__PARAMS;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SIGNAL__RETURN_VALUE = QT_OPERATION__RETURN_VALUE;

  /**
   * The number of structural features of the '<em>Qt Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SIGNAL_FEATURE_COUNT = QT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtSlotImpl <em>Qt Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtSlotImpl
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtSlot()
   * @generated
   */
  int QT_SLOT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SLOT__NAME = QT_OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SLOT__PARAMS = QT_OPERATION__PARAMS;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SLOT__RETURN_VALUE = QT_OPERATION__RETURN_VALUE;

  /**
   * The number of structural features of the '<em>Qt Slot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QT_SLOT_FEATURE_COUNT = QT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Virtuality <em>Virtuality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.Virtuality
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getVirtuality()
   * @generated
   */
  int VIRTUALITY = 18;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.Visibility
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 19;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Owner <em>Owner</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.Owner
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getOwner()
   * @generated
   */
  int OWNER = 20;

  /**
   * The meta object id for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ufacekit.qt.idl.dsl.qIdl.Type
   * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getType()
   * @generated
   */
  int TYPE = 21;


  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp <em>Qt Idl Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Idl Typ</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp
   * @generated
   */
  EClass getQtIdlTyp();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp#getElement()
   * @see #getQtIdlTyp()
   * @generated
   */
  EReference getQtIdlTyp_Element();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace <em>Qt Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Namespace</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace
   * @generated
   */
  EClass getQtNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getName()
   * @see #getQtNamespace()
   * @generated
   */
  EAttribute getQtNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getNamespaces()
   * @see #getQtNamespace()
   * @generated
   */
  EReference getQtNamespace_Namespaces();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getEnums()
   * @see #getQtNamespace()
   * @generated
   */
  EReference getQtNamespace_Enums();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flags</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getFlags()
   * @see #getQtNamespace()
   * @generated
   */
  EReference getQtNamespace_Flags();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getClasses()
   * @see #getQtNamespace()
   * @generated
   */
  EReference getQtNamespace_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getOperations()
   * @see #getQtNamespace()
   * @generated
   */
  EReference getQtNamespace_Operations();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtType <em>Qt Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtType
   * @generated
   */
  EClass getQtType();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtType#getName()
   * @see #getQtType()
   * @generated
   */
  EAttribute getQtType_Name();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperation <em>Qt Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Operation</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtOperation
   * @generated
   */
  EClass getQtOperation();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getName()
   * @see #getQtOperation()
   * @generated
   */
  EAttribute getQtOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getParams()
   * @see #getQtOperation()
   * @generated
   */
  EReference getQtOperation_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtOperation#getReturnValue()
   * @see #getQtOperation()
   * @generated
   */
  EReference getQtOperation_ReturnValue();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass <em>Qt Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Class</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass
   * @generated
   */
  EClass getQtClass();

  /**
   * Returns the meta object for the reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Types</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getSuperTypes()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getEnums()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Enums();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flags</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getFlags()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Flags();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getClasses()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getProperties()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getConstructors()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Constructors();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass#getOperations()
   * @see #getQtClass()
   * @generated
   */
  EReference getQtClass_Operations();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtConstructor <em>Qt Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Constructor</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtConstructor
   * @generated
   */
  EClass getQtConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtConstructor#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtConstructor#getParams()
   * @see #getQtConstructor()
   * @generated
   */
  EReference getQtConstructor_Params();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtProperty <em>Qt Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Property</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtProperty
   * @generated
   */
  EClass getQtProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtProperty#getType()
   * @see #getQtProperty()
   * @generated
   */
  EReference getQtProperty_Type();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnum <em>Qt Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Enum</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnum
   * @generated
   */
  EClass getQtEnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnum#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnum#getValues()
   * @see #getQtEnum()
   * @generated
   */
  EReference getQtEnum_Values();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags <em>Qt Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Flags</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFlags
   * @generated
   */
  EClass getQtFlags();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getName()
   * @see #getQtFlags()
   * @generated
   */
  EAttribute getQtFlags_Name();

  /**
   * Returns the meta object for the reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getEnumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enumeration</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getEnumeration()
   * @see #getQtFlags()
   * @generated
   */
  EReference getQtFlags_Enumeration();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue <em>Qt Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Enum Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue
   * @generated
   */
  EClass getQtEnumValue();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getName()
   * @see #getQtEnumValue()
   * @generated
   */
  EAttribute getQtEnumValue_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getEnumMask <em>Enum Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Mask</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getEnumMask()
   * @see #getQtEnumValue()
   * @generated
   */
  EReference getQtEnumValue_EnumMask();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getNumericValue <em>Numeric Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numeric Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getNumericValue()
   * @see #getQtEnumValue()
   * @generated
   */
  EAttribute getQtEnumValue_NumericValue();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask <em>Qt Enum Value Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Enum Value Mask</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask
   * @generated
   */
  EClass getQtEnumValueMask();

  /**
   * Returns the meta object for the reference list '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask#getValue()
   * @see #getQtEnumValueMask()
   * @generated
   */
  EReference getQtEnumValueMask_Value();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType <em>Qt Buitin Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Buitin Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType
   * @generated
   */
  EClass getQtBuitinType();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType#getValue()
   * @see #getQtBuitinType()
   * @generated
   */
  EReference getQtBuitinType_Value();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction <em>Qt Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Function</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction
   * @generated
   */
  EClass getQtFunction();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVisibility()
   * @see #getQtFunction()
   * @generated
   */
  EAttribute getQtFunction_Visibility();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getConst()
   * @see #getQtFunction()
   * @generated
   */
  EAttribute getQtFunction_Const();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVirtual <em>Virtual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Virtual</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVirtual()
   * @see #getQtFunction()
   * @generated
   */
  EAttribute getQtFunction_Virtual();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Owner</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getOwner()
   * @see #getQtFunction()
   * @generated
   */
  EAttribute getQtFunction_Owner();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue <em>Qt Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue
   * @generated
   */
  EClass getQtValue();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue#getConst()
   * @see #getQtValue()
   * @generated
   */
  EAttribute getQtValue_Const();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue#getValueType()
   * @see #getQtValue()
   * @generated
   */
  EAttribute getQtValue_ValueType();

  /**
   * Returns the meta object for the reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue#getType()
   * @see #getQtValue()
   * @generated
   */
  EReference getQtValue_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue#getName()
   * @see #getQtValue()
   * @generated
   */
  EAttribute getQtValue_Name();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter <em>Qt Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Parameter</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtParameter
   * @generated
   */
  EClass getQtParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getValue()
   * @see #getQtParameter()
   * @generated
   */
  EReference getQtParameter_Value();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultInt <em>Default Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Int</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultInt()
   * @see #getQtParameter()
   * @generated
   */
  EAttribute getQtParameter_DefaultInt();

  /**
   * Returns the meta object for the reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultEnum <em>Default Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Default Enum</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultEnum()
   * @see #getQtParameter()
   * @generated
   */
  EReference getQtParameter_DefaultEnum();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue <em>Qt Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Return Value</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue
   * @generated
   */
  EClass getQtReturnValue();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getConst()
   * @see #getQtReturnValue()
   * @generated
   */
  EAttribute getQtReturnValue_Const();

  /**
   * Returns the meta object for the attribute '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getValueType()
   * @see #getQtReturnValue()
   * @generated
   */
  EAttribute getQtReturnValue_ValueType();

  /**
   * Returns the meta object for the reference '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getType()
   * @see #getQtReturnValue()
   * @generated
   */
  EReference getQtReturnValue_Type();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtSignal <em>Qt Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Signal</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtSignal
   * @generated
   */
  EClass getQtSignal();

  /**
   * Returns the meta object for class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtSlot <em>Qt Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qt Slot</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtSlot
   * @generated
   */
  EClass getQtSlot();

  /**
   * Returns the meta object for enum '{@link org.ufacekit.qt.idl.dsl.qIdl.Virtuality <em>Virtuality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Virtuality</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Virtuality
   * @generated
   */
  EEnum getVirtuality();

  /**
   * Returns the meta object for enum '{@link org.ufacekit.qt.idl.dsl.qIdl.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the meta object for enum '{@link org.ufacekit.qt.idl.dsl.qIdl.Owner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Owner</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Owner
   * @generated
   */
  EEnum getOwner();

  /**
   * Returns the meta object for enum '{@link org.ufacekit.qt.idl.dsl.qIdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QIdlFactory getQIdlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtIdlTypImpl <em>Qt Idl Typ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtIdlTypImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtIdlTyp()
     * @generated
     */
    EClass QT_IDL_TYP = eINSTANCE.getQtIdlTyp();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_IDL_TYP__ELEMENT = eINSTANCE.getQtIdlTyp_Element();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl <em>Qt Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtNamespace()
     * @generated
     */
    EClass QT_NAMESPACE = eINSTANCE.getQtNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_NAMESPACE__NAME = eINSTANCE.getQtNamespace_Name();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_NAMESPACE__NAMESPACES = eINSTANCE.getQtNamespace_Namespaces();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_NAMESPACE__ENUMS = eINSTANCE.getQtNamespace_Enums();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_NAMESPACE__FLAGS = eINSTANCE.getQtNamespace_Flags();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_NAMESPACE__CLASSES = eINSTANCE.getQtNamespace_Classes();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_NAMESPACE__OPERATIONS = eINSTANCE.getQtNamespace_Operations();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeImpl <em>Qt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtType()
     * @generated
     */
    EClass QT_TYPE = eINSTANCE.getQtType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_TYPE__NAME = eINSTANCE.getQtType_Name();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtOperationImpl <em>Qt Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtOperationImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtOperation()
     * @generated
     */
    EClass QT_OPERATION = eINSTANCE.getQtOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_OPERATION__NAME = eINSTANCE.getQtOperation_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_OPERATION__PARAMS = eINSTANCE.getQtOperation_Params();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_OPERATION__RETURN_VALUE = eINSTANCE.getQtOperation_ReturnValue();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl <em>Qt Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtClass()
     * @generated
     */
    EClass QT_CLASS = eINSTANCE.getQtClass();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__SUPER_TYPES = eINSTANCE.getQtClass_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__ENUMS = eINSTANCE.getQtClass_Enums();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__FLAGS = eINSTANCE.getQtClass_Flags();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__CLASSES = eINSTANCE.getQtClass_Classes();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__PROPERTIES = eINSTANCE.getQtClass_Properties();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__CONSTRUCTORS = eINSTANCE.getQtClass_Constructors();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CLASS__OPERATIONS = eINSTANCE.getQtClass_Operations();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtConstructorImpl <em>Qt Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtConstructorImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtConstructor()
     * @generated
     */
    EClass QT_CONSTRUCTOR = eINSTANCE.getQtConstructor();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_CONSTRUCTOR__PARAMS = eINSTANCE.getQtConstructor_Params();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtPropertyImpl <em>Qt Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtPropertyImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtProperty()
     * @generated
     */
    EClass QT_PROPERTY = eINSTANCE.getQtProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_PROPERTY__TYPE = eINSTANCE.getQtProperty_Type();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumImpl <em>Qt Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnum()
     * @generated
     */
    EClass QT_ENUM = eINSTANCE.getQtEnum();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_ENUM__VALUES = eINSTANCE.getQtEnum_Values();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl <em>Qt Flags</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtFlags()
     * @generated
     */
    EClass QT_FLAGS = eINSTANCE.getQtFlags();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_FLAGS__NAME = eINSTANCE.getQtFlags_Name();

    /**
     * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_FLAGS__ENUMERATION = eINSTANCE.getQtFlags_Enumeration();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl <em>Qt Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnumValue()
     * @generated
     */
    EClass QT_ENUM_VALUE = eINSTANCE.getQtEnumValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_ENUM_VALUE__NAME = eINSTANCE.getQtEnumValue_Name();

    /**
     * The meta object literal for the '<em><b>Enum Mask</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_ENUM_VALUE__ENUM_MASK = eINSTANCE.getQtEnumValue_EnumMask();

    /**
     * The meta object literal for the '<em><b>Numeric Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_ENUM_VALUE__NUMERIC_VALUE = eINSTANCE.getQtEnumValue_NumericValue();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl <em>Qt Enum Value Mask</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtEnumValueMask()
     * @generated
     */
    EClass QT_ENUM_VALUE_MASK = eINSTANCE.getQtEnumValueMask();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_ENUM_VALUE_MASK__VALUE = eINSTANCE.getQtEnumValueMask_Value();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtBuitinTypeImpl <em>Qt Buitin Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtBuitinTypeImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtBuitinType()
     * @generated
     */
    EClass QT_BUITIN_TYPE = eINSTANCE.getQtBuitinType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_BUITIN_TYPE__VALUE = eINSTANCE.getQtBuitinType_Value();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl <em>Qt Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtFunction()
     * @generated
     */
    EClass QT_FUNCTION = eINSTANCE.getQtFunction();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_FUNCTION__VISIBILITY = eINSTANCE.getQtFunction_Visibility();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_FUNCTION__CONST = eINSTANCE.getQtFunction_Const();

    /**
     * The meta object literal for the '<em><b>Virtual</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_FUNCTION__VIRTUAL = eINSTANCE.getQtFunction_Virtual();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_FUNCTION__OWNER = eINSTANCE.getQtFunction_Owner();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl <em>Qt Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtValue()
     * @generated
     */
    EClass QT_VALUE = eINSTANCE.getQtValue();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_VALUE__CONST = eINSTANCE.getQtValue_Const();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_VALUE__VALUE_TYPE = eINSTANCE.getQtValue_ValueType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_VALUE__TYPE = eINSTANCE.getQtValue_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_VALUE__NAME = eINSTANCE.getQtValue_Name();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl <em>Qt Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtParameter()
     * @generated
     */
    EClass QT_PARAMETER = eINSTANCE.getQtParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_PARAMETER__VALUE = eINSTANCE.getQtParameter_Value();

    /**
     * The meta object literal for the '<em><b>Default Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_PARAMETER__DEFAULT_INT = eINSTANCE.getQtParameter_DefaultInt();

    /**
     * The meta object literal for the '<em><b>Default Enum</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_PARAMETER__DEFAULT_ENUM = eINSTANCE.getQtParameter_DefaultEnum();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl <em>Qt Return Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtReturnValue()
     * @generated
     */
    EClass QT_RETURN_VALUE = eINSTANCE.getQtReturnValue();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_RETURN_VALUE__CONST = eINSTANCE.getQtReturnValue_Const();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QT_RETURN_VALUE__VALUE_TYPE = eINSTANCE.getQtReturnValue_ValueType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QT_RETURN_VALUE__TYPE = eINSTANCE.getQtReturnValue_Type();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtSignalImpl <em>Qt Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtSignalImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtSignal()
     * @generated
     */
    EClass QT_SIGNAL = eINSTANCE.getQtSignal();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtSlotImpl <em>Qt Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QtSlotImpl
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getQtSlot()
     * @generated
     */
    EClass QT_SLOT = eINSTANCE.getQtSlot();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Virtuality <em>Virtuality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.Virtuality
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getVirtuality()
     * @generated
     */
    EEnum VIRTUALITY = eINSTANCE.getVirtuality();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.Visibility
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Owner <em>Owner</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.Owner
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getOwner()
     * @generated
     */
    EEnum OWNER = eINSTANCE.getOwner();

    /**
     * The meta object literal for the '{@link org.ufacekit.qt.idl.dsl.qIdl.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ufacekit.qt.idl.dsl.qIdl.Type
     * @see org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //QIdlPackage

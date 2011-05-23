/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.ufacekit.qt.idl.dsl.qIdl.Owner;
import org.ufacekit.qt.idl.dsl.qIdl.QIdlFactory;
import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType;
import org.ufacekit.qt.idl.dsl.qIdl.QtClass;
import org.ufacekit.qt.idl.dsl.qIdl.QtConstructor;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnum;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask;
import org.ufacekit.qt.idl.dsl.qIdl.QtFlags;
import org.ufacekit.qt.idl.dsl.qIdl.QtFunction;
import org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp;
import org.ufacekit.qt.idl.dsl.qIdl.QtNamespace;
import org.ufacekit.qt.idl.dsl.qIdl.QtOperation;
import org.ufacekit.qt.idl.dsl.qIdl.QtParameter;
import org.ufacekit.qt.idl.dsl.qIdl.QtProperty;
import org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue;
import org.ufacekit.qt.idl.dsl.qIdl.QtSignal;
import org.ufacekit.qt.idl.dsl.qIdl.QtSlot;
import org.ufacekit.qt.idl.dsl.qIdl.QtType;
import org.ufacekit.qt.idl.dsl.qIdl.QtValue;
import org.ufacekit.qt.idl.dsl.qIdl.Type;
import org.ufacekit.qt.idl.dsl.qIdl.Virtuality;
import org.ufacekit.qt.idl.dsl.qIdl.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QIdlPackageImpl extends EPackageImpl implements QIdlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtIdlTypEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtNamespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtConstructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtFlagsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtEnumValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtEnumValueMaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtBuitinTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtReturnValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtSignalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qtSlotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum virtualityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ownerEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QIdlPackageImpl()
  {
    super(eNS_URI, QIdlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QIdlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QIdlPackage init()
  {
    if (isInited) return (QIdlPackage)EPackage.Registry.INSTANCE.getEPackage(QIdlPackage.eNS_URI);

    // Obtain or create and register package
    QIdlPackageImpl theQIdlPackage = (QIdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QIdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QIdlPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XtypePackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theQIdlPackage.createPackageContents();

    // Initialize created meta-data
    theQIdlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQIdlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QIdlPackage.eNS_URI, theQIdlPackage);
    return theQIdlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtIdlTyp()
  {
    return qtIdlTypEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtIdlTyp_Element()
  {
    return (EReference)qtIdlTypEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtNamespace()
  {
    return qtNamespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtNamespace_Name()
  {
    return (EAttribute)qtNamespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtNamespace_Namespaces()
  {
    return (EReference)qtNamespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtNamespace_Enums()
  {
    return (EReference)qtNamespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtNamespace_Flags()
  {
    return (EReference)qtNamespaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtNamespace_Classes()
  {
    return (EReference)qtNamespaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtNamespace_Operations()
  {
    return (EReference)qtNamespaceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtType()
  {
    return qtTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtType_Name()
  {
    return (EAttribute)qtTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtOperation()
  {
    return qtOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtOperation_Name()
  {
    return (EAttribute)qtOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtOperation_Params()
  {
    return (EReference)qtOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtOperation_ReturnValue()
  {
    return (EReference)qtOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtClass()
  {
    return qtClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_SuperTypes()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Enums()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Flags()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Classes()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Properties()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Constructors()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtClass_Operations()
  {
    return (EReference)qtClassEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtConstructor()
  {
    return qtConstructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtConstructor_Params()
  {
    return (EReference)qtConstructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtProperty()
  {
    return qtPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtProperty_Type()
  {
    return (EReference)qtPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtEnum()
  {
    return qtEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtEnum_Values()
  {
    return (EReference)qtEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtFlags()
  {
    return qtFlagsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtFlags_Name()
  {
    return (EAttribute)qtFlagsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtFlags_Enumeration()
  {
    return (EReference)qtFlagsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtEnumValue()
  {
    return qtEnumValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtEnumValue_Name()
  {
    return (EAttribute)qtEnumValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtEnumValue_EnumMask()
  {
    return (EReference)qtEnumValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtEnumValue_NumericValue()
  {
    return (EAttribute)qtEnumValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtEnumValueMask()
  {
    return qtEnumValueMaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtEnumValueMask_Value()
  {
    return (EReference)qtEnumValueMaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtBuitinType()
  {
    return qtBuitinTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtBuitinType_Value()
  {
    return (EReference)qtBuitinTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtFunction()
  {
    return qtFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtFunction_Visibility()
  {
    return (EAttribute)qtFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtFunction_Const()
  {
    return (EAttribute)qtFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtFunction_Virtual()
  {
    return (EAttribute)qtFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtFunction_Owner()
  {
    return (EAttribute)qtFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtValue()
  {
    return qtValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtValue_Const()
  {
    return (EAttribute)qtValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtValue_ValueType()
  {
    return (EAttribute)qtValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtValue_Type()
  {
    return (EReference)qtValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtValue_Name()
  {
    return (EAttribute)qtValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtParameter()
  {
    return qtParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtParameter_Value()
  {
    return (EReference)qtParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtParameter_DefaultInt()
  {
    return (EAttribute)qtParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtParameter_DefaultEnum()
  {
    return (EReference)qtParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtReturnValue()
  {
    return qtReturnValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtReturnValue_Const()
  {
    return (EAttribute)qtReturnValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQtReturnValue_ValueType()
  {
    return (EAttribute)qtReturnValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQtReturnValue_Type()
  {
    return (EReference)qtReturnValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtSignal()
  {
    return qtSignalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQtSlot()
  {
    return qtSlotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVirtuality()
  {
    return virtualityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOwner()
  {
    return ownerEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QIdlFactory getQIdlFactory()
  {
    return (QIdlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    qtIdlTypEClass = createEClass(QT_IDL_TYP);
    createEReference(qtIdlTypEClass, QT_IDL_TYP__ELEMENT);

    qtNamespaceEClass = createEClass(QT_NAMESPACE);
    createEAttribute(qtNamespaceEClass, QT_NAMESPACE__NAME);
    createEReference(qtNamespaceEClass, QT_NAMESPACE__NAMESPACES);
    createEReference(qtNamespaceEClass, QT_NAMESPACE__ENUMS);
    createEReference(qtNamespaceEClass, QT_NAMESPACE__FLAGS);
    createEReference(qtNamespaceEClass, QT_NAMESPACE__CLASSES);
    createEReference(qtNamespaceEClass, QT_NAMESPACE__OPERATIONS);

    qtTypeEClass = createEClass(QT_TYPE);
    createEAttribute(qtTypeEClass, QT_TYPE__NAME);

    qtOperationEClass = createEClass(QT_OPERATION);
    createEAttribute(qtOperationEClass, QT_OPERATION__NAME);
    createEReference(qtOperationEClass, QT_OPERATION__PARAMS);
    createEReference(qtOperationEClass, QT_OPERATION__RETURN_VALUE);

    qtClassEClass = createEClass(QT_CLASS);
    createEReference(qtClassEClass, QT_CLASS__SUPER_TYPES);
    createEReference(qtClassEClass, QT_CLASS__ENUMS);
    createEReference(qtClassEClass, QT_CLASS__FLAGS);
    createEReference(qtClassEClass, QT_CLASS__CLASSES);
    createEReference(qtClassEClass, QT_CLASS__PROPERTIES);
    createEReference(qtClassEClass, QT_CLASS__CONSTRUCTORS);
    createEReference(qtClassEClass, QT_CLASS__OPERATIONS);

    qtConstructorEClass = createEClass(QT_CONSTRUCTOR);
    createEReference(qtConstructorEClass, QT_CONSTRUCTOR__PARAMS);

    qtPropertyEClass = createEClass(QT_PROPERTY);
    createEReference(qtPropertyEClass, QT_PROPERTY__TYPE);

    qtEnumEClass = createEClass(QT_ENUM);
    createEReference(qtEnumEClass, QT_ENUM__VALUES);

    qtFlagsEClass = createEClass(QT_FLAGS);
    createEAttribute(qtFlagsEClass, QT_FLAGS__NAME);
    createEReference(qtFlagsEClass, QT_FLAGS__ENUMERATION);

    qtEnumValueEClass = createEClass(QT_ENUM_VALUE);
    createEAttribute(qtEnumValueEClass, QT_ENUM_VALUE__NAME);
    createEReference(qtEnumValueEClass, QT_ENUM_VALUE__ENUM_MASK);
    createEAttribute(qtEnumValueEClass, QT_ENUM_VALUE__NUMERIC_VALUE);

    qtEnumValueMaskEClass = createEClass(QT_ENUM_VALUE_MASK);
    createEReference(qtEnumValueMaskEClass, QT_ENUM_VALUE_MASK__VALUE);

    qtBuitinTypeEClass = createEClass(QT_BUITIN_TYPE);
    createEReference(qtBuitinTypeEClass, QT_BUITIN_TYPE__VALUE);

    qtFunctionEClass = createEClass(QT_FUNCTION);
    createEAttribute(qtFunctionEClass, QT_FUNCTION__VISIBILITY);
    createEAttribute(qtFunctionEClass, QT_FUNCTION__CONST);
    createEAttribute(qtFunctionEClass, QT_FUNCTION__VIRTUAL);
    createEAttribute(qtFunctionEClass, QT_FUNCTION__OWNER);

    qtValueEClass = createEClass(QT_VALUE);
    createEAttribute(qtValueEClass, QT_VALUE__CONST);
    createEAttribute(qtValueEClass, QT_VALUE__VALUE_TYPE);
    createEReference(qtValueEClass, QT_VALUE__TYPE);
    createEAttribute(qtValueEClass, QT_VALUE__NAME);

    qtParameterEClass = createEClass(QT_PARAMETER);
    createEReference(qtParameterEClass, QT_PARAMETER__VALUE);
    createEAttribute(qtParameterEClass, QT_PARAMETER__DEFAULT_INT);
    createEReference(qtParameterEClass, QT_PARAMETER__DEFAULT_ENUM);

    qtReturnValueEClass = createEClass(QT_RETURN_VALUE);
    createEAttribute(qtReturnValueEClass, QT_RETURN_VALUE__CONST);
    createEAttribute(qtReturnValueEClass, QT_RETURN_VALUE__VALUE_TYPE);
    createEReference(qtReturnValueEClass, QT_RETURN_VALUE__TYPE);

    qtSignalEClass = createEClass(QT_SIGNAL);

    qtSlotEClass = createEClass(QT_SLOT);

    // Create enums
    virtualityEEnum = createEEnum(VIRTUALITY);
    visibilityEEnum = createEEnum(VISIBILITY);
    ownerEEnum = createEEnum(OWNER);
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    qtClassEClass.getESuperTypes().add(this.getQtType());
    qtEnumEClass.getESuperTypes().add(this.getQtType());
    qtBuitinTypeEClass.getESuperTypes().add(this.getQtType());
    qtFunctionEClass.getESuperTypes().add(this.getQtOperation());
    qtSignalEClass.getESuperTypes().add(this.getQtOperation());
    qtSlotEClass.getESuperTypes().add(this.getQtOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(qtIdlTypEClass, QtIdlTyp.class, "QtIdlTyp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtIdlTyp_Element(), ecorePackage.getEObject(), null, "element", null, 0, 1, QtIdlTyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtNamespaceEClass, QtNamespace.class, "QtNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtNamespace_Namespaces(), this.getQtNamespace(), null, "namespaces", null, 0, -1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtNamespace_Enums(), this.getQtEnum(), null, "enums", null, 0, -1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtNamespace_Flags(), this.getQtFlags(), null, "flags", null, 0, -1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtNamespace_Classes(), this.getQtClass(), null, "classes", null, 0, -1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtNamespace_Operations(), this.getQtOperation(), null, "operations", null, 0, -1, QtNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtTypeEClass, QtType.class, "QtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtType_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtOperationEClass, QtOperation.class, "QtOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtOperation_Params(), this.getQtParameter(), null, "params", null, 0, -1, QtOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtOperation_ReturnValue(), this.getQtReturnValue(), null, "returnValue", null, 0, 1, QtOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtClassEClass, QtClass.class, "QtClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtClass_SuperTypes(), this.getQtClass(), null, "superTypes", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Enums(), this.getQtEnum(), null, "enums", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Flags(), this.getQtFlags(), null, "flags", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Classes(), this.getQtClass(), null, "classes", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Properties(), this.getQtProperty(), null, "properties", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Constructors(), this.getQtConstructor(), null, "constructors", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtClass_Operations(), this.getQtOperation(), null, "operations", null, 0, -1, QtClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtConstructorEClass, QtConstructor.class, "QtConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtConstructor_Params(), this.getQtParameter(), null, "params", null, 0, -1, QtConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtPropertyEClass, QtProperty.class, "QtProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtProperty_Type(), this.getQtValue(), null, "type", null, 0, 1, QtProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtEnumEClass, QtEnum.class, "QtEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtEnum_Values(), this.getQtEnumValue(), null, "values", null, 0, -1, QtEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtFlagsEClass, QtFlags.class, "QtFlags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtFlags_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtFlags_Enumeration(), this.getQtEnum(), null, "enumeration", null, 0, 1, QtFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtEnumValueEClass, QtEnumValue.class, "QtEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtEnumValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtEnumValue_EnumMask(), this.getQtEnumValueMask(), null, "enumMask", null, 0, 1, QtEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtEnumValue_NumericValue(), ecorePackage.getEInt(), "numericValue", null, 0, 1, QtEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtEnumValueMaskEClass, QtEnumValueMask.class, "QtEnumValueMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtEnumValueMask_Value(), this.getQtEnumValue(), null, "value", null, 0, -1, QtEnumValueMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtBuitinTypeEClass, QtBuitinType.class, "QtBuitinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtBuitinType_Value(), theTypesPackage.getJvmTypeReference(), null, "value", null, 0, 1, QtBuitinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtFunctionEClass, QtFunction.class, "QtFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtFunction_Visibility(), this.getVisibility(), "visibility", null, 0, 1, QtFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtFunction_Const(), ecorePackage.getEString(), "const", null, 0, 1, QtFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtFunction_Virtual(), this.getVirtuality(), "virtual", null, 0, 1, QtFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtFunction_Owner(), this.getOwner(), "owner", null, 0, 1, QtFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtValueEClass, QtValue.class, "QtValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtValue_Const(), ecorePackage.getEString(), "const", null, 0, 1, QtValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtValue_ValueType(), this.getType(), "valueType", null, 0, 1, QtValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtValue_Type(), this.getQtType(), null, "type", null, 0, 1, QtValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, QtValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtParameterEClass, QtParameter.class, "QtParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQtParameter_Value(), this.getQtValue(), null, "value", null, 0, 1, QtParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtParameter_DefaultInt(), ecorePackage.getEInt(), "defaultInt", null, 0, 1, QtParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtParameter_DefaultEnum(), this.getQtEnumValue(), null, "defaultEnum", null, 0, 1, QtParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtReturnValueEClass, QtReturnValue.class, "QtReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQtReturnValue_Const(), ecorePackage.getEString(), "const", null, 0, 1, QtReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQtReturnValue_ValueType(), this.getType(), "valueType", null, 0, 1, QtReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQtReturnValue_Type(), this.getQtType(), null, "type", null, 0, 1, QtReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qtSignalEClass, QtSignal.class, "QtSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qtSlotEClass, QtSlot.class, "QtSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(virtualityEEnum, Virtuality.class, "Virtuality");
    addEEnumLiteral(virtualityEEnum, Virtuality.VIRTUAL);
    addEEnumLiteral(virtualityEEnum, Virtuality.PUREVIRTUAL);

    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);

    initEEnum(ownerEEnum, Owner.class, "Owner");
    addEEnumLiteral(ownerEEnum, Owner.MEMBER);
    addEEnumLiteral(ownerEEnum, Owner.CLASS);

    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.POINTER);
    addEEnumLiteral(typeEEnum, Type.REFERENCE);

    // Create resource
    createResource(eNS_URI);
  }

} //QIdlPackageImpl

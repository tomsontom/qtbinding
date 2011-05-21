/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtClass;
import org.ufacekit.qt.idl.dsl.qIdl.QtConstructor;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnum;
import org.ufacekit.qt.idl.dsl.qIdl.QtFlags;
import org.ufacekit.qt.idl.dsl.qIdl.QtOperations;
import org.ufacekit.qt.idl.dsl.qIdl.QtProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtClassImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtClassImpl extends QtTypeImpl implements QtClass
{
  /**
   * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<QtClass> superTypes;

  /**
   * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnums()
   * @generated
   * @ordered
   */
  protected EList<QtEnum> enums;

  /**
   * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected EList<QtFlags> flags;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<QtClass> classes;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<QtProperty> properties;

  /**
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<QtConstructor> constructors;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<QtOperations> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QIdlPackage.Literals.QT_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtClass> getSuperTypes()
  {
    if (superTypes == null)
    {
      superTypes = new EObjectResolvingEList<QtClass>(QtClass.class, this, QIdlPackage.QT_CLASS__SUPER_TYPES);
    }
    return superTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtEnum> getEnums()
  {
    if (enums == null)
    {
      enums = new EObjectContainmentEList<QtEnum>(QtEnum.class, this, QIdlPackage.QT_CLASS__ENUMS);
    }
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtFlags> getFlags()
  {
    if (flags == null)
    {
      flags = new EObjectContainmentEList<QtFlags>(QtFlags.class, this, QIdlPackage.QT_CLASS__FLAGS);
    }
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtClass> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<QtClass>(QtClass.class, this, QIdlPackage.QT_CLASS__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<QtProperty>(QtProperty.class, this, QIdlPackage.QT_CLASS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtConstructor> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<QtConstructor>(QtConstructor.class, this, QIdlPackage.QT_CLASS__CONSTRUCTORS);
    }
    return constructors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtOperations> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<QtOperations>(QtOperations.class, this, QIdlPackage.QT_CLASS__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_CLASS__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_CLASS__FLAGS:
        return ((InternalEList<?>)getFlags()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_CLASS__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_CLASS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_CLASS__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_CLASS__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_CLASS__SUPER_TYPES:
        return getSuperTypes();
      case QIdlPackage.QT_CLASS__ENUMS:
        return getEnums();
      case QIdlPackage.QT_CLASS__FLAGS:
        return getFlags();
      case QIdlPackage.QT_CLASS__CLASSES:
        return getClasses();
      case QIdlPackage.QT_CLASS__PROPERTIES:
        return getProperties();
      case QIdlPackage.QT_CLASS__CONSTRUCTORS:
        return getConstructors();
      case QIdlPackage.QT_CLASS__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_CLASS__SUPER_TYPES:
        getSuperTypes().clear();
        getSuperTypes().addAll((Collection<? extends QtClass>)newValue);
        return;
      case QIdlPackage.QT_CLASS__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends QtEnum>)newValue);
        return;
      case QIdlPackage.QT_CLASS__FLAGS:
        getFlags().clear();
        getFlags().addAll((Collection<? extends QtFlags>)newValue);
        return;
      case QIdlPackage.QT_CLASS__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends QtClass>)newValue);
        return;
      case QIdlPackage.QT_CLASS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends QtProperty>)newValue);
        return;
      case QIdlPackage.QT_CLASS__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends QtConstructor>)newValue);
        return;
      case QIdlPackage.QT_CLASS__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends QtOperations>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_CLASS__SUPER_TYPES:
        getSuperTypes().clear();
        return;
      case QIdlPackage.QT_CLASS__ENUMS:
        getEnums().clear();
        return;
      case QIdlPackage.QT_CLASS__FLAGS:
        getFlags().clear();
        return;
      case QIdlPackage.QT_CLASS__CLASSES:
        getClasses().clear();
        return;
      case QIdlPackage.QT_CLASS__PROPERTIES:
        getProperties().clear();
        return;
      case QIdlPackage.QT_CLASS__CONSTRUCTORS:
        getConstructors().clear();
        return;
      case QIdlPackage.QT_CLASS__OPERATIONS:
        getOperations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_CLASS__SUPER_TYPES:
        return superTypes != null && !superTypes.isEmpty();
      case QIdlPackage.QT_CLASS__ENUMS:
        return enums != null && !enums.isEmpty();
      case QIdlPackage.QT_CLASS__FLAGS:
        return flags != null && !flags.isEmpty();
      case QIdlPackage.QT_CLASS__CLASSES:
        return classes != null && !classes.isEmpty();
      case QIdlPackage.QT_CLASS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case QIdlPackage.QT_CLASS__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
      case QIdlPackage.QT_CLASS__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QtClassImpl

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtClass;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnum;
import org.ufacekit.qt.idl.dsl.qIdl.QtFlags;
import org.ufacekit.qt.idl.dsl.qIdl.QtNamespace;
import org.ufacekit.qt.idl.dsl.qIdl.QtOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtNamespaceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtNamespaceImpl extends MinimalEObjectImpl.Container implements QtNamespace
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaces()
   * @generated
   * @ordered
   */
  protected EList<QtNamespace> namespaces;

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
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<QtOperation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtNamespaceImpl()
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
    return QIdlPackage.Literals.QT_NAMESPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_NAMESPACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtNamespace> getNamespaces()
  {
    if (namespaces == null)
    {
      namespaces = new EObjectContainmentEList<QtNamespace>(QtNamespace.class, this, QIdlPackage.QT_NAMESPACE__NAMESPACES);
    }
    return namespaces;
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
      enums = new EObjectContainmentEList<QtEnum>(QtEnum.class, this, QIdlPackage.QT_NAMESPACE__ENUMS);
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
      flags = new EObjectContainmentEList<QtFlags>(QtFlags.class, this, QIdlPackage.QT_NAMESPACE__FLAGS);
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
      classes = new EObjectContainmentEList<QtClass>(QtClass.class, this, QIdlPackage.QT_NAMESPACE__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<QtOperation>(QtOperation.class, this, QIdlPackage.QT_NAMESPACE__OPERATIONS);
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
      case QIdlPackage.QT_NAMESPACE__NAMESPACES:
        return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_NAMESPACE__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_NAMESPACE__FLAGS:
        return ((InternalEList<?>)getFlags()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_NAMESPACE__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case QIdlPackage.QT_NAMESPACE__OPERATIONS:
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
      case QIdlPackage.QT_NAMESPACE__NAME:
        return getName();
      case QIdlPackage.QT_NAMESPACE__NAMESPACES:
        return getNamespaces();
      case QIdlPackage.QT_NAMESPACE__ENUMS:
        return getEnums();
      case QIdlPackage.QT_NAMESPACE__FLAGS:
        return getFlags();
      case QIdlPackage.QT_NAMESPACE__CLASSES:
        return getClasses();
      case QIdlPackage.QT_NAMESPACE__OPERATIONS:
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
      case QIdlPackage.QT_NAMESPACE__NAME:
        setName((String)newValue);
        return;
      case QIdlPackage.QT_NAMESPACE__NAMESPACES:
        getNamespaces().clear();
        getNamespaces().addAll((Collection<? extends QtNamespace>)newValue);
        return;
      case QIdlPackage.QT_NAMESPACE__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends QtEnum>)newValue);
        return;
      case QIdlPackage.QT_NAMESPACE__FLAGS:
        getFlags().clear();
        getFlags().addAll((Collection<? extends QtFlags>)newValue);
        return;
      case QIdlPackage.QT_NAMESPACE__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends QtClass>)newValue);
        return;
      case QIdlPackage.QT_NAMESPACE__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends QtOperation>)newValue);
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
      case QIdlPackage.QT_NAMESPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QIdlPackage.QT_NAMESPACE__NAMESPACES:
        getNamespaces().clear();
        return;
      case QIdlPackage.QT_NAMESPACE__ENUMS:
        getEnums().clear();
        return;
      case QIdlPackage.QT_NAMESPACE__FLAGS:
        getFlags().clear();
        return;
      case QIdlPackage.QT_NAMESPACE__CLASSES:
        getClasses().clear();
        return;
      case QIdlPackage.QT_NAMESPACE__OPERATIONS:
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
      case QIdlPackage.QT_NAMESPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QIdlPackage.QT_NAMESPACE__NAMESPACES:
        return namespaces != null && !namespaces.isEmpty();
      case QIdlPackage.QT_NAMESPACE__ENUMS:
        return enums != null && !enums.isEmpty();
      case QIdlPackage.QT_NAMESPACE__FLAGS:
        return flags != null && !flags.isEmpty();
      case QIdlPackage.QT_NAMESPACE__CLASSES:
        return classes != null && !classes.isEmpty();
      case QIdlPackage.QT_NAMESPACE__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //QtNamespaceImpl

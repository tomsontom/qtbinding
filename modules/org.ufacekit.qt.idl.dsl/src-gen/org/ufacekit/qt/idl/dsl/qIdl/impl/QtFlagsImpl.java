/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnum;
import org.ufacekit.qt.idl.dsl.qIdl.QtFlags;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Flags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFlagsImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtFlagsImpl extends MinimalEObjectImpl.Container implements QtFlags
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
   * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeration()
   * @generated
   * @ordered
   */
  protected QtEnum enumeration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtFlagsImpl()
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
    return QIdlPackage.Literals.QT_FLAGS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FLAGS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnum getEnumeration()
  {
    if (enumeration != null && enumeration.eIsProxy())
    {
      InternalEObject oldEnumeration = (InternalEObject)enumeration;
      enumeration = (QtEnum)eResolveProxy(oldEnumeration);
      if (enumeration != oldEnumeration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIdlPackage.QT_FLAGS__ENUMERATION, oldEnumeration, enumeration));
      }
    }
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnum basicGetEnumeration()
  {
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeration(QtEnum newEnumeration)
  {
    QtEnum oldEnumeration = enumeration;
    enumeration = newEnumeration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FLAGS__ENUMERATION, oldEnumeration, enumeration));
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
      case QIdlPackage.QT_FLAGS__NAME:
        return getName();
      case QIdlPackage.QT_FLAGS__ENUMERATION:
        if (resolve) return getEnumeration();
        return basicGetEnumeration();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QIdlPackage.QT_FLAGS__NAME:
        setName((String)newValue);
        return;
      case QIdlPackage.QT_FLAGS__ENUMERATION:
        setEnumeration((QtEnum)newValue);
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
      case QIdlPackage.QT_FLAGS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QIdlPackage.QT_FLAGS__ENUMERATION:
        setEnumeration((QtEnum)null);
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
      case QIdlPackage.QT_FLAGS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QIdlPackage.QT_FLAGS__ENUMERATION:
        return enumeration != null;
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

} //QtFlagsImpl

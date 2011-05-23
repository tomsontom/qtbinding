/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl#getEnumMask <em>Enum Mask</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueImpl#getNumericValue <em>Numeric Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtEnumValueImpl extends MinimalEObjectImpl.Container implements QtEnumValue
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
   * The cached value of the '{@link #getEnumMask() <em>Enum Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumMask()
   * @generated
   * @ordered
   */
  protected QtEnumValueMask enumMask;

  /**
   * The default value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericValue()
   * @generated
   * @ordered
   */
  protected static final int NUMERIC_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericValue()
   * @generated
   * @ordered
   */
  protected int numericValue = NUMERIC_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtEnumValueImpl()
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
    return QIdlPackage.Literals.QT_ENUM_VALUE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_ENUM_VALUE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnumValueMask getEnumMask()
  {
    return enumMask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumMask(QtEnumValueMask newEnumMask, NotificationChain msgs)
  {
    QtEnumValueMask oldEnumMask = enumMask;
    enumMask = newEnumMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_ENUM_VALUE__ENUM_MASK, oldEnumMask, newEnumMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumMask(QtEnumValueMask newEnumMask)
  {
    if (newEnumMask != enumMask)
    {
      NotificationChain msgs = null;
      if (enumMask != null)
        msgs = ((InternalEObject)enumMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_ENUM_VALUE__ENUM_MASK, null, msgs);
      if (newEnumMask != null)
        msgs = ((InternalEObject)newEnumMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_ENUM_VALUE__ENUM_MASK, null, msgs);
      msgs = basicSetEnumMask(newEnumMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_ENUM_VALUE__ENUM_MASK, newEnumMask, newEnumMask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumericValue()
  {
    return numericValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumericValue(int newNumericValue)
  {
    int oldNumericValue = numericValue;
    numericValue = newNumericValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_ENUM_VALUE__NUMERIC_VALUE, oldNumericValue, numericValue));
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
      case QIdlPackage.QT_ENUM_VALUE__ENUM_MASK:
        return basicSetEnumMask(null, msgs);
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
      case QIdlPackage.QT_ENUM_VALUE__NAME:
        return getName();
      case QIdlPackage.QT_ENUM_VALUE__ENUM_MASK:
        return getEnumMask();
      case QIdlPackage.QT_ENUM_VALUE__NUMERIC_VALUE:
        return getNumericValue();
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
      case QIdlPackage.QT_ENUM_VALUE__NAME:
        setName((String)newValue);
        return;
      case QIdlPackage.QT_ENUM_VALUE__ENUM_MASK:
        setEnumMask((QtEnumValueMask)newValue);
        return;
      case QIdlPackage.QT_ENUM_VALUE__NUMERIC_VALUE:
        setNumericValue((Integer)newValue);
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
      case QIdlPackage.QT_ENUM_VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QIdlPackage.QT_ENUM_VALUE__ENUM_MASK:
        setEnumMask((QtEnumValueMask)null);
        return;
      case QIdlPackage.QT_ENUM_VALUE__NUMERIC_VALUE:
        setNumericValue(NUMERIC_VALUE_EDEFAULT);
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
      case QIdlPackage.QT_ENUM_VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QIdlPackage.QT_ENUM_VALUE__ENUM_MASK:
        return enumMask != null;
      case QIdlPackage.QT_ENUM_VALUE__NUMERIC_VALUE:
        return numericValue != NUMERIC_VALUE_EDEFAULT;
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
    result.append(", numericValue: ");
    result.append(numericValue);
    result.append(')');
    return result.toString();
  }

} //QtEnumValueImpl

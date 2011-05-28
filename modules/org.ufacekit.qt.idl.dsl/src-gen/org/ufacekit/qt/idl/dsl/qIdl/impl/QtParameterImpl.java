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
import org.ufacekit.qt.idl.dsl.qIdl.QtParameter;
import org.ufacekit.qt.idl.dsl.qIdl.QtValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl#getDefaultInt <em>Default Int</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtParameterImpl#getDefaultEnum <em>Default Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtParameterImpl extends MinimalEObjectImpl.Container implements QtParameter
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected QtValue value;

  /**
   * The default value of the '{@link #getDefaultInt() <em>Default Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultInt()
   * @generated
   * @ordered
   */
  protected static final long DEFAULT_INT_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getDefaultInt() <em>Default Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultInt()
   * @generated
   * @ordered
   */
  protected long defaultInt = DEFAULT_INT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefaultEnum() <em>Default Enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultEnum()
   * @generated
   * @ordered
   */
  protected QtEnumValue defaultEnum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtParameterImpl()
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
    return QIdlPackage.Literals.QT_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(QtValue newValue, NotificationChain msgs)
  {
    QtValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_PARAMETER__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(QtValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_PARAMETER__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_PARAMETER__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_PARAMETER__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getDefaultInt()
  {
    return defaultInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultInt(long newDefaultInt)
  {
    long oldDefaultInt = defaultInt;
    defaultInt = newDefaultInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_PARAMETER__DEFAULT_INT, oldDefaultInt, defaultInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnumValue getDefaultEnum()
  {
    if (defaultEnum != null && defaultEnum.eIsProxy())
    {
      InternalEObject oldDefaultEnum = (InternalEObject)defaultEnum;
      defaultEnum = (QtEnumValue)eResolveProxy(oldDefaultEnum);
      if (defaultEnum != oldDefaultEnum)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIdlPackage.QT_PARAMETER__DEFAULT_ENUM, oldDefaultEnum, defaultEnum));
      }
    }
    return defaultEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtEnumValue basicGetDefaultEnum()
  {
    return defaultEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultEnum(QtEnumValue newDefaultEnum)
  {
    QtEnumValue oldDefaultEnum = defaultEnum;
    defaultEnum = newDefaultEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_PARAMETER__DEFAULT_ENUM, oldDefaultEnum, defaultEnum));
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
      case QIdlPackage.QT_PARAMETER__VALUE:
        return basicSetValue(null, msgs);
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
      case QIdlPackage.QT_PARAMETER__VALUE:
        return getValue();
      case QIdlPackage.QT_PARAMETER__DEFAULT_INT:
        return getDefaultInt();
      case QIdlPackage.QT_PARAMETER__DEFAULT_ENUM:
        if (resolve) return getDefaultEnum();
        return basicGetDefaultEnum();
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
      case QIdlPackage.QT_PARAMETER__VALUE:
        setValue((QtValue)newValue);
        return;
      case QIdlPackage.QT_PARAMETER__DEFAULT_INT:
        setDefaultInt((Long)newValue);
        return;
      case QIdlPackage.QT_PARAMETER__DEFAULT_ENUM:
        setDefaultEnum((QtEnumValue)newValue);
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
      case QIdlPackage.QT_PARAMETER__VALUE:
        setValue((QtValue)null);
        return;
      case QIdlPackage.QT_PARAMETER__DEFAULT_INT:
        setDefaultInt(DEFAULT_INT_EDEFAULT);
        return;
      case QIdlPackage.QT_PARAMETER__DEFAULT_ENUM:
        setDefaultEnum((QtEnumValue)null);
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
      case QIdlPackage.QT_PARAMETER__VALUE:
        return value != null;
      case QIdlPackage.QT_PARAMETER__DEFAULT_INT:
        return defaultInt != DEFAULT_INT_EDEFAULT;
      case QIdlPackage.QT_PARAMETER__DEFAULT_ENUM:
        return defaultEnum != null;
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
    result.append(" (defaultInt: ");
    result.append(defaultInt);
    result.append(')');
    return result.toString();
  }

} //QtParameterImpl

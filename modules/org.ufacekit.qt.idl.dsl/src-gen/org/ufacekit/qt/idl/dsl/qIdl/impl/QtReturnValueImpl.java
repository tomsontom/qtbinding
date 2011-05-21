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
import org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue;
import org.ufacekit.qt.idl.dsl.qIdl.QtType;
import org.ufacekit.qt.idl.dsl.qIdl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Return Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtReturnValueImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtReturnValueImpl extends MinimalEObjectImpl.Container implements QtReturnValue
{
  /**
   * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected static final String CONST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected String const_ = CONST_EDEFAULT;

  /**
   * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected static final Type VALUE_TYPE_EDEFAULT = Type.POINTER;

  /**
   * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected Type valueType = VALUE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QtType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtReturnValueImpl()
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
    return QIdlPackage.Literals.QT_RETURN_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(String newConst)
  {
    String oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_RETURN_VALUE__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getValueType()
  {
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueType(Type newValueType)
  {
    Type oldValueType = valueType;
    valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_RETURN_VALUE__VALUE_TYPE, oldValueType, valueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (QtType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIdlPackage.QT_RETURN_VALUE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QtType newType)
  {
    QtType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_RETURN_VALUE__TYPE, oldType, type));
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
      case QIdlPackage.QT_RETURN_VALUE__CONST:
        return getConst();
      case QIdlPackage.QT_RETURN_VALUE__VALUE_TYPE:
        return getValueType();
      case QIdlPackage.QT_RETURN_VALUE__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case QIdlPackage.QT_RETURN_VALUE__CONST:
        setConst((String)newValue);
        return;
      case QIdlPackage.QT_RETURN_VALUE__VALUE_TYPE:
        setValueType((Type)newValue);
        return;
      case QIdlPackage.QT_RETURN_VALUE__TYPE:
        setType((QtType)newValue);
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
      case QIdlPackage.QT_RETURN_VALUE__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case QIdlPackage.QT_RETURN_VALUE__VALUE_TYPE:
        setValueType(VALUE_TYPE_EDEFAULT);
        return;
      case QIdlPackage.QT_RETURN_VALUE__TYPE:
        setType((QtType)null);
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
      case QIdlPackage.QT_RETURN_VALUE__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case QIdlPackage.QT_RETURN_VALUE__VALUE_TYPE:
        return valueType != VALUE_TYPE_EDEFAULT;
      case QIdlPackage.QT_RETURN_VALUE__TYPE:
        return type != null;
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
    result.append(" (const: ");
    result.append(const_);
    result.append(", valueType: ");
    result.append(valueType);
    result.append(')');
    return result.toString();
  }

} //QtReturnValueImpl

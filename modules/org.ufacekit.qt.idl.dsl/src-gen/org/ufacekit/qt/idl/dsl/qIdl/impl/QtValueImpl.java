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
import org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef;
import org.ufacekit.qt.idl.dsl.qIdl.QtValue;
import org.ufacekit.qt.idl.dsl.qIdl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtValueImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtValueImpl extends MinimalEObjectImpl.Container implements QtValue
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
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected QtTypeRef typeRef;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtValueImpl()
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
    return QIdlPackage.Literals.QT_VALUE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_VALUE__CONST, oldConst, const_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_VALUE__VALUE_TYPE, oldValueType, valueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QtTypeRef getTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeRef(QtTypeRef newTypeRef, NotificationChain msgs)
  {
    QtTypeRef oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_VALUE__TYPE_REF, oldTypeRef, newTypeRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(QtTypeRef newTypeRef)
  {
    if (newTypeRef != typeRef)
    {
      NotificationChain msgs = null;
      if (typeRef != null)
        msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_VALUE__TYPE_REF, null, msgs);
      if (newTypeRef != null)
        msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIdlPackage.QT_VALUE__TYPE_REF, null, msgs);
      msgs = basicSetTypeRef(newTypeRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_VALUE__TYPE_REF, newTypeRef, newTypeRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_VALUE__NAME, oldName, name));
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
      case QIdlPackage.QT_VALUE__TYPE_REF:
        return basicSetTypeRef(null, msgs);
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
      case QIdlPackage.QT_VALUE__CONST:
        return getConst();
      case QIdlPackage.QT_VALUE__VALUE_TYPE:
        return getValueType();
      case QIdlPackage.QT_VALUE__TYPE_REF:
        return getTypeRef();
      case QIdlPackage.QT_VALUE__NAME:
        return getName();
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
      case QIdlPackage.QT_VALUE__CONST:
        setConst((String)newValue);
        return;
      case QIdlPackage.QT_VALUE__VALUE_TYPE:
        setValueType((Type)newValue);
        return;
      case QIdlPackage.QT_VALUE__TYPE_REF:
        setTypeRef((QtTypeRef)newValue);
        return;
      case QIdlPackage.QT_VALUE__NAME:
        setName((String)newValue);
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
      case QIdlPackage.QT_VALUE__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case QIdlPackage.QT_VALUE__VALUE_TYPE:
        setValueType(VALUE_TYPE_EDEFAULT);
        return;
      case QIdlPackage.QT_VALUE__TYPE_REF:
        setTypeRef((QtTypeRef)null);
        return;
      case QIdlPackage.QT_VALUE__NAME:
        setName(NAME_EDEFAULT);
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
      case QIdlPackage.QT_VALUE__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case QIdlPackage.QT_VALUE__VALUE_TYPE:
        return valueType != VALUE_TYPE_EDEFAULT;
      case QIdlPackage.QT_VALUE__TYPE_REF:
        return typeRef != null;
      case QIdlPackage.QT_VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //QtValueImpl

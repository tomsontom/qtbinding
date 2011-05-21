/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ufacekit.qt.idl.dsl.qIdl.Owner;
import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtFunction;
import org.ufacekit.qt.idl.dsl.qIdl.Virtuality;
import org.ufacekit.qt.idl.dsl.qIdl.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtFunctionImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtFunctionImpl extends QtOperationsImpl implements QtFunction
{
  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility = VISIBILITY_EDEFAULT;

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
   * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtual()
   * @generated
   * @ordered
   */
  protected static final Virtuality VIRTUAL_EDEFAULT = Virtuality.VIRTUAL;

  /**
   * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtual()
   * @generated
   * @ordered
   */
  protected Virtuality virtual = VIRTUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected static final Owner OWNER_EDEFAULT = Owner.MEMBER;

  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected Owner owner = OWNER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtFunctionImpl()
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
    return QIdlPackage.Literals.QT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FUNCTION__VISIBILITY, oldVisibility, visibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FUNCTION__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virtuality getVirtual()
  {
    return virtual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVirtual(Virtuality newVirtual)
  {
    Virtuality oldVirtual = virtual;
    virtual = newVirtual == null ? VIRTUAL_EDEFAULT : newVirtual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FUNCTION__VIRTUAL, oldVirtual, virtual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owner getOwner()
  {
    return owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(Owner newOwner)
  {
    Owner oldOwner = owner;
    owner = newOwner == null ? OWNER_EDEFAULT : newOwner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_FUNCTION__OWNER, oldOwner, owner));
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
      case QIdlPackage.QT_FUNCTION__VISIBILITY:
        return getVisibility();
      case QIdlPackage.QT_FUNCTION__CONST:
        return getConst();
      case QIdlPackage.QT_FUNCTION__VIRTUAL:
        return getVirtual();
      case QIdlPackage.QT_FUNCTION__OWNER:
        return getOwner();
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
      case QIdlPackage.QT_FUNCTION__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case QIdlPackage.QT_FUNCTION__CONST:
        setConst((String)newValue);
        return;
      case QIdlPackage.QT_FUNCTION__VIRTUAL:
        setVirtual((Virtuality)newValue);
        return;
      case QIdlPackage.QT_FUNCTION__OWNER:
        setOwner((Owner)newValue);
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
      case QIdlPackage.QT_FUNCTION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case QIdlPackage.QT_FUNCTION__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case QIdlPackage.QT_FUNCTION__VIRTUAL:
        setVirtual(VIRTUAL_EDEFAULT);
        return;
      case QIdlPackage.QT_FUNCTION__OWNER:
        setOwner(OWNER_EDEFAULT);
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
      case QIdlPackage.QT_FUNCTION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case QIdlPackage.QT_FUNCTION__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case QIdlPackage.QT_FUNCTION__VIRTUAL:
        return virtual != VIRTUAL_EDEFAULT;
      case QIdlPackage.QT_FUNCTION__OWNER:
        return owner != OWNER_EDEFAULT;
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
    result.append(" (visibility: ");
    result.append(visibility);
    result.append(", const: ");
    result.append(const_);
    result.append(", virtual: ");
    result.append(virtual);
    result.append(", owner: ");
    result.append(owner);
    result.append(')');
    return result.toString();
  }

} //QtFunctionImpl

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
import org.ufacekit.qt.idl.dsl.qIdl.QtType;
import org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeRefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtTypeRefImpl#getTemplateTypes <em>Template Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtTypeRefImpl extends MinimalEObjectImpl.Container implements QtTypeRef
{
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
   * The cached value of the '{@link #getTemplateTypes() <em>Template Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateTypes()
   * @generated
   * @ordered
   */
  protected EList<QtTypeRef> templateTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtTypeRefImpl()
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
    return QIdlPackage.Literals.QT_TYPE_REF;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIdlPackage.QT_TYPE_REF__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QIdlPackage.QT_TYPE_REF__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtTypeRef> getTemplateTypes()
  {
    if (templateTypes == null)
    {
      templateTypes = new EObjectContainmentEList<QtTypeRef>(QtTypeRef.class, this, QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES);
    }
    return templateTypes;
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
      case QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES:
        return ((InternalEList<?>)getTemplateTypes()).basicRemove(otherEnd, msgs);
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
      case QIdlPackage.QT_TYPE_REF__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES:
        return getTemplateTypes();
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
      case QIdlPackage.QT_TYPE_REF__TYPE:
        setType((QtType)newValue);
        return;
      case QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES:
        getTemplateTypes().clear();
        getTemplateTypes().addAll((Collection<? extends QtTypeRef>)newValue);
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
      case QIdlPackage.QT_TYPE_REF__TYPE:
        setType((QtType)null);
        return;
      case QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES:
        getTemplateTypes().clear();
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
      case QIdlPackage.QT_TYPE_REF__TYPE:
        return type != null;
      case QIdlPackage.QT_TYPE_REF__TEMPLATE_TYPES:
        return templateTypes != null && !templateTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QtTypeRefImpl

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue;
import org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qt Enum Value Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.impl.QtEnumValueMaskImpl#getNumericValue <em>Numeric Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QtEnumValueMaskImpl extends MinimalEObjectImpl.Container implements QtEnumValueMask
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<QtEnumValue> value;

  /**
   * The cached value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericValue()
   * @generated
   * @ordered
   */
  protected EList<Long> numericValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QtEnumValueMaskImpl()
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
    return QIdlPackage.Literals.QT_ENUM_VALUE_MASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QtEnumValue> getValue()
  {
    if (value == null)
    {
      value = new EObjectResolvingEList<QtEnumValue>(QtEnumValue.class, this, QIdlPackage.QT_ENUM_VALUE_MASK__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Long> getNumericValue()
  {
    if (numericValue == null)
    {
      numericValue = new EDataTypeEList<Long>(Long.class, this, QIdlPackage.QT_ENUM_VALUE_MASK__NUMERIC_VALUE);
    }
    return numericValue;
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
      case QIdlPackage.QT_ENUM_VALUE_MASK__VALUE:
        return getValue();
      case QIdlPackage.QT_ENUM_VALUE_MASK__NUMERIC_VALUE:
        return getNumericValue();
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
      case QIdlPackage.QT_ENUM_VALUE_MASK__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends QtEnumValue>)newValue);
        return;
      case QIdlPackage.QT_ENUM_VALUE_MASK__NUMERIC_VALUE:
        getNumericValue().clear();
        getNumericValue().addAll((Collection<? extends Long>)newValue);
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
      case QIdlPackage.QT_ENUM_VALUE_MASK__VALUE:
        getValue().clear();
        return;
      case QIdlPackage.QT_ENUM_VALUE_MASK__NUMERIC_VALUE:
        getNumericValue().clear();
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
      case QIdlPackage.QT_ENUM_VALUE_MASK__VALUE:
        return value != null && !value.isEmpty();
      case QIdlPackage.QT_ENUM_VALUE_MASK__NUMERIC_VALUE:
        return numericValue != null && !numericValue.isEmpty();
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
    result.append(" (numericValue: ");
    result.append(numericValue);
    result.append(')');
    return result.toString();
  }

} //QtEnumValueMaskImpl

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Enum Value Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask#getValue <em>Value</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValueMask#getNumericValue <em>Numeric Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValueMask()
 * @model
 * @generated
 */
public interface QtEnumValueMask extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValueMask_Value()
   * @model
   * @generated
   */
  EList<QtEnumValue> getValue();

  /**
   * Returns the value of the '<em><b>Numeric Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Long}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Value</em>' attribute list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValueMask_NumericValue()
   * @model unique="false"
   * @generated
   */
  EList<Long> getNumericValue();

} // QtEnumValueMask

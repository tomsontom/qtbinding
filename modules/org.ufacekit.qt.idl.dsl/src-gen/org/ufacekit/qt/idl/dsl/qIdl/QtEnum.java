/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnum#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnum()
 * @model
 * @generated
 */
public interface QtEnum extends QtType
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnum_Values()
   * @model containment="true"
   * @generated
   */
  EList<QtEnumValue> getValues();

} // QtEnum

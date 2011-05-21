/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Return Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtReturnValue()
 * @model
 * @generated
 */
public interface QtReturnValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(String)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtReturnValue_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.ufacekit.qt.idl.dsl.qIdl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Type
   * @see #setValueType(Type)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtReturnValue_ValueType()
   * @model
   * @generated
   */
  Type getValueType();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Type
   * @see #getValueType()
   * @generated
   */
  void setValueType(Type value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(QtType)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtReturnValue_Type()
   * @model
   * @generated
   */
  QtType getType();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(QtType value);

} // QtReturnValue

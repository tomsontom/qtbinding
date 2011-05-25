/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getEnumMask <em>Enum Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValue()
 * @model
 * @generated
 */
public interface QtEnumValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Enum Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Mask</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Mask</em>' containment reference.
   * @see #setEnumMask(QtEnumValueMask)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtEnumValue_EnumMask()
   * @model containment="true"
   * @generated
   */
  QtEnumValueMask getEnumMask();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue#getEnumMask <em>Enum Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Mask</em>' containment reference.
   * @see #getEnumMask()
   * @generated
   */
  void setEnumMask(QtEnumValueMask value);

} // QtEnumValue

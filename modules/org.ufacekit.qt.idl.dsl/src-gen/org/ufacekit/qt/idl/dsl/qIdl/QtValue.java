/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtValue()
 * @model
 * @generated
 */
public interface QtValue extends EObject
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtValue_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getConst <em>Const</em>}' attribute.
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtValue_ValueType()
   * @model
   * @generated
   */
  Type getValueType();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Type
   * @see #getValueType()
   * @generated
   */
  void setValueType(Type value);

  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(QtTypeRef)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtValue_TypeRef()
   * @model containment="true"
   * @generated
   */
  QtTypeRef getTypeRef();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(QtTypeRef value);

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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // QtValue

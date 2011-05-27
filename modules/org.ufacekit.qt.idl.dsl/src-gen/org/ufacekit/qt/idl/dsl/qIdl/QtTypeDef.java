/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeDef#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtTypeDef()
 * @model
 * @generated
 */
public interface QtTypeDef extends QtType
{
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtTypeDef_TypeRef()
   * @model containment="true"
   * @generated
   */
  QtTypeRef getTypeRef();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeDef#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(QtTypeRef value);

} // QtTypeDef

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
 * A representation of the model object '<em><b>Qt Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef#getType <em>Type</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef#getTemplateTypes <em>Template Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtTypeRef()
 * @model
 * @generated
 */
public interface QtTypeRef extends EObject
{
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtTypeRef_Type()
   * @model
   * @generated
   */
  QtType getType();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(QtType value);

  /**
   * Returns the value of the '<em><b>Template Types</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Types</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtTypeRef_TemplateTypes()
   * @model containment="true"
   * @generated
   */
  EList<QtTypeRef> getTemplateTypes();

} // QtTypeRef

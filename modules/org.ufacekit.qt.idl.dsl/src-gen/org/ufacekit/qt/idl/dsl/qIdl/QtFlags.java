/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFlags()
 * @model
 * @generated
 */
public interface QtFlags extends EObject
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFlags_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' reference.
   * @see #setEnumeration(QtEnum)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFlags_Enumeration()
   * @model
   * @generated
   */
  QtEnum getEnumeration();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags#getEnumeration <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(QtEnum value);

} // QtFlags

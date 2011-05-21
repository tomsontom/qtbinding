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
 * A representation of the model object '<em><b>Qt Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations#getParams <em>Params</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtOperations()
 * @model
 * @generated
 */
public interface QtOperations extends EObject
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtOperations_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtOperations_Params()
   * @model containment="true"
   * @generated
   */
  EList<QtValue> getParams();

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(QtReturnValue)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtOperations_ReturnValue()
   * @model containment="true"
   * @generated
   */
  QtReturnValue getReturnValue();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(QtReturnValue value);

} // QtOperations

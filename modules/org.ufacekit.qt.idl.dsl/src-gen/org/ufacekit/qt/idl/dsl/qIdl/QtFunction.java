/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getConst <em>Const</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFunction()
 * @model
 * @generated
 */
public interface QtFunction extends QtOperation
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.ufacekit.qt.idl.dsl.qIdl.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Visibility
   * @see #setVisibility(Visibility)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFunction_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFunction_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Virtual</b></em>' attribute.
   * The literals are from the enumeration {@link org.ufacekit.qt.idl.dsl.qIdl.Virtuality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Virtuality
   * @see #setVirtual(Virtuality)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFunction_Virtual()
   * @model
   * @generated
   */
  Virtuality getVirtual();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getVirtual <em>Virtual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Virtual</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Virtuality
   * @see #getVirtual()
   * @generated
   */
  void setVirtual(Virtuality value);

  /**
   * Returns the value of the '<em><b>Owner</b></em>' attribute.
   * The literals are from the enumeration {@link org.ufacekit.qt.idl.dsl.qIdl.Owner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Owner
   * @see #setOwner(Owner)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtFunction_Owner()
   * @model
   * @generated
   */
  Owner getOwner();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction#getOwner <em>Owner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' attribute.
   * @see org.ufacekit.qt.idl.dsl.qIdl.Owner
   * @see #getOwner()
   * @generated
   */
  void setOwner(Owner value);

} // QtFunction

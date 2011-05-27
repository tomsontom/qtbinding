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
 * A representation of the model object '<em><b>Qt Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getName <em>Name</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace()
 * @model
 * @generated
 */
public interface QtNamespace extends EObject
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespaces</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Namespaces()
   * @model containment="true"
   * @generated
   */
  EList<QtNamespace> getNamespaces();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Enums()
   * @model containment="true"
   * @generated
   */
  EList<QtEnum> getEnums();

  /**
   * Returns the value of the '<em><b>Flags</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Flags()
   * @model containment="true"
   * @generated
   */
  EList<QtFlags> getFlags();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Classes()
   * @model containment="true"
   * @generated
   */
  EList<QtClass> getClasses();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Operations()
   * @model containment="true"
   * @generated
   */
  EList<QtOperation> getOperations();

  /**
   * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtTypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtNamespace_Typedef()
   * @model containment="true"
   * @generated
   */
  EList<QtTypeDef> getTypedef();

} // QtNamespace

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass()
 * @model
 * @generated
 */
public interface QtClass extends QtType
{
  /**
   * Returns the value of the '<em><b>Super Types</b></em>' reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_SuperTypes()
   * @model
   * @generated
   */
  EList<QtClass> getSuperTypes();

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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Enums()
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Flags()
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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Classes()
   * @model containment="true"
   * @generated
   */
  EList<QtClass> getClasses();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Properties()
   * @model containment="true"
   * @generated
   */
  EList<QtProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link org.ufacekit.qt.idl.dsl.qIdl.QtConstructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<QtConstructor> getConstructors();

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
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtClass_Operations()
   * @model containment="true"
   * @generated
   */
  EList<QtOperation> getOperations();

} // QtClass

/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qt Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getValue <em>Value</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultInt <em>Default Int</em>}</li>
 *   <li>{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultEnum <em>Default Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtParameter()
 * @model
 * @generated
 */
public interface QtParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(QtValue)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtParameter_Value()
   * @model containment="true"
   * @generated
   */
  QtValue getValue();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(QtValue value);

  /**
   * Returns the value of the '<em><b>Default Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Int</em>' attribute.
   * @see #setDefaultInt(long)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtParameter_DefaultInt()
   * @model
   * @generated
   */
  long getDefaultInt();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultInt <em>Default Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Int</em>' attribute.
   * @see #getDefaultInt()
   * @generated
   */
  void setDefaultInt(long value);

  /**
   * Returns the value of the '<em><b>Default Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Enum</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Enum</em>' reference.
   * @see #setDefaultEnum(QtEnumValue)
   * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getQtParameter_DefaultEnum()
   * @model
   * @generated
   */
  QtEnumValue getDefaultEnum();

  /**
   * Sets the value of the '{@link org.ufacekit.qt.idl.dsl.qIdl.QtParameter#getDefaultEnum <em>Default Enum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Enum</em>' reference.
   * @see #getDefaultEnum()
   * @generated
   */
  void setDefaultEnum(QtEnumValue value);

} // QtParameter

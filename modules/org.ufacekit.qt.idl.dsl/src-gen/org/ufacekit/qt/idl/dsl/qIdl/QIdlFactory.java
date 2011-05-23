/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage
 * @generated
 */
public interface QIdlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QIdlFactory eINSTANCE = org.ufacekit.qt.idl.dsl.qIdl.impl.QIdlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Qt Idl Typ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Idl Typ</em>'.
   * @generated
   */
  QtIdlTyp createQtIdlTyp();

  /**
   * Returns a new object of class '<em>Qt Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Namespace</em>'.
   * @generated
   */
  QtNamespace createQtNamespace();

  /**
   * Returns a new object of class '<em>Qt Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Type</em>'.
   * @generated
   */
  QtType createQtType();

  /**
   * Returns a new object of class '<em>Qt Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Operation</em>'.
   * @generated
   */
  QtOperation createQtOperation();

  /**
   * Returns a new object of class '<em>Qt Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Class</em>'.
   * @generated
   */
  QtClass createQtClass();

  /**
   * Returns a new object of class '<em>Qt Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Constructor</em>'.
   * @generated
   */
  QtConstructor createQtConstructor();

  /**
   * Returns a new object of class '<em>Qt Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Property</em>'.
   * @generated
   */
  QtProperty createQtProperty();

  /**
   * Returns a new object of class '<em>Qt Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Enum</em>'.
   * @generated
   */
  QtEnum createQtEnum();

  /**
   * Returns a new object of class '<em>Qt Flags</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Flags</em>'.
   * @generated
   */
  QtFlags createQtFlags();

  /**
   * Returns a new object of class '<em>Qt Enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Enum Value</em>'.
   * @generated
   */
  QtEnumValue createQtEnumValue();

  /**
   * Returns a new object of class '<em>Qt Enum Value Mask</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Enum Value Mask</em>'.
   * @generated
   */
  QtEnumValueMask createQtEnumValueMask();

  /**
   * Returns a new object of class '<em>Qt Buitin Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Buitin Type</em>'.
   * @generated
   */
  QtBuitinType createQtBuitinType();

  /**
   * Returns a new object of class '<em>Qt Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Function</em>'.
   * @generated
   */
  QtFunction createQtFunction();

  /**
   * Returns a new object of class '<em>Qt Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Value</em>'.
   * @generated
   */
  QtValue createQtValue();

  /**
   * Returns a new object of class '<em>Qt Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Parameter</em>'.
   * @generated
   */
  QtParameter createQtParameter();

  /**
   * Returns a new object of class '<em>Qt Return Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Return Value</em>'.
   * @generated
   */
  QtReturnValue createQtReturnValue();

  /**
   * Returns a new object of class '<em>Qt Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Signal</em>'.
   * @generated
   */
  QtSignal createQtSignal();

  /**
   * Returns a new object of class '<em>Qt Slot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qt Slot</em>'.
   * @generated
   */
  QtSlot createQtSlot();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QIdlPackage getQIdlPackage();

} //QIdlFactory

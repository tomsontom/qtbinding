/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ufacekit.qt.idl.dsl.qIdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage
 * @generated
 */
public class QIdlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QIdlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QIdlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = QIdlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QIdlPackage.QT_IDL_TYP:
      {
        QtIdlTyp qtIdlTyp = (QtIdlTyp)theEObject;
        T result = caseQtIdlTyp(qtIdlTyp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_NAMESPACE:
      {
        QtNamespace qtNamespace = (QtNamespace)theEObject;
        T result = caseQtNamespace(qtNamespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_TYPE:
      {
        QtType qtType = (QtType)theEObject;
        T result = caseQtType(qtType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_OPERATION:
      {
        QtOperation qtOperation = (QtOperation)theEObject;
        T result = caseQtOperation(qtOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_CLASS:
      {
        QtClass qtClass = (QtClass)theEObject;
        T result = caseQtClass(qtClass);
        if (result == null) result = caseQtType(qtClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_TEMPLATE_PARAM:
      {
        QtTemplateParam qtTemplateParam = (QtTemplateParam)theEObject;
        T result = caseQtTemplateParam(qtTemplateParam);
        if (result == null) result = caseQtType(qtTemplateParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_TYPE_DEF:
      {
        QtTypeDef qtTypeDef = (QtTypeDef)theEObject;
        T result = caseQtTypeDef(qtTypeDef);
        if (result == null) result = caseQtType(qtTypeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_CONSTRUCTOR:
      {
        QtConstructor qtConstructor = (QtConstructor)theEObject;
        T result = caseQtConstructor(qtConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_PROPERTY:
      {
        QtProperty qtProperty = (QtProperty)theEObject;
        T result = caseQtProperty(qtProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_ENUM:
      {
        QtEnum qtEnum = (QtEnum)theEObject;
        T result = caseQtEnum(qtEnum);
        if (result == null) result = caseQtType(qtEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_FLAGS:
      {
        QtFlags qtFlags = (QtFlags)theEObject;
        T result = caseQtFlags(qtFlags);
        if (result == null) result = caseQtType(qtFlags);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_ENUM_VALUE:
      {
        QtEnumValue qtEnumValue = (QtEnumValue)theEObject;
        T result = caseQtEnumValue(qtEnumValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_ENUM_VALUE_MASK:
      {
        QtEnumValueMask qtEnumValueMask = (QtEnumValueMask)theEObject;
        T result = caseQtEnumValueMask(qtEnumValueMask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_BUITIN_TYPE:
      {
        QtBuitinType qtBuitinType = (QtBuitinType)theEObject;
        T result = caseQtBuitinType(qtBuitinType);
        if (result == null) result = caseQtType(qtBuitinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_FUNCTION:
      {
        QtFunction qtFunction = (QtFunction)theEObject;
        T result = caseQtFunction(qtFunction);
        if (result == null) result = caseQtOperation(qtFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_VALUE:
      {
        QtValue qtValue = (QtValue)theEObject;
        T result = caseQtValue(qtValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_TYPE_REF:
      {
        QtTypeRef qtTypeRef = (QtTypeRef)theEObject;
        T result = caseQtTypeRef(qtTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_CLASS_TYPE_REF:
      {
        QtClassTypeRef qtClassTypeRef = (QtClassTypeRef)theEObject;
        T result = caseQtClassTypeRef(qtClassTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_PARAMETER:
      {
        QtParameter qtParameter = (QtParameter)theEObject;
        T result = caseQtParameter(qtParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_RETURN_VALUE:
      {
        QtReturnValue qtReturnValue = (QtReturnValue)theEObject;
        T result = caseQtReturnValue(qtReturnValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_SIGNAL:
      {
        QtSignal qtSignal = (QtSignal)theEObject;
        T result = caseQtSignal(qtSignal);
        if (result == null) result = caseQtOperation(qtSignal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QIdlPackage.QT_SLOT:
      {
        QtSlot qtSlot = (QtSlot)theEObject;
        T result = caseQtSlot(qtSlot);
        if (result == null) result = caseQtOperation(qtSlot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Idl Typ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Idl Typ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtIdlTyp(QtIdlTyp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtNamespace(QtNamespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtType(QtType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtOperation(QtOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtClass(QtClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Template Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Template Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtTemplateParam(QtTemplateParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtTypeDef(QtTypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtConstructor(QtConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtProperty(QtProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtEnum(QtEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Flags</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Flags</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtFlags(QtFlags object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Enum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Enum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtEnumValue(QtEnumValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Enum Value Mask</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Enum Value Mask</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtEnumValueMask(QtEnumValueMask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Buitin Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Buitin Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtBuitinType(QtBuitinType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtFunction(QtFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtValue(QtValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtTypeRef(QtTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Class Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Class Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtClassTypeRef(QtClassTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtParameter(QtParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Return Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Return Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtReturnValue(QtReturnValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtSignal(QtSignal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qt Slot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qt Slot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQtSlot(QtSlot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QIdlSwitch

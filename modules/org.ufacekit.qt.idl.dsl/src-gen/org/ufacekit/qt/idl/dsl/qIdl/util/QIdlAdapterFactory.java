/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ufacekit.qt.idl.dsl.qIdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage
 * @generated
 */
public class QIdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QIdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QIdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QIdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QIdlSwitch<Adapter> modelSwitch =
    new QIdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseQtIdlTyp(QtIdlTyp object)
      {
        return createQtIdlTypAdapter();
      }
      @Override
      public Adapter caseQtNamespace(QtNamespace object)
      {
        return createQtNamespaceAdapter();
      }
      @Override
      public Adapter caseQtType(QtType object)
      {
        return createQtTypeAdapter();
      }
      @Override
      public Adapter caseQtOperations(QtOperations object)
      {
        return createQtOperationsAdapter();
      }
      @Override
      public Adapter caseQtClass(QtClass object)
      {
        return createQtClassAdapter();
      }
      @Override
      public Adapter caseQtConstructor(QtConstructor object)
      {
        return createQtConstructorAdapter();
      }
      @Override
      public Adapter caseQtProperty(QtProperty object)
      {
        return createQtPropertyAdapter();
      }
      @Override
      public Adapter caseQtEnum(QtEnum object)
      {
        return createQtEnumAdapter();
      }
      @Override
      public Adapter caseQtFlags(QtFlags object)
      {
        return createQtFlagsAdapter();
      }
      @Override
      public Adapter caseQtEnumValue(QtEnumValue object)
      {
        return createQtEnumValueAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseQtBuitinType(QtBuitinType object)
      {
        return createQtBuitinTypeAdapter();
      }
      @Override
      public Adapter caseQtFunction(QtFunction object)
      {
        return createQtFunctionAdapter();
      }
      @Override
      public Adapter caseQtValue(QtValue object)
      {
        return createQtValueAdapter();
      }
      @Override
      public Adapter caseQtReturnValue(QtReturnValue object)
      {
        return createQtReturnValueAdapter();
      }
      @Override
      public Adapter caseQtSignal(QtSignal object)
      {
        return createQtSignalAdapter();
      }
      @Override
      public Adapter caseQtSlot(QtSlot object)
      {
        return createQtSlotAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp <em>Qt Idl Typ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtIdlTyp
   * @generated
   */
  public Adapter createQtIdlTypAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtNamespace <em>Qt Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtNamespace
   * @generated
   */
  public Adapter createQtNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtType <em>Qt Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtType
   * @generated
   */
  public Adapter createQtTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtOperations <em>Qt Operations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtOperations
   * @generated
   */
  public Adapter createQtOperationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtClass <em>Qt Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtClass
   * @generated
   */
  public Adapter createQtClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtConstructor <em>Qt Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtConstructor
   * @generated
   */
  public Adapter createQtConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtProperty <em>Qt Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtProperty
   * @generated
   */
  public Adapter createQtPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnum <em>Qt Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnum
   * @generated
   */
  public Adapter createQtEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFlags <em>Qt Flags</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFlags
   * @generated
   */
  public Adapter createQtFlagsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue <em>Qt Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtEnumValue
   * @generated
   */
  public Adapter createQtEnumValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType <em>Qt Buitin Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtBuitinType
   * @generated
   */
  public Adapter createQtBuitinTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtFunction <em>Qt Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtFunction
   * @generated
   */
  public Adapter createQtFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtValue <em>Qt Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtValue
   * @generated
   */
  public Adapter createQtValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue <em>Qt Return Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtReturnValue
   * @generated
   */
  public Adapter createQtReturnValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtSignal <em>Qt Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtSignal
   * @generated
   */
  public Adapter createQtSignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ufacekit.qt.idl.dsl.qIdl.QtSlot <em>Qt Slot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ufacekit.qt.idl.dsl.qIdl.QtSlot
   * @generated
   */
  public Adapter createQtSlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QIdlAdapterFactory
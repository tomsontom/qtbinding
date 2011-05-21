/**
 * <copyright>
 * </copyright>
 *
 */
package org.ufacekit.qt.idl.dsl.qIdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Virtuality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage#getVirtuality()
 * @model
 * @generated
 */
public enum Virtuality implements Enumerator
{
  /**
   * The '<em><b>Virtual</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIRTUAL_VALUE
   * @generated
   * @ordered
   */
  VIRTUAL(0, "virtual", "virtual"),

  /**
   * The '<em><b>Purevirtual</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUREVIRTUAL_VALUE
   * @generated
   * @ordered
   */
  PUREVIRTUAL(1, "purevirtual", "purevirtual");

  /**
   * The '<em><b>Virtual</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Virtual</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIRTUAL
   * @model name="virtual"
   * @generated
   * @ordered
   */
  public static final int VIRTUAL_VALUE = 0;

  /**
   * The '<em><b>Purevirtual</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Purevirtual</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUREVIRTUAL
   * @model name="purevirtual"
   * @generated
   * @ordered
   */
  public static final int PUREVIRTUAL_VALUE = 1;

  /**
   * An array of all the '<em><b>Virtuality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Virtuality[] VALUES_ARRAY =
    new Virtuality[]
    {
      VIRTUAL,
      PUREVIRTUAL,
    };

  /**
   * A public read-only list of all the '<em><b>Virtuality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Virtuality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Virtuality</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Virtuality get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Virtuality result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Virtuality</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Virtuality getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Virtuality result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Virtuality</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Virtuality get(int value)
  {
    switch (value)
    {
      case VIRTUAL_VALUE: return VIRTUAL;
      case PUREVIRTUAL_VALUE: return PUREVIRTUAL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Virtuality(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Virtuality

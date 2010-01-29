/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NS Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.NSElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.fii.wade.voces.metavoc.MetavocPackage#getNSElement()
 * @model
 * @generated
 */
public interface NSElement extends EObject
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
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getNSElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.NSElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NSElement

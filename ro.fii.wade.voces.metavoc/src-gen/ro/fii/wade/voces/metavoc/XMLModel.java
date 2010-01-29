/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLModel#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLModel()
 * @model
 * @generated
 */
public interface XMLModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link ro.fii.wade.voces.metavoc.XMLValidElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLModel_Contents()
   * @model containment="true"
   * @generated
   */
  EList<XMLValidElement> getContents();

} // XMLModel

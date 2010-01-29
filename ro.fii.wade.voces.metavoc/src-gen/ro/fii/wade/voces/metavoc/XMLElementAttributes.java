/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNselements <em>Nselements</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getElementValue <em>Element Value</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementAttributes()
 * @model
 * @generated
 */
public interface XMLElementAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(AttrNS)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementAttributes_Namespace()
   * @model containment="true"
   * @generated
   */
  AttrNS getNamespace();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(AttrNS value);

  /**
   * Returns the value of the '<em><b>Nselements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nselements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nselements</em>' containment reference.
   * @see #setNselements(NSElement)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementAttributes_Nselements()
   * @model containment="true"
   * @generated
   */
  NSElement getNselements();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNselements <em>Nselements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nselements</em>' containment reference.
   * @see #getNselements()
   * @generated
   */
  void setNselements(NSElement value);

  /**
   * Returns the value of the '<em><b>Element Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Value</em>' attribute.
   * @see #setElementValue(String)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementAttributes_ElementValue()
   * @model
   * @generated
   */
  String getElementValue();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getElementValue <em>Element Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Value</em>' attribute.
   * @see #getElementValue()
   * @generated
   */
  void setElementValue(String value);

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
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementAttributes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // XMLElementAttributes

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
 * A representation of the model object '<em><b>XML Valid Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLValidElement#getStartelement <em>Startelement</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLValidElement#getChildren <em>Children</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLValidElement#getName <em>Name</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLValidElement#getContent <em>Content</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLValidElement#getEndelement <em>Endelement</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement()
 * @model
 * @generated
 */
public interface XMLValidElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Startelement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startelement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startelement</em>' containment reference.
   * @see #setStartelement(XMLStartElement)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement_Startelement()
   * @model containment="true"
   * @generated
   */
  XMLStartElement getStartelement();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getStartelement <em>Startelement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startelement</em>' containment reference.
   * @see #getStartelement()
   * @generated
   */
  void setStartelement(XMLStartElement value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link ro.fii.wade.voces.metavoc.XMLValidElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement_Children()
   * @model containment="true"
   * @generated
   */
  EList<XMLValidElement> getChildren();

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
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(int)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement_Content()
   * @model
   * @generated
   */
  int getContent();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(int value);

  /**
   * Returns the value of the '<em><b>Endelement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endelement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endelement</em>' containment reference.
   * @see #setEndelement(XMLEndElement)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLValidElement_Endelement()
   * @model containment="true"
   * @generated
   */
  XMLEndElement getEndelement();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getEndelement <em>Endelement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endelement</em>' containment reference.
   * @see #getEndelement()
   * @generated
   */
  void setEndelement(XMLEndElement value);

} // XMLValidElement

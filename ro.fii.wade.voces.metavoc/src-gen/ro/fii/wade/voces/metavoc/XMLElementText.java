/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementText#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementText#getNselements <em>Nselements</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.XMLElementText#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementText()
 * @model
 * @generated
 */
public interface XMLElementText extends XMLStartElement, XMLEndElement
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
   * @see #setNamespace(VocNS)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementText_Namespace()
   * @model containment="true"
   * @generated
   */
  VocNS getNamespace();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementText#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(VocNS value);

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
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementText_Nselements()
   * @model containment="true"
   * @generated
   */
  NSElement getNselements();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementText#getNselements <em>Nselements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nselements</em>' containment reference.
   * @see #getNselements()
   * @generated
   */
  void setNselements(NSElement value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(XMLElementAttributes)
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#getXMLElementText_Attributes()
   * @model containment="true"
   * @generated
   */
  XMLElementAttributes getAttributes();

  /**
   * Sets the value of the '{@link ro.fii.wade.voces.metavoc.XMLElementText#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(XMLElementAttributes value);

} // XMLElementText

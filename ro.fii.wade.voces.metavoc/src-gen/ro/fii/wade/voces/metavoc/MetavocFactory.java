/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ro.fii.wade.voces.metavoc.MetavocPackage
 * @generated
 */
public interface MetavocFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MetavocFactory eINSTANCE = ro.fii.wade.voces.metavoc.impl.MetavocFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XML Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Model</em>'.
   * @generated
   */
  XMLModel createXMLModel();

  /**
   * Returns a new object of class '<em>XML Valid Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Valid Element</em>'.
   * @generated
   */
  XMLValidElement createXMLValidElement();

  /**
   * Returns a new object of class '<em>XML Start Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Start Element</em>'.
   * @generated
   */
  XMLStartElement createXMLStartElement();

  /**
   * Returns a new object of class '<em>XML End Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML End Element</em>'.
   * @generated
   */
  XMLEndElement createXMLEndElement();

  /**
   * Returns a new object of class '<em>XML Element Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Element Text</em>'.
   * @generated
   */
  XMLElementText createXMLElementText();

  /**
   * Returns a new object of class '<em>XML Element Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Element Attributes</em>'.
   * @generated
   */
  XMLElementAttributes createXMLElementAttributes();

  /**
   * Returns a new object of class '<em>Attr NS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr NS</em>'.
   * @generated
   */
  AttrNS createAttrNS();

  /**
   * Returns a new object of class '<em>Voc NS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Voc NS</em>'.
   * @generated
   */
  VocNS createVocNS();

  /**
   * Returns a new object of class '<em>NS Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NS Element</em>'.
   * @generated
   */
  NSElement createNSElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MetavocPackage getMetavocPackage();

} //MetavocFactory

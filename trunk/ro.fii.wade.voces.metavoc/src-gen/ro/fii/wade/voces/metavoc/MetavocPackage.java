/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ro.fii.wade.voces.metavoc.MetavocFactory
 * @model kind="package"
 * @generated
 */
public interface MetavocPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "metavoc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fii.ro/wade/voces/Metavoc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "metavoc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MetavocPackage eINSTANCE = ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl.init();

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLModelImpl <em>XML Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLModelImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLModel()
   * @generated
   */
  int XML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_MODEL__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>XML Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl <em>XML Valid Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLValidElement()
   * @generated
   */
  int XML_VALID_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Startelement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT__STARTELEMENT = 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT__CHILDREN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT__NAME = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT__CONTENT = 3;

  /**
   * The feature id for the '<em><b>Endelement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT__ENDELEMENT = 4;

  /**
   * The number of structural features of the '<em>XML Valid Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_VALID_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLStartElementImpl <em>XML Start Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLStartElementImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLStartElement()
   * @generated
   */
  int XML_START_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>XML Start Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_START_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLEndElementImpl <em>XML End Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLEndElementImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLEndElement()
   * @generated
   */
  int XML_END_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>XML End Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_END_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl <em>XML Element Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLElementText()
   * @generated
   */
  int XML_ELEMENT_TEXT = 4;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_TEXT__NAMESPACE = XML_START_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nselements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_TEXT__NSELEMENTS = XML_START_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_TEXT__ATTRIBUTES = XML_START_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XML Element Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_TEXT_FEATURE_COUNT = XML_START_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl <em>XML Element Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLElementAttributes()
   * @generated
   */
  int XML_ELEMENT_ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_ATTRIBUTES__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Nselements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_ATTRIBUTES__NSELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Element Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_ATTRIBUTES__NAME = 3;

  /**
   * The number of structural features of the '<em>XML Element Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_ATTRIBUTES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.AttrNSImpl <em>Attr NS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.AttrNSImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getAttrNS()
   * @generated
   */
  int ATTR_NS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_NS__NAME = 0;

  /**
   * The number of structural features of the '<em>Attr NS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_NS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.VocNSImpl <em>Voc NS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.VocNSImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getVocNS()
   * @generated
   */
  int VOC_NS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_NS__NAME = 0;

  /**
   * The number of structural features of the '<em>Voc NS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_NS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ro.fii.wade.voces.metavoc.impl.NSElementImpl <em>NS Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.fii.wade.voces.metavoc.impl.NSElementImpl
   * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getNSElement()
   * @generated
   */
  int NS_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NS_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>NS Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NS_ELEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLModel <em>XML Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Model</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLModel
   * @generated
   */
  EClass getXMLModel();

  /**
   * Returns the meta object for the containment reference list '{@link ro.fii.wade.voces.metavoc.XMLModel#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLModel#getContents()
   * @see #getXMLModel()
   * @generated
   */
  EReference getXMLModel_Contents();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLValidElement <em>XML Valid Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Valid Element</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement
   * @generated
   */
  EClass getXMLValidElement();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getStartelement <em>Startelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Startelement</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement#getStartelement()
   * @see #getXMLValidElement()
   * @generated
   */
  EReference getXMLValidElement_Startelement();

  /**
   * Returns the meta object for the containment reference list '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement#getChildren()
   * @see #getXMLValidElement()
   * @generated
   */
  EReference getXMLValidElement_Children();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement#getName()
   * @see #getXMLValidElement()
   * @generated
   */
  EAttribute getXMLValidElement_Name();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement#getContent()
   * @see #getXMLValidElement()
   * @generated
   */
  EAttribute getXMLValidElement_Content();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLValidElement#getEndelement <em>Endelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Endelement</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement#getEndelement()
   * @see #getXMLValidElement()
   * @generated
   */
  EReference getXMLValidElement_Endelement();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLStartElement <em>XML Start Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Start Element</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLStartElement
   * @generated
   */
  EClass getXMLStartElement();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLEndElement <em>XML End Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML End Element</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLEndElement
   * @generated
   */
  EClass getXMLEndElement();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLElementText <em>XML Element Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Element Text</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementText
   * @generated
   */
  EClass getXMLElementText();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLElementText#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementText#getNamespace()
   * @see #getXMLElementText()
   * @generated
   */
  EReference getXMLElementText_Namespace();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLElementText#getNselements <em>Nselements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nselements</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementText#getNselements()
   * @see #getXMLElementText()
   * @generated
   */
  EReference getXMLElementText_Nselements();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLElementText#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementText#getAttributes()
   * @see #getXMLElementText()
   * @generated
   */
  EReference getXMLElementText_Attributes();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes <em>XML Element Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Element Attributes</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes
   * @generated
   */
  EClass getXMLElementAttributes();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes#getNamespace()
   * @see #getXMLElementAttributes()
   * @generated
   */
  EReference getXMLElementAttributes_Namespace();

  /**
   * Returns the meta object for the containment reference '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getNselements <em>Nselements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nselements</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes#getNselements()
   * @see #getXMLElementAttributes()
   * @generated
   */
  EReference getXMLElementAttributes_Nselements();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Value</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes#getElementValue()
   * @see #getXMLElementAttributes()
   * @generated
   */
  EAttribute getXMLElementAttributes_ElementValue();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes#getName()
   * @see #getXMLElementAttributes()
   * @generated
   */
  EAttribute getXMLElementAttributes_Name();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.AttrNS <em>Attr NS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr NS</em>'.
   * @see ro.fii.wade.voces.metavoc.AttrNS
   * @generated
   */
  EClass getAttrNS();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.AttrNS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.fii.wade.voces.metavoc.AttrNS#getName()
   * @see #getAttrNS()
   * @generated
   */
  EAttribute getAttrNS_Name();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.VocNS <em>Voc NS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voc NS</em>'.
   * @see ro.fii.wade.voces.metavoc.VocNS
   * @generated
   */
  EClass getVocNS();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.VocNS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.fii.wade.voces.metavoc.VocNS#getName()
   * @see #getVocNS()
   * @generated
   */
  EAttribute getVocNS_Name();

  /**
   * Returns the meta object for class '{@link ro.fii.wade.voces.metavoc.NSElement <em>NS Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NS Element</em>'.
   * @see ro.fii.wade.voces.metavoc.NSElement
   * @generated
   */
  EClass getNSElement();

  /**
   * Returns the meta object for the attribute '{@link ro.fii.wade.voces.metavoc.NSElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.fii.wade.voces.metavoc.NSElement#getName()
   * @see #getNSElement()
   * @generated
   */
  EAttribute getNSElement_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MetavocFactory getMetavocFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLModelImpl <em>XML Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLModelImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLModel()
     * @generated
     */
    EClass XML_MODEL = eINSTANCE.getXMLModel();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_MODEL__CONTENTS = eINSTANCE.getXMLModel_Contents();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl <em>XML Valid Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLValidElement()
     * @generated
     */
    EClass XML_VALID_ELEMENT = eINSTANCE.getXMLValidElement();

    /**
     * The meta object literal for the '<em><b>Startelement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_VALID_ELEMENT__STARTELEMENT = eINSTANCE.getXMLValidElement_Startelement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_VALID_ELEMENT__CHILDREN = eINSTANCE.getXMLValidElement_Children();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_VALID_ELEMENT__NAME = eINSTANCE.getXMLValidElement_Name();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_VALID_ELEMENT__CONTENT = eINSTANCE.getXMLValidElement_Content();

    /**
     * The meta object literal for the '<em><b>Endelement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_VALID_ELEMENT__ENDELEMENT = eINSTANCE.getXMLValidElement_Endelement();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLStartElementImpl <em>XML Start Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLStartElementImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLStartElement()
     * @generated
     */
    EClass XML_START_ELEMENT = eINSTANCE.getXMLStartElement();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLEndElementImpl <em>XML End Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLEndElementImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLEndElement()
     * @generated
     */
    EClass XML_END_ELEMENT = eINSTANCE.getXMLEndElement();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl <em>XML Element Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLElementText()
     * @generated
     */
    EClass XML_ELEMENT_TEXT = eINSTANCE.getXMLElementText();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_ELEMENT_TEXT__NAMESPACE = eINSTANCE.getXMLElementText_Namespace();

    /**
     * The meta object literal for the '<em><b>Nselements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_ELEMENT_TEXT__NSELEMENTS = eINSTANCE.getXMLElementText_Nselements();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_ELEMENT_TEXT__ATTRIBUTES = eINSTANCE.getXMLElementText_Attributes();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl <em>XML Element Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getXMLElementAttributes()
     * @generated
     */
    EClass XML_ELEMENT_ATTRIBUTES = eINSTANCE.getXMLElementAttributes();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_ELEMENT_ATTRIBUTES__NAMESPACE = eINSTANCE.getXMLElementAttributes_Namespace();

    /**
     * The meta object literal for the '<em><b>Nselements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_ELEMENT_ATTRIBUTES__NSELEMENTS = eINSTANCE.getXMLElementAttributes_Nselements();

    /**
     * The meta object literal for the '<em><b>Element Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE = eINSTANCE.getXMLElementAttributes_ElementValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_ELEMENT_ATTRIBUTES__NAME = eINSTANCE.getXMLElementAttributes_Name();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.AttrNSImpl <em>Attr NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.AttrNSImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getAttrNS()
     * @generated
     */
    EClass ATTR_NS = eINSTANCE.getAttrNS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_NS__NAME = eINSTANCE.getAttrNS_Name();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.VocNSImpl <em>Voc NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.VocNSImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getVocNS()
     * @generated
     */
    EClass VOC_NS = eINSTANCE.getVocNS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOC_NS__NAME = eINSTANCE.getVocNS_Name();

    /**
     * The meta object literal for the '{@link ro.fii.wade.voces.metavoc.impl.NSElementImpl <em>NS Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.fii.wade.voces.metavoc.impl.NSElementImpl
     * @see ro.fii.wade.voces.metavoc.impl.MetavocPackageImpl#getNSElement()
     * @generated
     */
    EClass NS_ELEMENT = eINSTANCE.getNSElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NS_ELEMENT__NAME = eINSTANCE.getNSElement_Name();

  }

} //MetavocPackage

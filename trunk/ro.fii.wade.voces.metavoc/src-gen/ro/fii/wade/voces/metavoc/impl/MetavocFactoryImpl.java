/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ro.fii.wade.voces.metavoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetavocFactoryImpl extends EFactoryImpl implements MetavocFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MetavocFactory init()
  {
    try
    {
      MetavocFactory theMetavocFactory = (MetavocFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fii.ro/wade/voces/Metavoc"); 
      if (theMetavocFactory != null)
      {
        return theMetavocFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MetavocFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetavocFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MetavocPackage.XML_MODEL: return createXMLModel();
      case MetavocPackage.XML_VALID_ELEMENT: return createXMLValidElement();
      case MetavocPackage.XML_START_ELEMENT: return createXMLStartElement();
      case MetavocPackage.XML_END_ELEMENT: return createXMLEndElement();
      case MetavocPackage.XML_ELEMENT_TEXT: return createXMLElementText();
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES: return createXMLElementAttributes();
      case MetavocPackage.ATTR_NS: return createAttrNS();
      case MetavocPackage.VOC_NS: return createVocNS();
      case MetavocPackage.NS_ELEMENT: return createNSElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLModel createXMLModel()
  {
    XMLModelImpl xmlModel = new XMLModelImpl();
    return xmlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLValidElement createXMLValidElement()
  {
    XMLValidElementImpl xmlValidElement = new XMLValidElementImpl();
    return xmlValidElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLStartElement createXMLStartElement()
  {
    XMLStartElementImpl xmlStartElement = new XMLStartElementImpl();
    return xmlStartElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLEndElement createXMLEndElement()
  {
    XMLEndElementImpl xmlEndElement = new XMLEndElementImpl();
    return xmlEndElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLElementText createXMLElementText()
  {
    XMLElementTextImpl xmlElementText = new XMLElementTextImpl();
    return xmlElementText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLElementAttributes createXMLElementAttributes()
  {
    XMLElementAttributesImpl xmlElementAttributes = new XMLElementAttributesImpl();
    return xmlElementAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrNS createAttrNS()
  {
    AttrNSImpl attrNS = new AttrNSImpl();
    return attrNS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VocNS createVocNS()
  {
    VocNSImpl vocNS = new VocNSImpl();
    return vocNS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NSElement createNSElement()
  {
    NSElementImpl nsElement = new NSElementImpl();
    return nsElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetavocPackage getMetavocPackage()
  {
    return (MetavocPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MetavocPackage getPackage()
  {
    return MetavocPackage.eINSTANCE;
  }

} //MetavocFactoryImpl

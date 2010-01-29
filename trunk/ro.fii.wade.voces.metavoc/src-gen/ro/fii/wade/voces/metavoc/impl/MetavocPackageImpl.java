/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ro.fii.wade.voces.metavoc.AttrNS;
import ro.fii.wade.voces.metavoc.MetavocFactory;
import ro.fii.wade.voces.metavoc.MetavocPackage;
import ro.fii.wade.voces.metavoc.NSElement;
import ro.fii.wade.voces.metavoc.VocNS;
import ro.fii.wade.voces.metavoc.XMLElementAttributes;
import ro.fii.wade.voces.metavoc.XMLElementText;
import ro.fii.wade.voces.metavoc.XMLEndElement;
import ro.fii.wade.voces.metavoc.XMLModel;
import ro.fii.wade.voces.metavoc.XMLStartElement;
import ro.fii.wade.voces.metavoc.XMLValidElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetavocPackageImpl extends EPackageImpl implements MetavocPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlValidElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlStartElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlEndElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlElementTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlElementAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrNSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vocNSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nsElementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ro.fii.wade.voces.metavoc.MetavocPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MetavocPackageImpl()
  {
    super(eNS_URI, MetavocFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MetavocPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MetavocPackage init()
  {
    if (isInited) return (MetavocPackage)EPackage.Registry.INSTANCE.getEPackage(MetavocPackage.eNS_URI);

    // Obtain or create and register package
    MetavocPackageImpl theMetavocPackage = (MetavocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetavocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetavocPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMetavocPackage.createPackageContents();

    // Initialize created meta-data
    theMetavocPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMetavocPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MetavocPackage.eNS_URI, theMetavocPackage);
    return theMetavocPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLModel()
  {
    return xmlModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLModel_Contents()
  {
    return (EReference)xmlModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLValidElement()
  {
    return xmlValidElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLValidElement_Startelement()
  {
    return (EReference)xmlValidElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLValidElement_Children()
  {
    return (EReference)xmlValidElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMLValidElement_Name()
  {
    return (EAttribute)xmlValidElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMLValidElement_Content()
  {
    return (EAttribute)xmlValidElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLValidElement_Endelement()
  {
    return (EReference)xmlValidElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLStartElement()
  {
    return xmlStartElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLEndElement()
  {
    return xmlEndElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLElementText()
  {
    return xmlElementTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLElementText_Namespace()
  {
    return (EReference)xmlElementTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLElementText_Nselements()
  {
    return (EReference)xmlElementTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLElementText_Attributes()
  {
    return (EReference)xmlElementTextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLElementAttributes()
  {
    return xmlElementAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLElementAttributes_Namespace()
  {
    return (EReference)xmlElementAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLElementAttributes_Nselements()
  {
    return (EReference)xmlElementAttributesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMLElementAttributes_ElementValue()
  {
    return (EAttribute)xmlElementAttributesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMLElementAttributes_Name()
  {
    return (EAttribute)xmlElementAttributesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrNS()
  {
    return attrNSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrNS_Name()
  {
    return (EAttribute)attrNSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVocNS()
  {
    return vocNSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVocNS_Name()
  {
    return (EAttribute)vocNSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNSElement()
  {
    return nsElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNSElement_Name()
  {
    return (EAttribute)nsElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetavocFactory getMetavocFactory()
  {
    return (MetavocFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xmlModelEClass = createEClass(XML_MODEL);
    createEReference(xmlModelEClass, XML_MODEL__CONTENTS);

    xmlValidElementEClass = createEClass(XML_VALID_ELEMENT);
    createEReference(xmlValidElementEClass, XML_VALID_ELEMENT__STARTELEMENT);
    createEReference(xmlValidElementEClass, XML_VALID_ELEMENT__CHILDREN);
    createEAttribute(xmlValidElementEClass, XML_VALID_ELEMENT__NAME);
    createEAttribute(xmlValidElementEClass, XML_VALID_ELEMENT__CONTENT);
    createEReference(xmlValidElementEClass, XML_VALID_ELEMENT__ENDELEMENT);

    xmlStartElementEClass = createEClass(XML_START_ELEMENT);

    xmlEndElementEClass = createEClass(XML_END_ELEMENT);

    xmlElementTextEClass = createEClass(XML_ELEMENT_TEXT);
    createEReference(xmlElementTextEClass, XML_ELEMENT_TEXT__NAMESPACE);
    createEReference(xmlElementTextEClass, XML_ELEMENT_TEXT__NSELEMENTS);
    createEReference(xmlElementTextEClass, XML_ELEMENT_TEXT__ATTRIBUTES);

    xmlElementAttributesEClass = createEClass(XML_ELEMENT_ATTRIBUTES);
    createEReference(xmlElementAttributesEClass, XML_ELEMENT_ATTRIBUTES__NAMESPACE);
    createEReference(xmlElementAttributesEClass, XML_ELEMENT_ATTRIBUTES__NSELEMENTS);
    createEAttribute(xmlElementAttributesEClass, XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE);
    createEAttribute(xmlElementAttributesEClass, XML_ELEMENT_ATTRIBUTES__NAME);

    attrNSEClass = createEClass(ATTR_NS);
    createEAttribute(attrNSEClass, ATTR_NS__NAME);

    vocNSEClass = createEClass(VOC_NS);
    createEAttribute(vocNSEClass, VOC_NS__NAME);

    nsElementEClass = createEClass(NS_ELEMENT);
    createEAttribute(nsElementEClass, NS_ELEMENT__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    xmlElementTextEClass.getESuperTypes().add(this.getXMLStartElement());
    xmlElementTextEClass.getESuperTypes().add(this.getXMLEndElement());

    // Initialize classes and features; add operations and parameters
    initEClass(xmlModelEClass, XMLModel.class, "XMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLModel_Contents(), this.getXMLValidElement(), null, "contents", null, 0, -1, XMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlValidElementEClass, XMLValidElement.class, "XMLValidElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLValidElement_Startelement(), this.getXMLStartElement(), null, "startelement", null, 0, 1, XMLValidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLValidElement_Children(), this.getXMLValidElement(), null, "children", null, 0, -1, XMLValidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLValidElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLValidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLValidElement_Content(), ecorePackage.getEInt(), "content", null, 0, 1, XMLValidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLValidElement_Endelement(), this.getXMLEndElement(), null, "endelement", null, 0, 1, XMLValidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlStartElementEClass, XMLStartElement.class, "XMLStartElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xmlEndElementEClass, XMLEndElement.class, "XMLEndElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xmlElementTextEClass, XMLElementText.class, "XMLElementText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLElementText_Namespace(), this.getVocNS(), null, "namespace", null, 0, 1, XMLElementText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLElementText_Nselements(), this.getNSElement(), null, "nselements", null, 0, 1, XMLElementText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLElementText_Attributes(), this.getXMLElementAttributes(), null, "attributes", null, 0, 1, XMLElementText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlElementAttributesEClass, XMLElementAttributes.class, "XMLElementAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLElementAttributes_Namespace(), this.getAttrNS(), null, "namespace", null, 0, 1, XMLElementAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLElementAttributes_Nselements(), this.getNSElement(), null, "nselements", null, 0, 1, XMLElementAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLElementAttributes_ElementValue(), ecorePackage.getEString(), "elementValue", null, 0, 1, XMLElementAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLElementAttributes_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLElementAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrNSEClass, AttrNS.class, "AttrNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttrNS_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttrNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vocNSEClass, VocNS.class, "VocNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVocNS_Name(), ecorePackage.getEString(), "name", null, 0, 1, VocNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nsElementEClass, NSElement.class, "NSElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNSElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NSElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MetavocPackageImpl

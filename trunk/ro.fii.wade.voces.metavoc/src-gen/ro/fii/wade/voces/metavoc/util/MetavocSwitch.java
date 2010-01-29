/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ro.fii.wade.voces.metavoc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ro.fii.wade.voces.metavoc.MetavocPackage
 * @generated
 */
public class MetavocSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MetavocPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetavocSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MetavocPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MetavocPackage.XML_MODEL:
      {
        XMLModel xmlModel = (XMLModel)theEObject;
        T result = caseXMLModel(xmlModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.XML_VALID_ELEMENT:
      {
        XMLValidElement xmlValidElement = (XMLValidElement)theEObject;
        T result = caseXMLValidElement(xmlValidElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.XML_START_ELEMENT:
      {
        XMLStartElement xmlStartElement = (XMLStartElement)theEObject;
        T result = caseXMLStartElement(xmlStartElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.XML_END_ELEMENT:
      {
        XMLEndElement xmlEndElement = (XMLEndElement)theEObject;
        T result = caseXMLEndElement(xmlEndElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.XML_ELEMENT_TEXT:
      {
        XMLElementText xmlElementText = (XMLElementText)theEObject;
        T result = caseXMLElementText(xmlElementText);
        if (result == null) result = caseXMLStartElement(xmlElementText);
        if (result == null) result = caseXMLEndElement(xmlElementText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES:
      {
        XMLElementAttributes xmlElementAttributes = (XMLElementAttributes)theEObject;
        T result = caseXMLElementAttributes(xmlElementAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.ATTR_NS:
      {
        AttrNS attrNS = (AttrNS)theEObject;
        T result = caseAttrNS(attrNS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.VOC_NS:
      {
        VocNS vocNS = (VocNS)theEObject;
        T result = caseVocNS(vocNS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetavocPackage.NS_ELEMENT:
      {
        NSElement nsElement = (NSElement)theEObject;
        T result = caseNSElement(nsElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLModel(XMLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Valid Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Valid Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLValidElement(XMLValidElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Start Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Start Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLStartElement(XMLStartElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML End Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML End Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLEndElement(XMLEndElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Element Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Element Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLElementText(XMLElementText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Element Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Element Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLElementAttributes(XMLElementAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr NS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr NS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrNS(AttrNS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Voc NS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Voc NS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVocNS(VocNS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NS Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NS Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNSElement(NSElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MetavocSwitch

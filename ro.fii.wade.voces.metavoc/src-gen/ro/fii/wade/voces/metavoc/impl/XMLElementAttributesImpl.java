/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ro.fii.wade.voces.metavoc.AttrNS;
import ro.fii.wade.voces.metavoc.MetavocPackage;
import ro.fii.wade.voces.metavoc.NSElement;
import ro.fii.wade.voces.metavoc.XMLElementAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl#getNselements <em>Nselements</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl#getElementValue <em>Element Value</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementAttributesImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLElementAttributesImpl extends MinimalEObjectImpl.Container implements XMLElementAttributes
{
  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected AttrNS namespace;

  /**
   * The cached value of the '{@link #getNselements() <em>Nselements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNselements()
   * @generated
   * @ordered
   */
  protected NSElement nselements;

  /**
   * The default value of the '{@link #getElementValue() <em>Element Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementValue()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElementValue() <em>Element Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementValue()
   * @generated
   * @ordered
   */
  protected String elementValue = ELEMENT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLElementAttributesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MetavocPackage.Literals.XML_ELEMENT_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrNS getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(AttrNS newNamespace, NotificationChain msgs)
  {
    AttrNS oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(AttrNS newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NSElement getNselements()
  {
    return nselements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNselements(NSElement newNselements, NotificationChain msgs)
  {
    NSElement oldNselements = nselements;
    nselements = newNselements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS, oldNselements, newNselements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNselements(NSElement newNselements)
  {
    if (newNselements != nselements)
    {
      NotificationChain msgs = null;
      if (nselements != null)
        msgs = ((InternalEObject)nselements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS, null, msgs);
      if (newNselements != null)
        msgs = ((InternalEObject)newNselements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS, null, msgs);
      msgs = basicSetNselements(newNselements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS, newNselements, newNselements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementValue()
  {
    return elementValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementValue(String newElementValue)
  {
    String oldElementValue = elementValue;
    elementValue = newElementValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE, oldElementValue, elementValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS:
        return basicSetNselements(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE:
        return getNamespace();
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS:
        return getNselements();
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE:
        return getElementValue();
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE:
        setNamespace((AttrNS)newValue);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS:
        setNselements((NSElement)newValue);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE:
        setElementValue((String)newValue);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE:
        setNamespace((AttrNS)null);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS:
        setNselements((NSElement)null);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE:
        setElementValue(ELEMENT_VALUE_EDEFAULT);
        return;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAMESPACE:
        return namespace != null;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NSELEMENTS:
        return nselements != null;
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__ELEMENT_VALUE:
        return ELEMENT_VALUE_EDEFAULT == null ? elementValue != null : !ELEMENT_VALUE_EDEFAULT.equals(elementValue);
      case MetavocPackage.XML_ELEMENT_ATTRIBUTES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (elementValue: ");
    result.append(elementValue);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //XMLElementAttributesImpl

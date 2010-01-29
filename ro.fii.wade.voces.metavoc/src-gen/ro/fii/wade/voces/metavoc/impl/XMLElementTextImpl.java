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

import ro.fii.wade.voces.metavoc.MetavocPackage;
import ro.fii.wade.voces.metavoc.NSElement;
import ro.fii.wade.voces.metavoc.VocNS;
import ro.fii.wade.voces.metavoc.XMLElementAttributes;
import ro.fii.wade.voces.metavoc.XMLElementText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl#getNselements <em>Nselements</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLElementTextImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLElementTextImpl extends XMLStartElementImpl implements XMLElementText
{
  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected VocNS namespace;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected XMLElementAttributes attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLElementTextImpl()
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
    return MetavocPackage.Literals.XML_ELEMENT_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VocNS getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(VocNS newNamespace, NotificationChain msgs)
  {
    VocNS oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(VocNS newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE, newNamespace, newNamespace));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS, oldNselements, newNselements);
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
        msgs = ((InternalEObject)nselements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS, null, msgs);
      if (newNselements != null)
        msgs = ((InternalEObject)newNselements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS, null, msgs);
      msgs = basicSetNselements(newNselements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS, newNselements, newNselements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLElementAttributes getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(XMLElementAttributes newAttributes, NotificationChain msgs)
  {
    XMLElementAttributes oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(XMLElementAttributes newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES, newAttributes, newAttributes));
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
      case MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS:
        return basicSetNselements(null, msgs);
      case MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
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
      case MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE:
        return getNamespace();
      case MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS:
        return getNselements();
      case MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES:
        return getAttributes();
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
      case MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE:
        setNamespace((VocNS)newValue);
        return;
      case MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS:
        setNselements((NSElement)newValue);
        return;
      case MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES:
        setAttributes((XMLElementAttributes)newValue);
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
      case MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE:
        setNamespace((VocNS)null);
        return;
      case MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS:
        setNselements((NSElement)null);
        return;
      case MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES:
        setAttributes((XMLElementAttributes)null);
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
      case MetavocPackage.XML_ELEMENT_TEXT__NAMESPACE:
        return namespace != null;
      case MetavocPackage.XML_ELEMENT_TEXT__NSELEMENTS:
        return nselements != null;
      case MetavocPackage.XML_ELEMENT_TEXT__ATTRIBUTES:
        return attributes != null;
    }
    return super.eIsSet(featureID);
  }

} //XMLElementTextImpl

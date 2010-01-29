/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ro.fii.wade.voces.metavoc.MetavocPackage;
import ro.fii.wade.voces.metavoc.XMLEndElement;
import ro.fii.wade.voces.metavoc.XMLStartElement;
import ro.fii.wade.voces.metavoc.XMLValidElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Valid Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl#getStartelement <em>Startelement</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl#getContent <em>Content</em>}</li>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLValidElementImpl#getEndelement <em>Endelement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLValidElementImpl extends MinimalEObjectImpl.Container implements XMLValidElement
{
  /**
   * The cached value of the '{@link #getStartelement() <em>Startelement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartelement()
   * @generated
   * @ordered
   */
  protected XMLStartElement startelement;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<XMLValidElement> children;

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
   * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected static final int CONTENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected int content = CONTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getEndelement() <em>Endelement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndelement()
   * @generated
   * @ordered
   */
  protected XMLEndElement endelement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLValidElementImpl()
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
    return MetavocPackage.Literals.XML_VALID_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLStartElement getStartelement()
  {
    return startelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartelement(XMLStartElement newStartelement, NotificationChain msgs)
  {
    XMLStartElement oldStartelement = startelement;
    startelement = newStartelement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT, oldStartelement, newStartelement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartelement(XMLStartElement newStartelement)
  {
    if (newStartelement != startelement)
    {
      NotificationChain msgs = null;
      if (startelement != null)
        msgs = ((InternalEObject)startelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT, null, msgs);
      if (newStartelement != null)
        msgs = ((InternalEObject)newStartelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT, null, msgs);
      msgs = basicSetStartelement(newStartelement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT, newStartelement, newStartelement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XMLValidElement> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<XMLValidElement>(XMLValidElement.class, this, MetavocPackage.XML_VALID_ELEMENT__CHILDREN);
    }
    return children;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(int newContent)
  {
    int oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLEndElement getEndelement()
  {
    return endelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndelement(XMLEndElement newEndelement, NotificationChain msgs)
  {
    XMLEndElement oldEndelement = endelement;
    endelement = newEndelement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT, oldEndelement, newEndelement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndelement(XMLEndElement newEndelement)
  {
    if (newEndelement != endelement)
    {
      NotificationChain msgs = null;
      if (endelement != null)
        msgs = ((InternalEObject)endelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT, null, msgs);
      if (newEndelement != null)
        msgs = ((InternalEObject)newEndelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT, null, msgs);
      msgs = basicSetEndelement(newEndelement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT, newEndelement, newEndelement));
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
      case MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT:
        return basicSetStartelement(null, msgs);
      case MetavocPackage.XML_VALID_ELEMENT__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT:
        return basicSetEndelement(null, msgs);
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
      case MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT:
        return getStartelement();
      case MetavocPackage.XML_VALID_ELEMENT__CHILDREN:
        return getChildren();
      case MetavocPackage.XML_VALID_ELEMENT__NAME:
        return getName();
      case MetavocPackage.XML_VALID_ELEMENT__CONTENT:
        return getContent();
      case MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT:
        return getEndelement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT:
        setStartelement((XMLStartElement)newValue);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends XMLValidElement>)newValue);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__CONTENT:
        setContent((Integer)newValue);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT:
        setEndelement((XMLEndElement)newValue);
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
      case MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT:
        setStartelement((XMLStartElement)null);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__CHILDREN:
        getChildren().clear();
        return;
      case MetavocPackage.XML_VALID_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__CONTENT:
        setContent(CONTENT_EDEFAULT);
        return;
      case MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT:
        setEndelement((XMLEndElement)null);
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
      case MetavocPackage.XML_VALID_ELEMENT__STARTELEMENT:
        return startelement != null;
      case MetavocPackage.XML_VALID_ELEMENT__CHILDREN:
        return children != null && !children.isEmpty();
      case MetavocPackage.XML_VALID_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetavocPackage.XML_VALID_ELEMENT__CONTENT:
        return content != CONTENT_EDEFAULT;
      case MetavocPackage.XML_VALID_ELEMENT__ENDELEMENT:
        return endelement != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //XMLValidElementImpl

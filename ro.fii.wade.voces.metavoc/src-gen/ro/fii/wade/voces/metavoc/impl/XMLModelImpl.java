/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ro.fii.wade.voces.metavoc.MetavocPackage;
import ro.fii.wade.voces.metavoc.XMLModel;
import ro.fii.wade.voces.metavoc.XMLValidElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.fii.wade.voces.metavoc.impl.XMLModelImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLModelImpl extends MinimalEObjectImpl.Container implements XMLModel
{
  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<XMLValidElement> contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLModelImpl()
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
    return MetavocPackage.Literals.XML_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XMLValidElement> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<XMLValidElement>(XMLValidElement.class, this, MetavocPackage.XML_MODEL__CONTENTS);
    }
    return contents;
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
      case MetavocPackage.XML_MODEL__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
      case MetavocPackage.XML_MODEL__CONTENTS:
        return getContents();
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
      case MetavocPackage.XML_MODEL__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends XMLValidElement>)newValue);
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
      case MetavocPackage.XML_MODEL__CONTENTS:
        getContents().clear();
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
      case MetavocPackage.XML_MODEL__CONTENTS:
        return contents != null && !contents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XMLModelImpl

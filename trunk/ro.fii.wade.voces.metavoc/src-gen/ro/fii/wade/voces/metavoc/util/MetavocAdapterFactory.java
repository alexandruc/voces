/**
 * <copyright>
 * </copyright>
 *

 */
package ro.fii.wade.voces.metavoc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ro.fii.wade.voces.metavoc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ro.fii.wade.voces.metavoc.MetavocPackage
 * @generated
 */
public class MetavocAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MetavocPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetavocAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MetavocPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetavocSwitch<Adapter> modelSwitch =
    new MetavocSwitch<Adapter>()
    {
      @Override
      public Adapter caseXMLModel(XMLModel object)
      {
        return createXMLModelAdapter();
      }
      @Override
      public Adapter caseXMLValidElement(XMLValidElement object)
      {
        return createXMLValidElementAdapter();
      }
      @Override
      public Adapter caseXMLStartElement(XMLStartElement object)
      {
        return createXMLStartElementAdapter();
      }
      @Override
      public Adapter caseXMLEndElement(XMLEndElement object)
      {
        return createXMLEndElementAdapter();
      }
      @Override
      public Adapter caseXMLElementText(XMLElementText object)
      {
        return createXMLElementTextAdapter();
      }
      @Override
      public Adapter caseXMLElementAttributes(XMLElementAttributes object)
      {
        return createXMLElementAttributesAdapter();
      }
      @Override
      public Adapter caseAttrNS(AttrNS object)
      {
        return createAttrNSAdapter();
      }
      @Override
      public Adapter caseVocNS(VocNS object)
      {
        return createVocNSAdapter();
      }
      @Override
      public Adapter caseNSElement(NSElement object)
      {
        return createNSElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLModel <em>XML Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLModel
   * @generated
   */
  public Adapter createXMLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLValidElement <em>XML Valid Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLValidElement
   * @generated
   */
  public Adapter createXMLValidElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLStartElement <em>XML Start Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLStartElement
   * @generated
   */
  public Adapter createXMLStartElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLEndElement <em>XML End Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLEndElement
   * @generated
   */
  public Adapter createXMLEndElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLElementText <em>XML Element Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLElementText
   * @generated
   */
  public Adapter createXMLElementTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.XMLElementAttributes <em>XML Element Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.XMLElementAttributes
   * @generated
   */
  public Adapter createXMLElementAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.AttrNS <em>Attr NS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.AttrNS
   * @generated
   */
  public Adapter createAttrNSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.VocNS <em>Voc NS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.VocNS
   * @generated
   */
  public Adapter createVocNSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ro.fii.wade.voces.metavoc.NSElement <em>NS Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ro.fii.wade.voces.metavoc.NSElement
   * @generated
   */
  public Adapter createNSElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MetavocAdapterFactory

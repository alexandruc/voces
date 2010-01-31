package ro.fii.wade.voces.highlighting;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import ro.fii.wade.voces.metavoc.XMLEndElement;
import ro.fii.wade.voces.metavoc.XMLModel;
import ro.fii.wade.voces.metavoc.XMLStartElement;
import ro.fii.wade.voces.metavoc.XMLValidElement;

public class MetavocSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	private static final int NS_INDEX = 0;
	private static final int NS_SEPARATOR_INDEX = 1;
	private static final int NS_ELEMENT_INDEX = 2;
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		
		if (resource.getContents().size() > 0) {
			// fetch the model
			XMLModel model = (XMLModel) resource.getContents().get(0);
			
			EList<XMLValidElement> modelElements = model.getContents();

			paintElements(modelElements, acceptor);
		}

	}
	
	private void paintElements(EList<XMLValidElement> elements, IHighlightedPositionAcceptor acceptor)
	{
		for(XMLValidElement xmlValidElem : elements )
		{
			
			XMLStartElement startElem = xmlValidElem.getStartelement();
			highlightStartAndEndElements(startElem, acceptor);
			
			XMLEndElement endElem = xmlValidElem.getEndelement();
			highlightStartAndEndElements(endElem, acceptor);
			
			paintElements(xmlValidElem.getChildren(), acceptor);
		}
	}
	
	private void highlightStartAndEndElements(EObject obj, IHighlightedPositionAcceptor acceptor) {
		NodeAdapter nadapter = NodeUtil.getNodeAdapter(obj);
		if (nadapter != null) {
			CompositeNode node = nadapter.getParserNode();
			if (node != null) {
				EList<LeafNode> leafNodes = node.getLeafNodes();

				int leafIndex = 0;
				// there should be 3 leafs (ns : nselem)
				for (LeafNode leaf : leafNodes) {
					switch (leafIndex) {
					case NS_INDEX: {
						acceptor
								.addPosition(
										leaf.getOffset(),
										leaf.getLength(),
										MetavocSemanticHighlightingConfiguration.NAMESPACE_ID);
						break;
					}
					case NS_SEPARATOR_INDEX: {
						acceptor
								.addPosition(
										leaf.getOffset(),
										leaf.getLength(),
										MetavocSemanticHighlightingConfiguration.NAMESPACE_SEPARATOR_ID);
						break;
					}
					case NS_ELEMENT_INDEX: {
						acceptor
								.addPosition(
										leaf.getOffset(),
										leaf.getLength(),
										MetavocSemanticHighlightingConfiguration.NAMESPACE_ELEMENT_ID);
						break;
					}
					default: {
						break;
					}

					}
					leafIndex++;
				}

			}
		}
	
	}

}

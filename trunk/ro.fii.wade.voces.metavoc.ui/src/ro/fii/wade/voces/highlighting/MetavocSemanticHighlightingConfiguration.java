package ro.fii.wade.voces.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class MetavocSemanticHighlightingConfiguration implements ISemanticHighlightingConfiguration {

	public static final String NAMESPACE_ID = "Namespace";
	public static final String NAMESPACE_ELEMENT_ID = "NamespaceElement";
	public static final String NAMESPACE_SEPARATOR_ID = "NamespaceSeparator";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		acceptor.acceptDefaultHighlighting(NAMESPACE_ID, "Namespace", namespaceType());
		acceptor.acceptDefaultHighlighting(NAMESPACE_ELEMENT_ID, "NamespaceElement", namespaceElementType());
		acceptor.acceptDefaultHighlighting(NAMESPACE_SEPARATOR_ID, "NamespaceSeparator", namespaceSeparatorType());
	}
	
	public TextStyle namespaceType() {
	    TextStyle textStyle = new TextStyle();
	    //textStyle.setBackgroundColor(new RGB(155, 55, 255));
	    textStyle.setColor(new RGB(0, 0, 150));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	  }

	public TextStyle namespaceElementType() {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setColor(new RGB(0, 150, 0));
	    return textStyle;
	  }

	public TextStyle namespaceSeparatorType() {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setColor(new RGB(255, 0, 0));
	    return textStyle;
	  }
}

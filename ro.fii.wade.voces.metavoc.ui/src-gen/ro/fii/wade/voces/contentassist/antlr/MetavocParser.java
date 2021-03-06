/*
* generated by Xtext
*/
package ro.fii.wade.voces.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ro.fii.wade.voces.services.MetavocGrammarAccess;

public class MetavocParser extends AbstractContentAssistParser {
	
	@Inject
	private MetavocGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocLexer createLexer(CharStream stream) {
		return new ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocLexer(stream);
	}
	
	@Override
	protected ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocParser createParser() {
		ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocParser result = new ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getXMLValidElementAccess().getAlternatives_1(), "rule__XMLValidElement__Alternatives_1");
					put(grammarAccess.getXMLValidElementAccess().getGroup(), "rule__XMLValidElement__Group__0");
					put(grammarAccess.getXMLStartElementAccess().getGroup(), "rule__XMLStartElement__Group__0");
					put(grammarAccess.getXMLEndElementAccess().getGroup(), "rule__XMLEndElement__Group__0");
					put(grammarAccess.getXMLElementTextAccess().getGroup(), "rule__XMLElementText__Group__0");
					put(grammarAccess.getXMLElementAttributesAccess().getGroup(), "rule__XMLElementAttributes__Group__0");
					put(grammarAccess.getXMLModelAccess().getContentsAssignment(), "rule__XMLModel__ContentsAssignment");
					put(grammarAccess.getXMLValidElementAccess().getStartelementAssignment_0(), "rule__XMLValidElement__StartelementAssignment_0");
					put(grammarAccess.getXMLValidElementAccess().getChildrenAssignment_1_0(), "rule__XMLValidElement__ChildrenAssignment_1_0");
					put(grammarAccess.getXMLValidElementAccess().getNameAssignment_1_1(), "rule__XMLValidElement__NameAssignment_1_1");
					put(grammarAccess.getXMLValidElementAccess().getContentAssignment_1_2(), "rule__XMLValidElement__ContentAssignment_1_2");
					put(grammarAccess.getXMLValidElementAccess().getEndelementAssignment_2(), "rule__XMLValidElement__EndelementAssignment_2");
					put(grammarAccess.getXMLElementTextAccess().getNamespaceAssignment_0(), "rule__XMLElementText__NamespaceAssignment_0");
					put(grammarAccess.getXMLElementTextAccess().getNselementsAssignment_2(), "rule__XMLElementText__NselementsAssignment_2");
					put(grammarAccess.getXMLElementTextAccess().getAttributesAssignment_3(), "rule__XMLElementText__AttributesAssignment_3");
					put(grammarAccess.getXMLElementAttributesAccess().getNamespaceAssignment_0(), "rule__XMLElementAttributes__NamespaceAssignment_0");
					put(grammarAccess.getXMLElementAttributesAccess().getNselementsAssignment_2(), "rule__XMLElementAttributes__NselementsAssignment_2");
					put(grammarAccess.getXMLElementAttributesAccess().getElementValueAssignment_4(), "rule__XMLElementAttributes__ElementValueAssignment_4");
					put(grammarAccess.getXMLElementAttributesAccess().getNameAssignment_5(), "rule__XMLElementAttributes__NameAssignment_5");
					put(grammarAccess.getAttrNSAccess().getNameAssignment(), "rule__AttrNS__NameAssignment");
					put(grammarAccess.getVocNSAccess().getNameAssignment(), "rule__VocNS__NameAssignment");
					put(grammarAccess.getNSElementAccess().getNameAssignment(), "rule__NSElement__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocParser typedParser = (ro.fii.wade.voces.contentassist.antlr.internal.InternalMetavocParser) parser;
			typedParser.entryRuleXMLModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MetavocGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MetavocGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

/*
* generated by Xtext
*/
grammar InternalMetavoc;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package ro.fii.wade.voces.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ro.fii.wade.voces.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import ro.fii.wade.voces.services.MetavocGrammarAccess;

}

@parser::members {
 
 	private MetavocGrammarAccess grammarAccess;
 	
    public InternalMetavocParser(TokenStream input, IAstFactory factory, MetavocGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "XMLModel";	
   	} 
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleXMLModel
entryRuleXMLModel returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLModelRule(), currentNode); }
	 iv_ruleXMLModel=ruleXMLModel 
	 { $current=$iv_ruleXMLModel.current; } 
	 EOF 
;

// Rule XMLModel
ruleXMLModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLModelAccess().getContentsXMLValidElementParserRuleCall_0(), currentNode); 
	    }
	    lv_contents_0=ruleXMLValidElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "contents", lv_contents_0, "XMLValidElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*;





// Entry rule entryRuleXMLValidElement
entryRuleXMLValidElement returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLValidElementRule(), currentNode); }
	 iv_ruleXMLValidElement=ruleXMLValidElement 
	 { $current=$iv_ruleXMLValidElement.current; } 
	 EOF 
;

// Rule XMLValidElement
ruleXMLValidElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getStartelementXMLStartElementParserRuleCall_0_0(), currentNode); 
	    }
	    lv_startelement_0=ruleXMLStartElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "startelement", lv_startelement_0, "XMLStartElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getChildrenXMLValidElementParserRuleCall_1_0_0(), currentNode); 
	    }
	    lv_children_1=ruleXMLValidElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "children", lv_children_1, "XMLValidElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*
    |(	
	
	    lv_name_2=	RULE_ID
	{
		createLeafNode(grammarAccess.getXMLValidElementAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_2, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)
    |(	
	
	    lv_content_3=	RULE_INT
	{
		createLeafNode(grammarAccess.getXMLValidElementAccess().getContentINTTerminalRuleCall_1_2_0(), "content"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "content", lv_content_3, "INT", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getEndelementXMLEndElementParserRuleCall_2_0(), currentNode); 
	    }
	    lv_endelement_4=ruleXMLEndElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "endelement", lv_endelement_4, "XMLEndElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
));





// Entry rule entryRuleXMLStartElement
entryRuleXMLStartElement returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLStartElementRule(), currentNode); }
	 iv_ruleXMLStartElement=ruleXMLStartElement 
	 { $current=$iv_ruleXMLStartElement.current; } 
	 EOF 
;

// Rule XMLStartElement
ruleXMLStartElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('<' 
    {
        createLeafNode(grammarAccess.getXMLStartElementAccess().getLessThanSignKeyword_0(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getXMLStartElementAccess().getXMLElementTextParserRuleCall_1(), currentNode); 
    }
    this_XMLElementText_1=ruleXMLElementText
    { 
        $current = $this_XMLElementText_1.current; 
        currentNode = currentNode.getParent();
    }
'>' 
    {
        createLeafNode(grammarAccess.getXMLStartElementAccess().getGreaterThanSignKeyword_2(), null); 
    }
);





// Entry rule entryRuleXMLEndElement
entryRuleXMLEndElement returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLEndElementRule(), currentNode); }
	 iv_ruleXMLEndElement=ruleXMLEndElement 
	 { $current=$iv_ruleXMLEndElement.current; } 
	 EOF 
;

// Rule XMLEndElement
ruleXMLEndElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('</' 
    {
        createLeafNode(grammarAccess.getXMLEndElementAccess().getLessThanSignSolidusKeyword_0(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getXMLEndElementAccess().getXMLElementTextParserRuleCall_1(), currentNode); 
    }
    this_XMLElementText_1=ruleXMLElementText
    { 
        $current = $this_XMLElementText_1.current; 
        currentNode = currentNode.getParent();
    }
'>' 
    {
        createLeafNode(grammarAccess.getXMLEndElementAccess().getGreaterThanSignKeyword_2(), null); 
    }
);





// Entry rule entryRuleXMLElementText
entryRuleXMLElementText returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLElementTextRule(), currentNode); }
	 iv_ruleXMLElementText=ruleXMLElementText 
	 { $current=$iv_ruleXMLElementText.current; } 
	 EOF 
;

// Rule XMLElementText
ruleXMLElementText returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getNamespaceVocNSParserRuleCall_0_0(), currentNode); 
	    }
	    lv_namespace_0=ruleVocNS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "namespace", lv_namespace_0, "VocNS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)':' 
    {
        createLeafNode(grammarAccess.getXMLElementTextAccess().getColonKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getNselementsNSElementParserRuleCall_2_0(), currentNode); 
	    }
	    lv_nselements_2=ruleNSElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "nselements", lv_nselements_2, "NSElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getAttributesXMLElementAttributesParserRuleCall_3_0(), currentNode); 
	    }
	    lv_attributes_3=ruleXMLElementAttributes 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "attributes", lv_attributes_3, "XMLElementAttributes", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*);





// Entry rule entryRuleXMLElementAttributes
entryRuleXMLElementAttributes returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getXMLElementAttributesRule(), currentNode); }
	 iv_ruleXMLElementAttributes=ruleXMLElementAttributes 
	 { $current=$iv_ruleXMLElementAttributes.current; } 
	 EOF 
;

// Rule XMLElementAttributes
ruleXMLElementAttributes returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLElementAttributesAccess().getNamespaceAttrNSParserRuleCall_0_0(), currentNode); 
	    }
	    lv_namespace_0=ruleAttrNS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "namespace", lv_namespace_0, "AttrNS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)':' 
    {
        createLeafNode(grammarAccess.getXMLElementAttributesAccess().getColonKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getXMLElementAttributesAccess().getNselementsNSElementParserRuleCall_2_0(), currentNode); 
	    }
	    lv_nselements_2=ruleNSElement 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "nselements", lv_nselements_2, "NSElement", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'=' 
    {
        createLeafNode(grammarAccess.getXMLElementAttributesAccess().getEqualsSignKeyword_3(), null); 
    }
(	
	
	    lv_elementValue_4='"' 
    {
        createLeafNode(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0(), "elementValue"); 
    }

 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "elementValue", /* lv_elementValue_4 */ input.LT(-1), "\"", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)(	
	
	    lv_name_5=	RULE_ID
	{
		createLeafNode(grammarAccess.getXMLElementAttributesAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_5, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)'"' 
    {
        createLeafNode(grammarAccess.getXMLElementAttributesAccess().getQuotationMarkKeyword_6(), null); 
    }
);





// Entry rule entryRuleAttrNS
entryRuleAttrNS returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getAttrNSRule(), currentNode); }
	 iv_ruleAttrNS=ruleAttrNS 
	 { $current=$iv_ruleAttrNS.current; } 
	 EOF 
;

// Rule AttrNS
ruleAttrNS returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    lv_name_0=	RULE_ID
	{
		createLeafNode(grammarAccess.getAttrNSAccess().getNameIDTerminalRuleCall_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAttrNSRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
);





// Entry rule entryRuleVocNS
entryRuleVocNS returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getVocNSRule(), currentNode); }
	 iv_ruleVocNS=ruleVocNS 
	 { $current=$iv_ruleVocNS.current; } 
	 EOF 
;

// Rule VocNS
ruleVocNS returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    lv_name_0=	RULE_ID
	{
		createLeafNode(grammarAccess.getVocNSAccess().getNameIDTerminalRuleCall_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getVocNSRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
);





// Entry rule entryRuleNSElement
entryRuleNSElement returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getNSElementRule(), currentNode); }
	 iv_ruleNSElement=ruleNSElement 
	 { $current=$iv_ruleNSElement.current; } 
	 EOF 
;

// Rule NSElement
ruleNSElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    lv_name_0=	RULE_ID
	{
		createLeafNode(grammarAccess.getNSElementAccess().getNameIDTerminalRuleCall_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNSElementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
);





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


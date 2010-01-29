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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMetavocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'</'", "':'", "'='", "'\"'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMetavocParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g"; }


     
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



    // $ANTLR start entryRuleXMLModel
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:72:1: entryRuleXMLModel returns [EObject current=null] : iv_ruleXMLModel= ruleXMLModel EOF ;
    public final EObject entryRuleXMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLModel = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:72:50: (iv_ruleXMLModel= ruleXMLModel EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:73:2: iv_ruleXMLModel= ruleXMLModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLModel_in_entryRuleXMLModel73);
            iv_ruleXMLModel=ruleXMLModel();
            _fsp--;

             current =iv_ruleXMLModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLModel


    // $ANTLR start ruleXMLModel
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:80:1: ruleXMLModel returns [EObject current=null] : (lv_contents_0= ruleXMLValidElement )* ;
    public final EObject ruleXMLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:85:6: ( (lv_contents_0= ruleXMLValidElement )* )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:86:1: (lv_contents_0= ruleXMLValidElement )*
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:86:1: (lv_contents_0= ruleXMLValidElement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:89:6: lv_contents_0= ruleXMLValidElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getXMLModelAccess().getContentsXMLValidElementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleXMLValidElement_in_ruleXMLModel141);
            	    lv_contents_0=ruleXMLValidElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getXMLModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "contents", lv_contents_0, "XMLValidElement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLModel


    // $ANTLR start entryRuleXMLValidElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:114:1: entryRuleXMLValidElement returns [EObject current=null] : iv_ruleXMLValidElement= ruleXMLValidElement EOF ;
    public final EObject entryRuleXMLValidElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLValidElement = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:114:57: (iv_ruleXMLValidElement= ruleXMLValidElement EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:115:2: iv_ruleXMLValidElement= ruleXMLValidElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLValidElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLValidElement_in_entryRuleXMLValidElement178);
            iv_ruleXMLValidElement=ruleXMLValidElement();
            _fsp--;

             current =iv_ruleXMLValidElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLValidElement188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLValidElement


    // $ANTLR start ruleXMLValidElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:122:1: ruleXMLValidElement returns [EObject current=null] : ( (lv_startelement_0= ruleXMLStartElement ) ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) ) (lv_endelement_4= ruleXMLEndElement ) ) ;
    public final EObject ruleXMLValidElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_content_3=null;
        EObject lv_startelement_0 = null;

        EObject lv_children_1 = null;

        EObject lv_endelement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:127:6: ( ( (lv_startelement_0= ruleXMLStartElement ) ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) ) (lv_endelement_4= ruleXMLEndElement ) ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:128:1: ( (lv_startelement_0= ruleXMLStartElement ) ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) ) (lv_endelement_4= ruleXMLEndElement ) )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:128:1: ( (lv_startelement_0= ruleXMLStartElement ) ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) ) (lv_endelement_4= ruleXMLEndElement ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:128:2: (lv_startelement_0= ruleXMLStartElement ) ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) ) (lv_endelement_4= ruleXMLEndElement )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:128:2: (lv_startelement_0= ruleXMLStartElement )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:131:6: lv_startelement_0= ruleXMLStartElement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getStartelementXMLStartElementParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleXMLStartElement_in_ruleXMLValidElement247);
            lv_startelement_0=ruleXMLStartElement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "startelement", lv_startelement_0, "XMLStartElement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:149:2: ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("149:2: ( (lv_children_1= ruleXMLValidElement )* | (lv_name_2= RULE_ID ) | (lv_content_3= RULE_INT ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:149:3: (lv_children_1= ruleXMLValidElement )*
                    {
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:149:3: (lv_children_1= ruleXMLValidElement )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==11) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:152:6: lv_children_1= ruleXMLValidElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getChildrenXMLValidElementParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleXMLValidElement_in_ruleXMLValidElement286);
                    	    lv_children_1=ruleXMLValidElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "children", lv_children_1, "XMLValidElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:171:6: (lv_name_2= RULE_ID )
                    {
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:171:6: (lv_name_2= RULE_ID )
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:173:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMLValidElement319); 

                    		createLeafNode(grammarAccess.getXMLValidElementAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 3 :
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:192:6: (lv_content_3= RULE_INT )
                    {
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:192:6: (lv_content_3= RULE_INT )
                    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:194:6: lv_content_3= RULE_INT
                    {
                    lv_content_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXMLValidElement355); 

                    		createLeafNode(grammarAccess.getXMLValidElementAccess().getContentINTTerminalRuleCall_1_2_0(), "content"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "content", lv_content_3, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:212:3: (lv_endelement_4= ruleXMLEndElement )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:215:6: lv_endelement_4= ruleXMLEndElement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLValidElementAccess().getEndelementXMLEndElementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleXMLEndElement_in_ruleXMLValidElement398);
            lv_endelement_4=ruleXMLEndElement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLValidElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "endelement", lv_endelement_4, "XMLEndElement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLValidElement


    // $ANTLR start entryRuleXMLStartElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:240:1: entryRuleXMLStartElement returns [EObject current=null] : iv_ruleXMLStartElement= ruleXMLStartElement EOF ;
    public final EObject entryRuleXMLStartElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLStartElement = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:240:57: (iv_ruleXMLStartElement= ruleXMLStartElement EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:241:2: iv_ruleXMLStartElement= ruleXMLStartElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLStartElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLStartElement_in_entryRuleXMLStartElement435);
            iv_ruleXMLStartElement=ruleXMLStartElement();
            _fsp--;

             current =iv_ruleXMLStartElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLStartElement445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLStartElement


    // $ANTLR start ruleXMLStartElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:248:1: ruleXMLStartElement returns [EObject current=null] : ( '<' this_XMLElementText_1= ruleXMLElementText '>' ) ;
    public final EObject ruleXMLStartElement() throws RecognitionException {
        EObject current = null;

        EObject this_XMLElementText_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:253:6: ( ( '<' this_XMLElementText_1= ruleXMLElementText '>' ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:254:1: ( '<' this_XMLElementText_1= ruleXMLElementText '>' )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:254:1: ( '<' this_XMLElementText_1= ruleXMLElementText '>' )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:254:2: '<' this_XMLElementText_1= ruleXMLElementText '>'
            {
            match(input,11,FOLLOW_11_in_ruleXMLStartElement479); 

                    createLeafNode(grammarAccess.getXMLStartElementAccess().getLessThanSignKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getXMLStartElementAccess().getXMLElementTextParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleXMLElementText_in_ruleXMLStartElement501);
            this_XMLElementText_1=ruleXMLElementText();
            _fsp--;

             
                    current = this_XMLElementText_1; 
                    currentNode = currentNode.getParent();
                
            match(input,12,FOLLOW_12_in_ruleXMLStartElement509); 

                    createLeafNode(grammarAccess.getXMLStartElementAccess().getGreaterThanSignKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLStartElement


    // $ANTLR start entryRuleXMLEndElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:278:1: entryRuleXMLEndElement returns [EObject current=null] : iv_ruleXMLEndElement= ruleXMLEndElement EOF ;
    public final EObject entryRuleXMLEndElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLEndElement = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:278:55: (iv_ruleXMLEndElement= ruleXMLEndElement EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:279:2: iv_ruleXMLEndElement= ruleXMLEndElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLEndElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLEndElement_in_entryRuleXMLEndElement542);
            iv_ruleXMLEndElement=ruleXMLEndElement();
            _fsp--;

             current =iv_ruleXMLEndElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLEndElement552); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLEndElement


    // $ANTLR start ruleXMLEndElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:286:1: ruleXMLEndElement returns [EObject current=null] : ( '</' this_XMLElementText_1= ruleXMLElementText '>' ) ;
    public final EObject ruleXMLEndElement() throws RecognitionException {
        EObject current = null;

        EObject this_XMLElementText_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:291:6: ( ( '</' this_XMLElementText_1= ruleXMLElementText '>' ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:292:1: ( '</' this_XMLElementText_1= ruleXMLElementText '>' )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:292:1: ( '</' this_XMLElementText_1= ruleXMLElementText '>' )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:292:2: '</' this_XMLElementText_1= ruleXMLElementText '>'
            {
            match(input,13,FOLLOW_13_in_ruleXMLEndElement586); 

                    createLeafNode(grammarAccess.getXMLEndElementAccess().getLessThanSignSolidusKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getXMLEndElementAccess().getXMLElementTextParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleXMLElementText_in_ruleXMLEndElement608);
            this_XMLElementText_1=ruleXMLElementText();
            _fsp--;

             
                    current = this_XMLElementText_1; 
                    currentNode = currentNode.getParent();
                
            match(input,12,FOLLOW_12_in_ruleXMLEndElement616); 

                    createLeafNode(grammarAccess.getXMLEndElementAccess().getGreaterThanSignKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLEndElement


    // $ANTLR start entryRuleXMLElementText
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:316:1: entryRuleXMLElementText returns [EObject current=null] : iv_ruleXMLElementText= ruleXMLElementText EOF ;
    public final EObject entryRuleXMLElementText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLElementText = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:316:56: (iv_ruleXMLElementText= ruleXMLElementText EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:317:2: iv_ruleXMLElementText= ruleXMLElementText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLElementTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLElementText_in_entryRuleXMLElementText649);
            iv_ruleXMLElementText=ruleXMLElementText();
            _fsp--;

             current =iv_ruleXMLElementText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLElementText659); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLElementText


    // $ANTLR start ruleXMLElementText
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:324:1: ruleXMLElementText returns [EObject current=null] : ( (lv_namespace_0= ruleVocNS ) ':' (lv_nselements_2= ruleNSElement ) (lv_attributes_3= ruleXMLElementAttributes )* ) ;
    public final EObject ruleXMLElementText() throws RecognitionException {
        EObject current = null;

        EObject lv_namespace_0 = null;

        EObject lv_nselements_2 = null;

        EObject lv_attributes_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:329:6: ( ( (lv_namespace_0= ruleVocNS ) ':' (lv_nselements_2= ruleNSElement ) (lv_attributes_3= ruleXMLElementAttributes )* ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:330:1: ( (lv_namespace_0= ruleVocNS ) ':' (lv_nselements_2= ruleNSElement ) (lv_attributes_3= ruleXMLElementAttributes )* )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:330:1: ( (lv_namespace_0= ruleVocNS ) ':' (lv_nselements_2= ruleNSElement ) (lv_attributes_3= ruleXMLElementAttributes )* )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:330:2: (lv_namespace_0= ruleVocNS ) ':' (lv_nselements_2= ruleNSElement ) (lv_attributes_3= ruleXMLElementAttributes )*
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:330:2: (lv_namespace_0= ruleVocNS )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:333:6: lv_namespace_0= ruleVocNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getNamespaceVocNSParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVocNS_in_ruleXMLElementText718);
            lv_namespace_0=ruleVocNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "namespace", lv_namespace_0, "VocNS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleXMLElementText731); 

                    createLeafNode(grammarAccess.getXMLElementTextAccess().getColonKeyword_1(), null); 
                
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:355:1: (lv_nselements_2= ruleNSElement )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:358:6: lv_nselements_2= ruleNSElement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getNselementsNSElementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNSElement_in_ruleXMLElementText765);
            lv_nselements_2=ruleNSElement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "nselements", lv_nselements_2, "NSElement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:376:2: (lv_attributes_3= ruleXMLElementAttributes )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:379:6: lv_attributes_3= ruleXMLElementAttributes
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getXMLElementTextAccess().getAttributesXMLElementAttributesParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleXMLElementAttributes_in_ruleXMLElementText803);
            	    lv_attributes_3=ruleXMLElementAttributes();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getXMLElementTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "attributes", lv_attributes_3, "XMLElementAttributes", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLElementText


    // $ANTLR start entryRuleXMLElementAttributes
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:404:1: entryRuleXMLElementAttributes returns [EObject current=null] : iv_ruleXMLElementAttributes= ruleXMLElementAttributes EOF ;
    public final EObject entryRuleXMLElementAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLElementAttributes = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:404:62: (iv_ruleXMLElementAttributes= ruleXMLElementAttributes EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:405:2: iv_ruleXMLElementAttributes= ruleXMLElementAttributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXMLElementAttributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleXMLElementAttributes_in_entryRuleXMLElementAttributes841);
            iv_ruleXMLElementAttributes=ruleXMLElementAttributes();
            _fsp--;

             current =iv_ruleXMLElementAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLElementAttributes851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleXMLElementAttributes


    // $ANTLR start ruleXMLElementAttributes
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:412:1: ruleXMLElementAttributes returns [EObject current=null] : ( (lv_namespace_0= ruleAttrNS ) ':' (lv_nselements_2= ruleNSElement ) '=' (lv_elementValue_4= '\"' ) (lv_name_5= RULE_ID ) '\"' ) ;
    public final EObject ruleXMLElementAttributes() throws RecognitionException {
        EObject current = null;

        Token lv_elementValue_4=null;
        Token lv_name_5=null;
        EObject lv_namespace_0 = null;

        EObject lv_nselements_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:417:6: ( ( (lv_namespace_0= ruleAttrNS ) ':' (lv_nselements_2= ruleNSElement ) '=' (lv_elementValue_4= '\"' ) (lv_name_5= RULE_ID ) '\"' ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:418:1: ( (lv_namespace_0= ruleAttrNS ) ':' (lv_nselements_2= ruleNSElement ) '=' (lv_elementValue_4= '\"' ) (lv_name_5= RULE_ID ) '\"' )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:418:1: ( (lv_namespace_0= ruleAttrNS ) ':' (lv_nselements_2= ruleNSElement ) '=' (lv_elementValue_4= '\"' ) (lv_name_5= RULE_ID ) '\"' )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:418:2: (lv_namespace_0= ruleAttrNS ) ':' (lv_nselements_2= ruleNSElement ) '=' (lv_elementValue_4= '\"' ) (lv_name_5= RULE_ID ) '\"'
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:418:2: (lv_namespace_0= ruleAttrNS )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:421:6: lv_namespace_0= ruleAttrNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLElementAttributesAccess().getNamespaceAttrNSParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttrNS_in_ruleXMLElementAttributes910);
            lv_namespace_0=ruleAttrNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "namespace", lv_namespace_0, "AttrNS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleXMLElementAttributes923); 

                    createLeafNode(grammarAccess.getXMLElementAttributesAccess().getColonKeyword_1(), null); 
                
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:443:1: (lv_nselements_2= ruleNSElement )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:446:6: lv_nselements_2= ruleNSElement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getXMLElementAttributesAccess().getNselementsNSElementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNSElement_in_ruleXMLElementAttributes957);
            lv_nselements_2=ruleNSElement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "nselements", lv_nselements_2, "NSElement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,15,FOLLOW_15_in_ruleXMLElementAttributes970); 

                    createLeafNode(grammarAccess.getXMLElementAttributesAccess().getEqualsSignKeyword_3(), null); 
                
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:468:1: (lv_elementValue_4= '\"' )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:470:6: lv_elementValue_4= '\"'
            {
            lv_elementValue_4=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleXMLElementAttributes991); 

                    createLeafNode(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0(), "elementValue"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "elementValue", /* lv_elementValue_4 */ input.LT(-1), "\"", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:489:2: (lv_name_5= RULE_ID )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:491:6: lv_name_5= RULE_ID
            {
            lv_name_5=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMLElementAttributes1026); 

            		createLeafNode(grammarAccess.getXMLElementAttributesAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXMLElementAttributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_5, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleXMLElementAttributes1043); 

                    createLeafNode(grammarAccess.getXMLElementAttributesAccess().getQuotationMarkKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleXMLElementAttributes


    // $ANTLR start entryRuleAttrNS
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:520:1: entryRuleAttrNS returns [EObject current=null] : iv_ruleAttrNS= ruleAttrNS EOF ;
    public final EObject entryRuleAttrNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrNS = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:520:48: (iv_ruleAttrNS= ruleAttrNS EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:521:2: iv_ruleAttrNS= ruleAttrNS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttrNSRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttrNS_in_entryRuleAttrNS1076);
            iv_ruleAttrNS=ruleAttrNS();
            _fsp--;

             current =iv_ruleAttrNS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrNS1086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttrNS


    // $ANTLR start ruleAttrNS
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:528:1: ruleAttrNS returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAttrNS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:533:6: ( (lv_name_0= RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:534:1: (lv_name_0= RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:534:1: (lv_name_0= RULE_ID )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:536:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrNS1132); 

            		createLeafNode(grammarAccess.getAttrNSAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttrNSRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttrNS


    // $ANTLR start entryRuleVocNS
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:561:1: entryRuleVocNS returns [EObject current=null] : iv_ruleVocNS= ruleVocNS EOF ;
    public final EObject entryRuleVocNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocNS = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:561:47: (iv_ruleVocNS= ruleVocNS EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:562:2: iv_ruleVocNS= ruleVocNS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVocNSRule(), currentNode); 
            pushFollow(FOLLOW_ruleVocNS_in_entryRuleVocNS1172);
            iv_ruleVocNS=ruleVocNS();
            _fsp--;

             current =iv_ruleVocNS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVocNS1182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVocNS


    // $ANTLR start ruleVocNS
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:569:1: ruleVocNS returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleVocNS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:574:6: ( (lv_name_0= RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:575:1: (lv_name_0= RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:575:1: (lv_name_0= RULE_ID )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:577:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVocNS1228); 

            		createLeafNode(grammarAccess.getVocNSAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVocNSRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVocNS


    // $ANTLR start entryRuleNSElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:602:1: entryRuleNSElement returns [EObject current=null] : iv_ruleNSElement= ruleNSElement EOF ;
    public final EObject entryRuleNSElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNSElement = null;


        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:602:51: (iv_ruleNSElement= ruleNSElement EOF )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:603:2: iv_ruleNSElement= ruleNSElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNSElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleNSElement_in_entryRuleNSElement1268);
            iv_ruleNSElement=ruleNSElement();
            _fsp--;

             current =iv_ruleNSElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNSElement1278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNSElement


    // $ANTLR start ruleNSElement
    // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:610:1: ruleNSElement returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleNSElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:615:6: ( (lv_name_0= RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:616:1: (lv_name_0= RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:616:1: (lv_name_0= RULE_ID )
            // ../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g:618:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNSElement1324); 

            		createLeafNode(grammarAccess.getNSElementAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNSElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNSElement


 

    public static final BitSet FOLLOW_ruleXMLModel_in_entryRuleXMLModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_ruleXMLModel141 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_entryRuleXMLValidElement178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLValidElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLStartElement_in_ruleXMLValidElement247 = new BitSet(new long[]{0x0000000000002830L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_ruleXMLValidElement286 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMLValidElement319 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXMLValidElement355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXMLEndElement_in_ruleXMLValidElement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLStartElement_in_entryRuleXMLStartElement435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLStartElement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXMLStartElement479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_ruleXMLStartElement501 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXMLStartElement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLEndElement_in_entryRuleXMLEndElement542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLEndElement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXMLEndElement586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_ruleXMLEndElement608 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXMLEndElement616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_entryRuleXMLElementText649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLElementText659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVocNS_in_ruleXMLElementText718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMLElementText731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNSElement_in_ruleXMLElementText765 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXMLElementAttributes_in_ruleXMLElementText803 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXMLElementAttributes_in_entryRuleXMLElementAttributes841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLElementAttributes851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrNS_in_ruleXMLElementAttributes910 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMLElementAttributes923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNSElement_in_ruleXMLElementAttributes957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXMLElementAttributes970 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMLElementAttributes991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMLElementAttributes1026 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMLElementAttributes1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrNS_in_entryRuleAttrNS1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrNS1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrNS1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVocNS_in_entryRuleVocNS1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVocNS1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVocNS1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNSElement_in_entryRuleNSElement1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNSElement1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNSElement1324 = new BitSet(new long[]{0x0000000000000002L});

}
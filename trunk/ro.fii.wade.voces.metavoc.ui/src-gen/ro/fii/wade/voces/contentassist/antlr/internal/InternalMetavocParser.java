package ro.fii.wade.voces.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import ro.fii.wade.voces.services.MetavocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMetavocParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g"; }


     
     	private MetavocGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MetavocGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleXMLModel
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:60:1: entryRuleXMLModel : ruleXMLModel EOF ;
    public final void entryRuleXMLModel() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:60:19: ( ruleXMLModel EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:61:1: ruleXMLModel EOF
            {
             before(grammarAccess.getXMLModelRule()); 
            pushFollow(FOLLOW_ruleXMLModel_in_entryRuleXMLModel60);
            ruleXMLModel();
            _fsp--;

             after(grammarAccess.getXMLModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLModel


    // $ANTLR start ruleXMLModel
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:68:1: ruleXMLModel : ( ( rule__XMLModel__ContentsAssignment )* ) ;
    public final void ruleXMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:72:2: ( ( ( rule__XMLModel__ContentsAssignment )* ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:73:1: ( ( rule__XMLModel__ContentsAssignment )* )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:73:1: ( ( rule__XMLModel__ContentsAssignment )* )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:74:1: ( rule__XMLModel__ContentsAssignment )*
            {
             before(grammarAccess.getXMLModelAccess().getContentsAssignment()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:75:1: ( rule__XMLModel__ContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:75:2: rule__XMLModel__ContentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__XMLModel__ContentsAssignment_in_ruleXMLModel94);
            	    rule__XMLModel__ContentsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXMLModelAccess().getContentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLModel


    // $ANTLR start entryRuleXMLValidElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:87:1: entryRuleXMLValidElement : ruleXMLValidElement EOF ;
    public final void entryRuleXMLValidElement() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:87:26: ( ruleXMLValidElement EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:88:1: ruleXMLValidElement EOF
            {
             before(grammarAccess.getXMLValidElementRule()); 
            pushFollow(FOLLOW_ruleXMLValidElement_in_entryRuleXMLValidElement121);
            ruleXMLValidElement();
            _fsp--;

             after(grammarAccess.getXMLValidElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLValidElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLValidElement


    // $ANTLR start ruleXMLValidElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:95:1: ruleXMLValidElement : ( ( rule__XMLValidElement__Group__0 ) ) ;
    public final void ruleXMLValidElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:99:2: ( ( ( rule__XMLValidElement__Group__0 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:100:1: ( ( rule__XMLValidElement__Group__0 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:100:1: ( ( rule__XMLValidElement__Group__0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:101:1: ( rule__XMLValidElement__Group__0 )
            {
             before(grammarAccess.getXMLValidElementAccess().getGroup()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:102:1: ( rule__XMLValidElement__Group__0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:102:2: rule__XMLValidElement__Group__0
            {
            pushFollow(FOLLOW_rule__XMLValidElement__Group__0_in_ruleXMLValidElement155);
            rule__XMLValidElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXMLValidElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLValidElement


    // $ANTLR start entryRuleXMLStartElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:114:1: entryRuleXMLStartElement : ruleXMLStartElement EOF ;
    public final void entryRuleXMLStartElement() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:114:26: ( ruleXMLStartElement EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:115:1: ruleXMLStartElement EOF
            {
             before(grammarAccess.getXMLStartElementRule()); 
            pushFollow(FOLLOW_ruleXMLStartElement_in_entryRuleXMLStartElement181);
            ruleXMLStartElement();
            _fsp--;

             after(grammarAccess.getXMLStartElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLStartElement188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLStartElement


    // $ANTLR start ruleXMLStartElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:122:1: ruleXMLStartElement : ( ( rule__XMLStartElement__Group__0 ) ) ;
    public final void ruleXMLStartElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:126:2: ( ( ( rule__XMLStartElement__Group__0 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:127:1: ( ( rule__XMLStartElement__Group__0 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:127:1: ( ( rule__XMLStartElement__Group__0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:128:1: ( rule__XMLStartElement__Group__0 )
            {
             before(grammarAccess.getXMLStartElementAccess().getGroup()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:129:1: ( rule__XMLStartElement__Group__0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:129:2: rule__XMLStartElement__Group__0
            {
            pushFollow(FOLLOW_rule__XMLStartElement__Group__0_in_ruleXMLStartElement215);
            rule__XMLStartElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXMLStartElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLStartElement


    // $ANTLR start entryRuleXMLEndElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:141:1: entryRuleXMLEndElement : ruleXMLEndElement EOF ;
    public final void entryRuleXMLEndElement() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:141:24: ( ruleXMLEndElement EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:142:1: ruleXMLEndElement EOF
            {
             before(grammarAccess.getXMLEndElementRule()); 
            pushFollow(FOLLOW_ruleXMLEndElement_in_entryRuleXMLEndElement241);
            ruleXMLEndElement();
            _fsp--;

             after(grammarAccess.getXMLEndElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLEndElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLEndElement


    // $ANTLR start ruleXMLEndElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:149:1: ruleXMLEndElement : ( ( rule__XMLEndElement__Group__0 ) ) ;
    public final void ruleXMLEndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:153:2: ( ( ( rule__XMLEndElement__Group__0 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:154:1: ( ( rule__XMLEndElement__Group__0 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:154:1: ( ( rule__XMLEndElement__Group__0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:155:1: ( rule__XMLEndElement__Group__0 )
            {
             before(grammarAccess.getXMLEndElementAccess().getGroup()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:156:1: ( rule__XMLEndElement__Group__0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:156:2: rule__XMLEndElement__Group__0
            {
            pushFollow(FOLLOW_rule__XMLEndElement__Group__0_in_ruleXMLEndElement275);
            rule__XMLEndElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXMLEndElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLEndElement


    // $ANTLR start entryRuleXMLElementText
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:168:1: entryRuleXMLElementText : ruleXMLElementText EOF ;
    public final void entryRuleXMLElementText() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:168:25: ( ruleXMLElementText EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:169:1: ruleXMLElementText EOF
            {
             before(grammarAccess.getXMLElementTextRule()); 
            pushFollow(FOLLOW_ruleXMLElementText_in_entryRuleXMLElementText301);
            ruleXMLElementText();
            _fsp--;

             after(grammarAccess.getXMLElementTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLElementText308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLElementText


    // $ANTLR start ruleXMLElementText
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:176:1: ruleXMLElementText : ( ( rule__XMLElementText__Group__0 ) ) ;
    public final void ruleXMLElementText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:180:2: ( ( ( rule__XMLElementText__Group__0 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:181:1: ( ( rule__XMLElementText__Group__0 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:181:1: ( ( rule__XMLElementText__Group__0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:182:1: ( rule__XMLElementText__Group__0 )
            {
             before(grammarAccess.getXMLElementTextAccess().getGroup()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:183:1: ( rule__XMLElementText__Group__0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:183:2: rule__XMLElementText__Group__0
            {
            pushFollow(FOLLOW_rule__XMLElementText__Group__0_in_ruleXMLElementText335);
            rule__XMLElementText__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXMLElementTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLElementText


    // $ANTLR start entryRuleXMLElementAttributes
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:195:1: entryRuleXMLElementAttributes : ruleXMLElementAttributes EOF ;
    public final void entryRuleXMLElementAttributes() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:195:31: ( ruleXMLElementAttributes EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:196:1: ruleXMLElementAttributes EOF
            {
             before(grammarAccess.getXMLElementAttributesRule()); 
            pushFollow(FOLLOW_ruleXMLElementAttributes_in_entryRuleXMLElementAttributes361);
            ruleXMLElementAttributes();
            _fsp--;

             after(grammarAccess.getXMLElementAttributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLElementAttributes368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleXMLElementAttributes


    // $ANTLR start ruleXMLElementAttributes
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:203:1: ruleXMLElementAttributes : ( ( rule__XMLElementAttributes__Group__0 ) ) ;
    public final void ruleXMLElementAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:207:2: ( ( ( rule__XMLElementAttributes__Group__0 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:208:1: ( ( rule__XMLElementAttributes__Group__0 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:208:1: ( ( rule__XMLElementAttributes__Group__0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:209:1: ( rule__XMLElementAttributes__Group__0 )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getGroup()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:210:1: ( rule__XMLElementAttributes__Group__0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:210:2: rule__XMLElementAttributes__Group__0
            {
            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__0_in_ruleXMLElementAttributes395);
            rule__XMLElementAttributes__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXMLElementAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXMLElementAttributes


    // $ANTLR start entryRuleAttrNS
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:222:1: entryRuleAttrNS : ruleAttrNS EOF ;
    public final void entryRuleAttrNS() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:222:17: ( ruleAttrNS EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:223:1: ruleAttrNS EOF
            {
             before(grammarAccess.getAttrNSRule()); 
            pushFollow(FOLLOW_ruleAttrNS_in_entryRuleAttrNS421);
            ruleAttrNS();
            _fsp--;

             after(grammarAccess.getAttrNSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrNS428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttrNS


    // $ANTLR start ruleAttrNS
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:230:1: ruleAttrNS : ( ( rule__AttrNS__NameAssignment ) ) ;
    public final void ruleAttrNS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:234:2: ( ( ( rule__AttrNS__NameAssignment ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:235:1: ( ( rule__AttrNS__NameAssignment ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:235:1: ( ( rule__AttrNS__NameAssignment ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:236:1: ( rule__AttrNS__NameAssignment )
            {
             before(grammarAccess.getAttrNSAccess().getNameAssignment()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:237:1: ( rule__AttrNS__NameAssignment )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:237:2: rule__AttrNS__NameAssignment
            {
            pushFollow(FOLLOW_rule__AttrNS__NameAssignment_in_ruleAttrNS455);
            rule__AttrNS__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getAttrNSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttrNS


    // $ANTLR start entryRuleVocNS
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:249:1: entryRuleVocNS : ruleVocNS EOF ;
    public final void entryRuleVocNS() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:249:16: ( ruleVocNS EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:250:1: ruleVocNS EOF
            {
             before(grammarAccess.getVocNSRule()); 
            pushFollow(FOLLOW_ruleVocNS_in_entryRuleVocNS481);
            ruleVocNS();
            _fsp--;

             after(grammarAccess.getVocNSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVocNS488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVocNS


    // $ANTLR start ruleVocNS
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:257:1: ruleVocNS : ( ( rule__VocNS__NameAssignment ) ) ;
    public final void ruleVocNS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:261:2: ( ( ( rule__VocNS__NameAssignment ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:262:1: ( ( rule__VocNS__NameAssignment ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:262:1: ( ( rule__VocNS__NameAssignment ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:263:1: ( rule__VocNS__NameAssignment )
            {
             before(grammarAccess.getVocNSAccess().getNameAssignment()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:264:1: ( rule__VocNS__NameAssignment )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:264:2: rule__VocNS__NameAssignment
            {
            pushFollow(FOLLOW_rule__VocNS__NameAssignment_in_ruleVocNS515);
            rule__VocNS__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getVocNSAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVocNS


    // $ANTLR start entryRuleNSElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:276:1: entryRuleNSElement : ruleNSElement EOF ;
    public final void entryRuleNSElement() throws RecognitionException {
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:276:20: ( ruleNSElement EOF )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:277:1: ruleNSElement EOF
            {
             before(grammarAccess.getNSElementRule()); 
            pushFollow(FOLLOW_ruleNSElement_in_entryRuleNSElement541);
            ruleNSElement();
            _fsp--;

             after(grammarAccess.getNSElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNSElement548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNSElement


    // $ANTLR start ruleNSElement
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:284:1: ruleNSElement : ( ( rule__NSElement__NameAssignment ) ) ;
    public final void ruleNSElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:288:2: ( ( ( rule__NSElement__NameAssignment ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:289:1: ( ( rule__NSElement__NameAssignment ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:289:1: ( ( rule__NSElement__NameAssignment ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:290:1: ( rule__NSElement__NameAssignment )
            {
             before(grammarAccess.getNSElementAccess().getNameAssignment()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:291:1: ( rule__NSElement__NameAssignment )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:291:2: rule__NSElement__NameAssignment
            {
            pushFollow(FOLLOW_rule__NSElement__NameAssignment_in_ruleNSElement575);
            rule__NSElement__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getNSElementAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNSElement


    // $ANTLR start rule__XMLValidElement__Alternatives_1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:303:1: rule__XMLValidElement__Alternatives_1 : ( ( ( rule__XMLValidElement__ChildrenAssignment_1_0 )* ) | ( ( rule__XMLValidElement__NameAssignment_1_1 ) ) | ( ( rule__XMLValidElement__ContentAssignment_1_2 ) ) );
    public final void rule__XMLValidElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:307:1: ( ( ( rule__XMLValidElement__ChildrenAssignment_1_0 )* ) | ( ( rule__XMLValidElement__NameAssignment_1_1 ) ) | ( ( rule__XMLValidElement__ContentAssignment_1_2 ) ) )
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
                    new NoViableAltException("303:1: rule__XMLValidElement__Alternatives_1 : ( ( ( rule__XMLValidElement__ChildrenAssignment_1_0 )* ) | ( ( rule__XMLValidElement__NameAssignment_1_1 ) ) | ( ( rule__XMLValidElement__ContentAssignment_1_2 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:308:1: ( ( rule__XMLValidElement__ChildrenAssignment_1_0 )* )
                    {
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:308:1: ( ( rule__XMLValidElement__ChildrenAssignment_1_0 )* )
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:309:1: ( rule__XMLValidElement__ChildrenAssignment_1_0 )*
                    {
                     before(grammarAccess.getXMLValidElementAccess().getChildrenAssignment_1_0()); 
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:310:1: ( rule__XMLValidElement__ChildrenAssignment_1_0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==11) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:310:2: rule__XMLValidElement__ChildrenAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_rule__XMLValidElement__ChildrenAssignment_1_0_in_rule__XMLValidElement__Alternatives_1611);
                    	    rule__XMLValidElement__ChildrenAssignment_1_0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getXMLValidElementAccess().getChildrenAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:314:6: ( ( rule__XMLValidElement__NameAssignment_1_1 ) )
                    {
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:314:6: ( ( rule__XMLValidElement__NameAssignment_1_1 ) )
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:315:1: ( rule__XMLValidElement__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getXMLValidElementAccess().getNameAssignment_1_1()); 
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:316:1: ( rule__XMLValidElement__NameAssignment_1_1 )
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:316:2: rule__XMLValidElement__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__XMLValidElement__NameAssignment_1_1_in_rule__XMLValidElement__Alternatives_1630);
                    rule__XMLValidElement__NameAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getXMLValidElementAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:320:6: ( ( rule__XMLValidElement__ContentAssignment_1_2 ) )
                    {
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:320:6: ( ( rule__XMLValidElement__ContentAssignment_1_2 ) )
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:321:1: ( rule__XMLValidElement__ContentAssignment_1_2 )
                    {
                     before(grammarAccess.getXMLValidElementAccess().getContentAssignment_1_2()); 
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:322:1: ( rule__XMLValidElement__ContentAssignment_1_2 )
                    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:322:2: rule__XMLValidElement__ContentAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__XMLValidElement__ContentAssignment_1_2_in_rule__XMLValidElement__Alternatives_1648);
                    rule__XMLValidElement__ContentAssignment_1_2();
                    _fsp--;


                    }

                     after(grammarAccess.getXMLValidElementAccess().getContentAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__Alternatives_1


    // $ANTLR start rule__XMLValidElement__Group__0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:333:1: rule__XMLValidElement__Group__0 : ( ( rule__XMLValidElement__StartelementAssignment_0 ) ) rule__XMLValidElement__Group__1 ;
    public final void rule__XMLValidElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:337:1: ( ( ( rule__XMLValidElement__StartelementAssignment_0 ) ) rule__XMLValidElement__Group__1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:338:1: ( ( rule__XMLValidElement__StartelementAssignment_0 ) ) rule__XMLValidElement__Group__1
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:338:1: ( ( rule__XMLValidElement__StartelementAssignment_0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:339:1: ( rule__XMLValidElement__StartelementAssignment_0 )
            {
             before(grammarAccess.getXMLValidElementAccess().getStartelementAssignment_0()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:340:1: ( rule__XMLValidElement__StartelementAssignment_0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:340:2: rule__XMLValidElement__StartelementAssignment_0
            {
            pushFollow(FOLLOW_rule__XMLValidElement__StartelementAssignment_0_in_rule__XMLValidElement__Group__0683);
            rule__XMLValidElement__StartelementAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getXMLValidElementAccess().getStartelementAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__XMLValidElement__Group__1_in_rule__XMLValidElement__Group__0692);
            rule__XMLValidElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__Group__0


    // $ANTLR start rule__XMLValidElement__Group__1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:351:1: rule__XMLValidElement__Group__1 : ( ( rule__XMLValidElement__Alternatives_1 ) ) rule__XMLValidElement__Group__2 ;
    public final void rule__XMLValidElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:355:1: ( ( ( rule__XMLValidElement__Alternatives_1 ) ) rule__XMLValidElement__Group__2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:356:1: ( ( rule__XMLValidElement__Alternatives_1 ) ) rule__XMLValidElement__Group__2
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:356:1: ( ( rule__XMLValidElement__Alternatives_1 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:357:1: ( rule__XMLValidElement__Alternatives_1 )
            {
             before(grammarAccess.getXMLValidElementAccess().getAlternatives_1()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:358:1: ( rule__XMLValidElement__Alternatives_1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:358:2: rule__XMLValidElement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__XMLValidElement__Alternatives_1_in_rule__XMLValidElement__Group__1720);
            rule__XMLValidElement__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getXMLValidElementAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__XMLValidElement__Group__2_in_rule__XMLValidElement__Group__1729);
            rule__XMLValidElement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__Group__1


    // $ANTLR start rule__XMLValidElement__Group__2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:369:1: rule__XMLValidElement__Group__2 : ( ( rule__XMLValidElement__EndelementAssignment_2 ) ) ;
    public final void rule__XMLValidElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:373:1: ( ( ( rule__XMLValidElement__EndelementAssignment_2 ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:374:1: ( ( rule__XMLValidElement__EndelementAssignment_2 ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:374:1: ( ( rule__XMLValidElement__EndelementAssignment_2 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:375:1: ( rule__XMLValidElement__EndelementAssignment_2 )
            {
             before(grammarAccess.getXMLValidElementAccess().getEndelementAssignment_2()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:376:1: ( rule__XMLValidElement__EndelementAssignment_2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:376:2: rule__XMLValidElement__EndelementAssignment_2
            {
            pushFollow(FOLLOW_rule__XMLValidElement__EndelementAssignment_2_in_rule__XMLValidElement__Group__2757);
            rule__XMLValidElement__EndelementAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getXMLValidElementAccess().getEndelementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__Group__2


    // $ANTLR start rule__XMLStartElement__Group__0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:392:1: rule__XMLStartElement__Group__0 : ( '<' ) rule__XMLStartElement__Group__1 ;
    public final void rule__XMLStartElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:396:1: ( ( '<' ) rule__XMLStartElement__Group__1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:397:1: ( '<' ) rule__XMLStartElement__Group__1
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:397:1: ( '<' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:398:1: '<'
            {
             before(grammarAccess.getXMLStartElementAccess().getLessThanSignKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__XMLStartElement__Group__0798); 
             after(grammarAccess.getXMLStartElementAccess().getLessThanSignKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__XMLStartElement__Group__1_in_rule__XMLStartElement__Group__0808);
            rule__XMLStartElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLStartElement__Group__0


    // $ANTLR start rule__XMLStartElement__Group__1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:412:1: rule__XMLStartElement__Group__1 : ( ruleXMLElementText ) rule__XMLStartElement__Group__2 ;
    public final void rule__XMLStartElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:416:1: ( ( ruleXMLElementText ) rule__XMLStartElement__Group__2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:417:1: ( ruleXMLElementText ) rule__XMLStartElement__Group__2
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:417:1: ( ruleXMLElementText )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:418:1: ruleXMLElementText
            {
             before(grammarAccess.getXMLStartElementAccess().getXMLElementTextParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleXMLElementText_in_rule__XMLStartElement__Group__1836);
            ruleXMLElementText();
            _fsp--;

             after(grammarAccess.getXMLStartElementAccess().getXMLElementTextParserRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__XMLStartElement__Group__2_in_rule__XMLStartElement__Group__1844);
            rule__XMLStartElement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLStartElement__Group__1


    // $ANTLR start rule__XMLStartElement__Group__2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:430:1: rule__XMLStartElement__Group__2 : ( '>' ) ;
    public final void rule__XMLStartElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:434:1: ( ( '>' ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:435:1: ( '>' )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:435:1: ( '>' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:436:1: '>'
            {
             before(grammarAccess.getXMLStartElementAccess().getGreaterThanSignKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__XMLStartElement__Group__2873); 
             after(grammarAccess.getXMLStartElementAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLStartElement__Group__2


    // $ANTLR start rule__XMLEndElement__Group__0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:455:1: rule__XMLEndElement__Group__0 : ( '</' ) rule__XMLEndElement__Group__1 ;
    public final void rule__XMLEndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:459:1: ( ( '</' ) rule__XMLEndElement__Group__1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:460:1: ( '</' ) rule__XMLEndElement__Group__1
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:460:1: ( '</' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:461:1: '</'
            {
             before(grammarAccess.getXMLEndElementAccess().getLessThanSignSolidusKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__XMLEndElement__Group__0915); 
             after(grammarAccess.getXMLEndElementAccess().getLessThanSignSolidusKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__XMLEndElement__Group__1_in_rule__XMLEndElement__Group__0925);
            rule__XMLEndElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLEndElement__Group__0


    // $ANTLR start rule__XMLEndElement__Group__1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:475:1: rule__XMLEndElement__Group__1 : ( ruleXMLElementText ) rule__XMLEndElement__Group__2 ;
    public final void rule__XMLEndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:479:1: ( ( ruleXMLElementText ) rule__XMLEndElement__Group__2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:480:1: ( ruleXMLElementText ) rule__XMLEndElement__Group__2
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:480:1: ( ruleXMLElementText )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:481:1: ruleXMLElementText
            {
             before(grammarAccess.getXMLEndElementAccess().getXMLElementTextParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleXMLElementText_in_rule__XMLEndElement__Group__1953);
            ruleXMLElementText();
            _fsp--;

             after(grammarAccess.getXMLEndElementAccess().getXMLElementTextParserRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__XMLEndElement__Group__2_in_rule__XMLEndElement__Group__1961);
            rule__XMLEndElement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLEndElement__Group__1


    // $ANTLR start rule__XMLEndElement__Group__2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:493:1: rule__XMLEndElement__Group__2 : ( '>' ) ;
    public final void rule__XMLEndElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:497:1: ( ( '>' ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:498:1: ( '>' )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:498:1: ( '>' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:499:1: '>'
            {
             before(grammarAccess.getXMLEndElementAccess().getGreaterThanSignKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__XMLEndElement__Group__2990); 
             after(grammarAccess.getXMLEndElementAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLEndElement__Group__2


    // $ANTLR start rule__XMLElementText__Group__0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:518:1: rule__XMLElementText__Group__0 : ( ( rule__XMLElementText__NamespaceAssignment_0 ) ) rule__XMLElementText__Group__1 ;
    public final void rule__XMLElementText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:522:1: ( ( ( rule__XMLElementText__NamespaceAssignment_0 ) ) rule__XMLElementText__Group__1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:523:1: ( ( rule__XMLElementText__NamespaceAssignment_0 ) ) rule__XMLElementText__Group__1
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:523:1: ( ( rule__XMLElementText__NamespaceAssignment_0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:524:1: ( rule__XMLElementText__NamespaceAssignment_0 )
            {
             before(grammarAccess.getXMLElementTextAccess().getNamespaceAssignment_0()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:525:1: ( rule__XMLElementText__NamespaceAssignment_0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:525:2: rule__XMLElementText__NamespaceAssignment_0
            {
            pushFollow(FOLLOW_rule__XMLElementText__NamespaceAssignment_0_in_rule__XMLElementText__Group__01031);
            rule__XMLElementText__NamespaceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getXMLElementTextAccess().getNamespaceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__XMLElementText__Group__1_in_rule__XMLElementText__Group__01040);
            rule__XMLElementText__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__Group__0


    // $ANTLR start rule__XMLElementText__Group__1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:536:1: rule__XMLElementText__Group__1 : ( ':' ) rule__XMLElementText__Group__2 ;
    public final void rule__XMLElementText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:540:1: ( ( ':' ) rule__XMLElementText__Group__2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:541:1: ( ':' ) rule__XMLElementText__Group__2
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:541:1: ( ':' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:542:1: ':'
            {
             before(grammarAccess.getXMLElementTextAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__XMLElementText__Group__11069); 
             after(grammarAccess.getXMLElementTextAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__XMLElementText__Group__2_in_rule__XMLElementText__Group__11079);
            rule__XMLElementText__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__Group__1


    // $ANTLR start rule__XMLElementText__Group__2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:556:1: rule__XMLElementText__Group__2 : ( ( rule__XMLElementText__NselementsAssignment_2 ) ) rule__XMLElementText__Group__3 ;
    public final void rule__XMLElementText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:560:1: ( ( ( rule__XMLElementText__NselementsAssignment_2 ) ) rule__XMLElementText__Group__3 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:561:1: ( ( rule__XMLElementText__NselementsAssignment_2 ) ) rule__XMLElementText__Group__3
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:561:1: ( ( rule__XMLElementText__NselementsAssignment_2 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:562:1: ( rule__XMLElementText__NselementsAssignment_2 )
            {
             before(grammarAccess.getXMLElementTextAccess().getNselementsAssignment_2()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:563:1: ( rule__XMLElementText__NselementsAssignment_2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:563:2: rule__XMLElementText__NselementsAssignment_2
            {
            pushFollow(FOLLOW_rule__XMLElementText__NselementsAssignment_2_in_rule__XMLElementText__Group__21107);
            rule__XMLElementText__NselementsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getXMLElementTextAccess().getNselementsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__XMLElementText__Group__3_in_rule__XMLElementText__Group__21116);
            rule__XMLElementText__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__Group__2


    // $ANTLR start rule__XMLElementText__Group__3
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:574:1: rule__XMLElementText__Group__3 : ( ( rule__XMLElementText__AttributesAssignment_3 )* ) ;
    public final void rule__XMLElementText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:578:1: ( ( ( rule__XMLElementText__AttributesAssignment_3 )* ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:579:1: ( ( rule__XMLElementText__AttributesAssignment_3 )* )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:579:1: ( ( rule__XMLElementText__AttributesAssignment_3 )* )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:580:1: ( rule__XMLElementText__AttributesAssignment_3 )*
            {
             before(grammarAccess.getXMLElementTextAccess().getAttributesAssignment_3()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:581:1: ( rule__XMLElementText__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:581:2: rule__XMLElementText__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__XMLElementText__AttributesAssignment_3_in_rule__XMLElementText__Group__31144);
            	    rule__XMLElementText__AttributesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getXMLElementTextAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__Group__3


    // $ANTLR start rule__XMLElementAttributes__Group__0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:599:1: rule__XMLElementAttributes__Group__0 : ( ( rule__XMLElementAttributes__NamespaceAssignment_0 ) ) rule__XMLElementAttributes__Group__1 ;
    public final void rule__XMLElementAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:603:1: ( ( ( rule__XMLElementAttributes__NamespaceAssignment_0 ) ) rule__XMLElementAttributes__Group__1 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:604:1: ( ( rule__XMLElementAttributes__NamespaceAssignment_0 ) ) rule__XMLElementAttributes__Group__1
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:604:1: ( ( rule__XMLElementAttributes__NamespaceAssignment_0 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:605:1: ( rule__XMLElementAttributes__NamespaceAssignment_0 )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNamespaceAssignment_0()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:606:1: ( rule__XMLElementAttributes__NamespaceAssignment_0 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:606:2: rule__XMLElementAttributes__NamespaceAssignment_0
            {
            pushFollow(FOLLOW_rule__XMLElementAttributes__NamespaceAssignment_0_in_rule__XMLElementAttributes__Group__01187);
            rule__XMLElementAttributes__NamespaceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getXMLElementAttributesAccess().getNamespaceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__1_in_rule__XMLElementAttributes__Group__01196);
            rule__XMLElementAttributes__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__0


    // $ANTLR start rule__XMLElementAttributes__Group__1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:617:1: rule__XMLElementAttributes__Group__1 : ( ':' ) rule__XMLElementAttributes__Group__2 ;
    public final void rule__XMLElementAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:621:1: ( ( ':' ) rule__XMLElementAttributes__Group__2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:622:1: ( ':' ) rule__XMLElementAttributes__Group__2
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:622:1: ( ':' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:623:1: ':'
            {
             before(grammarAccess.getXMLElementAttributesAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__XMLElementAttributes__Group__11225); 
             after(grammarAccess.getXMLElementAttributesAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__2_in_rule__XMLElementAttributes__Group__11235);
            rule__XMLElementAttributes__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__1


    // $ANTLR start rule__XMLElementAttributes__Group__2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:637:1: rule__XMLElementAttributes__Group__2 : ( ( rule__XMLElementAttributes__NselementsAssignment_2 ) ) rule__XMLElementAttributes__Group__3 ;
    public final void rule__XMLElementAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:641:1: ( ( ( rule__XMLElementAttributes__NselementsAssignment_2 ) ) rule__XMLElementAttributes__Group__3 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:642:1: ( ( rule__XMLElementAttributes__NselementsAssignment_2 ) ) rule__XMLElementAttributes__Group__3
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:642:1: ( ( rule__XMLElementAttributes__NselementsAssignment_2 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:643:1: ( rule__XMLElementAttributes__NselementsAssignment_2 )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNselementsAssignment_2()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:644:1: ( rule__XMLElementAttributes__NselementsAssignment_2 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:644:2: rule__XMLElementAttributes__NselementsAssignment_2
            {
            pushFollow(FOLLOW_rule__XMLElementAttributes__NselementsAssignment_2_in_rule__XMLElementAttributes__Group__21263);
            rule__XMLElementAttributes__NselementsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getXMLElementAttributesAccess().getNselementsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__3_in_rule__XMLElementAttributes__Group__21272);
            rule__XMLElementAttributes__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__2


    // $ANTLR start rule__XMLElementAttributes__Group__3
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:655:1: rule__XMLElementAttributes__Group__3 : ( '=' ) rule__XMLElementAttributes__Group__4 ;
    public final void rule__XMLElementAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:659:1: ( ( '=' ) rule__XMLElementAttributes__Group__4 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:660:1: ( '=' ) rule__XMLElementAttributes__Group__4
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:660:1: ( '=' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:661:1: '='
            {
             before(grammarAccess.getXMLElementAttributesAccess().getEqualsSignKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__XMLElementAttributes__Group__31301); 
             after(grammarAccess.getXMLElementAttributesAccess().getEqualsSignKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__4_in_rule__XMLElementAttributes__Group__31311);
            rule__XMLElementAttributes__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__3


    // $ANTLR start rule__XMLElementAttributes__Group__4
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:675:1: rule__XMLElementAttributes__Group__4 : ( ( rule__XMLElementAttributes__ElementValueAssignment_4 ) ) rule__XMLElementAttributes__Group__5 ;
    public final void rule__XMLElementAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:679:1: ( ( ( rule__XMLElementAttributes__ElementValueAssignment_4 ) ) rule__XMLElementAttributes__Group__5 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:680:1: ( ( rule__XMLElementAttributes__ElementValueAssignment_4 ) ) rule__XMLElementAttributes__Group__5
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:680:1: ( ( rule__XMLElementAttributes__ElementValueAssignment_4 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:681:1: ( rule__XMLElementAttributes__ElementValueAssignment_4 )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getElementValueAssignment_4()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:682:1: ( rule__XMLElementAttributes__ElementValueAssignment_4 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:682:2: rule__XMLElementAttributes__ElementValueAssignment_4
            {
            pushFollow(FOLLOW_rule__XMLElementAttributes__ElementValueAssignment_4_in_rule__XMLElementAttributes__Group__41339);
            rule__XMLElementAttributes__ElementValueAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getXMLElementAttributesAccess().getElementValueAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__5_in_rule__XMLElementAttributes__Group__41348);
            rule__XMLElementAttributes__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__4


    // $ANTLR start rule__XMLElementAttributes__Group__5
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:693:1: rule__XMLElementAttributes__Group__5 : ( ( rule__XMLElementAttributes__NameAssignment_5 ) ) rule__XMLElementAttributes__Group__6 ;
    public final void rule__XMLElementAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:697:1: ( ( ( rule__XMLElementAttributes__NameAssignment_5 ) ) rule__XMLElementAttributes__Group__6 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:698:1: ( ( rule__XMLElementAttributes__NameAssignment_5 ) ) rule__XMLElementAttributes__Group__6
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:698:1: ( ( rule__XMLElementAttributes__NameAssignment_5 ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:699:1: ( rule__XMLElementAttributes__NameAssignment_5 )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNameAssignment_5()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:700:1: ( rule__XMLElementAttributes__NameAssignment_5 )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:700:2: rule__XMLElementAttributes__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__XMLElementAttributes__NameAssignment_5_in_rule__XMLElementAttributes__Group__51376);
            rule__XMLElementAttributes__NameAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getXMLElementAttributesAccess().getNameAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__XMLElementAttributes__Group__6_in_rule__XMLElementAttributes__Group__51385);
            rule__XMLElementAttributes__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__5


    // $ANTLR start rule__XMLElementAttributes__Group__6
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:711:1: rule__XMLElementAttributes__Group__6 : ( '\"' ) ;
    public final void rule__XMLElementAttributes__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:715:1: ( ( '\"' ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:716:1: ( '\"' )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:716:1: ( '\"' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:717:1: '\"'
            {
             before(grammarAccess.getXMLElementAttributesAccess().getQuotationMarkKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__XMLElementAttributes__Group__61414); 
             after(grammarAccess.getXMLElementAttributesAccess().getQuotationMarkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__Group__6


    // $ANTLR start rule__XMLModel__ContentsAssignment
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:744:1: rule__XMLModel__ContentsAssignment : ( ruleXMLValidElement ) ;
    public final void rule__XMLModel__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:748:1: ( ( ruleXMLValidElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:749:1: ( ruleXMLValidElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:749:1: ( ruleXMLValidElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:750:1: ruleXMLValidElement
            {
             before(grammarAccess.getXMLModelAccess().getContentsXMLValidElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleXMLValidElement_in_rule__XMLModel__ContentsAssignment1463);
            ruleXMLValidElement();
            _fsp--;

             after(grammarAccess.getXMLModelAccess().getContentsXMLValidElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLModel__ContentsAssignment


    // $ANTLR start rule__XMLValidElement__StartelementAssignment_0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:759:1: rule__XMLValidElement__StartelementAssignment_0 : ( ruleXMLStartElement ) ;
    public final void rule__XMLValidElement__StartelementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:763:1: ( ( ruleXMLStartElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:764:1: ( ruleXMLStartElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:764:1: ( ruleXMLStartElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:765:1: ruleXMLStartElement
            {
             before(grammarAccess.getXMLValidElementAccess().getStartelementXMLStartElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleXMLStartElement_in_rule__XMLValidElement__StartelementAssignment_01494);
            ruleXMLStartElement();
            _fsp--;

             after(grammarAccess.getXMLValidElementAccess().getStartelementXMLStartElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__StartelementAssignment_0


    // $ANTLR start rule__XMLValidElement__ChildrenAssignment_1_0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:774:1: rule__XMLValidElement__ChildrenAssignment_1_0 : ( ruleXMLValidElement ) ;
    public final void rule__XMLValidElement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:778:1: ( ( ruleXMLValidElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:779:1: ( ruleXMLValidElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:779:1: ( ruleXMLValidElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:780:1: ruleXMLValidElement
            {
             before(grammarAccess.getXMLValidElementAccess().getChildrenXMLValidElementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleXMLValidElement_in_rule__XMLValidElement__ChildrenAssignment_1_01525);
            ruleXMLValidElement();
            _fsp--;

             after(grammarAccess.getXMLValidElementAccess().getChildrenXMLValidElementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__ChildrenAssignment_1_0


    // $ANTLR start rule__XMLValidElement__NameAssignment_1_1
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:789:1: rule__XMLValidElement__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__XMLValidElement__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:793:1: ( ( RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:794:1: ( RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:794:1: ( RULE_ID )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:795:1: RULE_ID
            {
             before(grammarAccess.getXMLValidElementAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XMLValidElement__NameAssignment_1_11556); 
             after(grammarAccess.getXMLValidElementAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__NameAssignment_1_1


    // $ANTLR start rule__XMLValidElement__ContentAssignment_1_2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:804:1: rule__XMLValidElement__ContentAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__XMLValidElement__ContentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:808:1: ( ( RULE_INT ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:809:1: ( RULE_INT )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:809:1: ( RULE_INT )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:810:1: RULE_INT
            {
             before(grammarAccess.getXMLValidElementAccess().getContentINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XMLValidElement__ContentAssignment_1_21587); 
             after(grammarAccess.getXMLValidElementAccess().getContentINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__ContentAssignment_1_2


    // $ANTLR start rule__XMLValidElement__EndelementAssignment_2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:819:1: rule__XMLValidElement__EndelementAssignment_2 : ( ruleXMLEndElement ) ;
    public final void rule__XMLValidElement__EndelementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:823:1: ( ( ruleXMLEndElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:824:1: ( ruleXMLEndElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:824:1: ( ruleXMLEndElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:825:1: ruleXMLEndElement
            {
             before(grammarAccess.getXMLValidElementAccess().getEndelementXMLEndElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleXMLEndElement_in_rule__XMLValidElement__EndelementAssignment_21618);
            ruleXMLEndElement();
            _fsp--;

             after(grammarAccess.getXMLValidElementAccess().getEndelementXMLEndElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLValidElement__EndelementAssignment_2


    // $ANTLR start rule__XMLElementText__NamespaceAssignment_0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:834:1: rule__XMLElementText__NamespaceAssignment_0 : ( ruleVocNS ) ;
    public final void rule__XMLElementText__NamespaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:838:1: ( ( ruleVocNS ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:839:1: ( ruleVocNS )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:839:1: ( ruleVocNS )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:840:1: ruleVocNS
            {
             before(grammarAccess.getXMLElementTextAccess().getNamespaceVocNSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVocNS_in_rule__XMLElementText__NamespaceAssignment_01649);
            ruleVocNS();
            _fsp--;

             after(grammarAccess.getXMLElementTextAccess().getNamespaceVocNSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__NamespaceAssignment_0


    // $ANTLR start rule__XMLElementText__NselementsAssignment_2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:849:1: rule__XMLElementText__NselementsAssignment_2 : ( ruleNSElement ) ;
    public final void rule__XMLElementText__NselementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:853:1: ( ( ruleNSElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:854:1: ( ruleNSElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:854:1: ( ruleNSElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:855:1: ruleNSElement
            {
             before(grammarAccess.getXMLElementTextAccess().getNselementsNSElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNSElement_in_rule__XMLElementText__NselementsAssignment_21680);
            ruleNSElement();
            _fsp--;

             after(grammarAccess.getXMLElementTextAccess().getNselementsNSElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__NselementsAssignment_2


    // $ANTLR start rule__XMLElementText__AttributesAssignment_3
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:864:1: rule__XMLElementText__AttributesAssignment_3 : ( ruleXMLElementAttributes ) ;
    public final void rule__XMLElementText__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:868:1: ( ( ruleXMLElementAttributes ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:869:1: ( ruleXMLElementAttributes )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:869:1: ( ruleXMLElementAttributes )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:870:1: ruleXMLElementAttributes
            {
             before(grammarAccess.getXMLElementTextAccess().getAttributesXMLElementAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleXMLElementAttributes_in_rule__XMLElementText__AttributesAssignment_31711);
            ruleXMLElementAttributes();
            _fsp--;

             after(grammarAccess.getXMLElementTextAccess().getAttributesXMLElementAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementText__AttributesAssignment_3


    // $ANTLR start rule__XMLElementAttributes__NamespaceAssignment_0
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:879:1: rule__XMLElementAttributes__NamespaceAssignment_0 : ( ruleAttrNS ) ;
    public final void rule__XMLElementAttributes__NamespaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:883:1: ( ( ruleAttrNS ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:884:1: ( ruleAttrNS )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:884:1: ( ruleAttrNS )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:885:1: ruleAttrNS
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNamespaceAttrNSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttrNS_in_rule__XMLElementAttributes__NamespaceAssignment_01742);
            ruleAttrNS();
            _fsp--;

             after(grammarAccess.getXMLElementAttributesAccess().getNamespaceAttrNSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__NamespaceAssignment_0


    // $ANTLR start rule__XMLElementAttributes__NselementsAssignment_2
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:894:1: rule__XMLElementAttributes__NselementsAssignment_2 : ( ruleNSElement ) ;
    public final void rule__XMLElementAttributes__NselementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:898:1: ( ( ruleNSElement ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:899:1: ( ruleNSElement )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:899:1: ( ruleNSElement )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:900:1: ruleNSElement
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNselementsNSElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNSElement_in_rule__XMLElementAttributes__NselementsAssignment_21773);
            ruleNSElement();
            _fsp--;

             after(grammarAccess.getXMLElementAttributesAccess().getNselementsNSElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__NselementsAssignment_2


    // $ANTLR start rule__XMLElementAttributes__ElementValueAssignment_4
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:909:1: rule__XMLElementAttributes__ElementValueAssignment_4 : ( ( '\"' ) ) ;
    public final void rule__XMLElementAttributes__ElementValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:913:1: ( ( ( '\"' ) ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:914:1: ( ( '\"' ) )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:914:1: ( ( '\"' ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:915:1: ( '\"' )
            {
             before(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0()); 
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:916:1: ( '\"' )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:917:1: '\"'
            {
             before(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__XMLElementAttributes__ElementValueAssignment_41809); 
             after(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0()); 

            }

             after(grammarAccess.getXMLElementAttributesAccess().getElementValueQuotationMarkKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__ElementValueAssignment_4


    // $ANTLR start rule__XMLElementAttributes__NameAssignment_5
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:932:1: rule__XMLElementAttributes__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__XMLElementAttributes__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:936:1: ( ( RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:937:1: ( RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:937:1: ( RULE_ID )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:938:1: RULE_ID
            {
             before(grammarAccess.getXMLElementAttributesAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XMLElementAttributes__NameAssignment_51848); 
             after(grammarAccess.getXMLElementAttributesAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XMLElementAttributes__NameAssignment_5


    // $ANTLR start rule__AttrNS__NameAssignment
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:947:1: rule__AttrNS__NameAssignment : ( RULE_ID ) ;
    public final void rule__AttrNS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:951:1: ( ( RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:952:1: ( RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:952:1: ( RULE_ID )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:953:1: RULE_ID
            {
             before(grammarAccess.getAttrNSAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttrNS__NameAssignment1879); 
             after(grammarAccess.getAttrNSAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrNS__NameAssignment


    // $ANTLR start rule__VocNS__NameAssignment
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:962:1: rule__VocNS__NameAssignment : ( RULE_ID ) ;
    public final void rule__VocNS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:966:1: ( ( RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:967:1: ( RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:967:1: ( RULE_ID )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:968:1: RULE_ID
            {
             before(grammarAccess.getVocNSAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VocNS__NameAssignment1910); 
             after(grammarAccess.getVocNSAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VocNS__NameAssignment


    // $ANTLR start rule__NSElement__NameAssignment
    // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:977:1: rule__NSElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__NSElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:981:1: ( ( RULE_ID ) )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:982:1: ( RULE_ID )
            {
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:982:1: ( RULE_ID )
            // ../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g:983:1: RULE_ID
            {
             before(grammarAccess.getNSElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NSElement__NameAssignment1941); 
             after(grammarAccess.getNSElementAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NSElement__NameAssignment


 

    public static final BitSet FOLLOW_ruleXMLModel_in_entryRuleXMLModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLModel__ContentsAssignment_in_ruleXMLModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_entryRuleXMLValidElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLValidElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__Group__0_in_ruleXMLValidElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLStartElement_in_entryRuleXMLStartElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLStartElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLStartElement__Group__0_in_ruleXMLStartElement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLEndElement_in_entryRuleXMLEndElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLEndElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLEndElement__Group__0_in_ruleXMLEndElement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_entryRuleXMLElementText301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLElementText308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementText__Group__0_in_ruleXMLElementText335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementAttributes_in_entryRuleXMLElementAttributes361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLElementAttributes368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__0_in_ruleXMLElementAttributes395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrNS_in_entryRuleAttrNS421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrNS428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrNS__NameAssignment_in_ruleAttrNS455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVocNS_in_entryRuleVocNS481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVocNS488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VocNS__NameAssignment_in_ruleVocNS515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNSElement_in_entryRuleNSElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNSElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NSElement__NameAssignment_in_ruleNSElement575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__ChildrenAssignment_1_0_in_rule__XMLValidElement__Alternatives_1611 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__XMLValidElement__NameAssignment_1_1_in_rule__XMLValidElement__Alternatives_1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__ContentAssignment_1_2_in_rule__XMLValidElement__Alternatives_1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__StartelementAssignment_0_in_rule__XMLValidElement__Group__0683 = new BitSet(new long[]{0x0000000000002830L});
    public static final BitSet FOLLOW_rule__XMLValidElement__Group__1_in_rule__XMLValidElement__Group__0692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__Alternatives_1_in_rule__XMLValidElement__Group__1720 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__XMLValidElement__Group__2_in_rule__XMLValidElement__Group__1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLValidElement__EndelementAssignment_2_in_rule__XMLValidElement__Group__2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__XMLStartElement__Group__0798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLStartElement__Group__1_in_rule__XMLStartElement__Group__0808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_rule__XMLStartElement__Group__1836 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XMLStartElement__Group__2_in_rule__XMLStartElement__Group__1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLStartElement__Group__2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__XMLEndElement__Group__0915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLEndElement__Group__1_in_rule__XMLEndElement__Group__0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementText_in_rule__XMLEndElement__Group__1953 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XMLEndElement__Group__2_in_rule__XMLEndElement__Group__1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLEndElement__Group__2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementText__NamespaceAssignment_0_in_rule__XMLElementText__Group__01031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__XMLElementText__Group__1_in_rule__XMLElementText__Group__01040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__XMLElementText__Group__11069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLElementText__Group__2_in_rule__XMLElementText__Group__11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementText__NselementsAssignment_2_in_rule__XMLElementText__Group__21107 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLElementText__Group__3_in_rule__XMLElementText__Group__21116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementText__AttributesAssignment_3_in_rule__XMLElementText__Group__31144 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__NamespaceAssignment_0_in_rule__XMLElementAttributes__Group__01187 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__1_in_rule__XMLElementAttributes__Group__01196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__XMLElementAttributes__Group__11225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__2_in_rule__XMLElementAttributes__Group__11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__NselementsAssignment_2_in_rule__XMLElementAttributes__Group__21263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__3_in_rule__XMLElementAttributes__Group__21272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__XMLElementAttributes__Group__31301 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__4_in_rule__XMLElementAttributes__Group__31311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__ElementValueAssignment_4_in_rule__XMLElementAttributes__Group__41339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__5_in_rule__XMLElementAttributes__Group__41348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__NameAssignment_5_in_rule__XMLElementAttributes__Group__51376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__XMLElementAttributes__Group__6_in_rule__XMLElementAttributes__Group__51385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__XMLElementAttributes__Group__61414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_rule__XMLModel__ContentsAssignment1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLStartElement_in_rule__XMLValidElement__StartelementAssignment_01494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLValidElement_in_rule__XMLValidElement__ChildrenAssignment_1_01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XMLValidElement__NameAssignment_1_11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XMLValidElement__ContentAssignment_1_21587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLEndElement_in_rule__XMLValidElement__EndelementAssignment_21618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVocNS_in_rule__XMLElementText__NamespaceAssignment_01649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNSElement_in_rule__XMLElementText__NselementsAssignment_21680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLElementAttributes_in_rule__XMLElementText__AttributesAssignment_31711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrNS_in_rule__XMLElementAttributes__NamespaceAssignment_01742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNSElement_in_rule__XMLElementAttributes__NselementsAssignment_21773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__XMLElementAttributes__ElementValueAssignment_41809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XMLElementAttributes__NameAssignment_51848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttrNS__NameAssignment1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VocNS__NameAssignment1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NSElement__NameAssignment1941 = new BitSet(new long[]{0x0000000000000002L});

}
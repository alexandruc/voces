lexer grammar InternalMetavoc;
@header {
package ro.fii.wade.voces.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '<' ;
T12 : '>' ;
T13 : '</' ;
T14 : ':' ;
T15 : '=' ;
T16 : '"' ;

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 993
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 995
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 997
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 999
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 1001
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 1003
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.fii.wade.voces.metavoc.ui/src-gen/ro/fii/wade/voces/contentassist/antlr/internal/InternalMetavoc.g" 1005
RULE_ANY_OTHER : .;



lexer grammar InternalMetavoc;
@header {
package ro.fii.wade.voces.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '<' ;
T12 : '>' ;
T13 : '</' ;
T14 : ':' ;
T15 : '=' ;
T16 : '"' ;

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 642
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 644
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 646
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 648
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 650
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 652
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.fii.wade.voces.metavoc/src-gen/ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.g" 654
RULE_ANY_OTHER : .;



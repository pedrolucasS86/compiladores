grammar Arara;

programa : comando* EOF ;

comando
    : 'leia' '(' ID ')' ';'
    | 'escreva' '(' expressao ')' ';'
    | atribuicao
    | condicional
    | repeticao
    ;

atribuicao : ID '<-' expressao ';' ;

condicional 
    : 'se' expressao 'entao' bloco ('senao' bloco)? 'fimse'
    ;

repeticao 
    : 'enquanto' expressao 'faca' bloco 'fimenquanto'
    ;

bloco : comando* ;

expressao 
    : logica
    ;

logica
    : comparacao (OPLOG comparacao)*
    ;

comparacao
    : soma (OPCOMP soma)?
    ;

soma
    : termo (OPSUM termo)*
    ;

termo
    : fator (OPMULT fator)*
    ;

fator
    : '!' fator
    | '(' expressao ')'
    | INT
    | STRING
    | ID
    ;

ID     : [a-zA-Z_][a-zA-Z_0-9]* ;
INT    : [0-9]+ ;
STRING : '"' (~["\\] | '\\' .)* '"' ;

OPSUM  : '+' | '-' ;
OPMULT : '*' | '/' ;
OPCOMP : '==' | '!=' | '<' | '<=' | '>' | '>=' ;
OPLOG  : '&&' | '||' ;

WS     : [ \t\r\n]+ -> skip ;

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
    : 'se' expressao 'entao' bloco cond_opc 'fimse'
    ;
cond_opc
    : 'senao' bloco
    | /* vazio */
    ;

repeticao 
    : 'enquanto' expressao 'faca' bloco 'fimenquanto'
    ;

bloco : comando* ;

expressao 
    : logica
    ;

logica 
    : comparacao logica_suf
    ;
logica_suf
    : OPLOG comparacao logica_suf
    | /* vazio */
    ;

comparacao 
    : soma comparacao_suf
    ;
comparacao_suf
    : OPCOMP soma
    | /* vazio */
    ;

soma 
    : termo soma_suf
    ;
soma_suf
    : OPSUM termo soma_suf
    | /* vazio */
    ;

termo 
    : fator termo_suf
    ;
termo_suf
    : OPMULT fator termo_suf
    | /* vazio */
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
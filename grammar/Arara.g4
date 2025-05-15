grammar Arara;

@lexer::members {
  from antlr4.error.Errors import LexerNoViableAltException
}

// PALAVRAS-CHAVE
LEIA: 'leia';
ESCREVA: 'escreva';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
FIMSE: 'fimse';
ENQUANTO: 'enquanto';
FACA: 'faca';
FIMENQ: 'fimenquanto';

// SÍMBOLOS
LPAREN: '(';
RPAREN: ')';
SEMICOLON: ';';
ATRIB: '<-';

OPSUM: '+' | '-';
OPMULT: '*' | '/';
OPCOMP: '==' | '!=' | '<' | '<=' | '>' | '>=';
OPLOG: '&&' | '||';
NOT: '!';

// LITERAIS POR ÚLTIMO
STRING: '"' (~["\\] | '\\' .)* '"';
INT: [0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;

//Regras e Comandos
programa: comando* EOF;

comando:
	LEIA LPAREN ID RPAREN SEMICOLON			# comandoLeia
	| ESCREVA LPAREN expressao RPAREN SEMICOLON	# comandoEscreva
	| ID ATRIB expressao SEMICOLON				# comandoAtrib
	| condicional								# comandoCondicional
	| repeticao									# comandoRepeticao;

condicional: SE expressao ENTAO bloco cond_opc FIMSE;
cond_opc: SENAO bloco |;

repeticao: ENQUANTO expressao FACA bloco FIMENQ;
bloco: comando*;

expressao: logica;
logica: comparacao logica_suf;
logica_suf: OPLOG comparacao logica_suf |;

comparacao: soma comparacao_suf;
comparacao_suf: OPCOMP soma |;

soma: termo soma_suf;
soma_suf: OPSUM termo soma_suf |;

termo: fator termo_suf;
termo_suf: OPMULT fator termo_suf |;

fator: NOT fator | LPAREN expressao RPAREN | INT | STRING | ID;
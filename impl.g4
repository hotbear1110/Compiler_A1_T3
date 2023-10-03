grammar impl;

start   : (SINGLELINE|MULTILINECOMMENT|WHITESPACE|hardware|input|output|latches|NORMALTEXT|simulate|updates)* EOF ;

SINGLELINE : '//' ~[\n]* [\n]* -> skip;

MULTILINECOMMENT : '/*' (~[*] | '*' ~[/])* '*/' [\n]* -> skip;

WHITESPACE : [ \t\n]+ -> skip;


hardware: '.hardware ' NORMALTEXT;
input:  '.inputs ' list;
output:  '.outputs ' list;
latches: '.latches' latch+;
simulate: '.simulate' simulation+;
updates: '.update' update+;

list: ((NORMALTEXT ' ') | NORMALTEXT)+;
latch: ' '* NORMALTEXT ' -> ' NORMALTEXT;
simulation: ' '* NORMALTEXT '=' INT;
update: ' '* NORMALTEXT ' '* '=' ' '* expression;

expression: '!'? NORMALTEXT
            | ' '* '('expression')' ' '*
            | expression ' '* '&&' ' '* expression
            | expression ' '* '||' ' '* expression;

INT: [0-9]+;
NORMALTEXT: [a-zA-Z_0-9]+;
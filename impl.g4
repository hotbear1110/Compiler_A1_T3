grammar impl;

start   : m=methods | (SINGLELINE|MULTILINECOMMENT|WHITESPACE|NORMALTEXT)* EOF ;

SINGLELINE : '//' ~[\n]* [\n]* -> skip;

MULTILINECOMMENT : '/*' (~[*] | '*' ~[/])* '*/' [\n]* -> skip;

WHITESPACE : [ \t\n]+ -> skip;

methods:    hw=hardware
       |    in=input
       |    out=output
       |    lat=latches
       |    sim=simulate
       |    upd=updates;


hardware: '.hardware ' v=NORMALTEXT;
input:  '.inputs ' li=list;
output:  '.outputs ' li=list;
latches: '.latches' la=latch+;
simulate: '.simulate' s=simulation+;
updates: '.update' u=update+;

list: ((v=NORMALTEXT ' ') | v=NORMALTEXT)+;
latch: ' '* v1=NORMALTEXT ' -> ' v2=NORMALTEXT;
simulation: ' '* v=NORMALTEXT '=' i=INT;
update: ' '* v=NORMALTEXT ' '* '=' ' '* e=expression;

expression: '!'? x=NORMALTEXT                       # Var
            | ' '* '('e=expression')' ' '*          # Paren
            | e1=expression op=AND e2=expression    # AND
            | e1=expression op=OR  e2=expression    # OR
            ;

AND: ' '* '&&' ' '*;
OR: ' '* '||' ' '*;

INT: [0-9]+;
NORMALTEXT: [a-zA-Z_0-9]+;
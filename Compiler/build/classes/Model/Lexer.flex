package Model;
import static Model.Token.*;
%%
%class Lexer
%type Token
%public
%line
L = [a-zA-Z]
D = [0-9]+
RW = ARRAY|BEGIN|BOOLEAN|BYTE|CASE|CHAR|CONST|DO|DOWNTO|ELSE|END|FALSE|FILE|FOR|FORWARD|FUNCTION|GOTO|IF|IN|INLINE|INT|LABEL|LONGINT|NIL|OF|PACKED|PROCEDURE|PROGRAM|READ|REAL|RECORD|REPEAT|SET|SHORTINT|STRING|THEN|TO|TRUE|TYPE|UNTIL|VAR|WHILE|WITH|WRITE
OP = ,|;|\+\+|--|>=|>|<=|<|<>|=|\+|-|\*|\/|\(|\)|\[|\]|:=|\.|:|\+=|-=|\*=|\/=|>>|<<|<<=|>>=|NOT|OR|AND|XOR|MOD|DIV
WHITE = [ \t\r\n]
bloque = ("{" ~"}" | "{" "}")
bloque1 = ("\(\*" ~"\*\)" | "\(\*" "\*"+ "\)")
%{
    public String lexeme;
    public int line;
%}
%%
{WHITE} {/*Ignore*/}
{RW} {line = yyline; lexeme = yytext(); return Reserved_Word;}
{OP} {line = yyline; lexeme = yytext(); return Operator;}
{D}\.{D}E-?{D}|{D}\.{D}|{D} {line = yyline; lexeme = yytext(); return Literal;}
#{D} {line = yyline; lexeme = yytext(); return Literal;}
[\"][^\"]*[\"] {line = yyline; lexeme = yytext(); return Literal;}
\"{L}* ({L}|[]|{D})*\" {line = yyline; lexeme = yytext(); return Literal;}
{L} (({L}|[0-9]){0,126}) {line = yyline; lexeme = yytext(); return Identificador;}
\/\/.* {line = yyline; lexeme = yytext(); return Comment;}
\{.*\} {line = yyline; lexeme = yytext(); return Comment;}
{bloque} {line = yyline; lexeme = yytext(); return Comment;}
{bloque1} {line = yyline; lexeme = yytext(); return Comment;}
. {line = yyline; lexeme = yytext(); return ERROR;}



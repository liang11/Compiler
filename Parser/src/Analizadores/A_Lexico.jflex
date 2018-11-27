/*------------------1er Area: Codigo de Ususario--------------*/
//-----> Paquetes, importaciones
package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;

/*------------------2da Area: Opciones y Declaraciones--------*/
%%
//-----> Codigo de usuario en sintaxis java
%{
    public static LinkedList<TError> tablaEL = new LinkedList<TError>();
%}

//-----> Directivas
%public
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%line
%unicode
%full
%ignorecase

//-----> Expresiones Regulares
D = [0-9]+
L = [a-zA-Z]
numero = {D}\.{D}E-?{D}|{D}\.{D}|{D}
identificador = {L}(({L}|[0-9]){0,126})
cadena = \"{L}* ({L}|[]|{D})*\"

%%

/*------------------3ra Area: Reglas Lexicas------------------*/
//-----> Simbolos
<YYINITIAL> "="             //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.IGUALAR, yycolumn, yyline, yytext());}
<YYINITIAL> "+"             //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.MAS, yycolumn, yyline, yytext());}
<YYINITIAL> "-"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MENOS, yycolumn, yyline, yytext());}
<YYINITIAL> "*"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MULT, yycolumn, yyline, yytext());}
<YYINITIAL> "/"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.DIVICION, yycolumn, yyline, yytext());}
<YYINITIAL> "("             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.para, yycolumn, yyline, yytext());}
<YYINITIAL> ")"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.parc, yycolumn, yyline, yytext());}
<YYINITIAL> "PROGRAM"       //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.PROGRAM, yycolumn, yyline, yytext());}
<YYINITIAL> "BEGIN"         //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.BEGIN, yycolumn, yyline, yytext());}
<YYINITIAL> "END"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.END, yycolumn, yyline, yytext());}
<YYINITIAL> "FUNCTION"      //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.FUNCTION, yycolumn, yyline, yytext());}
<YYINITIAL> "INT"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.INT, yycolumn, yyline, yytext());}
<YYINITIAL> ","             //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.COMA, yycolumn, yyline, yytext());}
<YYINITIAL> ":"             //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.DOS_PUNTOS, yycolumn, yyline, yytext());}
<YYINITIAL> ";"             //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.PUNTO_COMA, yycolumn, yyline, yytext());}
<YYINITIAL> ":="            //{System.out.println("Reconocio: " + yytext()); 
                              {  return new Symbol(Simbolos.ASIGNAR, yycolumn, yyline, yytext());}
<YYINITIAL> "BOOLEAN"       //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.BOOLEAN, yycolumn, yyline, yytext());}
<YYINITIAL> "CHAR"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.CHAR, yycolumn, yyline, yytext());}
<YYINITIAL> "INT"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.INT, yycolumn, yyline, yytext());}
<YYINITIAL> "LONGINT"       //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.LONGINT, yycolumn, yyline, yytext());}
<YYINITIAL> "REAL"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.REAL, yycolumn, yyline, yytext());}
<YYINITIAL> "SHORTINT"      //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.SHORTINT, yycolumn, yyline, yytext());}
<YYINITIAL> "STRING"        //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.STRING, yycolumn, yyline, yytext());}
<YYINITIAL> "THEN"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.THEN, yycolumn, yyline, yytext());}
<YYINITIAL> "CONST"         //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.CONST, yycolumn, yyline, yytext());}
<YYINITIAL> "VAR"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.VAR, yycolumn, yyline, yytext());}
<YYINITIAL> "DO"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.DO, yycolumn, yyline, yytext());}
<YYINITIAL> "TO"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.TO, yycolumn, yyline, yytext());}
<YYINITIAL> "DIV"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.DIV, yycolumn, yyline, yytext());}
<YYINITIAL> "MOD"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MOD, yycolumn, yyline, yytext());}
<YYINITIAL> "+="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MAS_IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> "-="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MENOS_IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> "++"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MAS_MAS, yycolumn, yyline, yytext());}
<YYINITIAL> "--"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MENOS_MENOS, yycolumn, yyline, yytext());}
<YYINITIAL> "*="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.POR_IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> "/="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.DIV_IGUAL, yycolumn, yyline, yytext());}
//-------------Operaciones booleanas
<YYINITIAL> ">="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MAYOR_IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> ">"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MAYOR, yycolumn, yyline, yytext());}
<YYINITIAL> "<="            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MENOR_IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> "<"             //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.MENOR, yycolumn, yyline, yytext());}
<YYINITIAL> "<>"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.DIFERENTE, yycolumn, yyline, yytext());}
<YYINITIAL> "OR"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.OR, yycolumn, yyline, yytext());}
<YYINITIAL> "AND"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.AND, yycolumn, yyline, yytext());}
<YYINITIAL> "NOT"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.NOT, yycolumn, yyline, yytext());}
<YYINITIAL> "READ"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.READ, yycolumn, yyline, yytext());}
<YYINITIAL> "WRITE"         //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.WRITE, yycolumn, yyline, yytext());}
//-----------Operaciones de control
<YYINITIAL> "IF"            //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.IF, yycolumn, yyline, yytext());}
<YYINITIAL> "ELSE"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.ELSE, yycolumn, yyline, yytext());}
<YYINITIAL> "THEN"          //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.THEN, yycolumn, yyline, yytext());}
<YYINITIAL> "WHILE"         //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.WHILE, yycolumn, yyline, yytext());}
<YYINITIAL> "FOR"           //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.FOR, yycolumn, yyline, yytext());}
<YYINITIAL> "PROCEDURE"     //{System.out.println("Reconocio: " + yytext());
                              {  return new Symbol(Simbolos.PROCEDURE, yycolumn, yyline, yytext());}

//-----> Simbolos ER
<YYINITIAL> {numero}        //{System.out.println("Reconocio: " + yytext() + " Literal");
                              {  return new Symbol(Simbolos.NUM, yycolumn, yyline, yytext());}
<YYINITIAL> {cadena}        //{System.out.println("Reconocio: " + yytext() + " Literal");
                              {  return new Symbol(Simbolos.CADENA, yycolumn, yyline, yytext());}
<YYINITIAL> {identificador} //{System.out.println("Reconocio: " + yytext() + " ID");
                              {  return new Symbol(Simbolos.ID, yycolumn, yyline, yytext());}

//-----> Espacios
[ \t\r\n\f]             {/*Ignora los espacios*/}

\/\/.* {}

//-----> Errores Lexicos
.                       //{System.out.println("Error Lexico " + yytext() + " Linea: " + yyline);
                        {    tablaEL.add(new TError(yytext(), yyline));}
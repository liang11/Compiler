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

//-----> Expresiones Regulares
D = [0-9]+
L = [a-zA-Z]
numero = {D}\.{D}E-?{D}|{D}\.{D}|{D}
identificador = {L}(({L}|[0-9]){0,126})
literal = \"{L}* ({L}|[]|{D})*\"

%%

/*------------------3ra Area: Reglas Lexicas------------------*/
//-----> Simbolos
<YYINITIAL> "+"             {System.out.println("Reconocio: " + yytext()); 
                                return new Symbol(Simbolos.mas, yycolumn, yyline, yytext());}
<YYINITIAL> "-"             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.menos, yycolumn, yyline, yytext());}
<YYINITIAL> "*"             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.por, yycolumn, yyline, yytext());}
<YYINITIAL> "/"             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.div, yycolumn, yyline, yytext());}
<YYINITIAL> "("             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.para, yycolumn, yyline, yytext());}
<YYINITIAL> ")"             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.parc, yycolumn, yyline, yytext());}
<YYINITIAL> "PROGRAM"       {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.RW, yycolumn, yyline, yytext());}
<YYINITIAL> "BEGIN"         {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.beg, yycolumn, yyline, yytext());}
<YYINITIAL> "END"             {System.out.println("Reconocio: " + yytext());
                                return new Symbol(Simbolos.term, yycolumn, yyline, yytext());}

//-----> Simbolos ER
<YYINITIAL> {numero}        {System.out.println("Reconocio: " + yytext() + " Literal");
                                return new Symbol(Simbolos.lit, yycolumn, yyline, yytext());}
<YYINITIAL> {literal}       {System.out.println("Reconocio: " + yytext() + " Literal");
                                return new Symbol(Simbolos.lit, yycolumn, yyline, yytext());}
<YYINITIAL> {identificador} {System.out.println("Reconocio: " + yytext() + " ID");
                                return new Symbol(Simbolos.id, yycolumn, yyline, yytext());}

//-----> Espacios
[ \t\r\n\f]             {/*Ignora los espacios*/}

//-----> Errores Lexicos
.                       {System.out.println("Error Lexico " + yytext() + " Linea: " + yyline + " Columna: " + yycolumn);
                            TError datos = new TError(yytext(), "Error Lexico", "Simbolo no reconocido", yyline, yycolumn);
                            tablaEL.add(datos);}

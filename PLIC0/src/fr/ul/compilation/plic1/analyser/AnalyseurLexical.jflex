package fr.ul.compilation.plic1.analyser;

import java_cup.runtime.*;
      
%%
   
%class AnalyseurLexical
%public

%line
%column
    
%type Symbol
%eofval{
        return symbol(CodesLexicaux.EOF) ;
%eofval}

%cupsym Codeslexicaux
%cup
   
%{
  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }
%}

entier=                 0|[1-9][0-9]*
idf= 					[:jletter:][:jletterdigit:]*
idfmul=					([:jletter:][:jletterdigit:]*)((","|", ")[:jletter:][:jletterdigit:]*)*
chaine=					"\""[^]+"\""
statut=					"publique"|"privee"
type=					"entier"
comment=				( [^*] | \*+[^/*] )*

/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */
LineTerminator = \r|\n|\r\n
 

  
/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = {LineTerminator} | [ \t\f]



%%
<YYINITIAL> "("					{ return symbol(CodesLexicaux.PARO,yytext()); }
<YYINITIAL> ")"					{ return symbol(CodesLexicaux.PARF,yytext()) ; }
<YYINITIAL> {entier}			{ return symbol(CodesLexicaux.ENTIER, yytext()); }
<YYINITIAL>	"-"					{ return symbol(CodesLexicaux.MOINS, yytext()); }
<YYINITIAL>	"+"					{ return symbol(CodesLexicaux.PLUS, yytext()); }
<YYINITIAL>	"*"					{ return symbol(CodesLexicaux.MULTIPLICATION, yytext()); }
<YYINITIAL>	"<"					{ return symbol(CodesLexicaux.INFERIEUR, yytext()); }
<YYINITIAL>	">"					{ return symbol(CodesLexicaux.SUPERIEUR, yytext()); }
<YYINITIAL>	"=="				{ return symbol(CodesLexicaux.EGAL, yytext()); }
<YYINITIAL>	"!="				{ return symbol(CodesLexicaux.DIFFERENT, yytext()); }

<YYINITIAL> "entier "			{ return symbol(CodesLexicaux.TYPE, yytext()); }
<YYINITIAL> "fin"				{ return symbol(CodesLexicaux.FIN_CLASSE, yytext()); }
<YYINITIAL> {statut}			{ return symbol(CodesLexicaux.STATUT, yytext()); }
<YYINITIAL> "classe "			{ return symbol(CodesLexicaux.CLASSE, yytext()); }
<YYINITIAL> ";"					{ return symbol(CodesLexicaux.SEMI, yytext()); }
<YYINITIAL> "ecrire"			{ return symbol(CodesLexicaux.ECRIRE, yytext()); }
<YYINITIAL> "lire "				{ return symbol(CodesLexicaux.LIRE, yytext()); }
<YYINITIAL> "="					{ return symbol(CodesLexicaux.EGAL_AFFECT, yytext()); }
<YYINITIAL> {chaine}			{ return symbol(CodesLexicaux.CHAINE, yytext()); }
<YYINITIAL> {idf}				{ return symbol(CodesLexicaux.IDF, yytext()); }
<YYINITIAL> {idfmul}			{ return symbol(CodesLexicaux.IDF_MUL, yytext()); }

{WhiteSpace}       				{ /* just skip what was found, do nothing */ }  
"/*" [^*] {comment} "*"+ "/"   {}
"//" [^\n\r]* [\n|\r|\r\n]     {}
[\ |\t|\n|\r|\r\n]             {}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }



		   




					

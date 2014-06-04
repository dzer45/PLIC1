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
idf= 					[a-zA-Z0-9]+
chaine=					"\""[^]+"\""
comment=				( [^*] | \*+[^/*] )*

/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */
LineTerminator = \r|\n|\r\n
 

  
/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = {LineTerminator} | [ \t\f]



%%
<YYINITIAL> "("					{ return symbol(CodesLexicaux.PAROUV, yytext()); }
<YYINITIAL> ")"					{ return symbol(CodesLexicaux.PARFER, yytext()) ; }
<YYINITIAL> {entier}			{ return symbol(CodesLexicaux.ENTIER, yytext()); }
<YYINITIAL> "entier "			{ return symbol(CodesLexicaux.ENT, yytext()); }
<YYINITIAL>	"-"					{ return symbol(CodesLexicaux.MOINS, yytext()); }
<YYINITIAL>	"+"					{ return symbol(CodesLexicaux.PLUS, yytext()); }
<YYINITIAL>	"*"					{ return symbol(CodesLexicaux.MULTIPLICATION, yytext()); }
<YYINITIAL>	"<"					{ return symbol(CodesLexicaux.INFERIEUR, yytext()); }
<YYINITIAL>	">"					{ return symbol(CodesLexicaux.SUPERIEUR, yytext()); }
<YYINITIAL>	"=="				{ return symbol(CodesLexicaux.EGAL, yytext()); }
<YYINITIAL>	"!="				{ return symbol(CodesLexicaux.DIFFERENT, yytext()); }

<YYINITIAL> "debut"				{ return symbol(CodesLexicaux.DEB, yytext()); }
<YYINITIAL> "fin"				{ return symbol(CodesLexicaux.FIN, yytext()); }
<YYINITIAL> "classe "			{ return symbol(CodesLexicaux.CLASS, yytext()); }
<YYINITIAL> ";"					{ return symbol(CodesLexicaux.PTVIRG, yytext()); }
<YYINITIAL> "ecrire"			{ return symbol(CodesLexicaux.ECRIRE, yytext()); }
<YYINITIAL> "lire "				{ return symbol(CodesLexicaux.LIRE, yytext()); }
<YYINITIAL> "="					{ return symbol(CodesLexicaux.EGAL_AFFECT, yytext()); }
<YYINITIAL> {chaine}			{ return symbol(CodesLexicaux.CHAINE, yytext()); }
<YYINITIAL> {idf}				{ return symbol(CodesLexicaux.IDF, yytext()); }
<YYINITIAL> ","					{ return symbol(CodesLexicaux.VIRG, yytext());	}
<YYINITIAL> "publique " 		{ return symbol(CodesLexicaux.PUB, yytext());	}
<YYINITIAL> "privee " 			{ return symbol(CodesLexicaux.PRIV, yytext());	}
<YYINITIAL> "retourne "			{ return symbol(CodesLexicaux.RETOURNE, yytext()); }

{WhiteSpace}       				{ /* just skip what was found, do nothing */ }  
"/*" [^*] {comment} "*"+ "/"   {}
"//" [^\n\r]* [\n|\r|\r\n]     {}
[\ |\t|\n|\r|\r\n]             {}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }



		   




					

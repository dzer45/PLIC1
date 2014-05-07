package fr.ul.compilation.plic0.analyser;

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

/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */
LineTerminator = \r|\n|\r\n
 

  
/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = {LineTerminator} | [ \t\f]



%%
<YYINITIAL> "("				{ return symbol(CodesLexicaux.PARO,yytext()); }
<YYINITIAL> ")"				{ return symbol(CodesLexicaux.PARF,yytext()) ; }
<YYINITIAL> {entier}			{ return symbol(CodesLexicaux.ENTIER, yytext()); }
<YYINITIAL>	"-"					{ return symbol(CodesLexicaux.MOINS, yytext()); }
<YYINITIAL>	"+"					{ return symbol(CodesLexicaux.PLUS, yytext()); }
<YYINITIAL>	"*"					{ return symbol(CodesLexicaux.MULTIPLICATION, yytext()); }
<YYINITIAL>	"<"					{ return symbol(CodesLexicaux.INFERIEUR, yytext()); }
<YYINITIAL>	">"					{ return symbol(CodesLexicaux.SUPERIEUR, yytext()); }
<YYINITIAL>	"=="				{ return symbol(CodesLexicaux.EGAL, yytext()); }
<YYINITIAL>	"!="				{ return symbol(CodesLexicaux.DIFFERENT, yytext()); }

{WhiteSpace}       				{ /* just skip what was found, do nothing */ }  


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }



		   




					

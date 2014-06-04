package fr.ul.compilation.plic1.exception;


public class AnalyseSyntaxiqueException extends PlicException{
    public AnalyseSyntaxiqueException(String s){
	super("ERREUR SYNTAXIQUE : "+s);
    }
}
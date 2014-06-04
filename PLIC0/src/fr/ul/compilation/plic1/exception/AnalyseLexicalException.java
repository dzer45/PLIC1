package fr.ul.compilation.plic1.exception;

public class AnalyseLexicalException extends PlicException{
    public AnalyseLexicalException(String s){
    	super("ERREUR LEXICALE  : " +s);
    }
}
package fr.ul.compilation.plic1.exception;


public class AnalyseurSemantiqueException extends PlicException{
    public AnalyseurSemantiqueException(String s){
	super("ERREUR SEMANTIQUE :\n "+s);
    }

	/**
	 * @param erreurEx
	 */
	public AnalyseurSemantiqueException(StringBuilder erreurEx) {
		// TODO Auto-generated constructor stub
		super("ERREUR SEMANTIQUE : "+erreurEx);
	}
}
package fr.ul.compilation.plic1.expression;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.generateur.EntreeVariable;
import fr.ul.compilation.plic1.generateur.TDS;

public class Idf extends Zeroaire{
	private String identifier;
	
	public Idf( String id) {
		this.identifier = id;
	}
	
	@Override
	public String generer() {
		return  " " + this.identifier;
	}

	@Override
	public String toString() {
		return  " " + this.identifier;
	}
	/**
	 * REgarde si l'identifaceur a �t� bien d�clar� et rempli les champs type et statut grace � identfier de la tds
	 * r�cup�ration des erreurs
	 * @throws AnalyseurSemantiqueException 
	 */
	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		
		if(TDS.getInstance().identifier(identifier) == null) {
			
			throw new AnalyseurSemantiqueException("Variable non d�clar�e : " + this.identifier+" ligne "+TDS.getInstance().getListe().get(0).get(identifier).ligne());
		}else{
			
			return true;
		}
	}
}

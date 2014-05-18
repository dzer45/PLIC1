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
	 * REgarde si l'identifaceur a été bien déclaré et rempli les champs type et statut grace à identfier de la tds
	 * récupération des erreurs
	 * @throws AnalyseurSemantiqueException 
	 */
	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		
		if(TDS.getInstance().identifier(identifier) == null) {
			
			throw new AnalyseurSemantiqueException("Variable non déclarée : " + this.identifier+" ligne "+TDS.getInstance().getListe().get(0).get(identifier).ligne());
		}else{
			
			return true;
		}
	}
}

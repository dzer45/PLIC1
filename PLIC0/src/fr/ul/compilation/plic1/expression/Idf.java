package fr.ul.compilation.plic1.expression;

import java.util.Map.Entry;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.generateur.Entree;
import fr.ul.compilation.plic1.generateur.EntreeVariable;
import fr.ul.compilation.plic1.generateur.Symbole;
import fr.ul.compilation.plic1.generateur.SymboleVariable;
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
		for(Entry<Entree, Symbole> entry : TDS.getInstance().getListe().get(0).entrySet()) {
			if(entry.getKey().idf().identifier.equals(this.identifier)) {
				SymboleVariable s = (SymboleVariable) TDS.getInstance().getListe().get(0).get(entry.getKey());
				if(s.getStatut() == null) {
					throw new AnalyseurSemantiqueException("Variable non déclarée : " + this.identifier);	
				}
			}
		}
		return true;
	
	}
	
	public String getIdentifier() {
		return this.identifier;
	}
}

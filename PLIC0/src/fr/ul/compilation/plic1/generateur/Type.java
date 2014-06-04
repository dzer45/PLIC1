package fr.ul.compilation.plic1.generateur;

public abstract class Type {
	/**
	 * Fonction qui vérifie le type donnée en parametre est celui attendu 
	 * @param typ
	 * @return vrai si le type donnée en param est celui attendu
	 */
	public abstract boolean verifierType(Type typ);
}

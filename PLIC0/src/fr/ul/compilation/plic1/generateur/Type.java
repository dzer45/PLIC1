package fr.ul.compilation.plic1.generateur;

public abstract class Type {
	/**
	 * Fonction qui v�rifie le type donn�e en parametre est celui attendu 
	 * @param typ
	 * @return vrai si le type donn�e en param est celui attendu
	 */
	public abstract boolean verifierType(Type typ);
}

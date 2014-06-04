package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public abstract class Entree {
	// Construire une entr�e
	protected Idf idf;

	public Entree(Idf id) {
		idf = id;
	}

	// Identificateur attach� � l'entr�e
	public Idf idf() {
		return idf;
	}
	public String toString(){
		return idf.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Entree))
			return false;
		Entree entree = (Entree)obj;
		return this.idf.getIdentifier().equals(entree.idf.getIdentifier());
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}

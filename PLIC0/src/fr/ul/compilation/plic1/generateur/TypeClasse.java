package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public class TypeClasse extends Type {

	public TypeClasse(Idf idf) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verifierType(Type typ) {
		return typ instanceof TypeClasse;
	}

}

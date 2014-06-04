package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public class SymboleConstructeur extends SymboleMethode{

	public SymboleConstructeur(int ileft, Idf i, Statut s,
			ParametresFormels lp, Type t, ListeDInstructions li) {
		super(ileft, i, s, lp, t, li);
	}

	public SymboleConstructeur(int ileft, Idf i, Statut s,
			ParametresFormels lp, ListeDInstructions li) {
		super(ileft, i, s, lp, null, li);
	}
}

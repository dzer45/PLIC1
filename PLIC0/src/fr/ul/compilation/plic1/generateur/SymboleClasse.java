package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public class SymboleClasse extends Symbole{
	private Idf idf;

	protected SymboleClasse(int ligne) {
		super(ligne);
		// TODO Auto-generated constructor stub
	}

	public SymboleClasse(int ileft, Idf a) {
		super(ileft);
		this.idf = a;
	}

	public Idf getIdf() {
		return idf;
	}

	public void setIdf(Idf idf) {
		this.idf = idf;
	}
	
}

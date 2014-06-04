package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public class EntreeMethode extends Entree {
	private ParametresFormels pf;

	public EntreeMethode(Idf id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public EntreeMethode(Idf i, ParametresFormels lp) {
		super(i);
		this.pf = lp;
	}

	public ParametresFormels getPf() {
		return pf;
	}

	public void setPf(ParametresFormels pf) {
		this.pf = pf;
	}
}

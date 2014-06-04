package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.expression.Idf;

public class SymboleMethode extends Symbole {
	private Idf idf;
	private Statut statut;
	private ParametresFormels pf;
	private Type type;
	private ListeDInstructions ldi;

	protected SymboleMethode(int ligne) {
		super(ligne);
		// TODO Auto-generated constructor stub
	}
	public SymboleMethode(int ileft, Idf i, Statut s, ParametresFormels lp,
			Type t, ListeDInstructions li) {
		super(ileft);
		this.idf = i;
		this.statut = s;
		this.pf = lp;
		this.type = t;
		this.ldi = li;
	}
	public Idf getIdf() {
		return idf;
	}
	public void setIdf(Idf idf) {
		this.idf = idf;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public ParametresFormels getPf() {
		return pf;
	}
	public void setPf(ParametresFormels pf) {
		this.pf = pf;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public ListeDInstructions getLdi() {
		return ldi;
	}
	public void setLdi(ListeDInstructions ldi) {
		this.ldi = ldi;
	}
	
}

package fr.ul.compilation.plic0;

public abstract class Binaire extends Expression {
	protected Expression opg, opd;
	
	public Binaire(){
		
	}
	
	public Binaire(Expression g, Expression d) {
		this.opg = g;
		this.opd = d;
		Expression.NB_OPERANDE++;
	}
	public Expression gauche(){
		return opg;
		
	}
	public Expression droit(){
		return opd;
		
	}
	public void ajouterDroit(Expression exp){
		opd=exp;
	}
	public void ajouterGauche(Expression exp){
		opg=exp;
	}
	public int NbOperateurs() {
		return this.opg.NbOperateurs() + this.opd.NbOperateurs() + 1;
	}

	public int NbOperandes() {
		return this.opg.NbOperandes() + this.opd.NbOperandes();
	}

	public  String toString(){
		return "("+opg+operateur()+opd+")";
	}
	public abstract String operateur();
}

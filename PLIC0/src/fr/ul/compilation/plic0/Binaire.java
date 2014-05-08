package fr.ul.compilation.plic0;

public abstract class Binaire extends Expression {
	protected Expression opg, opd;
	public Binaire(){
	}
	
	public Binaire(Expression g, Expression d) {
		this.opg = g;
		this.opd = d;
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
}

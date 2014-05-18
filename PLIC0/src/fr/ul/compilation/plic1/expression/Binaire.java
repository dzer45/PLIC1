package fr.ul.compilation.plic1.expression;

public abstract class Binaire extends Expression {
	protected Expression opg, opd;
	//protected types
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
	/**
	 * Utilise la fonction vérifType pour savoir si c'est conforme
	 */
	@Override
	public boolean verifier() {
		// TODO Auto-generated method stub
		return false;
	}
}

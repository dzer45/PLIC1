package fr.ul.compilation.plic0;

public abstract class Expression {
	public static int COMPTEUR_GENEREATION = 0;
	
	public abstract int NbOperateurs();

	public abstract int NbOperandes();

	public abstract String toString();

	public abstract void ajouterGauche(Expression e1);
	public abstract void ajouterDroit(Expression e1);

	public abstract String generer() ;
}

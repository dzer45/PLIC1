package fr.ul.compilation.plic0;

public abstract class Expression{	
	public Expression() {
	}
	
	public static int COMPTEUR_GENEREATION = 0;

	public abstract String toString();
	
	public abstract String generer();
}

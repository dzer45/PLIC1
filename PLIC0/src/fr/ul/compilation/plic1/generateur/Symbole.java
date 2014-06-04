package fr.ul.compilation.plic1.generateur;

public abstract class Symbole {
	int numero;
	
	//Construire un symbole
	public Symbole(int ligne){
		numero=ligne;	
	}
	
	//Ligne dans le texte source
	public int ligne(){
		return numero;
	}
	//Type de la variable
	
}

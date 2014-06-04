package fr.ul.compilation.plic1.generateur;

import fr.ul.compilation.plic1.Classe;

public class EtatCompilateur {
	public static EtatCompilateur ec = new EtatCompilateur();
	
	private Classe classeEnCours;
	
	public static EtatCompilateur getInstance() {
		return ec;
	}

	public Classe classeEnCours() {
		return this.classeEnCours;
	}

	public void setClasseEnCours(Classe cla) {
		this.classeEnCours = cla;
	}

}

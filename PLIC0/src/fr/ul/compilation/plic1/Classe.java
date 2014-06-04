package fr.ul.compilation.plic1;

import java.util.ArrayList;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;
import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.expression.Idf;
import fr.ul.compilation.plic1.generateur.EntreeConstructeur;
import fr.ul.compilation.plic1.generateur.EntreeMethode;
import fr.ul.compilation.plic1.generateur.SymboleConstructeur;
import fr.ul.compilation.plic1.generateur.SymboleMethode;

public class Classe extends ArbreAbstrait{
	private ArrayList<Methode> listeMethodes = new ArrayList<Methode>();
	private ArrayList<Constructeur> listeConstructeurs = new ArrayList<Constructeur>();
	
	public Classe(Idf i, Idf a, int ileft) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generer() {
		StringBuilder sb = new StringBuilder();
		for(Methode cl : listeMethodes) {
			sb.append(cl.generer());
			sb.append('\n');
		}
		for(Constructeur cl : listeConstructeurs) {
			sb.append(cl.generer());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Methode cl : listeMethodes) {
			sb.append(cl.toString());
			sb.append('\n');
		}
		for(Constructeur cl : listeConstructeurs) {
			sb.append(cl.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		return false;
		
	}

	public void ajouterMethode(EntreeMethode em, SymboleMethode sm) {
		this.listeMethodes.add(new Methode(em, sm));
	}

	public void ajouterConstructeur(EntreeConstructeur ec,
			SymboleConstructeur sc) {
		this.listeConstructeurs.add(new Constructeur(ec, sc));
	}
	
}

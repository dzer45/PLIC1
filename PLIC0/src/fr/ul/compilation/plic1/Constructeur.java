package fr.ul.compilation.plic1;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.generateur.EntreeConstructeur;
import fr.ul.compilation.plic1.generateur.SymboleConstructeur;
import fr.ul.compilation.plic1.instruction.Instruction;

public class Constructeur extends ArbreAbstrait{
	private EntreeConstructeur entree;
	private SymboleConstructeur symbole;
	
	public Constructeur(EntreeConstructeur entree, SymboleConstructeur symbole) {
		this.entree = entree;
		this.symbole = symbole;
	}

	public EntreeConstructeur getEntree() {
		return entree;
	}

	public void setEntree(EntreeConstructeur entree) {
		this.entree = entree;
	}

	public SymboleConstructeur getSymbole() {
		return symbole;
	}

	public void setSymbole(SymboleConstructeur symbole) {
		this.symbole = symbole;
	}

	@Override
	public String generer() {
		StringBuilder sb = new StringBuilder();
		for(Instruction cl : symbole.getLdi().getLi()) {
			sb.append(cl.generer());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Instruction cl : symbole.getLdi().getLi()) {
			sb.append(cl.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

}

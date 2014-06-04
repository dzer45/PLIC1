package fr.ul.compilation.plic1;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.generateur.EntreeMethode;
import fr.ul.compilation.plic1.generateur.SymboleMethode;
import fr.ul.compilation.plic1.instruction.Instruction;

public class Methode extends ArbreAbstrait{
	private EntreeMethode entree;
	private SymboleMethode symbole;
	
	public Methode(EntreeMethode entree, SymboleMethode symbole) {
		this.entree = entree;
		this.symbole = symbole;
	}

	public EntreeMethode getEntree() {
		return entree;
	}

	public void setEntree(EntreeMethode entree) {
		this.entree = entree;
	}

	public SymboleMethode getSymbole() {
		return symbole;
	}

	public void setSymbole(SymboleMethode symbole) {
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
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(Instruction cl : symbole.getLdi().getLi()) {
			sb.append(cl.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

}

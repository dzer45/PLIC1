package fr.ul.compilation.plic1;

import java.util.LinkedList;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;
import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;

public class Bloc extends ArbreAbstrait{
	private LinkedList<ArbreAbstrait> instructions = new LinkedList<ArbreAbstrait>();
	
	public void addArbreAbstrait(ArbreAbstrait instruction ) {
		this.instructions.add(instruction);
	}
	
	@Override
	public String generer()  {
		StringBuilder sb = new StringBuilder();
		for(ArbreAbstrait abr : this.instructions) {
			sb.append(abr.generer());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(ArbreAbstrait abr : this.instructions) {
			sb.append(abr.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		boolean sb = true;
		for(ArbreAbstrait abr : this.instructions) {
			sb = sb &&  abr.verifier();
		}
		return sb;
	}
}

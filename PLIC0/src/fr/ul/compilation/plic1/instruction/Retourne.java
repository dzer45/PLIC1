package fr.ul.compilation.plic1.instruction;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.expression.Expression;

public class Retourne extends Instruction {
	private Expression expression;
	public Retourne(Expression exp) {
		this.expression = exp;
	}
	
	@Override
	public String generer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "retourne " + this.expression.toString();
	}

}

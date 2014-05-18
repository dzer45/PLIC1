package fr.ul.compilation.plic1.instruction;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;
import fr.ul.compilation.plic1.expression.Expression;
import fr.ul.compilation.plic1.expression.Idf;
import fr.ul.compilation.plic1.generateur.TDS;

public class Ecrire extends Instruction {
	protected Expression expression;
	
	public Ecrire(Expression exp) {
		this.expression = exp;
	}

	@Override
	public String toString() {
		return "ecrire " + this.expression.toString();
	}

	public String generer() {
	StringBuilder ecrire = new StringBuilder();
		
		if(expression instanceof Idf){
			
			ecrire.append("\n\nli $v0, 1\n");
//			ecrire.append("lw $a0,"+TDS.getInstance().identifier(((Idf) expression).getKey()).getDeplacement() +"($t7)\n");
			ecrire.append("syscall\n\n");
					
			return ecrire.toString() ;
			
		}

		ecrire.append("\n"+expression.generer());
		ecrire.append("\nadd $sp,$sp,4");
		ecrire.append("\n\nli $v0, 1\n");
		ecrire.append("lw $a0,($sp)\n");
		ecrire.append("syscall\n\n");
				
		return ecrire.toString() ;
	}
	/**
	 * VŽrifie que exp est du bon type c'est ˆ dire que exp est soit une chaine soit une expression
	 */
	@Override
	public boolean verifier() {
		// TODO Auto-generated method stub
		return false;
	}
}

package fr.ul.compilation.plic1.instruction;

import fr.ul.compilation.plic1.expression.Expression;
import fr.ul.compilation.plic1.expression.Idf;

public class Lire extends Instruction {
	protected Expression expression;
	protected int j ;
	
	public Lire(String idf) {
		// Il faut retrouver la variable
		this.expression = new Idf( idf);
	}

	@Override
	public String toString() {
		return "lire " + this.expression.toString();
	}

	@Override
	public String generer() {
		StringBuilder lire = new StringBuilder(); 
		 lire.append("\n.data");
		 lire.append("\n");
		 lire.append("stri"+j+": .asciiz \"Veuillez indiquer un entier pour " +  expression +" : \"");
		 lire.append("\n");
		 lire.append(".text");
		 lire.append("\n");
		 lire.append("li $v0, 4");
		 lire.append("\n");
		 lire.append("la $a0, stri"+j);
		 lire.append("\n");
		 lire.append("syscall\n\n") ;
		 
		 
		 lire.append("\n");
		 lire.append("li  $v0, 5\n");      
		 lire.append("syscall\n\n");

	//	 lire.append("sw $v0,"+ Tds.getInstance().identifier(idf).getDeplacement() +"($t7)\n");
		 

		 return lire.toString();
	}
	/**
	 * VŽrifie que exp est du bon type
	 */
	@Override
	public boolean verifier() {
		// TODO Auto-generated method stub
		return false;
	}
}

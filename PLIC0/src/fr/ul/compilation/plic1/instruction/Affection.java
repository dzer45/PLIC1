package fr.ul.compilation.plic1.instruction;

import fr.ul.compilation.plic1.expression.Expression;
import fr.ul.compilation.plic1.expression.Idf;

public class Affection extends Instruction{
	protected Idf identifiant;
	protected Expression expression;
	
	public Affection(Idf idf, Expression exp) {
		this.identifiant = idf;
		this.expression = exp;
	}
	
	public String toString() {
		return this.identifiant.toString() + " = " + this.expression.toString();
	}

	public String generer() {
		return 
				"#Calculer l'adresse de la destination \n"+
				"   	lw $v0,base\n"+	
				"		adi $v0,$v0,#4\n"+
				"		sw $v0,-(pile\n"+
				"#Ranger la valeur de la source dans v0\n"+
				"		lw $v0,(base)0\n"+
				"		lw $t8,#10 \n"+
				"		add $v0,$t8,$t8 \n"+
				"# Ranger la source dans la destination\n"+
				"		lw $t8,(pile)+\n"+
				"		sw $v0, ($t8)\n";
	}
	/**
	 * Verifie que idf et exp sont de même type
	 */
	@Override
	public boolean verifier() {
		// TODO Auto-generated method stub
		return identifiant.getType().verifierType(expression.getType());
		//return false;
	}

}

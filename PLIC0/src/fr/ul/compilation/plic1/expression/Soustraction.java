package fr.ul.compilation.plic1.expression;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;


public class Soustraction extends Binaire {
	public Soustraction(Expression e1, Expression opd) {
		super(e1, opd);

	}

	public Soustraction() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String generer(){
		// TODO Auto-generated method stub
		return opg.generer()+
				"#Empiler v0 \n"+
				"		sw $v0,0($sp)\n"+
				"		add $sp, $sp, -4\n"+
				opd.generer()+
				"#Depiler dans $t8\n"+
				"		add $sp, $sp, 4\n"+
				"		lw $t8,($sp) \n"+
				"#Soustraction  $t8 � v0 \n"+
				"		sub $v0, $t8, $v0\n";

	}


	@Override
	public String toString() {
		return "(" + this.opg.toString() + "-" + this.opd.toString() + ")";
	}


}

package fr.ul.compilation.plic1.expression;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;


public class Inegalite extends Binaire{

	public Inegalite(Expression g, Expression d) {
		super(g, d);
		// TODO Auto-generated constructor stub
	}

	public Inegalite() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String generer(){
		Expression.COMPTEUR_GENEREATION++;
		return opg.generer()+
				"#Empiler v0 \n"+
				"		sw $v0,0($sp)\n"+
				"		add $sp, $sp, -4\n"+
				opd.generer()+
				"#Depiler dans $t8\n"+
				"		add $sp, $sp, 4\n"+
				"		lw $t8,($sp)\n "+
				"#Calculer opg!=opd $t8 \n"+
				"		beq $t8, $v0, neqfalse" + Expression.COMPTEUR_GENEREATION + "\n"+
				"		li $v0, 1\n" +
				"		b neqend" + Expression.COMPTEUR_GENEREATION + "\n" +
				"neqfalse" + Expression.COMPTEUR_GENEREATION + ":\n" +
				"		li $v0, 0\n" +
				"neqend" + Expression.COMPTEUR_GENEREATION + ":\n";
	}


	@Override
	public String toString() {
		return "(" + this.opg.toString() + "!=" + this.opd.toString() + ")";
	}


}

package fr.ul.compilation.plic0;

public class Egal extends Binaire{

	public Egal(Expression g, Expression d) {
		super(g, d);
		// TODO Auto-generated constructor stub
	}

	public Egal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generer() {
		Expression.COMPTEUR_GENEREATION++;
		return opg.generer()+
				"#Empiler v0 \n"+
				"		sw $v0,0($sp)\n"+
				"		add $sp, $sp, -4\n"+
				opd.generer()+
				"#Depiler dans $t8\n"+
				"		add $sp, $sp, 4\n"+
				"		lw $t8,($sp) \n"+
				"#Calculer opg==opd $t8 \n"+
				"		bne $t8, $v0, eqfalse" + Expression.COMPTEUR_GENEREATION + "\n"+
				"		li $v0, 1\n" +
				"		b eqend" + Expression.COMPTEUR_GENEREATION + "\n" +
				"eqfalse" + Expression.COMPTEUR_GENEREATION + ":\n" +
				"		li $v0, 0\n" +
				"eqend" + Expression.COMPTEUR_GENEREATION + ":\n";
	}

	@Override
	public String toString() {
		return "(" + this.opg.toString() + "==" + this.opd.toString() + ")";
	}
}

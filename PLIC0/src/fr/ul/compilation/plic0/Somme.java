package fr.ul.compilation.plic0;

public class Somme extends Binaire {

	public Somme(Expression exp1, Expression exp2) {
		super(exp1, exp2);

	}

	public Somme() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String operateur() {
		// TODO Auto-generated method stub
		return "+";
	}

	@Override
	public String generer() {
		// TODO Auto-generated method stub
		return opg.generer()+
				"#Empiler v0 \n"+
				"		sw $v0,0($sp)\n"+
				"		add $sp, $sp, -4\n"+
				opd.generer()+
				"#Depiler dans $t8\n"+
				"		add $sp, $sp, 4\n"+
				"		lw $t8,($sp)\n "+
				"#Somme  $t8 � v0 \n"+
				"		add $v0, $t8, $v0\n";

	}


}
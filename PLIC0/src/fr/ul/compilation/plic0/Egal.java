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
	public String operateur() {
		// TODO Auto-generated method stub
		return "==";
	}

	@Override
	public String generer() {
		// TODO Auto-generated method stub;
		return opg.generer()+
				"#Empiler v0 \n"+
				"		sw $v0,0($sp)\n"+
				"		add $sp, $sp, -4\n"+
				opd.generer()+
				"#Depiler dans $t8\n"+
				"		add $sp, $sp, 4\n"+
				"		lw $t8,($sp) \n"+
				"#Calculer opg==opd $t8 \n"+
				"		sub $v0,$t8,$v0\n"+
				"		beq $t8, aller \n"+
				"aller:";
	}



}

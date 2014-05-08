package fr.ul.compilation.plic0;

public class Affection extends Binaire{
	public Affection(Expression e1, Expression e2) {
		super(e1, e2);
	}
	
	@Override
	public String toString() {
		return this.opg.toString() + " = " + this.opd.toString();
	}

	@Override
	public String generer() {
		return "test";
	}

}

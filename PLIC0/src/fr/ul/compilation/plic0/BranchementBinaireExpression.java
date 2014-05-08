package fr.ul.compilation.plic0;

public class BranchementBinaireExpression extends Binaire{
	public BranchementBinaireExpression(Expression e1, Expression e2) {
		super(e1, e2);
	}
	
	@Override
	public String toString() {
		return "(" + this.opg.toString() + this.opd.toString() + ")";
	}

	@Override
	public String generer() {
		return this.opg.generer() + this.opd.generer();
	}
}

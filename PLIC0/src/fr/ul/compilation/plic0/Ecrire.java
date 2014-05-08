package fr.ul.compilation.plic0;

public class Ecrire extends Unaire{
	public Ecrire(Expression exp) {
		super(exp);
	}
	
	@Override
	public String toString() {
		return "ecrire " + this.next;
	}

	@Override
	public String generer() {
		return "test";
	}
}

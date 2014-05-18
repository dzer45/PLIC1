package fr.ul.compilation.plic1.expression;


public class Chaine extends Zeroaire{
	private String chaine;
	
	public Chaine(String chaine) {
		this.chaine = chaine;
	}
	
	@Override
	public String toString() {
		return this.chaine;
	}

	@Override
	public String generer() {
		return "test";
	}


}

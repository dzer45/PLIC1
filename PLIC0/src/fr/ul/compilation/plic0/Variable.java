package fr.ul.compilation.plic0;

public class Variable extends Zeroaire{
	private String identifier;
	private String statut;
	
	public Variable(String statut, String id) {
		this.identifier = id;
		this.statut = statut;
	}
	
	@Override
	public String generer() {
		return this.statut + " " + this.identifier;
	}

	@Override
	public String toString() {
		return this.statut + " " + this.identifier;
	}
}

package fr.ul.compilation.plic0;

public class Lire extends Unaire{
	public Lire(String idf) {
		//Il faut retrouver la variable
		this.next = new Variable("publique", idf);
	}

	@Override
	public String toString() {
		return "lire " + this.next;
	}

	@Override
	public String generer() {
		return "test";
	}
}

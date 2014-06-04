package fr.ul.compilation.plic1.generateur;

public class SymboleChamp extends Symbole{
	private Statut statut;
	private Type type;
	
	public SymboleChamp(int ileft, Statut s, Type t) {
		super(ileft);
		this.statut = s;
		this.type = t;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}

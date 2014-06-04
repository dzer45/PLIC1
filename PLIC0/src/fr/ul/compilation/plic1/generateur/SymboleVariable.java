package fr.ul.compilation.plic1.generateur;

public class SymboleVariable extends Symbole{
	private Type type;
	private Statut statut;
	public SymboleVariable(int ligne, Statut stat, Type t) {
		super(ligne);
		// TODO Auto-generated constructor stub
		type=t;
		statut=stat;
	}

	
	@Override
	public String toString() {
		return super.ligne()+" "+ statut + " " + type.toString();
	}
	
	public Type getType() {
		return this.type;
	}


	public Statut getStatut() {
		return statut;
	}


	public void setStatut(Statut statut) {
		this.statut = statut;
	}


	public void setType(Type type) {
		this.type = type;
	}
}

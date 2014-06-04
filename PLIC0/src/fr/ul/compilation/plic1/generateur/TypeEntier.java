package fr.ul.compilation.plic1.generateur;

public class TypeEntier extends Type
{
	public static TypeEntier te = new TypeEntier();
	
	@Override
	public boolean verifierType(Type typ) {
		// TODO Auto-generated method stub
		return typ instanceof TypeEntier;
	}
	
	public String toString(){
		return "entier";
	}

	public static Type getInstance() {
		// TODO Auto-generated method stub
		return te;
	}

}

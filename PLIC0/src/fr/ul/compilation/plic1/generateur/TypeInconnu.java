package fr.ul.compilation.plic1.generateur;

public class TypeInconnu extends Type{
	@Override
	public boolean verifierType(Type typ) {
		// TODO Auto-generated method stub
		return typ instanceof TypeInconnu;
	}
	
	public String toString(){
		return "inconnu";
	}
}

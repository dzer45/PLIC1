package fr.ul.compilation.plic1.generateur;

public class TypeChaine extends Type {

	@Override
	public boolean verifierType(Type typ) {
		// TODO Auto-generated method stub
		return typ instanceof TypeChaine;
	}
	
	public String toString(){
		return "caine";
	}
}

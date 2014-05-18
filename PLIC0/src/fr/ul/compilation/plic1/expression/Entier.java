package fr.ul.compilation.plic1.expression;

import fr.ul.compilation.plic1.generateur.TypeEntier;


public class Entier extends Zeroaire {
	private  int val;

	public Entier( int val ) {
		this.val = val ;

	}

	public int valeur(){
		return this.val;
	}

	public  String toString(){
		return ""+this.val ;
	}

	@Override
	public String generer() {
		// TODO Auto-generated method stub
		return "#Ranger "+val+" dans v0\n"+
		" 		li $v0,"+val+"  \n" ;

	}
	/**
	 * décore son champs type par TypeEntier
	 */
	@Override
	public boolean verifier() {
		// TODO Auto-generated method stub
		type = new TypeEntier();
		return true;
	}
}


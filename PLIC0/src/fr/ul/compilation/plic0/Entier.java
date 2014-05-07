package fr.ul.compilation.plic0;
	public class Entier extends Expression {
		private  int val;
	

	public Entier( int val ) {
		this.val = val ;

	}
	
	public  int valeur(){
		return this.val;
	}
	public int NbOperateurs()
		{ 
			return 0 ; 
		}
	
	public int NbOperandes() 
		{ 
			return 1 ; 
		}
	
	public  String toString(){
		return ""+this.val ;
	}

	@Override
	public void ajouterGauche(Expression e1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterDroit(Expression e1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String generer() {
		// TODO Auto-generated method stub
		return "#Ranger "+val+" dans v0\n"+
				" 		li $v0,"+val+"  \n" ;
				
	}


}


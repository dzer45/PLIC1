package fr.ul.compilation.plic0.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import fr.ul.compilation.plic0.Expression;
import fr.ul.compilation.plic0.analyser.AnalyseurLexical;
import fr.ul.compilation.plic0.analyser.AnalyseurSyntaxique;
import fr.ul.compilation.plic0.generateur.GenerateurCode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1){
		Expression exp ;
			exp = affichageLexique(args[0]);
			GenerateurCode.getInstance().printFichier(exp.generer());
		}else{
			System.out.println("Test <fichierSource>");
		}
	
		
	}
	
	public static Expression affichageLexique(String chemin)   {
		Expression exp = null;
		
		FileReader fichierR;
		try {
			fichierR = new FileReader(chemin);
			AnalyseurLexical analyseurL = new AnalyseurLexical(fichierR);
			AnalyseurSyntaxique analyseurS = new AnalyseurSyntaxique(analyseurL);
			exp = (Expression) analyseurS.parse().value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(exp);	
		
		return exp;
	}

}

package fr.ul.compilation.plic0.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

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
			LinkedList<Expression> liste ;
			liste = affichageLexique(args[0]);
			for(Expression exp : liste) {
				GenerateurCode.getInstance().printFichier(exp.generer());
			}
			
		}else{
			System.out.println("<fichierSource>");
		}
	
		
	}
	
	public static LinkedList<Expression> affichageLexique(String chemin)   {
		LinkedList<Expression> liste = null;
		
		FileReader fichierR;
		try {
			fichierR = new FileReader(chemin);
			AnalyseurLexical analyseurL = new AnalyseurLexical(fichierR);
			AnalyseurSyntaxique analyseurS = new AnalyseurSyntaxique(analyseurL);
			liste = (LinkedList<Expression>) analyseurS.parse().value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Expression exp : liste) {
			System.out.println(exp.toString());
		}
		
		return liste;
	}

}

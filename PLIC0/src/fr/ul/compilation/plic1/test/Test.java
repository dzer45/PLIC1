package fr.ul.compilation.plic1.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import fr.ul.compilation.plic1.Classe;
import fr.ul.compilation.plic1.analyser.AnalyseurLexical;
import fr.ul.compilation.plic1.analyser.AnalyseurSyntaxique;
import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;
import fr.ul.compilation.plic1.generateur.GenerateurCode;
import fr.ul.compilation.plic1.generateur.TDS;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			Classe classe;
			classe = affichageLexique(args[0]);
			System.out.println(TDS.getInstance().toString());
			try {
				classe.verifier();
			} catch (AnalyseurSemantiqueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GenerateurCode.getInstance().printFichier(classe.generer());

		} else {
			System.out.println("<fichierSource.plic>");
		}

	}

	public static Classe affichageLexique(String chemin) {
		Classe classe = null;

		FileReader fichierR;
		try {
			fichierR = new FileReader(chemin);
			AnalyseurLexical analyseurL = new AnalyseurLexical(fichierR);
			AnalyseurSyntaxique analyseurS = new AnalyseurSyntaxique(analyseurL);
			classe = (Classe) analyseurS.parse().value;
		} catch (AnalyseLexicalException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println(classe.toString());

		return classe;
	}

}

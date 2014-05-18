package fr.ul.compilation.plic1.generateur;

import java.io.*;

/**
 * Cr�er le fichier Mips
 * @author 
 */
public class GenerateurCode {

    private static GenerateurCode instance = new GenerateurCode();
    private static String home = System.getProperty("user.home");
    private FileWriter flot;
    private PrintWriter flotFiltre;

    /**
     * Constructeur de GenerateurCode
     */
    private GenerateurCode() {
    }

    /**
     * Retourne une instance de GenerateurCode
     * @return instance
     */
    public static GenerateurCode getInstance() {
        return instance;
    }

    /**
     * Ecrit Fichier MIPS
     */
    public void printFichier(String expr) {
    	 try {
				flot = new FileWriter(home+"/fichier.asm");
				flotFiltre = new PrintWriter( new BufferedWriter(flot));
				flotFiltre.print("//Reservation de la zone des variables\n\n"
		        +"base			equ			r14\n"
		        +"tailleVar 			equ 	3\n"
		        +"zoneVar			rsw			tailleVar\n\n" 
		        +"//Initialisation de la base  des variables\n"
		        +"		ldw base,#zoneVar\n\n"		
				+"//Reservation de la place pour la pile\n\n"
         		+"pile				equ			r15\n"
         		+"taillePile 			equ 			400\n"
         		+"zonePile			rsw			taillePile\n\n" 
         		+"//Initialisation du sommet de Pile\n"
         		+"		ldw pile,#zonePile+taillePile*2\n\n");
           } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        flotFiltre.printf(expr);
        flotFiltre.close();
    }



}

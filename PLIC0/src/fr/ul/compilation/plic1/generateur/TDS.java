package fr.ul.compilation.plic1.generateur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.ul.compilation.plic1.expression.Idf;

public class TDS {
	private int numeroBloc =-1;
	private List<HashMap<Entree, Symbole>> liste = new ArrayList<HashMap<Entree, Symbole>>();

	private static TDS instance = new TDS();

	public static TDS getInstance(){
		return instance;
	}

	private TDS(){

	}

	public void entreeBloc(){
		numeroBloc ++;
		if(liste.size() - 1 < this.numeroBloc) {
			liste.add(new HashMap<Entree, Symbole>());
		}
	}

	public void sortieBloc(){
		numeroBloc--;
	}
	
	public void ajouter(EntreeVariable ev, SymboleVariable sv) {
		if(this.liste.get(numeroBloc) != null) {
			if(!this.liste.get(numeroBloc).containsKey(ev)) {
				this.liste.get(numeroBloc).put(ev, sv);
			}else{
				if(sv.getStatut() != null)
					((SymboleVariable)this.liste.get(numeroBloc).get(ev)).setStatut(sv.getStatut());
			}
		}
	}

	public Symbole identifier(Entree e){
		if(this.liste.get(numeroBloc) != null && !this.liste.get(numeroBloc).containsKey(e)) {
			return this.liste.get(numeroBloc).get(e);
		}
		return null;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();

		/*for(Entree entree : liste.get(0).keySet()) {
			sb.append(entree);
			sb.append(" : ");
			sb.append(liste.get(0).get(entree).toString());
			sb.append('\n');

		}*/

		return sb.toString();
	}

	public int getNumeroBloc() {
		return numeroBloc;
	}

	public void setNumeroBloc(int numeroBloc) {
		this.numeroBloc = numeroBloc;
	}

	public List<HashMap<Entree, Symbole>> getListe() {
		return liste;
	}

	public void setListe(List<HashMap<Entree, Symbole>> liste) {
		this.liste = liste;
	}

	public void ajouter(EntreeVarLocPar e, SymboleVarPar s) {
		// TODO Auto-generated method stub
		
	}

	public void ajouter(EntreeMethode em, SymboleMethode sm) {
		// TODO Auto-generated method stub
		
	}

	public void ajouter(EntreeConstructeur ec, SymboleConstructeur sc) {
		// TODO Auto-generated method stub
		
	}

	public void ajouter(EntreeChamp ec, SymboleChamp sc) {
		// TODO Auto-generated method stub
		
	}

	public void ajouter(EntreeClasse ic, SymboleClasse sc) {
		// TODO Auto-generated method stub
		
	}

	public void entreeClasse(Idf i) {
		// TODO Auto-generated method stub
		
	}

	public void sortieClasse() {
		// TODO Auto-generated method stub
		
	}
}

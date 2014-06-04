package fr.ul.compilation.plic1;

import java.util.ArrayList;
import java.util.Iterator;

import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;

public class Systeme extends ArbreAbstrait{
	private ArrayList<Classe> lc;
	private int lcleft;
	
	public Systeme(ArrayList<Classe> lc, int lcleft) {
		this.lc = lc;
		this.lcleft = lcleft;
	}

	public ArrayList<Classe> getLc() {
		return lc;
	}

	public void setLc(ArrayList<Classe> lc) {
		this.lc = lc;
	}

	public int getLcleft() {
		return lcleft;
	}

	public void setLcleft(int lcleft) {
		this.lcleft = lcleft;
	}
	@Override
	public String generer() {
		StringBuilder sb = new StringBuilder();
		for(Classe cl : lc) {
			sb.append(cl.generer());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Classe cl : lc) {
			sb.append(cl.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public boolean verifier() throws AnalyseurSemantiqueException {
		boolean sb = true;
		for(Classe cl : lc) {
			sb = sb &&  cl.verifier();
		}
		return sb;
	}
}

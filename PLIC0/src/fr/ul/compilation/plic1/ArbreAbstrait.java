package fr.ul.compilation.plic1;

import fr.ul.compilation.plic1.exception.AnalyseLexicalException;
import fr.ul.compilation.plic1.exception.AnalyseSyntaxiqueException;
import fr.ul.compilation.plic1.exception.AnalyseurSemantiqueException;

public abstract class ArbreAbstrait  {
	public abstract String generer() ;
	public abstract boolean verifier() throws AnalyseurSemantiqueException;
	public abstract String toString();
}

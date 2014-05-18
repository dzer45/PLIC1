package fr.ul.compilation.plic1.expression;

import fr.ul.compilation.plic1.ArbreAbstrait;
import fr.ul.compilation.plic1.generateur.Type;
import fr.ul.compilation.plic1.generateur.TypeInconnu;

public abstract class Expression extends ArbreAbstrait{	
	protected Type type = new TypeInconnu();
	
	public Expression() {
	}
	
	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	public static int COMPTEUR_GENEREATION = 0;
}

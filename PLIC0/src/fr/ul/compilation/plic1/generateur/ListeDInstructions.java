package fr.ul.compilation.plic1.generateur;

import java.util.ArrayList;

import fr.ul.compilation.plic1.instruction.Instruction;

public class ListeDInstructions {
	ArrayList<Instruction> li = new ArrayList<Instruction>();
	
	public ListeDInstructions(){
		
	}
	
	public void add(Instruction o){
		li.add(o);
	}

	public ArrayList<Instruction> getLi() {
		return li;
	}

	public void setLi(ArrayList<Instruction> li) {
		this.li = li;
	}
	
}

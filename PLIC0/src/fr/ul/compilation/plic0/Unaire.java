package fr.ul.compilation.plic0;

public abstract class Unaire extends Expression{
	protected Expression next;
	
	public Unaire() {
		
	}
	
	public Unaire(Expression exp) {
		this.next = exp;
	}
	
	public Expression getNext() {
		return next;
	}

	public void setNext(Expression next) {
		this.next = next;
	}
}

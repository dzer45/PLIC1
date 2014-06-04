package fr.ul.compilation.plic1.exception;


public  class PlicException extends Exception{
	public PlicException(String s){
		super("PlicException : \n"+s);
    }
}
package com.krzem.CJL.C;



public class BracketError extends SyntaxError{
	public BracketError(String m,CallStack S){
		super("Bracket Error: "+m,S);
	}
}
package com.krzem.CJL.C;



public class UnknownVariableError extends SyntaxError{
	public UnknownVariableError(String m,CallStack S){
		super("Unknown Variable Error: "+m,S);
	}
}
package com.krzem.CJL.C;



public class UnknownClassError extends SyntaxError{
	public UnknownClassError(String m,CallStack S){
		super("Unknown Class Error: "+m,S);
	}
}
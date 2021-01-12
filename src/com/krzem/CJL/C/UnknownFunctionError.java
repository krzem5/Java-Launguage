package com.krzem.CJL.C;



public class UnknownFunctionError extends SyntaxError{
	public UnknownFunctionError(String m,CallStack S){
		super("Unknown Function Error: "+m,S);
	}
}
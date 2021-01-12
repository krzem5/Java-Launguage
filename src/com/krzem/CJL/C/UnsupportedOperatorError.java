package com.krzem.CJL.C;



public class UnsupportedOperatorError extends SyntaxError{
	public UnsupportedOperatorError(String m,CallStack S){
		super("Unsupported Operator Error: "+m,S);
	}
}
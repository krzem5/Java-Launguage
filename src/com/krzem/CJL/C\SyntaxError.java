package com.krzem.CJL.C;



public class SyntaxError extends Error{
	public SyntaxError(String m,CallStack S){
		super("Syntax Error: "+m,S);
	}
}
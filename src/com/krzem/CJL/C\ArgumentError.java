package com.krzem.CJL.C;



public class ArgumentError extends SyntaxError{
	public ArgumentError(String m,CallStack S){
		super("Argument Error: "+m,S);
	}
}
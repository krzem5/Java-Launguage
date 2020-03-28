package com.krzem.CJL.C;



public class UnterminatedStringError extends SyntaxError{
	public UnterminatedStringError(String m,CallStack S){
		super("Unterminated String Error: "+m,S);
	}
}
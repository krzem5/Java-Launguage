package com.krzem.CJL.C;



public class UnterminatedLineError extends SyntaxError{
	public UnterminatedLineError(String m,CallStack S){
		super("Unterminated Line Error: "+m,S);
	}
}
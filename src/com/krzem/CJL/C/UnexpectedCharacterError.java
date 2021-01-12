package com.krzem.CJL.C;



public class UnexpectedCharacterError extends SyntaxError{
	public UnexpectedCharacterError(String m,CallStack S){
		super("Unexpected Character Error: "+m,S);
	}
}
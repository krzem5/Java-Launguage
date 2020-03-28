package com.krzem.CJL.C;



public class ReassigmentError extends OverrideError{
	public ReassigmentError(String m,CallStack S){
		super("Reassigment Error: "+m,S);
	}
}
package com.krzem.CJL.C;



public class OverrideError extends Error{
	public OverrideError(String m,CallStack S){
		super("Override Error: "+m,S);
	}
}
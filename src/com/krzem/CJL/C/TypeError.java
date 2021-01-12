package com.krzem.CJL.C;



public class TypeError extends Error{
	public TypeError(String m,CallStack S){
		super("Type Error: "+m,S);
	}
}
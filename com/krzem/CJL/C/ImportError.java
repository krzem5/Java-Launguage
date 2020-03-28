package com.krzem.CJL.C;



public class ImportError extends Error{
	public ImportError(String m,CallStack S){
		super("Import Error: "+m,S);
	}
}
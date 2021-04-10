package com.krzem.CJL.C;



public class FileError extends Error{
	public FileError(String m,CallStack S){
		super("File Error: "+m,S);
	}
}
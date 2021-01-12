package com.krzem.CJL.C;



public class Error{
	private CallStack S;
	private String m;



	public Error(String m,CallStack S){
		this.m=m;
		this.S=S;
	}



	public String toString(){
		return "Error:\n"+this.S.toString()+"\n"+this.m+"\n";
	}
}
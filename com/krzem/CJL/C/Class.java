package com.krzem.CJL.C;



import java.lang.reflect.Method;
import java.util.ArrayList;



public class Class{
	public String name;
	public FunctionList FL;



	public Class(String name,Method[] ml){
		this.name=name;
		this.FL=new FunctionList();
		for (Method m:ml){
			this.FL.add(new Function.FJava(m));
		}
	}



	public boolean has_func(String fnm){
		return this.FL.has(fnm);
	}



	public ArrayList<String> get_func_param_list(String fnm){
		return this.FL.get_func_params(fnm);
	}



	public String get_func_r_type(String fnm){
		return this.FL.get_type(fnm);
	}



	public void export(FunctionList oFL){
		oFL.merge(this.FL);
	}
}
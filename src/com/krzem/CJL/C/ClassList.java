package com.krzem.CJL.C;



import java.util.ArrayList;



public class ClassList{
	private ArrayList<Class> Cl;



	public ClassList(){
		this.Cl=new ArrayList<Class>();
	}



	public void add(Class c){
		this.Cl.add(c);
	}



	@Override
	public ClassList clone(){
		ClassList cl=new ClassList();
		for (Class c:this.Cl){
			cl.add(c);
		}
		return cl;
	}



	public boolean has(String nm){
		for (Class c:this.Cl){
			if (c.name.equals(nm)){
				return true;
			}
		}
		return false;
	}



	public Class find_name(String nm){
		for (Class c:this.Cl){
			if (c.name.equals(nm)){
				return c;
			}
		}
		return null;
	}
}

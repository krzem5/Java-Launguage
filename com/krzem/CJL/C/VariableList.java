package com.krzem.CJL.C;



import java.util.ArrayList;



public class VariableList{
	private ArrayList<Variable.VInt> VIl;
	private ArrayList<Variable.VFloat> VFl;
	private ArrayList<Variable.VString> VSl;
	private ArrayList<Variable.VBool> VBl;



	public VariableList(){
		this.VIl=new ArrayList<Variable.VInt>();
		this.VFl=new ArrayList<Variable.VFloat>();
		this.VSl=new ArrayList<Variable.VString>();
		this.VBl=new ArrayList<Variable.VBool>();
	}



	public void merge(VariableList oVL){
		for (Variable.VInt v:oVL.VIl){
			this.add(v);
		}
		for (Variable.VFloat v:oVL.VFl){
			this.add(v);
		}
		for (Variable.VString v:oVL.VSl){
			this.add(v);
		}
		for (Variable.VBool v:oVL.VBl){
			this.add(v);
		}
	}



	public void add(Variable.VInt v){
		this.VIl.add(v);
	}
	public void add(Variable.VFloat v){
		this.VFl.add(v);
	}
	public void add(Variable.VString v){
		this.VSl.add(v);
	}
	public void add(Variable.VBool v){
		this.VBl.add(v);
	}



	public void add_new(String name,String type,boolean is_const){
		if (type.equals("int")){
			this.add(new Variable.VInt(name,0,is_const));
		}
		if (type.equals("float")){
			this.add(new Variable.VFloat(name,0,is_const));
		}
		if (type.equals("string")){
			this.add(new Variable.VString(name,"",is_const));
		}
		if (type.equals("bool")){
			this.add(new Variable.VBool(name,false,is_const));
		}
	}



	public VariableList clone(){
		VariableList vl=new VariableList();
		for (Variable.VInt v:this.VIl){
			vl.add(v);
		}
		for (Variable.VFloat v:this.VFl){
			vl.add(v);
		}
		for (Variable.VString v:this.VSl){
			vl.add(v);
		}
		for (Variable.VBool v:this.VBl){
			vl.add(v);
		}
		return vl;
	}



	public ArrayList<String> get_types(){
		ArrayList<String> a=new ArrayList<String>();
		for (Variable.VInt v:this.VIl){
			a.add(v.type);
		}
		for (Variable.VFloat v:this.VFl){
			a.add(v.type);
		}
		for (Variable.VString v:this.VSl){
			a.add(v.type);
		}
		for (Variable.VBool v:this.VBl){
			a.add(v.type);
		}
		return a;
	}



	public String get_r_type(String nm){
		for (Variable.VInt v:this.VIl){
			if (v.name.equals(nm)){
				return "int";
			}
		}
		for (Variable.VFloat v:this.VFl){
			if (v.name.equals(nm)){
				return "float";
			}
		}
		for (Variable.VString v:this.VSl){
			if (v.name.equals(nm)){
				return "string";
			}
		}
		for (Variable.VBool v:this.VBl){
			if (v.name.equals(nm)){
				return "bool";
			}
		}
		return "";
	}



	public boolean is_const(String nm){
		for (Variable.VInt v:this.VIl){
			if (v.name.equals(nm)){
				return v.is_const;
			}
		}
		for (Variable.VFloat v:this.VFl){
			if (v.name.equals(nm)){
				return v.is_const;
			}
		}
		for (Variable.VString v:this.VSl){
			if (v.name.equals(nm)){
				return v.is_const;
			}
		}
		for (Variable.VBool v:this.VBl){
			if (v.name.equals(nm)){
				return v.is_const;
			}
		}
		return false;
	}



	public String get_string(){
		String s="";
		for (String t:this.get_types()){
			s+=","+t;
		}
		return s.substring(1);
	}



	public boolean has(String nm){
		for (Variable.VInt v:this.VIl){
			if (v.name.equals(nm)){
				return true;
			}
		}
		for (Variable.VFloat v:this.VFl){
			if (v.name.equals(nm)){
				return true;
			}
		}
		for (Variable.VString v:this.VSl){
			if (v.name.equals(nm)){
				return true;
			}
		}
		for (Variable.VBool v:this.VBl){
			if (v.name.equals(nm)){
				return true;
			}
		}
		return false;
	}



	public String get_type(String nm){
		for (Variable.VInt v:this.VIl){
			if (v.name.equals(nm)){
				return "int";
			}
		}
		for (Variable.VFloat v:this.VFl){
			if (v.name.equals(nm)){
				return "float";
			}
		}
		for (Variable.VString v:this.VSl){
			if (v.name.equals(nm)){
				return "string";
			}
		}
		for (Variable.VBool v:this.VBl){
			if (v.name.equals(nm)){
				return "bool";
			}
		}
		return "void";
	}
}
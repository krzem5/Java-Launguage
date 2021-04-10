package com.krzem.CJL.C;



import java.util.ArrayList;



public class FunctionList{
	private ArrayList<Function.FInt> FIl;
	private ArrayList<Function.FFloat> FFl;
	private ArrayList<Function.FString> FSl;
	private ArrayList<Function.FBool> FBl;
	private ArrayList<Function.FVoid> FVl;
	private ArrayList<Function.FJava> FJl;



	public FunctionList(){
		this.FIl=new ArrayList<Function.FInt>();
		this.FFl=new ArrayList<Function.FFloat>();
		this.FSl=new ArrayList<Function.FString>();
		this.FBl=new ArrayList<Function.FBool>();
		this.FVl=new ArrayList<Function.FVoid>();
		this.FJl=new ArrayList<Function.FJava>();
	}



	public void merge(FunctionList oFL){
		for (Function.FInt f:oFL.FIl){
			this.add(f);
		}
		for (Function.FFloat f:oFL.FFl){
			this.add(f);
		}
		for (Function.FString f:oFL.FSl){
			this.add(f);
		}
		for (Function.FBool f:oFL.FBl){
			this.add(f);
		}
		for (Function.FVoid f:oFL.FVl){
			this.add(f);
		}
		for (Function.FJava f:oFL.FJl){
			this.add(f);
		}
	}



	public void add(Function.FInt f){
		this.FIl.add(f);
	}
	public void add(Function.FFloat f){
		this.FFl.add(f);
	}
	public void add(Function.FString f){
		this.FSl.add(f);
	}
	public void add(Function.FBool f){
		this.FBl.add(f);
	}
	public void add(Function.FVoid f){
		this.FVl.add(f);
	}
	public void add(Function.FJava f){
		this.FJl.add(f);
	}



	public void add_new(String name,String type,VariableList params){
		if (type.equals("int")){
			this.add(new Function.FInt(name,params));
		}
		if (type.equals("float")){
			this.add(new Function.FFloat(name,params));
		}
		if (type.equals("string")){
			this.add(new Function.FString(name,params));
		}
		if (type.equals("bool")){
			this.add(new Function.FBool(name,params));
		}
		if (type.equals("void")){
			this.add(new Function.FVoid(name,params));
		}
	}



	@Override
	public FunctionList clone(){
		FunctionList fl=new FunctionList();
		for (Function.FInt f:this.FIl){
			fl.add(f);
		}
		for (Function.FFloat f:this.FFl){
			fl.add(f);
		}
		for (Function.FString f:this.FSl){
			fl.add(f);
		}
		for (Function.FBool f:this.FBl){
			fl.add(f);
		}
		for (Function.FVoid f:this.FVl){
			fl.add(f);
		}
		for (Function.FJava f:this.FJl){
			fl.add(f);
		}
		return fl;
	}



	public boolean has(String nm){
		for (Function.FInt f:this.FIl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		for (Function.FFloat f:this.FFl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		for (Function.FString f:this.FSl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		for (Function.FBool f:this.FBl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		for (Function.FVoid f:this.FVl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		for (Function.FJava f:this.FJl){
			if (f.name.equals(nm)){
				return true;
			}
		}
		return false;
	}



	public boolean is_native(String nm){
		for (Function.FInt f:this.FIl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		for (Function.FFloat f:this.FFl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		for (Function.FString f:this.FSl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		for (Function.FBool f:this.FBl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		for (Function.FVoid f:this.FVl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		for (Function.FJava f:this.FJl){
			if (f.name.equals(nm)){
				return f.is_native;
			}
		}
		return false;
	}



	public ArrayList<String> get_func_params(String nm){
		for (Function.FInt f:this.FIl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		for (Function.FFloat f:this.FFl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		for (Function.FString f:this.FSl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		for (Function.FBool f:this.FBl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		for (Function.FVoid f:this.FVl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		for (Function.FJava f:this.FJl){
			if (f.name.equals(nm)){
				return f.param_list();
			}
		}
		return null;
	}



	public String get_func_params_string(String nm){
		for (Function.FInt f:this.FIl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		for (Function.FFloat f:this.FFl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		for (Function.FString f:this.FSl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		for (Function.FBool f:this.FBl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		for (Function.FVoid f:this.FVl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		for (Function.FJava f:this.FJl){
			if (f.name.equals(nm)){
				return f.param_list_string();
			}
		}
		return "null";
	}



	public String get_type(String nm){
		for (Function.FInt f:this.FIl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		for (Function.FFloat f:this.FFl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		for (Function.FString f:this.FSl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		for (Function.FBool f:this.FBl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		for (Function.FVoid f:this.FVl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		for (Function.FJava f:this.FJl){
			if (f.name.equals(nm)){
				return f.r_type;
			}
		}
		return "void";
	}
}

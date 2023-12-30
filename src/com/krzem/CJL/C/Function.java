package com.krzem.CJL.C;



import java.lang.Class;
import java.lang.reflect.Method;
import java.util.ArrayList;



public class Function{
	public static class FInt{
		public static final String r_type="int";
		public String name;
		public VariableList params;
		public boolean is_native=false;



		public FInt(String name,VariableList params){
			this.name=name;
			this.params=params;
		}



		public ArrayList<String> param_list(){
			if (this.params==null){
				return null;
			}
			return this.params.get_types();
		}



		public String param_list_string(){
			if (this.params==null){
				return "";
			}
			return this.params.get_string();
		}
	}



	public static class FFloat{
		public static final String r_type="float";
		public String name;
		public VariableList params;
		public boolean is_native=false;



		public FFloat(String name,VariableList params){
			this.name=name;
			this.params=params;
		}



		public ArrayList<String> param_list(){
			if (this.params==null){
				return null;
			}
			return this.params.get_types();
		}



		public String param_list_string(){
			if (this.params==null){
				return "";
			}
			return this.params.get_string();
		}
	}



	public static class FString{
		public static final String r_type="string";
		public String name;
		public VariableList params;
		public boolean is_native=false;



		public FString(String name,VariableList params){
			this.name=name;
			this.params=params;
		}



		public ArrayList<String> param_list(){
			if (this.params==null){
				return null;
			}
			return this.params.get_types();
		}



		public String param_list_string(){
			if (this.params==null){
				return "";
			}
			return this.params.get_string();
		}
	}



	public static class FBool{
		public static final String r_type="bool";
		public String name;
		public VariableList params;
		public boolean is_native=false;



		public FBool(String name,VariableList params){
			this.name=name;
			this.params=params;
		}



		public ArrayList<String> param_list(){
			if (this.params==null){
				return null;
			}
			return this.params.get_types();
		}



		public String param_list_string(){
			if (this.params==null){
				return "";
			}
			return this.params.get_string();
		}
	}



	public static class FVoid{
		public static final String r_type="void";
		public String name;
		public VariableList params;
		public boolean is_native=false;



		public FVoid(String name,VariableList params){
			this.name=name;
			this.params=params;
		}



		public ArrayList<String> param_list(){
			if (this.params==null){
				return null;
			}
			return this.params.get_types();
		}



		public String param_list_string(){
			if (this.params==null){
				return "";
			}
			return this.params.get_string();
		}
	}



	public static class FJava{
		public String r_type;
		public String name;
		public ArrayList<String> params;
		public Method m;
		public boolean is_native=false;



		public FJava(Method m){
			this.m=m;
			this.name=this.m.getName();
			this.params=this._params();
			this.r_type=this._type();
		}



		public ArrayList<String> param_list(){
			return this.params;
		}



		public String param_list_string(){
			String s="";
			for (String a:this.params){
				s+=","+a;
			}
			return s.substring(1);
		}



		private ArrayList<String> _params(){
			ArrayList<String> p=new ArrayList<String>();
			for (Class<?> tc:this.m.getParameterTypes()){
				String t=tc.getName().replace("java.lang.","").toLowerCase();
				p.add(t);
			}
			return p;
		}



		private String _type(){
			return this.m.getReturnType().getName();
		}
	}
}

package com.krzem.CJL.C;



public class Variable{
	public static class VInt{
		public static final String type="int";
		public String name;
		public int value;
		public boolean is_const;



		public VInt(String name,int value,boolean is_const){
			this.name=name;
			this.value=value;
			this.is_const=is_const;
		}
	}



	public static class VFloat{
		public static final String type="float";
		public String name;
		public float value;
		public boolean is_const;



		public VFloat(String name,float value,boolean is_const){
			this.name=name;
			this.value=value;
			this.is_const=is_const;
		}
	}



	public static class VString{
		public static final String type="string";
		public String name;
		public String value;
		public boolean is_const;



		public VString(String name,String value,boolean is_const){
			this.name=name;
			this.value=value;
			this.is_const=is_const;
		}
	}



	public static class VBool{
		public static final String type="bool";
		public String name;
		public boolean value;
		public boolean is_const;



		public VBool(String name,boolean value,boolean is_const){
			this.name=name;
			this.value=value;
			this.is_const=is_const;
		}
	}



	public static VInt new_(String name,String type,int value,boolean is_const){
		if (!type.equals("int")){
			System.err.println("!!!Not matching!!!>VInt");
			return null;
		}
		VInt v=new Variable.VInt(name,value,is_const);
		return v;
	}



	public static VFloat new_(String name,String type,float value,boolean is_const){
		if (!type.equals("float")){
			System.err.println("!!!Not matching!!!>VFloat");
			return null;
		}
		VFloat v=new Variable.VFloat(name,value,is_const);
		return v;
	}



	public static VString new_(String name,String type,String value,boolean is_const){
		if (!type.equals("string")){
			System.err.println("!!!Not matching!!!>VString");
			return null;
		}
		VString v=new Variable.VString(name,value,is_const);
		return v;
	}



	public static VBool new_(String name,String type,boolean value,boolean is_const){
		if (!type.equals("bool")){
			System.err.println("!!!Not matching!!!>VBool");
			return null;
		}
		VBool v=new Variable.VBool(name,value,is_const);
		return v;
	}
}

package com.krzem.CJL.C;



import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CallStack{
	public static final Pattern REGEX_CODE=Pattern.compile("\\n  File ([^,]+), line ([^ ]+) in (<[^:]+>):\\n");
	public static final Pattern REGEX_ERROR_MSG=Pattern.compile("^Error:\\n[\\s\\S]+\\n(.+Error:.+)$");
	private ArrayList<String> S;
	private int l_add=0;



	public CallStack(){
		this.S=new ArrayList<String>();
	}
	public CallStack(String fn){
		this();
		this.add(new File(fn).getAbsolutePath(),0," ");
	}
	public CallStack(ArrayList<String> a){
		this();
		for (String s:a){
			this.S.add(s);
		}
	}



	public void add(String s,int l,String ln){
		this.S.add(new File(s).getAbsolutePath()+"~"+Integer.toString(l+this.l_add)+"~"+ln);
	}



	public void set_last(String s,int l,String ln){
		this.S.remove(this.S.size()-1);
		this.add(s,l,ln);
	}



	public String get_last_path(){
		return this.S.get(this.S.size()-1).split("~")[0];
	}



	public boolean is_main_level(){
		return new File(this.S.get(this.S.size()-1).split("~")[0]).isFile();
	}



	public void set_line_add(int la){
		this.l_add=la;
	}



	public CallStack clone(){
		return new CallStack(this.S);
	}



	public String toString(){
		String s="";
		String rp=null;
		for (String p:this.S){
			String[] l=C.split(p,"~");
			if (new File(l[0]).isFile()==true){
				rp=l[0];
				s+="  File "+l[0]+", line "+l[1]+" in <main>:\n"+l[2]+"\n";
			}
			else{
				s+="  File "+rp+", line "+l[1]+" in "+l[0]+":\n"+l[2]+"\n";
			}
		}
		return s;
	}



	public static String reformat(String e){
		e=e.replace("\r","\\r");
		Matcher mem=REGEX_ERROR_MSG.matcher(e);
		mem.find();
		String err_msg=mem.group(1);
		Matcher mc=REGEX_CODE.matcher(e);
		CallStack S=new CallStack();
		while (mc.find()){
			String l=C.split(C.read_file(mc.group(1),new CallStack(mc.group(1))).substring(1),String.valueOf(C.LINE_BREAK_CHAR))[Integer.parseInt(mc.group(2))-1];
			if (mc.group(3).equals("<main>")){
				S.add(mc.group(1),Integer.parseInt(mc.group(2)),l);
			}
			else{
				S.add(mc.group(3),Integer.parseInt(mc.group(2)),l);
			}
		}
		return "Error:\n"+S.toString()+"\n"+err_msg;
	}
}
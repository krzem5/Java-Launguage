package com.krzem.CJL;



import com.krzem.CJL.C.C;
import com.krzem.CJL.RE.RE;



public class CJL{
	public static void main(String[] a){
		for (int i=0;i<a.length;i++){
			if (a[i].equals("-c")){
				i++;
				C.compile(a[i],String.join(" ",a).indexOf("-d")>-1);
			}
			else if (a[i].equals("-r")){
				i++;
				RE.exec(a[i]);
			}
			else if (a[i].equals("-d")){
				continue;
			}
			else{
				System.err.println("Unknown Command: "+a[i]);
				return;
			}
		}
	}
}
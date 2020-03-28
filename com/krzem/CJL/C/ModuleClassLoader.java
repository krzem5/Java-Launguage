package com.krzem.CJL.C;



import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;



public class ModuleClassLoader extends ClassLoader{
	@Override
	public Class<?> findClass(String nm) throws ClassNotFoundException{
		try{
			byte[] b=this.load_(nm);
			return this.defineClass(nm.substring(nm.lastIndexOf("\\")+1,nm.length()-5),b,0,b.length);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		return null;
	}



	private byte[] load_(String fn) throws FileNotFoundException,IOException,InterruptedException{
		if (!new File(fn.replace(".java",".class")).isFile()){
			ProcessBuilder b=new ProcessBuilder("cmd.exe","/c","cd \""+fn.substring(0,fn.lastIndexOf("\\"))+"\"&&javac "+fn.substring(fn.lastIndexOf("\\")+1)+"&&dir");
			b.redirectErrorStream(true);
			Process p=b.start();
			p.waitFor();
		}
		InputStream inpS=new FileInputStream(new File(fn.replace(".java",".class")));
		ByteArrayOutputStream bS=new ByteArrayOutputStream();
		int nv=0;
		try{
			while ((nv=inpS.read())!=-1){
				bS.write(nv);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return bS.toByteArray();
	}



	public Method[] load(String fn){
		try{
			Object obj=this.loadClass(fn).newInstance();
			ArrayList<Method> ml=new ArrayList<Method>();
			Method[] am=obj.getClass().getDeclaredMethods();
			for (Method m:am){
				int modif=m.getModifiers();
				if ((Modifier.isPublic(modif)||Modifier.isProtected(modif))&&"int,float,boolean,String,void".indexOf(m.getReturnType().getName())!=-1){
					ml.add(m);
				}
			}
			return ml.toArray(new Method[ml.size()]);
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (InstantiationException e){
			e.printStackTrace();
		}
		catch (IllegalAccessException e){
			e.printStackTrace();
		}
		return null;
	}
}
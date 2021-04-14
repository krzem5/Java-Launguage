package com.krzem.CJL.C;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class C{
	public static final String VERSION="1.0.0";

	public static final String MODULE_PATH=new File("com/krzem/CJL/modules").getAbsolutePath()+"\\";

	public static final char NO_ERROR_CHAR='S';
	public static final char NO_REFORMAT_CHAR='N';
	public static final char EMPTY_CHAR=' ';

	public static final int LT_NONE=0;
	public static final int LT_EMPTY=1;
	public static final int LT_COMMENT=2;
	public static final int LT_IMPORT=3;
	public static final int LT_CLASS_CALL=4;
	public static final int LT_FUNC_CALL=5;
	public static final int LT_FUNC_DEF=6;
	public static final int LT_VAR_DEF=7;
	public static final int LT_CONST_DEF=8;
	public static final int LT_VAR_ASSIGN=9;
	public static final int LT_IF_STATEMENT=10;
	public static final int LT_FOR_LOOP=11;
	public static final int LT_WHILE_LOOP=12;

	public static final int M_NONE=0;
	public static final int M_STRING=1;

	public static final char NORMAL_OPEN_BRACKET='(';
	public static final char SQUARE_OPEN_BRACKET='[';
	public static final char CURLY_OPEN_BRACKET='{';
	public static final char NORMAL_CLOSE_BRACKET=')';
	public static final char SQUARE_CLOSE_BRACKET=']';
	public static final char CURLY_CLOSE_BRACKET='}';

	public static final char LINE_BREAK_CHAR='\n';
	public static final char LINE_BREAK_ESCAPE_CHAR='\r';
	public static final String LINE_BREAK_CHARS="\n\r";
	public static final char LINE_TERMINATOR_CHAR=';';
	public static final char TAB_CHAR='\t';
	public static final char SPACE_CHAR=' ';
	public static final char QUOTE_CHAR='"';
	public static final char QUOTE_ESCAPE_CHAR='\\';
	public static final String COMMENT_STRING="//";
	public static final String UNICODE_ESCAPE_STRING="\\u";
	public static final int UNICODE_ESCAPE_LENGTH=4;

	public static final String FUNC_DEF_STRING="func ";
	public static final String ALLOWED_FUNC_NAME_START_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";
	public static final String ALLOWED_FUNC_NAME_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
	public static final char FUNC_PARAMS_START_CHAR='(';
	public static final char FUNC_PARAMS_END_CHAR=')';
	public static final char FUNC_PARAMS_SPILT_CHAR=',';
	public static final char FUNC_DEF_START_CHAR='{';
	public static final char FUNC_DEF_END_CHAR='}';

	public static final String VAR_DEF_STRING="var ";
	public static final String CONST_DEF_STRING="const ";
	public static final char VAR_DEF_SPLIT_CHAR=',';
	public static final char VAR_DEF_ASSIGN_CHAR='=';
	public static final String ALLOWED_VAR_NAME_START_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";
	public static final String ALLOWED_VAR_NAME_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

	public static final String ALLOWED_VAR_TYPE_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";
	public static final String ALLOWED_VAR_TYPES="int>float>string>bool";
	public static final String ALLOWED_RETURN_VAR_TYPES="int>float>string>bool>void";
	public static final char VAR_TYPE_START_CHAR='<';
	public static final char VAR_TYPE_END_CHAR='>';

	public static final String VAR_TYPE_BOOL_TRUE="true";
	public static final String VAR_TYPE_BOOL_FALSE="false";

	public static final String ALLOWED_TYPE_INT_START_CHARS="0123456789";
	public static final String ALLOWED_TYPE_INT_CHARS="0123456789_";

	public static final String ALLOWED_TYPE_FLOAT_START_CHARS="0123456789";
	public static final String ALLOWED_TYPE_FLOAT_CHARS="0123456789_";
	public static final char TYPE_FLOAT_SPLIT_CHAR='.';

	public static final String OPERATORS="+-*/%^";
	public static final char OP_ADD='+';
	public static final char OP_SUB='-';
	public static final char OP_MULT='*';
	public static final char OP_DIV='/';
	public static final char OP_MOD='%';
	public static final char OP_POW='^';
	public static final char OP_OPEN_BRACKET='(';
	public static final char OP_CLOSE_BRACKET=')';
	public static final int MAX_OP_LVL=3;
	public static final String OP_LVL_3="^";
	public static final String OP_LVL_2="*/";
	public static final String OP_LVL_1="+-";

	public static final String IF_STATEMENT_STRING="if";
	public static final char IF_COND_START_CHAR='(';
	public static final char IF_COND_END_CHAR=')';
	public static final char IF_DEF_START_CHAR='{';
	public static final char IF_DEF_END_CHAR='}';

	public static final String ELSE_STATEMENT_STRING="else";

	public static final String COND_SPLIT_CHARS="&&,||";
	public static final String COND_AND_CHAR="&&";
	public static final String COND_OR_CHAR="||";
	public static final char COND_NOT_CHAR='!';
	public static final String COND_EQ_CHAR="==";
	public static final String COND_NOT_EQ_CHAR="!=";
	public static final String COND_LESS_CHAR="<";
	public static final String COND_NOT_MORE_CHAR="<=";
	public static final String COND_MORE_CHAR=">";
	public static final String COND_NOT_LESS_CHAR=">=";
	public static final char COND_OPEN_BRACKETS='(';
	public static final char COND_CLOSE_BRACKETS=')';

	public static final String FOR_LOOP_STRING="for";
	public static final char FOR_COND_START_CHAR='(';
	public static final char FOR_COND_END_CHAR=')';
	public static final char FOR_COND_DELIMETER=';';
	public static final char FOR_INCREMENT_DELIMETER=',';
	public static final char FOR_DEF_START_CHAR='{';
	public static final char FOR_DEF_END_CHAR='}';

	public static final String WHILE_LOOP_STRING="while";
	public static final char WHILE_COND_START_CHAR='(';
	public static final char WHILE_COND_END_CHAR=')';
	public static final char WHILE_DEF_START_CHAR='{';
	public static final char WHILE_DEF_END_CHAR='}';

	public static final String IMPORT_STRING="import ";
	public static final char IMPORT_AS_FUNCTION_LIST_CHAR='*';
	public static final String IMPORT_MODULE_JAVA_EXT=".java";
	public static final String IMPORT_MODULE_CJL_EXT=".cjl";

	public static final char CLASS_ATTR_SPLIT_CHAR='.';
	public static final String ALLOWED_CLASS_NAME_START_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";
	public static final String ALLOWED_CLASS_NAME_CHARS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";



	public static String read_file(String fn,CallStack S){
		File f=new File(fn);
		if (!f.isAbsolute()){
			f=f.getAbsoluteFile();
		}
		if (!f.exists()||!f.isFile()){
			return new FileError("File '"+f.toString()+"' doesn't exist",S).toString();
		}
		try{
			return String.valueOf(C.NO_ERROR_CHAR)+new String(Files.readAllBytes(Paths.get(f.toString())));
		}
		catch (IOException e){
			return new FileError("Error while reading file "+f.toString(),S).toString();
		}
	}



	private static String break_lines(String seq){
		seq=String.valueOf(C.LINE_BREAK_CHAR)+C.IMPORT_STRING+String.valueOf(C.IMPORT_AS_FUNCTION_LIST_CHAR)+"builtin"+String.valueOf(C.LINE_TERMINATOR_CHAR)+String.valueOf(C.LINE_BREAK_CHARS)+seq+String.valueOf(C.LINE_BREAK_CHAR);
		int M=C.M_NONE;
		int i=0;
		while (i<seq.length()){
			if (seq.charAt(i)==C.QUOTE_CHAR&&((i==0)||(seq.charAt(i-1)!=C.QUOTE_ESCAPE_CHAR))){
				if (M==C.M_NONE){
					M=C.M_STRING;
				}
				else{
					M=C.M_NONE;
				}
			}
			if (C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.FOR_LOOP_STRING)){
				i+=C.FOR_LOOP_STRING.length()+1;
				int b=0;
				boolean s=true;
				while (b!=0||s){
					if (seq.charAt(i)==C.FOR_COND_START_CHAR){
						b++;
					}
					if (seq.charAt(i)==C.FOR_COND_END_CHAR){
						b--;
					}
					i++;
					s=false;
				}
				continue;
			}
			if (i>0&&M==C.M_NONE&&seq.charAt(i-1)==C.LINE_TERMINATOR_CHAR&&seq.charAt(i)!=C.LINE_BREAK_CHAR){
				seq=seq.substring(0,i)+String.valueOf(C.LINE_BREAK_ESCAPE_CHAR)+seq.substring(i);
			}
			i++;
		}
		return seq;
	}



	private static boolean is_line_start(String seq,int i){
		while (i>=0&&!C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
			if (seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR){
				return false;
			}
			i--;
		}
		return true;
	}



	public static String[] split(String s,String d){
		String[] o=new String[s.length()-s.replace(d,"").length()+1];
		String cs="";
		int si=0;
		for (int i=0;i<s.length();i++){
			if (s.substring(i).startsWith(d)){
				i+=d.length()-1;
				o[si]=cs;
				si++;
				cs="";
			}
			else{
				cs+=String.valueOf(s.charAt(i));
			}
		}
		o[si]=cs;
		return o;
	}



	private static String compile(String seq,ClassList CL,FunctionList FL,VariableList VL,boolean DEBUG,boolean first,CallStack S){
		double START_TIME=(double)System.nanoTime();
		if (DEBUG==true&&first==true){
			System.out.println("Compiling...");
		}
		String COMPILED_SEQ="";
		int i=1;
		int li=-1;
		int LT=C.LT_NONE;
		int M=C.M_NONE;
		while (true){
			if (i>=seq.length()){
				break;
			}
			// Line not started yet
			if (C.is_line_start(seq,i+0)&&!C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
				i++;
				continue;
			}
			// Empty line
			if (C.is_line_start(seq,i-1)&&C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
				LT=C.LT_EMPTY;
			}
			// Comment
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.COMMENT_STRING)){
				LT=C.LT_COMMENT;
				while (seq.charAt(i)!=C.LINE_BREAK_CHAR){
					i++;
				}
				if (DEBUG==true){
					System.out.println("DEBUG -> Comment");
				}
			}
			// String
			if (LT==C.LT_NONE&&seq.charAt(i)==C.QUOTE_CHAR&&seq.charAt(i-1)!=C.QUOTE_ESCAPE_CHAR){
				if (M==C.M_NONE){
					M=C.M_STRING;
				}
				else{
					M=C.M_NONE;
				}
			}
			// Import
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.IMPORT_STRING)){
				LT=C.LT_IMPORT;
				i+=C.IMPORT_STRING.length();
				if (!S.is_main_level()){
					S.set_last(S.get_last_path(),li+1,"");
					return new ImportError("Can only import at <main> level",S).toString();
				}
				boolean to_FL=false;
				if (seq.charAt(i)==C.IMPORT_AS_FUNCTION_LIST_CHAR){
					to_FL=true;
					i++;
				}
				String nm="";
				while (seq.charAt(i)!=C.LINE_TERMINATOR_CHAR&&!C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
					nm+=seq.charAt(i);
					i++;
				}
				if (DEBUG==true&&li>-1){
					System.out.println("DEBUG -> Import");
				}
				if (new File(nm+C.IMPORT_MODULE_CJL_EXT).isFile()||new File(C.MODULE_PATH+nm+C.IMPORT_MODULE_CJL_EXT).isFile()){
					if (!new File(nm+C.IMPORT_MODULE_CJL_EXT).isFile()){
						nm=C.MODULE_PATH+nm;
					}
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),li+1,"");
					NS.add(nm+C.IMPORT_MODULE_CJL_EXT,0,"");
					String iseq=C.read_file(nm+C.IMPORT_MODULE_CJL_EXT,NS);
					if (iseq.charAt(0)==C.NO_ERROR_CHAR){
						iseq=iseq.substring(1);
					}
					else{
						return iseq;
					}
					iseq=C.break_lines(iseq);
					String ic=C.compile(iseq,new ClassList(),new FunctionList(),new VariableList(),DEBUG,false,NS);
					if (ic.charAt(0)==C.NO_ERROR_CHAR){
						ic=ic.substring(1);
					}
					else{
						return ic;
					}
					System.out.println("Import: "+ic);
				}
				else if (new File(nm+C.IMPORT_MODULE_JAVA_EXT).isFile()||new File(C.MODULE_PATH+nm+C.IMPORT_MODULE_JAVA_EXT).isFile()){
					if (!new File(nm+C.IMPORT_MODULE_JAVA_EXT).isFile()){
						nm=C.MODULE_PATH+nm;
					}
					Class c=new Class(nm.substring(nm.lastIndexOf("\\")+1),new ModuleClassLoader().load(nm+C.IMPORT_MODULE_JAVA_EXT));
					if (to_FL==false){
						CL.add(c);
					}
					else{
						c.export(FL);
					}
				}
				else{
					S.set_last(S.get_last_path(),li+1,"");
					return new ImportError("Unknown module '"+nm+"'",S).toString();
				}
			}
			// If | Else
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.IF_STATEMENT_STRING)){
				i+=C.IF_STATEMENT_STRING.length();
				int si=i-C.IF_STATEMENT_STRING.length();
				int sli=li+0;
				while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
					i++;
				}
				if (seq.charAt(i)!=C.IF_COND_START_CHAR){
					i=si;
				}
				else{
					i++;
					int b=1;
					String c="";
					while (b!=0){
						c+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
							b--;
						}
						if (b==0){
							c=c.substring(0,c.length()-1);
						}
						i++;
						if (b!=0&&i>=seq.length()||C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
							c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.IF_COND_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					if (seq.charAt(i)!=C.IF_DEF_START_CHAR){
						c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.IF_DEF_START_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					String code="";
					b=1;
					while (b!=0){
						code+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.IF_DEF_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.IF_DEF_END_CHAR){
							b--;
						}
						if (b==0){
							code=code.substring(0,code.length()-1);
						}
						i++;
						if (seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						if (b!=0&&i>=seq.length()){
							c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.IF_DEF_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					LT=C.LT_IF_STATEMENT;
					if (DEBUG==true){
						System.out.println("DEBUG -> If cond");
					}
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),sli+1,"");
					c=C.compile_condition(c,CL,FL,VL,NS);
					if (c.charAt(0)==C.NO_ERROR_CHAR){
						c=c.substring(1);
					}
					else{
						return c;
					}
					NS=S.clone();
					NS.set_line_add(sli);
					code=C.compile(code+String.valueOf(C.LINE_BREAK_CHAR)+String.valueOf(C.LINE_BREAK_CHAR),CL,FL,VL,DEBUG,false,NS);
					if (code.charAt(0)==C.NO_ERROR_CHAR){
						code=code.substring(1);
					}
					else{
						return code;
					}
					si=i+0;
					sli=li+0;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR||C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
						if (seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						i++;
						if (i>=seq.length()){
							break;
						}
					}
					String ec="";
					if (i<seq.length()&&seq.substring(i).startsWith(C.ELSE_STATEMENT_STRING)){
						i+=C.ELSE_STATEMENT_STRING.length();
						while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR||C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
							if (seq.charAt(i)==C.LINE_BREAK_CHAR){
								li++;
							}
							i++;
						}
						if (seq.charAt(i)!=C.IF_DEF_START_CHAR){
							i=si;
						}
						else{
							i++;
							b=1;
							sli=li+0;
							while (b!=0){
								ec+=String.valueOf(seq.charAt(i));
								if (seq.charAt(i)==C.IF_DEF_START_CHAR){
									b++;
								}
								if (seq.charAt(i)==C.IF_DEF_END_CHAR){
									b--;
								}
								if (b==0){
									ec=ec.substring(0,ec.length()-1);
								}
								i++;
								if (seq.charAt(i)==C.LINE_BREAK_CHAR){
									li++;
								}
								if (b!=0&&i>=seq.length()){
									c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
									S.set_last(S.get_last_path(),li+1,"");
									return new UnexpectedCharacterError("Expected '"+C.IF_DEF_END_CHAR+"', found '"+c+"'",S).toString();
								}
							}
							NS=S.clone();
							NS.set_line_add(sli+1);
							ec=C.compile(ec,CL,FL,VL,DEBUG,false,NS);
							if (ec.charAt(0)==C.NO_ERROR_CHAR){
								ec=ec.substring(1);
							}
							else{
								return ec;
							}
						}
					}
					else{
						i=si;
						li=sli;
					}
					COMPILED_SEQ+="[{\"t\":\"if_c\",\"c\":\""+c+"\",\"v\":\""+code+"\",\"e\":\""+ec+"\"}]";
				}
			}
			// For Loop
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.FOR_LOOP_STRING)){
				i+=C.FOR_LOOP_STRING.length();
				int si=i-C.FOR_LOOP_STRING.length();
				while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
					i++;
				}
				if (seq.charAt(i)!=C.FOR_COND_START_CHAR){
					i=si;
				}
				else{
					i++;
					int sli=li+0;
					ArrayList<String> cd=new ArrayList<String>();
					cd.add("");
					int cdi=0;
					int b=0;
					M=C.M_NONE;
					while (b!=0||cd.size()!=3||seq.charAt(i)!=C.FOR_COND_END_CHAR){
						cd.set(cdi,cd.get(cdi)+String.valueOf(seq.charAt(i)));
						if (seq.charAt(i)==C.FOR_COND_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FOR_COND_END_CHAR){
							b--;
						}
						if (seq.charAt(i)==C.QUOTE_CHAR&&((i==0)||(i>0&&seq.charAt(i-1)!=C.QUOTE_ESCAPE_CHAR))){
							if (M==C.M_NONE){
								M=C.M_STRING;
							}
							else{
								M=C.M_NONE;
							}
						}
						if (seq.charAt(i)==C.FOR_COND_DELIMETER){
							if (cd.size()==3){
								S.set_last(S.get_last_path(),li+1,"");
								return new SyntaxError("Too many delimeters",S).toString();
							}
							cd.set(cdi,cd.get(cdi).substring(0,cd.get(cdi).length()-1));
							cd.add("");
							cdi++;
						}
						i++;
						if (!(b==0&&cd.size()==3&&seq.charAt(i)==C.FOR_COND_END_CHAR)&&(i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))!=-1)){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.FOR_COND_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					for (int j=1;j<3;j++){
						if (cd.get(j).charAt(0)==C.LINE_BREAK_ESCAPE_CHAR){
							cd.set(j,cd.get(j).substring(cd.get(j).length()-1));
						}
					}
					String ni="";
					b=0;
					M=C.M_NONE;
					int j=0;
					while (j<cd.get(2).length()){
						ni+=String.valueOf(cd.get(2).charAt(j));
						if (seq.charAt(i)==C.FOR_DEF_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FOR_DEF_END_CHAR){
							b--;
						}
						if (seq.charAt(i)==C.QUOTE_CHAR&&((j==0)||(cd.get(2).charAt(j)!=C.QUOTE_ESCAPE_CHAR))){
							if (M==C.M_NONE){
								M=C.M_STRING;
							}
							else{
								M=C.M_NONE;
							}
						}
						if (b==0&&M==C.M_NONE&&cd.get(2).charAt(j)==C.FOR_INCREMENT_DELIMETER){
							ni=ni.substring(ni.length()-1)+C.LINE_TERMINATOR_CHAR;
						}
						j++;
					}
					cd.set(2,ni);
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						i++;
					}
					if (seq.charAt(i)!=C.FOR_DEF_START_CHAR){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.FOR_DEF_START_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					String code="";
					b=1;
					while (b!=0){
						code+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.FOR_DEF_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FOR_DEF_END_CHAR){
							b--;
						}
						if (b==0){
							code=code.substring(code.length()-1);
						}
						i++;
						if (i<seq.length()&&seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						if (b!=0&&i>=seq.length()){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.FOR_DEF_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					if (DEBUG==true){
						System.out.println("DEBUG -> For loop");
					}
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),li+1,"");
					VariableList oVL=VL.clone();
					System.out.println(cd.get(0)+String.valueOf(C.LINE_TERMINATOR_CHAR));
					cd.set(0,C.compile(cd.get(0)+String.valueOf(C.LINE_TERMINATOR_CHAR),CL.clone(),FL.clone(),oVL,DEBUG,false,NS));
					if (cd.get(0).charAt(0)==C.NO_ERROR_CHAR){
						cd.set(0,cd.get(0).substring(1));
					}
					else{
						return cd.get(0);
					}
					System.out.println(cd.get(0));
					cd.set(1,C.compile_condition(cd.get(1),CL.clone(),FL.clone(),oVL,NS));
					if (cd.get(1).charAt(0)==C.NO_ERROR_CHAR){
						cd.set(1,cd.get(1).substring(1));
					}
					else{
						return cd.get(1);
					}
					cd.set(2,C.compile(cd.get(2)+String.valueOf(C.LINE_TERMINATOR_CHAR),CL.clone(),FL.clone(),oVL,DEBUG,false,NS));
					if (cd.get(2).charAt(0)==C.NO_ERROR_CHAR){
						cd.set(2,cd.get(2).substring(1));
					}
					else{
						return cd.get(2);
					}
					NS=S.clone();
					NS.set_line_add(sli+1);
					code=C.compile(code,CL.clone(),FL.clone(),oVL,DEBUG,false,NS);
					if (code.charAt(0)==C.NO_ERROR_CHAR){
						code=code.substring(1);
					}
					else{
						return code;
					}
					COMPILED_SEQ+="[{\"t\":\"for\",\"d\":"+cd.get(0)+",\"c\":"+cd.get(1)+",\"i\":"+cd.get(2)+",\"s\":"+code+"}]";
					LT=C.LT_FOR_LOOP;
				}
			}
			// While Loop
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.WHILE_LOOP_STRING)){
				i+=C.WHILE_LOOP_STRING.length();
				int si=i-C.WHILE_LOOP_STRING.length();
				while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
					i++;
				}
				if (seq.charAt(i)!=C.WHILE_COND_START_CHAR){
					i=si;
				}
				else{
					i++;
					int sli=li+0;
					String c="";
					int b=0;
					while (b!=0||seq.charAt(i)!=C.WHILE_COND_END_CHAR){
						c+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.WHILE_COND_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.WHILE_COND_END_CHAR){
							b--;
						}
						i++;
						if (!(b==0&&seq.charAt(i)==C.WHILE_COND_END_CHAR)&&(i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1)){
							c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.WHILE_COND_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						i++;
					}
					if (seq.charAt(i)!=C.WHILE_DEF_START_CHAR){
						c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.WHILE_DEF_START_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					String code="";
					b=1;
					while (b!=0){
						code+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.WHILE_DEF_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.WHILE_DEF_END_CHAR){
							b--;
						}
						if (b==0){
							code=code.substring(code.length()-1);
						}
						i++;
						if (i<seq.length()&&seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						if (b!=0&&i>=seq.length()){
							c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.WHILE_DEF_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					if (DEBUG==true){
						System.out.println("DEBUG -> While loop");
					}
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),li+1,"");
					c=C.compile_condition(c,CL,FL,VL,S);
					if (c.charAt(0)==C.NO_ERROR_CHAR){
						c=c.substring(1);
					}
					else{
						return c;
					}
					NS=S.clone();
					NS.set_line_add(sli+1);
					code=C.compile(code,CL,FL,VL,DEBUG,false,NS);
					if (code.charAt(0)==C.NO_ERROR_CHAR){
						code=code.substring(1);
					}
					else{
						return code;
					}
					COMPILED_SEQ+="[{\"t\":\"while\",\"c\":"+c+",\"v\":"+code+"}]";
					LT=C.LT_WHILE_LOOP;
				}
			}
			// Function def
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.charAt(i)==C.VAR_TYPE_START_CHAR&&C.ALLOWED_RETURN_VAR_TYPES.indexOf(seq.substring(i+1).split(String.valueOf(C.VAR_TYPE_END_CHAR))[0])!=-1){
				String fn="";
				String frt=seq.substring(i+1).split(String.valueOf(C.VAR_TYPE_END_CHAR))[0];
				VariableList params=new VariableList();
				String code="";
				int sdli=li+0;
				i+=3+frt.length();
				if (seq.substring(i).startsWith(C.FUNC_DEF_STRING)){
					i+=C.FUNC_DEF_STRING.length();
					if (C.ALLOWED_FUNC_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Function names cannot start with '"+c+"'",S).toString();
					}
					while (seq.charAt(i)!=C.FUNC_PARAMS_START_CHAR){
						if (C.ALLOWED_FUNC_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Invalid function name chracter '"+c+"'",S).toString();
						}
						fn+=String.valueOf(seq.charAt(i));
						i++;
					}
					if (FL.has(fn)&&FL.is_native(fn)){
						S.set_last(S.get_last_path(),li+1,"");
						return new OverrideError("Cannot override a native functions",S).toString();
					}
					i++;
					while (seq.charAt(i)!=C.FUNC_PARAMS_END_CHAR&&seq.charAt(i-1)!=C.FUNC_PARAMS_END_CHAR){
						if (seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR){
							if (seq.charAt(i)!=C.VAR_TYPE_START_CHAR){
								String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
								S.set_last(S.get_last_path(),li+1,"");
								return new UnexpectedCharacterError("Expected '"+C.VAR_TYPE_START_CHAR+"', found '"+c+"'",S).toString();
							}
							i++;
							String vn="";
							String vt="";
							while (seq.charAt(i)!=C.VAR_TYPE_END_CHAR){
								if (C.ALLOWED_VAR_TYPE_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
									String c=String.valueOf(seq.charAt(i)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
									S.set_last(S.get_last_path(),li+1,"");
									return new UnexpectedCharacterError("Invalid variable type name character '"+c+"'",S).toString();
								}
								vt+=String.valueOf(seq.charAt(i));
								i++;
							}
							if (C.ALLOWED_VAR_TYPES.indexOf(vt)==-1){
								S.set_last(S.get_last_path(),li+1,"");
								return new TypeError("Unknown Type: '"+vt+"'",S).toString();
							}
							i++;
							while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
								i++;
							}
							if (C.ALLOWED_VAR_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
								String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
								S.set_last(S.get_last_path(),li+1,"");
								return new UnexpectedCharacterError("Variables cannot start with '"+c+"'",S).toString();
							}
							while (seq.charAt(i)!=C.FUNC_PARAMS_SPILT_CHAR&&seq.charAt(i)!=C.FUNC_PARAMS_END_CHAR){
								if (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
									String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
									S.set_last(S.get_last_path(),li+1,"");
									return new UnexpectedCharacterError("Invalid variable name character '"+c+"'",S).toString();
								}
								vn+=String.valueOf(seq.charAt(i));
								i++;
							}
							params.add_new(vn,vt,false);
						}
						i++;
					}
					if (FL.has(fn)&&FL.get_func_params(fn).equals(params.get_types())){
						S.set_last(S.get_last_path(),li+1,"");
						return new OverrideError("Cannot declare the same function twice",S).toString();
					}
					if (seq.charAt(i-1)==C.FUNC_PARAMS_END_CHAR){
						i++;
					}
					if (seq.charAt(i)==C.LINE_BREAK_CHAR){
						li++;
					}
					while (seq.charAt(i)!=C.FUNC_DEF_START_CHAR){
						if (seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR&&C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.FUNC_DEF_START_CHAR+"', found '"+c+"'",S).toString();
						}
						if (seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						i++;
					}
					i++;
					int b=1;
					while (b!=0){
						if (seq.charAt(i)==C.LINE_BREAK_CHAR){
							li++;
						}
						code+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.FUNC_DEF_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FUNC_DEF_END_CHAR){
							b--;
						}
						if (b==0){
							code=code.substring(0,code.length()-1);
						}
						i++;
						if (b!=0&&i>=seq.length()){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.FUNC_DEF_END_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					LT=C.LT_FUNC_DEF;
					FL.add_new(fn,frt,params);
					if (DEBUG==true){
						System.out.println("DEBUG -> Func def");
					}
					CallStack NS=S.clone();
					NS.set_line_add(sdli+1);
					VariableList oVL=VL.clone();
					oVL.merge(params);
					code=C.compile(code,CL.clone(),FL.clone(),oVL,DEBUG,false,NS);
					if (code.charAt(0)==C.NO_ERROR_CHAR){
						code=code.substring(1);
					}
					else{
						return code;
					}
					COMPILED_SEQ+="[{\"t\":\"f_def\",\"n\":\""+fn+"\",\"r\":\""+frt+"\",\"p\":"+FL.get_func_params_string(fn)+",\"v\":"+code+"}]";
				}
				else{
					S.set_last(S.get_last_path(),li+1,"");
					return new SyntaxError("(This error msg is not finished) Bad function start",S).toString();
				}
			}
			// Var def
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.VAR_DEF_STRING)){
				i+=C.VAR_DEF_STRING.length();
				if (DEBUG==true){
					System.out.println("DEBUG -> Var def");
				}
				while (C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1&&seq.charAt(i)!=C.LINE_TERMINATOR_CHAR&&C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&seq.charAt(i-1)!=C.LINE_TERMINATOR_CHAR){
					if (seq.charAt(i)!=C.VAR_TYPE_START_CHAR){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.VAR_TYPE_START_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					String vn="";
					String vt="";
					while (seq.charAt(i)!=C.VAR_TYPE_END_CHAR){
						if (C.ALLOWED_VAR_TYPE_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Invalid variable type name character '"+c+"'",S).toString();
						}
						vt+=String.valueOf(seq.charAt(i));
						i++;
					}
					if (C.ALLOWED_VAR_TYPES.indexOf(vt)==-1){
						S.set_last(S.get_last_path(),li+1,"");
						return new TypeError("Unknown Type: '"+vt+"'",S).toString();
					}
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					if (C.ALLOWED_VAR_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Variables cannot start with '"+c+"'",S).toString();
					}
					while (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR&&seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR){
						if (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Invalid variable name character '"+c+"'",S).toString();
						}
						vn+=String.valueOf(seq.charAt(i));
						i++;
					}
					if (VL.has(vn)){
						S.set_last(S.get_last_path(),li+1,"");
						return new OverrideError("Cannot declare the same variable twice",S).toString();
					}
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					if (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.VAR_DEF_ASSIGN_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					String args="";
					int b=0;
					while (!(b==0&&(seq.charAt(i)==C.VAR_DEF_SPLIT_CHAR||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1||seq.charAt(i)==C.LINE_TERMINATOR_CHAR))){
						args+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
							b--;
						}
						i++;
						if (b!=0&&i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.VAR_DEF_SPLIT_CHAR+"' or '"+C.LINE_TERMINATOR_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					i++;
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),li+1,"");
					ArrayList<String> aargs=new ArrayList<String>();
					aargs.add(args);
					ArrayList<String> rta=new ArrayList<String>();
					rta.add(vt);
					args=C.compile_args(aargs,CL,FL,VL,rta,vn,NS);
					if (args.charAt(0)==C.NO_ERROR_CHAR){
						args=args.substring(1);
					}
					else{
						return args;
					}
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					VL.add_new(vn,vt,false);
					COMPILED_SEQ+="[{\"t\":\"v_def\",\"n\":\""+vn+"\",\"r\":\""+vt+"\",\"v\":"+args+",\"c\":false}]";
				}
				LT=C.LT_VAR_DEF;
			}
			// Const def
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&seq.substring(i).startsWith(C.CONST_DEF_STRING)){
				i+=C.CONST_DEF_STRING.length();
				if (DEBUG==true){
					System.out.println("DEBUG -> Const def");
				}
				while (C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1&&seq.charAt(i)!=C.LINE_TERMINATOR_CHAR&&C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&seq.charAt(i-1)!=C.LINE_TERMINATOR_CHAR){
					if (seq.charAt(i)!=C.VAR_TYPE_START_CHAR){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.VAR_TYPE_START_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					String vn="";
					String vt="";
					while (seq.charAt(i)!=C.VAR_TYPE_END_CHAR){
						if (C.ALLOWED_VAR_TYPE_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Invalid variable type name character '"+c+"'",S).toString();
						}
						vt+=String.valueOf(seq.charAt(i));
						i++;
					}
					if (C.ALLOWED_VAR_TYPES.indexOf(vt)==-1){
						S.set_last(S.get_last_path(),li+1,"");
						return new TypeError("Unknown Type: '"+vt+"'",S).toString();
					}
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					if (C.ALLOWED_VAR_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Variables cannot start with '"+c+"'",S).toString();
					}
					while (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR&&seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR){
						if (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Invalid variable name character '"+c+"'",S).toString();
						}
						vn+=String.valueOf(seq.charAt(i));
						i++;
					}
					if (VL.has(vn)){
						S.set_last(S.get_last_path(),li+1,"");
						return new OverrideError("Cannot declare the same variable twice",S).toString();
					}
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					if (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR){
						String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
						S.set_last(S.get_last_path(),li+1,"");
						return new UnexpectedCharacterError("Expected '"+C.VAR_DEF_ASSIGN_CHAR+"', found '"+c+"'",S).toString();
					}
					i++;
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					String args="";
					int b=0;
					while (!(b==0&&(seq.charAt(i)==C.VAR_DEF_SPLIT_CHAR||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1||seq.charAt(i)==C.LINE_TERMINATOR_CHAR))){
						args+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
							b++;
						}
						if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
							b--;
						}
						i++;
						if (b!=0&&i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.VAR_DEF_SPLIT_CHAR+"' or '"+C.LINE_TERMINATOR_CHAR+"', found '"+c+"'",S).toString();
						}
					}
					i++;
					CallStack NS=S.clone();
					NS.set_last(NS.get_last_path(),li+1,"");
					ArrayList<String> aargs=new ArrayList<String>();
					aargs.add(args);
					ArrayList<String> rta=new ArrayList<String>();
					rta.add(vt);
					args=C.compile_args(aargs,CL,FL,VL,rta,vn,NS);
					if (args.charAt(0)==C.NO_ERROR_CHAR){
						args=args.substring(1);
					}
					else{
						return args;
					}
					while (seq.charAt(i)==C.SPACE_CHAR||seq.charAt(i)==C.TAB_CHAR){
						i++;
					}
					VL.add_new(vn,vt,true);
					COMPILED_SEQ+="[{\"t\":\"v_def\",\"n\":\""+vn+"\",\"r\":\""+vt+"\",\"v\":"+args+",\"c\":false}]";
				}
				LT=C.LT_CONST_DEF;
			}
			// Var assign
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&C.ALLOWED_VAR_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
				String nm="";
				int si=i+0;
				while (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
					nm+=String.valueOf(seq.charAt(i));
					i++;
					if (i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						i=si;
						nm="";
						break;
					}
				}
				if (nm.length()>0){
					if (seq.charAt(i)!=C.FUNC_PARAMS_START_CHAR&&seq.charAt(i)!=C.CLASS_ATTR_SPLIT_CHAR){
						if (!VL.has(nm)){
							S.set_last(S.get_last_path(),li+1,"");
							return new UnknownVariableError("Unknown variable '"+nm+"'",S).toString();
						}
						if (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR&&seq.charAt(i+1)!=C.VAR_DEF_ASSIGN_CHAR){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected '"+C.VAR_DEF_ASSIGN_CHAR+"', found '"+c+"'",S).toString();
						}
						if (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR&&C.OPERATORS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected any of '"+C.OPERATORS+"' of '"+C.VAR_DEF_ASSIGN_CHAR+"', found '"+c+"'",S).toString();
						}
						String e="";
						if (seq.charAt(i)!=C.VAR_DEF_ASSIGN_CHAR){
							e=nm+String.valueOf(seq.charAt(i))+String.valueOf(C.OP_OPEN_BRACKET);
							i++;
						}
						i++;
						while (seq.charAt(i)!=C.LINE_TERMINATOR_CHAR&&C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							e+=String.valueOf(seq.charAt(i));
							i++;
							if (i>=seq.length()){
								break;
							}
						}
						if (e.startsWith(nm)){
							e+=String.valueOf(C.OP_CLOSE_BRACKET);
						}
						if (VL.is_const(nm)==true){
							S.set_last(S.get_last_path(),li+1,"");
							return new ReassigmentError("Cannot override a constant",S).toString();
						}
						if (DEBUG==true){
							System.out.println("DEBUG -> Var assign");
						}
						ArrayList<String> el=new ArrayList<String>();
						el.add(e);
						ArrayList<String> rt=new ArrayList<String>();
						rt.add(VL.get_r_type(nm));
						CallStack NS=S.clone();
						NS.set_last(NS.get_last_path(),li+1,"");
						e=C.compile_args(el,CL,FL,VL,rt,nm,S);
						if (e.charAt(0)==C.NO_ERROR_CHAR){
							e=e.substring(2,e.length()-1);
						}
						else{
							return e;
						}
						COMPILED_SEQ+="[{\"t\":\"v_ass\",\"n\":\""+nm+"\",\"e\":"+e+"}]";
						LT=C.LT_VAR_ASSIGN;
					}
					else{
						i=si;
					}
				}
			}
			// Class call
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&C.ALLOWED_FUNC_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_CLASS_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
				String nm="";
				int si=i+0;
				while (seq.charAt(i)!=C.CLASS_ATTR_SPLIT_CHAR){
					nm+=String.valueOf(seq.charAt(i));
					i++;
					if (i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						nm="";
						break;
					}
				}
				if (nm.length()==0){
					i=si;
				}
				else{
					if (CL.has(nm)){
						Class cl=CL.find_name(nm);
						i++;
						String fnm="";
						if (C.ALLOWED_FUNC_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1){
							String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
							S.set_last(S.get_last_path(),li+1,"");
							return new UnexpectedCharacterError("Expected any of '"+C.ALLOWED_FUNC_NAME_START_CHARS+"', found '"+c+"'",S).toString();
						}
						while (seq.charAt(i)!=C.FUNC_PARAMS_START_CHAR){
							fnm+=String.valueOf(seq.charAt(i));
							i++;
							if (i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
								String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
								S.set_last(S.get_last_path(),li+1,"");
								return new UnexpectedCharacterError("Expected '"+C.FUNC_PARAMS_START_CHAR+"', found '"+c+"'",S).toString();
							}
						}
						if (!cl.has_func(fnm)){
							S.set_last(S.get_last_path(),li+1,"");
							return new UnknownFunctionError("Unknown function '"+nm+"'",S).toString();
						}
						else{
							int b=1;
							i++;
							ArrayList<String> c=new ArrayList<String>();
							c.add("");
							int cci=0;
							while (b!=0){
								if (C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
									c=null;
									break;
								}
								c.set(cci,c.get(cci)+String.valueOf(seq.charAt(i)));
								if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
									b++;
								}
								if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
									b--;
								}
								if (b==1&&seq.charAt(i)==C.FUNC_PARAMS_SPILT_CHAR){
									c.set(cci,c.get(cci).substring(0,c.get(cci).length()-1));
									cci++;
									c.add("");
								}
								if (b==0){
									c.set(cci,c.get(cci).substring(0,c.get(cci).length()-1));
								}
								i++;
							}
							if (c==null){
								String co=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
								S.set_last(S.get_last_path(),li+1,"");
								return new UnexpectedCharacterError("Expected '"+C.FUNC_PARAMS_END_CHAR+"', found '"+co+"'",S).toString();
							}
							else{
								LT=C.LT_CLASS_CALL;
								if (DEBUG==true){
									System.out.println("DEBUG -> Class call");
								}
								CallStack NS=S.clone();
								NS.set_last(NS.get_last_path(),li+1,"");
								String cc=C.compile_args(c,CL,FL,VL,cl.get_func_param_list(fnm),"Function "+nm+String.valueOf(C.CLASS_ATTR_SPLIT_CHAR)+fnm,NS);
								if (cc.charAt(0)==C.NO_ERROR_CHAR){
									cc=cc.substring(1);
								}
								else{
									return cc;
								}
								COMPILED_SEQ+="[{\"t\":\"cf_call\",\"c\":\""+nm+"\",\"v\":\""+fnm+"\",\"a\":"+cc+"}]";
							}
						}
					}
					else{
						S.set_last(S.get_last_path(),li+1,"");
						return new UnknownClassError("Unknown class '"+nm+"'",S).toString();
					}
				}
			}
			// Func call
			if (LT==C.LT_NONE&&C.is_line_start(seq,i-1)&&C.ALLOWED_FUNC_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_FUNC_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
				String nm="";
				int si=i+0;
				while (seq.charAt(i)!=C.FUNC_PARAMS_START_CHAR){
					nm+=String.valueOf(seq.charAt(i));
					i++;
					if (i>=seq.length()||C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						nm="";
						break;
					}
				}
				if (nm.length()==0){
					i=si;
				}
				else{
					if (FL.has(nm)){
						int b=1;
						i++;
						ArrayList<String> c=new ArrayList<String>();
						c.add("");
						int cci=0;
						while (b!=0){
							if (C.LINE_BREAK_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
								c=null;
								break;
							}
							c.set(cci,c.get(cci)+String.valueOf(seq.charAt(i)));
							if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
								b++;
							}
							if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
								b--;
							}
							if (b==1&&seq.charAt(i)==C.FUNC_PARAMS_SPILT_CHAR){
								c.set(cci,c.get(cci).substring(0,c.get(cci).length()-1));
								cci++;
								c.add("");
							}
							if (b==0){
								c.set(cci,c.get(cci).substring(0,c.get(cci).length()-1));
							}
							i++;
						}
						if (c==null){
							i=si+1;
						}
						else{
							LT=C.LT_FUNC_CALL;
							if (DEBUG==true){
								System.out.println("DEBUG -> Func call");
							}
							CallStack NS=S.clone();
							NS.set_last(NS.get_last_path(),li+1,"");
							String cc=C.compile_args(c,CL,FL,VL,FL.get_func_params(nm),"Function "+nm,NS);
							if (cc.charAt(0)==C.NO_ERROR_CHAR){
								cc=cc.substring(1);
							}
							else{
								return cc;
							}
							COMPILED_SEQ+="[{\"t\":\"f_call\",\"v\":\""+nm+"\",\"a\":"+cc+"}]";
						}
					}
					else{
						S.set_last(S.get_last_path(),li+1,"");
						return new UnknownFunctionError("Unknown function '"+nm+"'",S).toString();
					}
				}
			}
			// Line end
			if (i<seq.length()&&C.LINE_BREAK_CHARS.contains(String.valueOf(seq.charAt(i)))){
				if (LT==C.LT_NONE){
					S.set_last(S.get_last_path(),li+1,"");
					return new SyntaxError("Unknown error",S).toString();
				}
				if (LT!=C.LT_EMPTY&&LT!=C.LT_COMMENT&&LT!=C.LT_FUNC_DEF&&LT!=C.LT_IF_STATEMENT&&LT!=C.LT_FOR_LOOP&&LT!=C.LT_WHILE_LOOP&&seq.charAt(i-1)!=C.LINE_TERMINATOR_CHAR){
					String c=String.valueOf(seq.charAt(i-1)).replace(String.valueOf(C.LINE_BREAK_CHAR),"\\n").replace(String.valueOf(C.TAB_CHAR),"\\t");
					S.set_last(S.get_last_path(),li+1,"");
					return new UnterminatedLineError("Expected '"+C.LINE_TERMINATOR_CHAR+"', found '"+c+"'",S).toString();
				}
				if (M==C.M_STRING){
					S.set_last(S.get_last_path(),li+1,"");
					return new UnterminatedStringError("Unterminated String Error:",S).toString();
				}
				if (seq.charAt(i)==C.LINE_BREAK_CHAR){
					li++;
				}
				LT=C.LT_NONE;
			}
			i++;
		}
		if (DEBUG==true&&first==true){
			double diff=(double)System.nanoTime()-START_TIME;
			System.out.println("Compiling took "+Double.toString(Math.round(diff/1e+6)/1e+3)+"s");
		}
		return String.valueOf(C.NO_ERROR_CHAR)+COMPILED_SEQ;
	}



	private static String compile_args(ArrayList<String> sl,ClassList CL,FunctionList FL,VariableList VL,ArrayList<String> RT,String FN,CallStack S){
		String COMPILED_SEQ="[";
		ArrayList<String> rt_l=new ArrayList<String>();
		for (String seq:sl){
			COMPILED_SEQ+="[";
			String t1="";
			String t2="";
			char op=C.EMPTY_CHAR;
			int i=0;
			boolean M=false;
			while (i<seq.length()){
				if (seq.charAt(i)==C.OP_OPEN_BRACKET){
					String s="";
					i++;
					int b=1;
					while (b!=0){
						if (seq.charAt(i)==C.OP_OPEN_BRACKET){
							b++;
						}
						if (seq.charAt(i)==C.OP_CLOSE_BRACKET){
							b--;
						}
						if (b!=0){
							s+=seq.charAt(i);
						}
						i++;
						if (b!=0&&i>=seq.length()){
							return new BracketError("Found '"+C.OP_OPEN_BRACKET+"' without a pair",S).toString();
						}
					}
					ArrayList<String> as=new ArrayList<String>();
					as.add(s);
					String e=C.compile_args(as,CL,FL,VL,null,FN,S);
					if (e.charAt(0)==C.NO_ERROR_CHAR){
						e=e.substring(1);
					}
					else{
						return e;
					}
					COMPILED_SEQ+="[{\"t\":\"brackets\",\"v\":"+e+"}],";
					if (i>=seq.length()){
						break;
					}
				}
				if (((i>0&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1)||i==0)&&(seq.substring(i).startsWith(C.VAR_TYPE_BOOL_TRUE)||seq.substring(i).startsWith(C.VAR_TYPE_BOOL_FALSE))){
					if (seq.substring(i).startsWith(C.VAR_TYPE_BOOL_TRUE)&&((i+C.VAR_TYPE_BOOL_TRUE.length()<seq.length()&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i+C.VAR_TYPE_BOOL_TRUE.length())))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i+C.VAR_TYPE_BOOL_TRUE.length()	)))==-1)||(i+C.VAR_TYPE_BOOL_TRUE.length()>=seq.length()))){
						t1=t2;
						t2="bool";
						i+=C.VAR_TYPE_BOOL_TRUE.length();
						M=true;
						COMPILED_SEQ+="[{\"t\":\"bool\",\"v\":true}]";
					}
					if (seq.substring(i).startsWith(C.VAR_TYPE_BOOL_FALSE)&&((i+C.VAR_TYPE_BOOL_FALSE.length()<seq.length()&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i+C.VAR_TYPE_BOOL_FALSE.length())))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i+C.VAR_TYPE_BOOL_FALSE.length())))==-1)||(i+C.VAR_TYPE_BOOL_FALSE.length()>=seq.length()))){
						t1=t2;
						t2="bool";
						i+=C.VAR_TYPE_BOOL_FALSE.length();
						M=true;
						COMPILED_SEQ+="[{\"t\":\"bool\",\"v\":false}]";
					}
				}
				if (((i>0&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1)||i==0)&&seq.charAt(i)==C.QUOTE_CHAR){
					i++;
					String nm="";
					while (true){
						if (seq.charAt(i-1)!=C.QUOTE_ESCAPE_CHAR&&seq.charAt(i)==C.QUOTE_CHAR){
							break;
						}
						nm+=String.valueOf(seq.charAt(i));
						i++;
						if (i>=seq.length()){
							return new SyntaxError("Unterminated string",S).toString();
						}
					}
					t1=t2;
					t2="string";
					M=true;
					COMPILED_SEQ+="[{\"t\":\"string\",\"v\":\""+nm.replace("\\n","\n").replace("\\t","\t").replace("\\\"","\"")+"\"}]";
				}
				if (((i>0&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1)||i==0)&&C.ALLOWED_CLASS_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
					int si=i+0;
					if (i>0&&seq.charAt(i-1)==C.FUNC_PARAMS_END_CHAR){
						op=C.OP_MULT;
						COMPILED_SEQ+="[{\"t\":\"operator\",\"v\":\""+op+"\"}]";
					}
					String nm=String.valueOf(C.NO_ERROR_CHAR);
					while (seq.charAt(i)!=C.CLASS_ATTR_SPLIT_CHAR){
						nm+=String.valueOf(seq.charAt(i));
						i++;
						if (((i<seq.length()&&seq.charAt(i)!=C.CLASS_ATTR_SPLIT_CHAR)||(i>=seq.length()))&&(i>=seq.length()||C.ALLOWED_CLASS_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))==-1)){
							nm="";
							break;
						}
					}
					if (nm.length()==0){
						i=si;
					}
					else{
						nm=nm.substring(1);
						i++;
						Class cl=CL.find_name(nm);
						if (cl==null){
							return new UnknownClassError("Class '"+nm+"' doesn't exist",S).toString();
						}
						String fnm="";
						while (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
							fnm+=String.valueOf(seq.charAt(i));
							i++;
							if (i>=seq.length()){
								break;
							}
						}
						if (i<seq.length()&&seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
							if (!cl.has_func(fnm)){
								return new UnknownFunctionError("Function '"+nm+"' doesn't exist",S).toString();
							}
							ArrayList<String> p=new ArrayList<String>();
							p.add("");
							int pi=0;
							int b=1;
							i++;
							while(b!=0){
								if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
									b++;
								}
								if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
									b--;
								}
								p.set(pi,p.get(pi)+String.valueOf(seq.charAt(i)));
								if (b==1&&seq.charAt(i)==C.FUNC_PARAMS_SPILT_CHAR){
									p.set(pi,p.get(pi).substring(p.get(pi).length()-1));
									pi++;
									p.add("");
								}
								if (b==0){
									p.set(pi,p.get(pi).substring(p.get(pi).length()-1));
								}
								i++;
								if (b!=0&&i>=seq.length()){
									return new BracketError("Found '"+C.FUNC_PARAMS_START_CHAR+"' without a pair",S).toString();
								}
							}
							String cp=C.compile_args(p,CL,FL,VL,cl.get_func_param_list(fnm),"Function "+nm,S);
							if (cp.charAt(0)==C.NO_ERROR_CHAR){
								cp=cp.substring(1);
							}
							else{
								return cp;
							}
							i--;
							t1=t2;
							t2=cl.get_func_r_type(fnm);
							M=true;
							COMPILED_SEQ+="[{\"t\":\"cf_call\",\"c\":\""+nm+"\",\"v\":\""+fnm+"\",\"a\":"+cp+"}]";
						}
					}
				}
				if (((i>0&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1)||i==0)&&C.ALLOWED_VAR_NAME_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
					if (i>0&&seq.charAt(i-1)==C.FUNC_PARAMS_END_CHAR){
						op=C.OP_MULT;
						COMPILED_SEQ+="[{\"t\":\"operator\",\"v\":\""+op+"\"}]";
					}
					String nm="";
					while (C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
						nm+=String.valueOf(seq.charAt(i));
						i++;
						if (i>=seq.length()){
							break;
						}
					}
					if (i<seq.length()&&seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
						if (!FL.has(nm)){
							return new UnknownFunctionError("Function '"+nm+"' doesn't exist",S).toString();
						}
						ArrayList<String> p=new ArrayList<String>();
						p.add("");
						int pi=0;
						int b=1;
						i++;
						while(b!=0){
							if (seq.charAt(i)==C.FUNC_PARAMS_START_CHAR){
								b++;
							}
							if (seq.charAt(i)==C.FUNC_PARAMS_END_CHAR){
								b--;
							}
							p.set(pi,p.get(pi)+String.valueOf(seq.charAt(i)));
							if (b==1&&seq.charAt(i)==C.FUNC_PARAMS_SPILT_CHAR){
								p.set(pi,p.get(pi).substring(p.get(pi).length()-1));
								pi++;
								p.add("");
							}
							if (b==0){
								p.set(pi,p.get(pi).substring(p.get(pi).length()-1));
							}
							i++;
							if (b!=0&&i>=seq.length()){
								return new BracketError("Found '"+C.FUNC_PARAMS_START_CHAR+"' without a pair",S).toString();
							}
						}
						String cp=C.compile_args(p,CL,FL,VL,FL.get_func_params(nm),"Function "+nm,S);
						if (cp.charAt(0)==C.NO_ERROR_CHAR){
							cp=cp.substring(1);
						}
						else{
							return cp;
						}
						i--;
						t1=t2;
						t2=FL.get_type(nm);
						M=true;
						COMPILED_SEQ+="[{\"t\":\"f_call\",\"v\":\""+nm+"\",\"a\":"+cp+"}]";
					}
					else{
						if (!VL.has(nm)){
							return new SyntaxError("Unknown Variable: Variable '"+nm+"' doesn't exist",S).toString();
						}
						i--;
						t1=t2;
						t2=VL.get_type(nm);
						M=true;
						COMPILED_SEQ+="[{\"t\":\"v_ref\",\"v\":\""+nm+"\"}]";
					}
				}
				if (((i>0&&C.ALLOWED_VAR_NAME_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1&&C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i-1)))==-1)||i==0)&&C.ALLOWED_TYPE_FLOAT_START_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
					String nm="";
					String t="int";
					while (C.ALLOWED_TYPE_FLOAT_CHARS.indexOf(String.valueOf(seq.charAt(i)))!=-1||seq.charAt(i)==C.TYPE_FLOAT_SPLIT_CHAR){
						nm+=String.valueOf(seq.charAt(i));
						if (seq.charAt(i)==C.TYPE_FLOAT_SPLIT_CHAR){
							if (t.equals("float")){
								return new UnexpectedCharacterError("Expected any of '"+C.ALLOWED_TYPE_FLOAT_CHARS+"', found '"+String.valueOf(seq.charAt(i))+"'",S).toString();
							}
							t="float";
						}
						i++;
						if (i>=seq.length()){
							break;
						}
					}
					i--;
					t1=t2;
					t2=t;
					M=true;
					COMPILED_SEQ+="[{\"t\":\""+t+"\",\"v\":"+nm+"}]";
				}
				if (i<seq.length()&&C.OPERATORS.indexOf(String.valueOf(seq.charAt(i)))!=-1){
					if (op!=C.EMPTY_CHAR){
						return new UnexpectedCharacterError("Expected a variable or a function, found '"+String.valueOf(seq.charAt(i))+"'",S).toString();
					}
					if (seq.charAt(i)==C.OP_ADD){
						op=C.OP_ADD;
					}
					if (seq.charAt(i)==C.OP_SUB){
						op=C.OP_SUB;
					}
					if (seq.charAt(i)==C.OP_MULT){
						op=C.OP_MULT;
					}
					if (seq.charAt(i)==C.OP_DIV){
						op=C.OP_DIV;
					}
					if (seq.charAt(i)==C.OP_MOD){
						op=C.OP_MOD;
					}
					if (seq.charAt(i)==C.OP_POW){
						op=C.OP_POW;
					}
					if (op==C.EMPTY_CHAR){
						return new UnsupportedOperatorError("Unknown operator '"+String.valueOf(seq.charAt(i))+"'",S).toString();
					}
					M=true;
					COMPILED_SEQ+="[{\"t\":\"operator\",\"v\":\""+String.valueOf(op)+"\"}]";
				}
				if (t1.length()!=0&&t2.length()!=0){
					if (op==C.OP_ADD){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							if (t1.equals("float")&&t2.equals("float")){
								t2="float";
							}
							else{
								t2="int";
							}
						}
						if (((t1.equals("int")||t1.equals("float"))&&t2.equals("string"))||(t1.equals("string")&&(t2.equals("int")||t2.equals("float")))){
							t1="";
							t2="string";
						}
						if (t1.equals("string")&&t2.equals("string")){
							t1="";
							t2="string";
						}
					}
					if (op==C.OP_SUB){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							if (t1.equals("float")&&t2.equals("float")){
								t2="float";
							}
							else{
								t2="int";
							}
						}
					}
					if (op==C.OP_MULT){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							if (t1.equals("float")&&t2.equals("float")){
								t2="float";
							}
							else{
								t2="int";
							}
						}
						if ((t1.equals("int")&&t2.equals("string"))||(t1.equals("string")&&t2.equals("int"))){
							t1="";
							t2="string";
						}
					}
					if (op==C.OP_DIV){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							t2="float";
						}
					}
					if (op==C.OP_MOD){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							if (t1.equals("float")&&t2.equals("float")){
								t2="float";
							}
							else{
								t2="int";
							}
						}
					}
					if (op==C.OP_POW){
						if ((t1.equals("int")||t1.equals("float"))&&(t2.equals("int")||t2.equals("float"))){
							t1="";
							if (t1.equals("float")&&t2.equals("float")){
								t2="float";
							}
							else{
								t2="int";
							}
						}
					}
					if (t1.length()!=0){
						return new UnsupportedOperatorError("Unsupported operator '"+op+"' for '"+t1+"' and '"+t2+"'",S).toString();
					}
					op=C.EMPTY_CHAR;
					M=true;
				}
				if (M==false&&((i<seq.length()&&seq.charAt(i)!=C.SPACE_CHAR&&seq.charAt(i)!=C.TAB_CHAR)||(i>=seq.length()))){
					return new UnexpectedCharacterError("Unexpected character '"+(i<seq.length()?seq.charAt(i):seq.charAt(i-1))+"'",S).toString();
				}
				M=false;
				i++;
				COMPILED_SEQ+=",";
			}
			rt_l.add(t2);
			COMPILED_SEQ=COMPILED_SEQ.substring(0,COMPILED_SEQ.length()-1)+"],";
		}
		if (RT!=null&&!((rt_l.size()>1)||(rt_l.get(0)==null))){
			String l1="";
			if (RT.size()>=1&&RT.get(0).length()!=0){
				for (String s:RT){
					if (s.equals("object")){
						l1+="<any>, ";
					}
					else{
						l1+="<"+s+">, ";
					}
				}
				l1=l1.substring(0,l1.length()-2);
			}
			String l2="";
			if (sl.size()>=1&&sl.get(0).length()==0){
				for (String s:rt_l){
					if (s.length()==0){
						l2+="<any>, ";
					}
					else{
						l2+="<"+s+">, ";
					}
				}
				l2=l2.substring(0,l2.length()-2);
			}
			if (rt_l.size()!=RT.size()){
				if (FN.startsWith("Function")){
					return new ArgumentError(FN+"("+l1+") is not applicable for the arguments ("+l2+")",S).toString();
				}
				else{
					return new ArgumentError("Variable "+l1.split(", ")[0]+FN+" is not applicable for "+l2.split(", ")[0],S).toString();
				}
			}
			int i=0;
			while (i<rt_l.size()){
				if (RT.get(i).length()==0){
					i++;
					continue;
				}
				if ((rt_l.get(i).equals("float")||rt_l.get(i).equals("int"))&&(RT.get(i).equals("float")||RT.get(i).equals("int"))){
					rt_l.set(i,RT.get(i));
				}
				if (RT.get(i).equals("object")){
					rt_l.set(i,"object");
				}
				if (!rt_l.get(i).equals(RT.get(i))){
					if (FN.startsWith("Function")){
						return new ArgumentError(FN+"("+l1+") is not applicable for the arguments ("+l2+")",S).toString();
					}
					else{
						return new ArgumentError("Variable "+l1.split(", ")[0]+FN+" is not applicable for "+l2.split(", ")[0],S).toString();
					}
				}
				i++;
			}
		}
		return String.valueOf(C.NO_ERROR_CHAR)+COMPILED_SEQ.substring(0,COMPILED_SEQ.length()-1)+"]";
	}



	private static String compile_condition(String seq,ClassList CL,FunctionList FL,VariableList VL,CallStack S){
		String COMPILED_SEQ="[";
		int i=0;
		ArrayList<String> c=new ArrayList<String>();
		int ci=0;
		int b=0;
		int M=C.M_NONE;
		c.add("E");
		while (i<seq.length()){
			if (seq.charAt(i)==C.COND_OPEN_BRACKETS){
				b++;
			}
			if (seq.charAt(i)==C.COND_CLOSE_BRACKETS){
				b--;
			}
			if (seq.charAt(i)==C.QUOTE_CHAR&&((i==0)||(seq.charAt(i-1)!=C.QUOTE_ESCAPE_CHAR))){
				if (M==C.M_NONE){
					M=C.M_STRING;
				}
				else{
					M=C.M_NONE;
				}
			}
			if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_AND_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_AND_CHAR+"'",S).toString();
				}
				i+=C.COND_AND_CHAR.length();
				c.add("{\"t\":\""+C.COND_AND_CHAR+"\"}");
				ci+=2;
				c.add("E");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_OR_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_OR_CHAR+"'",S).toString();
				}
				i+=C.COND_OR_CHAR.length();
				c.add("{\"t\":\""+C.COND_OR_CHAR+"\"}");
				ci+=2;
				c.add("E");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_EQ_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_EQ_CHAR+"'",S).toString();
				}
				i+=C.COND_EQ_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_EQ_CHAR+"\"}~");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_NOT_EQ_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_NOT_EQ_CHAR+"'",S).toString();
				}
				i+=C.COND_NOT_EQ_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_NOT_EQ_CHAR+"\"}~");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_NOT_LESS_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_NOT_LESS_CHAR+"'",S).toString();
				}
				i+=C.COND_NOT_LESS_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_NOT_LESS_CHAR+"\"}~");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_NOT_MORE_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_NOT_MORE_CHAR+"'",S).toString();
				}
				i+=C.COND_NOT_MORE_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_NOT_MORE_CHAR+"\"}~");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_LESS_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_LESS_CHAR+"'",S).toString();
				}
				i+=C.COND_LESS_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_LESS_CHAR+"\"}~");
			}
			else if (M==C.M_NONE&&b==0&&seq.substring(i).startsWith(C.COND_MORE_CHAR)){
				if (c.get(ci).split("~").length==1&&c.get(ci).split("~")[0].length()==0){
					return new UnexpectedCharacterError("Expected a condition, found '"+C.COND_MORE_CHAR+"'",S).toString();
				}
				i+=C.COND_MORE_CHAR.length();
				c.set(ci,c.get(ci)+"~E{\"t\":\""+C.COND_MORE_CHAR+"\"}~");
			}
			else{
				if (i<seq.length()){
					c.set(ci,c.get(ci)+String.valueOf(seq.charAt(i)));
				}
				i++;
			}
		}
		for (String l:c){
			if (l.charAt(0)!='E'){
				COMPILED_SEQ+=l+",";
				continue;
			}
			l=l.substring(1);
			COMPILED_SEQ+="[";
			for (String s:l.split("~")){
				if (s.charAt(0)=='E'){
					COMPILED_SEQ+=s.substring(1);
					continue;
				}
				if (COMPILED_SEQ.length()>2){
					COMPILED_SEQ+=",";
				}
				if (s.charAt(0)==C.COND_OPEN_BRACKETS){
					int k=1;
					b=1;
					seq="";
					while (b!=0){
						seq+=String.valueOf(s.charAt(k));
						if (s.charAt(k)==C.COND_OPEN_BRACKETS){
							b++;
						}
						if (s.charAt(k)==C.COND_CLOSE_BRACKETS){
							b--;
						}
						if (b==0){
							s=s.substring(0,s.length()-1);
						}
						k++;
					}
					String r=C.compile_condition(s,CL,FL,VL,S);
					if (r.charAt(0)==C.NO_ERROR_CHAR){
						r=r.substring(1);
						if (r.equals("[["+s+"]]")){
							COMPILED_SEQ+=s;
						}
						else{
							COMPILED_SEQ+=r;
						}
					}
					else{
						return r;
					}
				}
				else{
					ArrayList<String> aa=new ArrayList<String>();
					aa.add(s);
					String r=C.compile_args(aa,CL,FL,VL,null,"",S);
					if (r.charAt(0)==C.NO_ERROR_CHAR){
						COMPILED_SEQ+=r.substring(1)+",";
					}
					else{
						return r;
					}
				}
			}
			if (l.split("~").length==1){
				COMPILED_SEQ+="[{\"t\":\"==\"},[[{\"t\":\"bool\",\"v\":true}]]],";
			}
			COMPILED_SEQ=COMPILED_SEQ.substring(0,COMPILED_SEQ.length()-1)+"],";
		}
		return String.valueOf(C.NO_ERROR_CHAR)+COMPILED_SEQ.substring(0,COMPILED_SEQ.length()-1)+"]";
	}



	public static void compile(String fn,boolean DEBUG){
		String seq=C.read_file(fn,new CallStack(fn));
		if (seq.charAt(0)==C.NO_ERROR_CHAR){
			seq=seq.substring(1);
		}
		else{
			System.err.println(seq);
			System.exit(1);
		}
		seq=C.break_lines(seq);
		String c=C.compile(seq,new ClassList(),new FunctionList(),new VariableList(),DEBUG,true,new CallStack(fn));
		if (c.charAt(0)==C.NO_ERROR_CHAR){
			c=c.substring(1);
		}
		else{
			c=CallStack.reformat(c);
			System.err.println(c);
			System.exit(1);
		}
		System.out.println("COMPILED: "+c);
	}
}

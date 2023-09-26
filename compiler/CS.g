grammar CS;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header {
    import java.util.ArrayList;
}

@parser::members {
    private static ArrayList<String> symbol_table;
    private static ArrayList<Character> type_table;
    private static ArrayList<Integer> while_stack;
    private static ArrayList<Boolean> symbol_table_warning;
    private static ArrayList<String> error_list;
    private static ArrayList<String> function_table; 
    private static String comp_op;	
	private static String argments;
    private static int stack_cur, stack_max;
    private static int cont_if;
    private static int if_counter;
    private static int while_counter;	
	private static char ret;

    private static void emit(String bytecode, int delta) 
    {
        System.out.println("    " + bytecode);
        stack_cur += delta;
		
        if (stack_max < stack_cur) 
        {   
            stack_max = stack_cur; 
        }
		
    }

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        CSLexer lexer = new CSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSParser parser = new CSParser(tokens);

        if_counter = 0;
        while_counter = 0;

        symbol_table = new ArrayList<String>();

        type_table = new ArrayList<Character>();

        symbol_table_warning = new ArrayList<Boolean>();

        while_stack = new ArrayList<Integer>();

        error_list = new ArrayList<String>();

        function_table = new ArrayList<String>();

        argments = "";
		ret = 'V';

        parser.program();
        System.out.println("\n; symbols: " + symbol_table);
    }
}

/*---------------- LEXER RULES ----------------*/

ATTRIB: '=';
CL_BRT: ']';
CL_CUR: '}';
CL_PAR: ')';
COMMA: ',';
DOT: '.';
INT: 'int';
MINUS: '-';
OP_BRT: '[';
OP_CUR: '{';
OP_PAR: '(';
OVER: '/';
PLUS: '+';
REMAINDER: '%';
TIMES: '*';

EQ: '==';
NE: '!=';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';

BREAK: 'break';
CONSOLE: 'console';
CONTINUE: 'continue';
ELSE: 'else';
FUNCTION: 'function';
IF: 'if';
LENGTH: 'length';
PUSH: 'push';
READINT: 'readInt';
READSTRING: 'readString' ;
RETURN: 'return';
WHILE: 'while';

NUMBER: '0' ..'9'+;
STRING: '"' ~["]* '"';
VARIABLE: 'a' ..'z'+;

COMMENT: '//' ~('\n')* { skip(); };
SPACE: (' ' | '\t' | '\r' | '\n')+ { skip(); };

/*---------------- PARSER RULES ----------------*/

program:
	{  
            System.out.println(".source Test.j");
            System.out.println(".class  public Test");
            System.out.println(".super  java/lang/Object");
            System.out.println();
            System.out.println(".method public <init>()V");
            System.out.println("    aload_0");
            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
            System.out.println("    return");
            System.out.println(".end method");
            System.out.println(); 
    }( function )* main EOF;

main:
	{   
        System.out.println(".method public static main([Ljava/lang/String;)V"); 
        symbol_table.add("args");
        type_table.add('-');
        symbol_table_warning.add(true);
    } 
    (statement)* 
        {   
            System.out.println("    return");
            System.out.println(".limit stack " + stack_max);
            System.out.println(".limit locals " + symbol_table.size());
            System.out.println(".end method"); 
			
            // Warnings
            for (int i = 0; i < symbol_table_warning.size(); i++) 
            {
                if(symbol_table_warning.get(i) == false){
                    System.err.println("Warning: "+ symbol_table.get(i) + " declared but not used");  
            }

            //GERAR ERROS
			if (error_list.size() > 0) 
			{
				for (String s : error_list) 
				{
					System.err.println(s);
				}
				System.exit(1);
			}
			
        }
		
    };

statement: st_console | st_attrib | st_if | st_while | st_break | st_continue | st_array_new | st_array_push | st_array_set | st_call | st_return;


st_return:	
	RETURN expression 
	{
		argments = "";
		emit("ireturn",-1);
	}
;

st_array_new:
	VARIABLE ATTRIB OP_BRT CL_BRT
	{
		int i = symbol_table.indexOf($VARIABLE.text);
		
		if (i != 0) 
		{
			symbol_table.add($VARIABLE.text);
			type_table.add('v');
			symbol_table_warning.add(false);
			i = symbol_table.indexOf($VARIABLE.text);
			emit("new Array", 0);
			emit("dup", 0);
			emit("invokespecial Array/<init>()V", +1);
			emit("astore "+i, -1);
		} else {
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable '"+ $VARIABLE.text +"' already exists ");
		}
	}
;
	
st_array_push	:
	VARIABLE DOT PUSH OP_PAR 
	{
		int i = symbol_table.indexOf($VARIABLE.text);
		
		if (i > 0) 
		{
			symbol_table_warning.set(i, true);
			emit("aload "+i, +1);
		} else {
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable '"+ $VARIABLE.text +"' doesn't exists ");
		}
	}
	
	exp1 = expression CL_PAR
	{
        if ($exp1.type == 'a')
		{
            error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable '"+ $VARIABLE.text +"' is not a integer. Arrays only accept integers ");
        } else {    
			    emit("invokevirtual Array/push(I)V", -2);
            }
	}
;
	
st_array_set:
	VARIABLE OP_BRT 
	{
		int i = symbol_table.indexOf($VARIABLE.text);
		
		if (i != -1) 
		{
			emit("aload "+i, +1);
		} else {
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable '"+ $VARIABLE.text +"' doesn't exists ");
		}
	}
	
	exp = expression CL_BRT ATTRIB exp1 = expression
	{
		if (i == -1)
		{
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable '"+ $VARIABLE.text +"' doesn't exists ");
		}

        if (type_table.get(i) == 'v' && $exp.type != 'i') 
		{
            error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' array index must be integer ");
        }
		
        if (type_table.get(i) == 'v' && $exp1.type == 'a') 
		{
            error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' is an array and only accepct integers ");
        } else {
		    emit("invokevirtual Array/set(II)V", -3);
        }
	}
;

st_console:   
	CONSOLE OP_PAR 
    {   
        emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
    }
	
    exp1 = expression
    {   
        if ($exp1.type == 'i')
		{
            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
        }
		
        if ($exp1.type == 'a')
		{
            emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
        }             
    }( COMMA
        {   
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
        }
    exp2 = expression
    {   
        if ($exp2.type == 'i')
		{
            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
        }
		
        if ($exp2.type == 'a')
		{
             emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
        }  
    } ) * CL_PAR
        {   
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
            emit("invokevirtual java/io/PrintStream/println()V", -1); 
        }
;
    
st_attrib:  
    VARIABLE ATTRIB exp = expression
    {    
        System.out.println("\n; types size: " + type_table.size());
        System.out.println("\n; symbols size: " + symbol_table.size());
		
        int i = symbol_table.indexOf($VARIABLE.text);
		
        if (i > 0) 
		{
            if (type_table.get(i) == $exp.type)
     		{
                if ($exp.type == 'i') 
				{
				    emit("istore "+i+"\n", -1);
				}
				
                if ($exp.type == 'a') 
				{
					emit("astore "+i+"\n", -1);
				}
            } else if (type_table.get(i) == 'i' && $exp.type == 'a') 
			{
                error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' is integer ");

            } else if (type_table.get(i) == 'a' && $exp.type == 'i') 
			{
                error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' is string ");
            }
        } else { 
            symbol_table.add($VARIABLE.text);
			
            if ($exp.type == 'i') 
			{ 
				type_table.add('i'); 
			}
			
            if ($exp.type == 'a') 
			{ 
				type_table.add('a'); 
			}
			
            symbol_table_warning.add(false);
            i = symbol_table.indexOf($VARIABLE.text);
			
            if ($exp.type == 'i') 
			{ 
				emit("istore "+i+"\n", -1); 
			}
			
            if ($exp.type == 'a') 
			{ 
		        emit("astore "+i+"\n", -1); 
			}
        }  
    }      
;

st_if:
    IF OP_PAR comparison 
    {  
        int if_local = if_counter++;
        boolean else_local = false;
        emit(comp_op + " NOT_IF_"+if_local, -2);
    } 
	CL_PAR OP_CUR (statement)* CL_CUR ( 
    {
        else_local = true;
        emit("goto END_ELSE_"+if_local, 0);
        emit("NOT_IF_"+if_local+":", 0);
    } 
	ELSE OP_CUR (statement)* CL_CUR)?
    {  
        if (else_local) 
		{
            emit("END_ELSE_"+if_local+":", 0);
        } else {
            emit("NOT_IF_"+if_local+":", 0);
        }
    }
;
  
st_while:  
	WHILE  
    {  
        int while_local = while_counter++;
        emit("BEGIN_WHILE_" + while_local + ":", 0);
        while_stack.add(while_local);
    }
    OP_PAR comparison CL_PAR 
    {  
        emit(comp_op + " END_WHILE_" + while_local, -2);
    }
    OP_CUR ( statement )* CL_CUR
    { 
        emit("goto BEGIN_WHILE_" + while_local, 0);
    }
    {  
        emit("END_WHILE_" + while_local + ":", 0); 
        while_stack.remove(while_stack.size()-1);
    }
;

st_break: 
	BREAK
    {  
        if (while_stack.size() != 0)
		{
            emit("goto END_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
        } else {
            error_list.add("ERROR: break not inside a while!");
        }
    }
;

st_continue:
    CONTINUE
    {  
        if (while_stack.size() != 0)
		{
            emit("goto BEGIN_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
        } else {
            error_list.add("ERROR: continue not inside a while!");
        }
    }
;

st_call:
	VARIABLE OP_PAR (arguments {ret = 'V';})? CL_PAR
	{
		int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
		
		if (i >= 0) 
		{
			emit("invokestatic Test/"+$VARIABLE.text+"("+argments+")"+ret, 0);
		} else {
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' function is not declared!");
			error_list.add("DEBUG: "+$VARIABLE.text+"("+argments+")"+ret);
		}
		argments = "";
	}
;
	
arguments:	
	expression {argments +="I";} (COMMA expression {argments +="I";})*
;

function: 
	FUNCTION VARIABLE OP_PAR (parameters)? CL_PAR (INT {ret = 'I';})?  OP_CUR 
	{   
		int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
		
		if (i >= 0)
		{
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' function is already declared!");
		} else {
			function_table.add($VARIABLE.text+"("+argments+")"+ret);
		}
		System.out.println(".method public static "+$VARIABLE.text+"("+argments+")"+ret); 
		argments =  "";
		ret = 'V';
	}
	(statement)+ CL_CUR
	{   
		System.out.println("    return");
        System.out.println(".limit stack "+ stack_max);
		System.out.println(".limit locals "+ symbol_table.size() );
        System.out.println(".end method\n"); 			
		System.out.println("\n; symbols: " + symbol_table);
		System.out.println("\n; types: " + type_table);
		System.out.println("\n; used: " + symbol_table_warning);
			
		symbol_table = new ArrayList<String>();	
		type_table = new ArrayList<Character>();
		symbol_table_warning = new ArrayList<Boolean>();	
		stack_cur = 0;
		stack_max = 0;
	}
;

parameters:
	VARIABLE 
	{ 
		symbol_table.add($VARIABLE.text);
		symbol_table_warning.add(false);
		type_table.add('i');
		argments += "I";
	}
	( COMMA VARIABLE 		
	{ 
		symbol_table.add($VARIABLE.text);
		symbol_table_warning.add(false);
		type_table.add('i');
		argments += "I";
	}
	)*
;

comparison: 
    exp1 = expression op = (EQ | NE | GT | GE | LT | LE) exp2 = expression
    {   
        if ($exp1.type == 'i' && $exp2.type == 'i') 
		{
            if ($op.type == EQ) 
			{ 
				comp_op = "if_icmpne"; 
			}
			
            if ($op.type == NE) 
			{
				comp_op = "if_icmpeq"; 
			}
			
            if ($op.type == GT) 
			{ 
				comp_op = "if_icmple"; 
			}
			
            if ($op.type == GE) 
			{ 
				comp_op = "if_icmplt"; 
			}
               
			if ($op.type == LT) 
			{ 
				comp_op = "if_icmpge";
			}
			
            if ($op.type == LE) 
			{ 
				comp_op = "if_icmpgt"; 
			}
			
        } else{
            error_list.add("ERROR ON LINE "+$op.line+ ": mixed types ");
        }
    }
;

expression returns [char type]:   
	t1 = term ( op = ( PLUS | MINUS ) t2 = term
    {   
        if ($t2.type == 'i')
		{
            emit(($op.type == PLUS) ? "iadd" : "isub", -1);
        } else {
            error_list.add("ERROR ON LINE "+ $op.line + ": mixed types");
        }
    }
    )*
    {    
		$type = $t1.type; 
	}
;

term returns [char type]:
	f1 = factor ( op = (TIMES | OVER | REMAINDER) f2 = factor 
    {   
        if ($f2.type == 'i')
		{
            emit(($op.type == TIMES) ? "    imul" : (($op.type  == OVER) ? "    idiv" : "    irem"), -1); 
        } else {
            error_list.add("ERROR ON LINE "+ $op.line + ": mixed types");
        }  
    }
	)*
    {   
		$type = $f1.type; 
	}    
;

factor returns [char type]:   
	NUMBER
    {   
		emit("ldc " + $NUMBER.text, +1); $type = 'i';
	}
    |   OP_PAR exp = expression CL_PAR
		{ 
			$type = $exp.type; 
		}
	|	VARIABLE OP_PAR (arguments{ret = 'I';})? CL_PAR
		{
			int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
			
			if (i >= 0) 
			{
				emit("invokestatic Test/"+$VARIABLE.text+"("+argments+")"+ret,0);
			}else {
				error_list.add("Invalid function on line: "+$VARIABLE.line+". Signiature: "+$VARIABLE.text+"("+argments+")"+ret);
			}
			$type = 'i';
		}
	|	VARIABLE DOT LENGTH
		{
			int i = symbol_table.indexOf($VARIABLE.text);
			
			if (i >= 0)
			{
				symbol_table_warning.set(i, true);
				
				if (type_table.get(i) == 'v') 
				{ 
					emit("aload "+i, +1); 
					emit("invokevirtual Array/length()I", 0);
					$type = 'i';
				} else {
					error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not an array!");
				}
			} else { 
				error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not declared!");
			}
		}
	|	VARIABLE OP_BRT 
		{
			int i = symbol_table.indexOf($VARIABLE.text);
			
			if (i >= 0)
			{
				symbol_table_warning.set(i, true);
				
				if (type_table.get(i) == 'v') 
				{ 
					emit("aload "+i, +1); 
					$type = 'i';
				} else {
					error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not an array!");
				}
			} else {
				error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not declared!");
			}
		}
		expression CL_BRT
		{
			emit("invokevirtual Array/get(I)I", -1);
		}
	|	VARIABLE
		{
			int i = symbol_table.indexOf($VARIABLE.text);
			
			if (i >= 0) 
			{
				symbol_table_warning.set(i, true);
				
				if (type_table.get(i) == 'i') 
				{ 
					emit("iload "+i, +1); $type = 'i'; 
				}
				
				if (type_table.get(i) == 'a') 
				{ 
					emit("aload "+i, +1); $type = 'a';
				}
				
				if (type_table.get(i) == 'v') 
				{ 
					emit("aload "+i, +1); 
				    emit("invokevirtual Array/string()Ljava/lang/String;", 0);
					$type = 'a';
				}
			} else { 
				error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not declared!");
				$type = 'i';
			}
		}
	|	READINT OP_PAR CL_PAR
		{	
			emit("invokestatic Runtime/readInt()I", +1); $type = 'i'; 
		}
	|	STRING
		{   
			emit("ldc " + $STRING.text, +1); $type = 'a';
		}
	|	READSTRING OP_PAR CL_PAR
		{	
			emit("invokestatic Runtime/readString()Ljava/lang/String;", +1); $type = 'a'; 
		}
;

// BUILD java -jar antlr-4.8-complete.jar CS.g javac -cp .;antlr-4.8-complete.jar CS*.java

// COMPILE java -cp .;antlr-4.8-complete.jar CSParser < print.cs > Test.j java -jar jasmin-2.4.jar
// Test.j java Test
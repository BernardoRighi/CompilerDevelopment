// Generated from CS.g by ANTLR 4.8

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATTRIB=1, CL_BRT=2, CL_CUR=3, CL_PAR=4, COMMA=5, DOT=6, INT=7, MINUS=8, 
		OP_BRT=9, OP_CUR=10, OP_PAR=11, OVER=12, PLUS=13, REMAINDER=14, TIMES=15, 
		EQ=16, NE=17, GT=18, GE=19, LT=20, LE=21, BREAK=22, CONSOLE=23, CONTINUE=24, 
		ELSE=25, FUNCTION=26, IF=27, LENGTH=28, PUSH=29, READINT=30, READSTRING=31, 
		RETURN=32, WHILE=33, NUMBER=34, STRING=35, VARIABLE=36, COMMENT=37, SPACE=38;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_return = 3, 
		RULE_st_array_new = 4, RULE_st_array_push = 5, RULE_st_array_set = 6, 
		RULE_st_console = 7, RULE_st_attrib = 8, RULE_st_if = 9, RULE_st_while = 10, 
		RULE_st_break = 11, RULE_st_continue = 12, RULE_st_call = 13, RULE_arguments = 14, 
		RULE_function = 15, RULE_parameters = 16, RULE_comparison = 17, RULE_expression = 18, 
		RULE_term = 19, RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_return", "st_array_new", "st_array_push", 
			"st_array_set", "st_console", "st_attrib", "st_if", "st_while", "st_break", 
			"st_continue", "st_call", "arguments", "function", "parameters", "comparison", 
			"expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "']'", "'}'", "')'", "','", "'.'", "'int'", "'-'", "'['", 
			"'{'", "'('", "'/'", "'+'", "'%'", "'*'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'break'", "'console'", "'continue'", "'else'", "'function'", 
			"'if'", "'length'", "'push'", "'readInt'", "'readString'", "'return'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATTRIB", "CL_BRT", "CL_CUR", "CL_PAR", "COMMA", "DOT", "INT", 
			"MINUS", "OP_BRT", "OP_CUR", "OP_PAR", "OVER", "PLUS", "REMAINDER", "TIMES", 
			"EQ", "NE", "GT", "GE", "LT", "LE", "BREAK", "CONSOLE", "CONTINUE", "ELSE", 
			"FUNCTION", "IF", "LENGTH", "PUSH", "READINT", "READSTRING", "RETURN", 
			"WHILE", "NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CS.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public CSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(43);
				function();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			main();
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   
			        System.out.println(".method public static main([Ljava/lang/String;)V"); 
			        symbol_table.add("args");
			        type_table.add('-');
			        symbol_table_warning.add(true);
			    
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONSOLE) | (1L << CONTINUE) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			   
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
					
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public St_consoleContext st_console() {
			return getRuleContext(St_consoleContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_breakContext st_break() {
			return getRuleContext(St_breakContext.class,0);
		}
		public St_continueContext st_continue() {
			return getRuleContext(St_continueContext.class,0);
		}
		public St_array_newContext st_array_new() {
			return getRuleContext(St_array_newContext.class,0);
		}
		public St_array_pushContext st_array_push() {
			return getRuleContext(St_array_pushContext.class,0);
		}
		public St_array_setContext st_array_set() {
			return getRuleContext(St_array_setContext.class,0);
		}
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public St_returnContext st_return() {
			return getRuleContext(St_returnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				st_console();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				st_break();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				st_continue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				st_array_new();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				st_array_push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				st_array_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				st_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				st_return();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CSParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_return(this);
		}
	}

	public final St_returnContext st_return() throws RecognitionException {
		St_returnContext _localctx = new St_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(RETURN);
			setState(75);
			expression();

					argments = "";
					emit("ireturn",-1);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_newContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode ATTRIB() { return getToken(CSParser.ATTRIB, 0); }
		public TerminalNode OP_BRT() { return getToken(CSParser.OP_BRT, 0); }
		public TerminalNode CL_BRT() { return getToken(CSParser.CL_BRT, 0); }
		public St_array_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_array_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_array_new(this);
		}
	}

	public final St_array_newContext st_array_new() throws RecognitionException {
		St_array_newContext _localctx = new St_array_newContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_array_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((St_array_newContext)_localctx).VARIABLE = match(VARIABLE);
			setState(79);
			match(ATTRIB);
			setState(80);
			match(OP_BRT);
			setState(81);
			match(CL_BRT);

					int i = symbol_table.indexOf((((St_array_newContext)_localctx).VARIABLE!=null?((St_array_newContext)_localctx).VARIABLE.getText():null));
					
					if (i != 0) 
					{
						symbol_table.add((((St_array_newContext)_localctx).VARIABLE!=null?((St_array_newContext)_localctx).VARIABLE.getText():null));
						type_table.add('v');
						symbol_table_warning.add(false);
						i = symbol_table.indexOf((((St_array_newContext)_localctx).VARIABLE!=null?((St_array_newContext)_localctx).VARIABLE.getText():null));
						emit("new Array", 0);
						emit("dup", 0);
						emit("invokespecial Array/<init>()V", +1);
						emit("astore "+i, -1);
					} else {
						error_list.add("ERROR ON LINE "+(((St_array_newContext)_localctx).VARIABLE!=null?((St_array_newContext)_localctx).VARIABLE.getLine():0)+ ": variable '"+ (((St_array_newContext)_localctx).VARIABLE!=null?((St_array_newContext)_localctx).VARIABLE.getText():null) +"' already exists ");
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_pushContext extends ParserRuleContext {
		public Token VARIABLE;
		public ExpressionContext exp1;
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode DOT() { return getToken(CSParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(CSParser.PUSH, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_array_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_array_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_array_push(this);
		}
	}

	public final St_array_pushContext st_array_push() throws RecognitionException {
		St_array_pushContext _localctx = new St_array_pushContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_array_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((St_array_pushContext)_localctx).VARIABLE = match(VARIABLE);
			setState(85);
			match(DOT);
			setState(86);
			match(PUSH);
			setState(87);
			match(OP_PAR);

					int i = symbol_table.indexOf((((St_array_pushContext)_localctx).VARIABLE!=null?((St_array_pushContext)_localctx).VARIABLE.getText():null));
					
					if (i > 0) 
					{
						symbol_table_warning.set(i, true);
						emit("aload "+i, +1);
					} else {
						error_list.add("ERROR ON LINE "+(((St_array_pushContext)_localctx).VARIABLE!=null?((St_array_pushContext)_localctx).VARIABLE.getLine():0)+ ": variable '"+ (((St_array_pushContext)_localctx).VARIABLE!=null?((St_array_pushContext)_localctx).VARIABLE.getText():null) +"' doesn't exists ");
					}
				
			setState(89);
			((St_array_pushContext)_localctx).exp1 = expression();
			setState(90);
			match(CL_PAR);

			        if (((St_array_pushContext)_localctx).exp1.type == 'a')
					{
			            error_list.add("ERROR ON LINE "+(((St_array_pushContext)_localctx).VARIABLE!=null?((St_array_pushContext)_localctx).VARIABLE.getLine():0)+ ": variable '"+ (((St_array_pushContext)_localctx).VARIABLE!=null?((St_array_pushContext)_localctx).VARIABLE.getText():null) +"' is not a integer. Arrays only accept integers ");
			        } else {    
						    emit("invokevirtual Array/push(I)V", -2);
			            }
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_setContext extends ParserRuleContext {
		public Token VARIABLE;
		public ExpressionContext exp;
		public ExpressionContext exp1;
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode OP_BRT() { return getToken(CSParser.OP_BRT, 0); }
		public TerminalNode CL_BRT() { return getToken(CSParser.CL_BRT, 0); }
		public TerminalNode ATTRIB() { return getToken(CSParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_array_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_array_set(this);
		}
	}

	public final St_array_setContext st_array_set() throws RecognitionException {
		St_array_setContext _localctx = new St_array_setContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_array_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((St_array_setContext)_localctx).VARIABLE = match(VARIABLE);
			setState(94);
			match(OP_BRT);

					int i = symbol_table.indexOf((((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getText():null));
					
					if (i != -1) 
					{
						emit("aload "+i, +1);
					} else {
						error_list.add("ERROR ON LINE "+(((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getLine():0)+ ": variable '"+ (((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getText():null) +"' doesn't exists ");
					}
				
			setState(96);
			((St_array_setContext)_localctx).exp = expression();
			setState(97);
			match(CL_BRT);
			setState(98);
			match(ATTRIB);
			setState(99);
			((St_array_setContext)_localctx).exp1 = expression();

					if (i == -1)
					{
						error_list.add("ERROR ON LINE "+(((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getLine():0)+ ": variable '"+ (((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getText():null) +"' doesn't exists ");
					}

			        if (type_table.get(i) == 'v' && ((St_array_setContext)_localctx).exp.type != 'i') 
					{
			            error_list.add("ERROR ON LINE "+(((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getText():null) +"' array index must be integer ");
			        }
					
			        if (type_table.get(i) == 'v' && ((St_array_setContext)_localctx).exp1.type == 'a') 
					{
			            error_list.add("ERROR ON LINE "+(((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_array_setContext)_localctx).VARIABLE!=null?((St_array_setContext)_localctx).VARIABLE.getText():null) +"' is an array and only accepct integers ");
			        } else {
					    emit("invokevirtual Array/set(II)V", -3);
			        }
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_consoleContext extends ParserRuleContext {
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public TerminalNode CONSOLE() { return getToken(CSParser.CONSOLE, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSParser.COMMA, i);
		}
		public St_consoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_console; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_console(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_console(this);
		}
	}

	public final St_consoleContext st_console() throws RecognitionException {
		St_consoleContext _localctx = new St_consoleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(CONSOLE);
			setState(103);
			match(OP_PAR);
			   
			        emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			    
			setState(105);
			((St_consoleContext)_localctx).exp1 = expression();
			   
			        if (((St_consoleContext)_localctx).exp1.type == 'i')
					{
			            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
			        }
					
			        if (((St_consoleContext)_localctx).exp1.type == 'a')
					{
			            emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
			        }             
			    
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				   
				            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
				        
				setState(109);
				((St_consoleContext)_localctx).exp2 = expression();
				   
				        if (((St_consoleContext)_localctx).exp2.type == 'i')
						{
				            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
				        }
						
				        if (((St_consoleContext)_localctx).exp2.type == 'a')
						{
				             emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				        }  
				    
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(CL_PAR);
			   
			            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			            emit("invokevirtual java/io/PrintStream/println()V", -1); 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_attribContext extends ParserRuleContext {
		public Token VARIABLE;
		public ExpressionContext exp;
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode ATTRIB() { return getToken(CSParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((St_attribContext)_localctx).VARIABLE = match(VARIABLE);
			setState(121);
			match(ATTRIB);
			setState(122);
			((St_attribContext)_localctx).exp = expression();
			    
			        System.out.println("\n; types size: " + type_table.size());
			        System.out.println("\n; symbols size: " + symbol_table.size());
					
			        int i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
					
			        if (i > 0) 
					{
			            if (type_table.get(i) == ((St_attribContext)_localctx).exp.type)
			     		{
			                if (((St_attribContext)_localctx).exp.type == 'i') 
							{
							    emit("istore "+i+"\n", -1);
							}
							
			                if (((St_attribContext)_localctx).exp.type == 'a') 
							{
								emit("astore "+i+"\n", -1);
							}
			            } else if (type_table.get(i) == 'i' && ((St_attribContext)_localctx).exp.type == 'a') 
						{
			                error_list.add("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is integer ");

			            } else if (type_table.get(i) == 'a' && ((St_attribContext)_localctx).exp.type == 'i') 
						{
			                error_list.add("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is string ");
			            }
			        } else { 
			            symbol_table.add((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
						
			            if (((St_attribContext)_localctx).exp.type == 'i') 
						{ 
							type_table.add('i'); 
						}
						
			            if (((St_attribContext)_localctx).exp.type == 'a') 
						{ 
							type_table.add('a'); 
						}
						
			            symbol_table_warning.add(false);
			            i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
						
			            if (((St_attribContext)_localctx).exp.type == 'i') 
						{ 
							emit("istore "+i+"\n", -1); 
						}
						
			            if (((St_attribContext)_localctx).exp.type == 'a') 
						{ 
					        emit("astore "+i+"\n", -1); 
						}
			        }  
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CSParser.IF, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public List<TerminalNode> OP_CUR() { return getTokens(CSParser.OP_CUR); }
		public TerminalNode OP_CUR(int i) {
			return getToken(CSParser.OP_CUR, i);
		}
		public List<TerminalNode> CL_CUR() { return getTokens(CSParser.CL_CUR); }
		public TerminalNode CL_CUR(int i) {
			return getToken(CSParser.CL_CUR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSParser.ELSE, 0); }
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(126);
			match(OP_PAR);
			setState(127);
			comparison();
			  
			        int if_local = if_counter++;
			        boolean else_local = false;
			        emit(comp_op + " NOT_IF_"+if_local, -2);
			    
			setState(129);
			match(CL_PAR);
			setState(130);
			match(OP_CUR);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONSOLE) | (1L << CONTINUE) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(CL_CUR);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{

				        else_local = true;
				        emit("goto END_ELSE_"+if_local, 0);
				        emit("NOT_IF_"+if_local+":", 0);
				    
				setState(139);
				match(ELSE);
				setState(140);
				match(OP_CUR);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONSOLE) | (1L << CONTINUE) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << VARIABLE))) != 0)) {
					{
					{
					setState(141);
					statement();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(CL_CUR);
				}
			}

			  
			        if (else_local) 
					{
			            emit("END_ELSE_"+if_local+":", 0);
			        } else {
			            emit("NOT_IF_"+if_local+":", 0);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CSParser.WHILE, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(CSParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(CSParser.CL_CUR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			  
			        int while_local = while_counter++;
			        emit("BEGIN_WHILE_" + while_local + ":", 0);
			        while_stack.add(while_local);
			    
			setState(154);
			match(OP_PAR);
			setState(155);
			comparison();
			setState(156);
			match(CL_PAR);
			  
			        emit(comp_op + " END_WHILE_" + while_local, -2);
			    
			setState(158);
			match(OP_CUR);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONSOLE) | (1L << CONTINUE) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(CL_CUR);
			 
			        emit("goto BEGIN_WHILE_" + while_local, 0);
			    
			  
			        emit("END_WHILE_" + while_local + ":", 0); 
			        while_stack.remove(while_stack.size()-1);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CSParser.BREAK, 0); }
		public St_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_break(this);
		}
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(BREAK);
			  
			        if (while_stack.size() != 0)
					{
			            emit("goto END_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            error_list.add("ERROR: break not inside a while!");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CSParser.CONTINUE, 0); }
		public St_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_continue(this);
		}
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(CONTINUE);
			  
			        if (while_stack.size() != 0)
					{
			            emit("goto BEGIN_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            error_list.add("ERROR: continue not inside a while!");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_callContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterSt_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitSt_call(this);
		}
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((St_callContext)_localctx).VARIABLE = match(VARIABLE);
			setState(176);
			match(OP_PAR);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READINT) | (1L << READSTRING) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0)) {
				{
				setState(177);
				arguments();
				ret = 'V';
				}
			}

			setState(182);
			match(CL_PAR);

					int i = function_table.indexOf((((St_callContext)_localctx).VARIABLE!=null?((St_callContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					
					if (i >= 0) 
					{
						emit("invokestatic Test/"+(((St_callContext)_localctx).VARIABLE!=null?((St_callContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret, 0);
					} else {
						error_list.add("ERROR ON LINE "+(((St_callContext)_localctx).VARIABLE!=null?((St_callContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_callContext)_localctx).VARIABLE!=null?((St_callContext)_localctx).VARIABLE.getText():null) +"' function is not declared!");
						error_list.add("DEBUG: "+(((St_callContext)_localctx).VARIABLE!=null?((St_callContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					}
					argments = "";
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expression();
			argments +="I";
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				expression();
				argments +="I";
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode FUNCTION() { return getToken(CSParser.FUNCTION, 0); }
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(CSParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(CSParser.CL_CUR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(CSParser.INT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(FUNCTION);
			setState(197);
			((FunctionContext)_localctx).VARIABLE = match(VARIABLE);
			setState(198);
			match(OP_PAR);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(199);
				parameters();
				}
			}

			setState(202);
			match(CL_PAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(203);
				match(INT);
				ret = 'I';
				}
			}

			setState(207);
			match(OP_CUR);
			   
					int i = function_table.indexOf((((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					
					if (i >= 0)
					{
						error_list.add("ERROR ON LINE "+(((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null) +"' function is already declared!");
					} else {
						function_table.add((((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					}
					System.out.println(".method public static "+(((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret); 
					argments =  "";
					ret = 'V';
				
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				statement();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONSOLE) | (1L << CONTINUE) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << VARIABLE))) != 0) );
			setState(214);
			match(CL_CUR);
			   
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Token VARIABLE;
		public List<TerminalNode> VARIABLE() { return getTokens(CSParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(CSParser.VARIABLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
			 
					symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
					symbol_table_warning.add(false);
					type_table.add('i');
					argments += "I";
				
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
				 
						symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
						symbol_table_warning.add(false);
						type_table.add('i');
						argments += "I";
					
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext exp1;
		public Token op;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CSParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CSParser.NE, 0); }
		public TerminalNode GT() { return getToken(CSParser.GT, 0); }
		public TerminalNode GE() { return getToken(CSParser.GE, 0); }
		public TerminalNode LT() { return getToken(CSParser.LT, 0); }
		public TerminalNode LE() { return getToken(CSParser.LE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((ComparisonContext)_localctx).exp1 = expression();
			setState(228);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			((ComparisonContext)_localctx).exp2 = expression();
			   
			        if (((ComparisonContext)_localctx).exp1.type == 'i' && ((ComparisonContext)_localctx).exp2.type == 'i') 
					{
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQ) 
						{ 
							comp_op = "if_icmpne"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == NE) 
						{
							comp_op = "if_icmpeq"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GT) 
						{ 
							comp_op = "if_icmple"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GE) 
						{ 
							comp_op = "if_icmplt"; 
						}
			               
						if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LT) 
						{ 
							comp_op = "if_icmpge";
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LE) 
						{ 
							comp_op = "if_icmpgt"; 
						}
						
			        } else{
			            error_list.add("ERROR ON LINE "+(((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getLine():0)+ ": mixed types ");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CSParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CSParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((ExpressionContext)_localctx).t1 = term();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(233);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				((ExpressionContext)_localctx).t2 = term();
				   
				        if (((ExpressionContext)_localctx).t2.type == 'i')
						{
				            emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "isub", -1);
				        } else {
				            error_list.add("ERROR ON LINE "+ (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + ": mixed types");
				        }
				    
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			    
					((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type; 
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CSParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CSParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(CSParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(CSParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(CSParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(CSParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((TermContext)_localctx).f1 = factor();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) {
				{
				{
				setState(245);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				((TermContext)_localctx).f2 = factor();
				   
				        if (((TermContext)_localctx).f2.type == 'i')
						{
				            emit(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "    imul" : (((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0)  == OVER) ? "    idiv" : "    irem"), -1); 
				        } else {
				            error_list.add("ERROR ON LINE "+ (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + ": mixed types");
				        }  
				    
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			   
					((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type; 
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public char type;
		public Token NUMBER;
		public ExpressionContext exp;
		public Token VARIABLE;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(CSParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(CSParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(CSParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(CSParser.VARIABLE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CSParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(CSParser.LENGTH, 0); }
		public TerminalNode OP_BRT() { return getToken(CSParser.OP_BRT, 0); }
		public TerminalNode CL_BRT() { return getToken(CSParser.CL_BRT, 0); }
		public TerminalNode READINT() { return getToken(CSParser.READINT, 0); }
		public TerminalNode STRING() { return getToken(CSParser.STRING, 0); }
		public TerminalNode READSTRING() { return getToken(CSParser.READSTRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSListener ) ((CSListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				   
						emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1); ((FactorContext)_localctx).type =  'i';
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(OP_PAR);
				setState(259);
				((FactorContext)_localctx).exp = expression();
				setState(260);
				match(CL_PAR);
				 
							((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp.type; 
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(264);
				match(OP_PAR);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READINT) | (1L << READSTRING) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0)) {
					{
					setState(265);
					arguments();
					ret = 'I';
					}
				}

				setState(270);
				match(CL_PAR);

							int i = function_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
							
							if (i >= 0) 
							{
								emit("invokestatic Test/"+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret,0);
							}else {
								error_list.add("Invalid function on line: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+". Signiature: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
							}
							((FactorContext)_localctx).type =  'i';
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(273);
				match(DOT);
				setState(274);
				match(LENGTH);

							int i = symbol_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null));
							
							if (i >= 0)
							{
								symbol_table_warning.set(i, true);
								
								if (type_table.get(i) == 'v') 
								{ 
									emit("aload "+i, +1); 
									emit("invokevirtual Array/length()I", 0);
									((FactorContext)_localctx).type =  'i';
								} else {
									error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not an array!");
								}
							} else { 
								error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not declared!");
							}
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(277);
				match(OP_BRT);

							int i = symbol_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null));
							
							if (i >= 0)
							{
								symbol_table_warning.set(i, true);
								
								if (type_table.get(i) == 'v') 
								{ 
									emit("aload "+i, +1); 
									((FactorContext)_localctx).type =  'i';
								} else {
									error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not an array!");
								}
							} else {
								error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not declared!");
							}
						
				setState(279);
				expression();
				setState(280);
				match(CL_BRT);

							emit("invokevirtual Array/get(I)I", -1);
						
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);

							int i = symbol_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null));
							
							if (i >= 0) 
							{
								symbol_table_warning.set(i, true);
								
								if (type_table.get(i) == 'i') 
								{ 
									emit("iload "+i, +1); ((FactorContext)_localctx).type =  'i'; 
								}
								
								if (type_table.get(i) == 'a') 
								{ 
									emit("aload "+i, +1); ((FactorContext)_localctx).type =  'a';
								}
								
								if (type_table.get(i) == 'v') 
								{ 
									emit("aload "+i, +1); 
								    emit("invokevirtual Array/string()Ljava/lang/String;", 0);
									((FactorContext)_localctx).type =  'a';
								}
							} else { 
								error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not declared!");
								((FactorContext)_localctx).type =  'i';
							}
						
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(READINT);
				setState(286);
				match(OP_PAR);
				setState(287);
				match(CL_PAR);
					
							emit("invokestatic Runtime/readInt()I", +1); ((FactorContext)_localctx).type =  'i'; 
						
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				((FactorContext)_localctx).STRING = match(STRING);
				   
							emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); ((FactorContext)_localctx).type =  'a';
						
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(READSTRING);
				setState(292);
				match(OP_PAR);
				setState(293);
				match(CL_PAR);
					
							emit("invokestatic Runtime/readString()Ljava/lang/String;", +1); ((FactorContext)_localctx).type =  'a'; 
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\ts\n\t\f\t\16"+
		"\tv\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0091\n\13\f\13\16\13\u0094\13\13\3\13\5\13\u0097\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00b7\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c2\n"+
		"\20\f\20\16\20\u00c5\13\20\3\21\3\21\3\21\3\21\5\21\u00cb\n\21\3\21\3"+
		"\21\3\21\5\21\u00d0\n\21\3\21\3\21\3\21\6\21\u00d5\n\21\r\21\16\21\u00d6"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00e1\n\22\f\22\16\22\u00e4"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00f0\n"+
		"\24\f\24\16\24\u00f3\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00fc"+
		"\n\25\f\25\16\25\u00ff\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u010f\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012a\n\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\22\27\4\2\n\n\17\17\4\2\16"+
		"\16\20\21\2\u0138\2,\3\2\2\2\4\66\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nP\3\2"+
		"\2\2\fV\3\2\2\2\16_\3\2\2\2\20h\3\2\2\2\22z\3\2\2\2\24\177\3\2\2\2\26"+
		"\u009a\3\2\2\2\30\u00ab\3\2\2\2\32\u00ae\3\2\2\2\34\u00b1\3\2\2\2\36\u00bb"+
		"\3\2\2\2 \u00c6\3\2\2\2\"\u00db\3\2\2\2$\u00e5\3\2\2\2&\u00ea\3\2\2\2"+
		"(\u00f6\3\2\2\2*\u0129\3\2\2\2,\60\b\2\1\2-/\5 \21\2.-\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\5\4\3"+
		"\2\64\65\7\2\2\3\65\3\3\2\2\2\66:\b\3\1\2\679\5\6\4\28\67\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\b\3\1\2>\5\3\2\2\2?K"+
		"\5\20\t\2@K\5\22\n\2AK\5\24\13\2BK\5\26\f\2CK\5\30\r\2DK\5\32\16\2EK\5"+
		"\n\6\2FK\5\f\7\2GK\5\16\b\2HK\5\34\17\2IK\5\b\5\2J?\3\2\2\2J@\3\2\2\2"+
		"JA\3\2\2\2JB\3\2\2\2JC\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2"+
		"JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7\"\2\2MN\5&\24\2NO\b\5\1\2O\t\3\2\2"+
		"\2PQ\7&\2\2QR\7\3\2\2RS\7\13\2\2ST\7\4\2\2TU\b\6\1\2U\13\3\2\2\2VW\7&"+
		"\2\2WX\7\b\2\2XY\7\37\2\2YZ\7\r\2\2Z[\b\7\1\2[\\\5&\24\2\\]\7\6\2\2]^"+
		"\b\7\1\2^\r\3\2\2\2_`\7&\2\2`a\7\13\2\2ab\b\b\1\2bc\5&\24\2cd\7\4\2\2"+
		"de\7\3\2\2ef\5&\24\2fg\b\b\1\2g\17\3\2\2\2hi\7\31\2\2ij\7\r\2\2jk\b\t"+
		"\1\2kl\5&\24\2lt\b\t\1\2mn\7\7\2\2no\b\t\1\2op\5&\24\2pq\b\t\1\2qs\3\2"+
		"\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\6"+
		"\2\2xy\b\t\1\2y\21\3\2\2\2z{\7&\2\2{|\7\3\2\2|}\5&\24\2}~\b\n\1\2~\23"+
		"\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\7\r\2\2\u0081\u0082\5$\23\2\u0082"+
		"\u0083\b\13\1\2\u0083\u0084\7\6\2\2\u0084\u0088\7\f\2\2\u0085\u0087\5"+
		"\6\4\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0096\7\5"+
		"\2\2\u008c\u008d\b\13\1\2\u008d\u008e\7\33\2\2\u008e\u0092\7\f\2\2\u008f"+
		"\u0091\5\6\4\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\7\5\2\2\u0096\u008c\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\13\1\2\u0099\25\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c"+
		"\b\f\1\2\u009c\u009d\7\r\2\2\u009d\u009e\5$\23\2\u009e\u009f\7\6\2\2\u009f"+
		"\u00a0\b\f\1\2\u00a0\u00a4\7\f\2\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\b\f"+
		"\1\2\u00a9\u00aa\b\f\1\2\u00aa\27\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad"+
		"\b\r\1\2\u00ad\31\3\2\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\b\16\1\2\u00b0"+
		"\33\3\2\2\2\u00b1\u00b2\7&\2\2\u00b2\u00b6\7\r\2\2\u00b3\u00b4\5\36\20"+
		"\2\u00b4\u00b5\b\17\1\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\b\17"+
		"\1\2\u00ba\35\3\2\2\2\u00bb\u00bc\5&\24\2\u00bc\u00c3\b\20\1\2\u00bd\u00be"+
		"\7\7\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\b\20\1\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\34\2\2\u00c7"+
		"\u00c8\7&\2\2\u00c8\u00ca\7\r\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\7\6\2\2\u00cd"+
		"\u00ce\7\t\2\2\u00ce\u00d0\b\21\1\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d4\b\21\1\2\u00d3"+
		"\u00d5\5\6\4\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9"+
		"\u00da\b\21\1\2\u00da!\3\2\2\2\u00db\u00dc\7&\2\2\u00dc\u00e2\b\22\1\2"+
		"\u00dd\u00de\7\7\2\2\u00de\u00df\7&\2\2\u00df\u00e1\b\22\1\2\u00e0\u00dd"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"#\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\t\2\2\2"+
		"\u00e7\u00e8\5&\24\2\u00e8\u00e9\b\23\1\2\u00e9%\3\2\2\2\u00ea\u00f1\5"+
		"(\25\2\u00eb\u00ec\t\3\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ee\b\24\1\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\b\24\1\2\u00f5\'\3\2\2\2\u00f6\u00fd\5*\26\2\u00f7\u00f8\t\4\2"+
		"\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\b\25\1\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f7\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\b\25\1\2\u0101"+
		")\3\2\2\2\u0102\u0103\7$\2\2\u0103\u012a\b\26\1\2\u0104\u0105\7\r\2\2"+
		"\u0105\u0106\5&\24\2\u0106\u0107\7\6\2\2\u0107\u0108\b\26\1\2\u0108\u012a"+
		"\3\2\2\2\u0109\u010a\7&\2\2\u010a\u010e\7\r\2\2\u010b\u010c\5\36\20\2"+
		"\u010c\u010d\b\26\1\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\6\2\2\u0111\u012a\b\26\1\2"+
		"\u0112\u0113\7&\2\2\u0113\u0114\7\b\2\2\u0114\u0115\7\36\2\2\u0115\u012a"+
		"\b\26\1\2\u0116\u0117\7&\2\2\u0117\u0118\7\13\2\2\u0118\u0119\b\26\1\2"+
		"\u0119\u011a\5&\24\2\u011a\u011b\7\4\2\2\u011b\u011c\b\26\1\2\u011c\u012a"+
		"\3\2\2\2\u011d\u011e\7&\2\2\u011e\u012a\b\26\1\2\u011f\u0120\7 \2\2\u0120"+
		"\u0121\7\r\2\2\u0121\u0122\7\6\2\2\u0122\u012a\b\26\1\2\u0123\u0124\7"+
		"%\2\2\u0124\u012a\b\26\1\2\u0125\u0126\7!\2\2\u0126\u0127\7\r\2\2\u0127"+
		"\u0128\7\6\2\2\u0128\u012a\b\26\1\2\u0129\u0102\3\2\2\2\u0129\u0104\3"+
		"\2\2\2\u0129\u0109\3\2\2\2\u0129\u0112\3\2\2\2\u0129\u0116\3\2\2\2\u0129"+
		"\u011d\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u012a+\3\2\2\2\24\60:Jt\u0088\u0092\u0096\u00a4\u00b6\u00c3\u00ca"+
		"\u00cf\u00d6\u00e2\u00f1\u00fd\u010e\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
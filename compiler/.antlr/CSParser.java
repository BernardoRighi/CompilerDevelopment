// Generated from c:\Users\dougl\Desktop\CoronaScript\CS.g by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OP_PAR=6, CL_PAR=7, OP_CUR=8, 
		CL_CUR=9, ATTRIB=10, COMMA=11, EQ=12, NE=13, GT=14, GE=15, LT=16, LE=17, 
		CONSOLE=18, READINT=19, READSTRING=20, IF=21, WHILE=22, BREAK=23, CONTINUE=24, 
		ELSE=25, NUMBER=26, VARIABLE=27, STRING=28, COMMENT=29, SPACE=30;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_console = 3, 
		RULE_st_attrib = 4, RULE_st_if = 5, RULE_st_while = 6, RULE_st_break = 7, 
		RULE_st_continue = 8, RULE_comparison = 9, RULE_expression = 10, RULE_term = 11, 
		RULE_factor = 12;
	public static final String[] ruleNames = {
		"program", "main", "statement", "st_console", "st_attrib", "st_if", "st_while", 
		"st_break", "st_continue", "comparison", "expression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'{'", "'}'", "'='", 
		"','", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'console'", "'readInt'", 
		"'readString'", "'if'", "'while'", "'break'", "'continue'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
		"OP_CUR", "CL_CUR", "ATTRIB", "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", 
		"CONSOLE", "READINT", "READSTRING", "IF", "WHILE", "BREAK", "CONTINUE", 
		"ELSE", "NUMBER", "VARIABLE", "STRING", "COMMENT", "SPACE"
	};
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
	    private static int stack_cur, stack_max;
	    private static String comp_op;
	    private static int cont_if;
	    private static int if_counter;
	    private static int while_counter;

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
	        symbol_table.add("args");
	        type_table = new ArrayList<Character>();
	        type_table.add('-');
	        symbol_table_warning = new ArrayList<Boolean>();
	        symbol_table_warning.add(true);
	        while_stack = new ArrayList<Integer>();
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
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
			    
			setState(27);
			main();
			setState(28);
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
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   
			        System.out.println(".method public static main([Ljava/lang/String;)V"); 
			    
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				statement();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARIABLE))) != 0) );
			   
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				st_console();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				st_attrib();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				st_if();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				st_while();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				st_break();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				st_continue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	}

	public final St_consoleContext st_console() throws RecognitionException {
		St_consoleContext _localctx = new St_consoleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CONSOLE);
			setState(47);
			match(OP_PAR);
			   
			            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			        
			setState(49);
			((St_consoleContext)_localctx).exp1 = expression();
			   
			            if (((St_consoleContext)_localctx).exp1.type == 'i'){
			                emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
			            } 
			            if (((St_consoleContext)_localctx).exp1.type == 'a'){
			                emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
			            }             
			        
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51);
				match(COMMA);
				   
				            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
				        
				setState(53);
				((St_consoleContext)_localctx).exp2 = expression();
				   
				            if (((St_consoleContext)_localctx).exp2.type == 'i'){
				                emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
				            } 
				            if (((St_consoleContext)_localctx).exp2.type == 'a'){
				                emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				            }  
				        
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((St_attribContext)_localctx).VARIABLE = match(VARIABLE);
			setState(65);
			match(ATTRIB);
			setState(66);
			((St_attribContext)_localctx).exp = expression();

			        
			            System.out.println("\n; types size: " + type_table.size());
			            System.out.println("\n; symbols size: " + symbol_table.size());
			            int i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
			            if (i > 0) {
			                if (type_table.get(i) == ((St_attribContext)_localctx).exp.type) {
			                    if (((St_attribContext)_localctx).exp.type == 'i') {emit("istore "+i+"\n", -1);}
			                    if (((St_attribContext)_localctx).exp.type == 'a') {emit("astore "+i+"\n", -1);}
			                } else if (type_table.get(i) == 'i' && ((St_attribContext)_localctx).exp.type == 'a') {
			                    System.err.println("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is integer ");
			                    System.exit(1);
			                } else if (type_table.get(i) == 'a' && ((St_attribContext)_localctx).exp.type == 'i') {
			                    System.err.println("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is string ");
			                    System.exit(1);
			                }
			            } else { 
			                symbol_table.add((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
			                if (((St_attribContext)_localctx).exp.type == 'i') { type_table.add('i'); }
			                if (((St_attribContext)_localctx).exp.type == 'a') { type_table.add('a'); }
			                symbol_table_warning.add(false);
			                i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
			                if (((St_attribContext)_localctx).exp.type == 'i') { emit("istore "+i+"\n", -1); }
			                if (((St_attribContext)_localctx).exp.type == 'a') { emit("astore "+i+"\n", -1); }
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
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IF);
			setState(70);
			match(OP_PAR);
			setState(71);
			comparison();
			  
			        int if_local = if_counter++;
			        boolean else_local = false;
			        emit(comp_op + " NOT_IF_"+if_local, -2);
			    
			setState(73);
			match(CL_PAR);
			setState(74);
			match(OP_CUR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(CL_CUR);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{

				        else_local = true;
				        emit("goto END_ELSE_"+if_local, 0);
				        emit("NOT_IF_"+if_local+":", 0);
				    
				setState(83);
				match(ELSE);
				setState(84);
				match(OP_CUR);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARIABLE))) != 0)) {
					{
					{
					setState(85);
					statement();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(CL_CUR);
				}
			}

			  
			        if (else_local) {
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
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WHILE);
			  
			        int while_local = while_counter++;
			        emit("BEGIN_WHILE_" + while_local + ":", 0);
			        while_stack.add(while_local);
			    
			setState(98);
			match(OP_PAR);
			setState(99);
			comparison();
			setState(100);
			match(CL_PAR);
			  
			        emit(comp_op + " END_WHILE_" + while_local, -2);
			    
			setState(102);
			match(OP_CUR);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BREAK);
			  
			        if (while_stack.size() != 0){
			            emit("goto END_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            System.err.println("Break command not in a while");  
			            System.exit(1);
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
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CONTINUE);
			  
			        if (while_stack.size() != 0){
			            emit("goto BEGIN_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            System.err.println("Continue command not in a while");  
			            System.exit(1);
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((ComparisonContext)_localctx).exp1 = expression();
			setState(120);
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
			setState(121);
			((ComparisonContext)_localctx).exp2 = expression();
			   
			            if (((ComparisonContext)_localctx).exp1.type == 'i' && ((ComparisonContext)_localctx).exp2.type == 'i') {
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQ) { comp_op = "if_icmpne"; }
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == NE) { comp_op = "if_icmpeq"; }
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GT) { comp_op = "if_icmple"; }
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GE) { comp_op = "if_icmplt"; }
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LT) { comp_op = "if_icmpge"; }
			                if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LE) { comp_op = "if_icmpgt"; }
			            } else{
			                System.err.println("ERROR ON LINE "+ (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getLine():0) +": mixed types");
			                System.exit(1);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((ExpressionContext)_localctx).t1 = term();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(125);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				((ExpressionContext)_localctx).t2 = term();
				   
				            if (((ExpressionContext)_localctx).t2.type == 'i') {
				                emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "isub", -1);
				            } else {
				                System.err.println("ERROR ON LINE "+ (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) +": mixed types");
				                System.exit(1);
				            }
				        
				}
				}
				setState(133);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((TermContext)_localctx).f1 = factor();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(137);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				((TermContext)_localctx).f2 = factor();
				   
				            if (((TermContext)_localctx).f2.type == 'i') {
				                emit(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "    imul" : (((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0)  == OVER) ? "    idiv" : "    irem"), -1); 
				            } else {
				                System.err.println("ERROR ON LINE "+ (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) +": mixed types");
				                System.exit(1);
				            }
				            
				        
				}
				}
				setState(145);
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
		public TerminalNode READINT() { return getToken(CSParser.READINT, 0); }
		public TerminalNode STRING() { return getToken(CSParser.STRING, 0); }
		public TerminalNode READSTRING() { return getToken(CSParser.READSTRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				   
				            emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1);
				            ((FactorContext)_localctx).type =  'i'; 
				        
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(OP_PAR);
				setState(151);
				((FactorContext)_localctx).exp = expression();
				setState(152);
				match(CL_PAR);

				            ((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp.type; 
				        
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				   
				            int i = symbol_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null));
				            if (i != -1) 
				            {
				                char t = type_table.get(i);
				                if (t == 'i'){
				                    symbol_table_warning.set(i,true);
				                    emit("iload " + i, 1);  
				                    ((FactorContext)_localctx).type =  'i';
				                }
				                if (t == 'a'){
				                    symbol_table_warning.set(i,true);
				                    emit("aload " + i, 1);  
				                    ((FactorContext)_localctx).type =  'a';
				                }                
				            }else{
				                System.err.println("Variable "+ (((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null) + " not declared");  
				                System.exit(1);
				            }
				        
				}
				break;
			case READINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(READINT);
				setState(158);
				match(OP_PAR);
				setState(159);
				match(CL_PAR);

				            emit("invokestatic Runtime/readInt()I", +1);
				            ((FactorContext)_localctx).type =  'i'; 
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				((FactorContext)_localctx).STRING = match(STRING);
				   
				            emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1);
				            ((FactorContext)_localctx).type =  'a';
				        
				}
				break;
			case READSTRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(READSTRING);
				setState(164);
				match(OP_PAR);
				setState(165);
				match(CL_PAR);

				            emit("invokestatic Runtime/readString()Ljava/lang/String;", 1);
				            ((FactorContext)_localctx).type =  'a';
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\6\3#\n\3\r\3\16"+
		"\3$\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\5\7_\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0084\n\f\f\f\16"+
		"\f\u0087\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0090\n\r\f\r\16\r\u0093"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00aa\n\16\3\16\2\2\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\16\23\3\2\3\4\3\2\5\7\2\u00b0\2"+
		"\34\3\2\2\2\4 \3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\nB\3\2\2\2\fG\3\2\2\2\16"+
		"b\3\2\2\2\20s\3\2\2\2\22v\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u008a\3\2"+
		"\2\2\32\u00a9\3\2\2\2\34\35\b\2\1\2\35\36\5\4\3\2\36\37\7\2\2\3\37\3\3"+
		"\2\2\2 \"\b\3\1\2!#\5\6\4\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%&\3\2\2\2&\'\b\3\1\2\'\5\3\2\2\2(/\5\b\5\2)/\5\n\6\2*/\5\f\7\2+/\5\16"+
		"\b\2,/\5\20\t\2-/\5\22\n\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3"+
		"\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61\7\24\2\2\61\62\7\b\2\2\62\63\b\5\1\2"+
		"\63\64\5\26\f\2\64<\b\5\1\2\65\66\7\r\2\2\66\67\b\5\1\2\678\5\26\f\28"+
		"9\b\5\1\29;\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2><\3\2\2\2?@\7\t\2\2@A\b\5\1\2A\t\3\2\2\2BC\7\35\2\2CD\7\f\2\2DE\5\26"+
		"\f\2EF\b\6\1\2F\13\3\2\2\2GH\7\27\2\2HI\7\b\2\2IJ\5\24\13\2JK\b\7\1\2"+
		"KL\7\t\2\2LP\7\n\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RP\3\2\2\2S^\7\13\2\2TU\b\7\1\2UV\7\33\2\2VZ\7\n\2\2WY\5\6\4"+
		"\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]_\7\13"+
		"\2\2^T\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\7\1\2a\r\3\2\2\2bc\7\30\2\2cd\b"+
		"\b\1\2de\7\b\2\2ef\5\24\13\2fg\7\t\2\2gh\b\b\1\2hl\7\n\2\2ik\5\6\4\2j"+
		"i\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\13\2\2"+
		"pq\b\b\1\2qr\b\b\1\2r\17\3\2\2\2st\7\31\2\2tu\b\t\1\2u\21\3\2\2\2vw\7"+
		"\32\2\2wx\b\n\1\2x\23\3\2\2\2yz\5\26\f\2z{\t\2\2\2{|\5\26\f\2|}\b\13\1"+
		"\2}\25\3\2\2\2~\u0085\5\30\r\2\177\u0080\t\3\2\2\u0080\u0081\5\30\r\2"+
		"\u0081\u0082\b\f\1\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\b\f\1\2\u0089\27\3\2\2\2\u008a\u0091\5\32\16"+
		"\2\u008b\u008c\t\4\2\2\u008c\u008d\5\32\16\2\u008d\u008e\b\r\1\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\b\r\1\2\u0095\31\3\2\2\2\u0096\u0097\7\34\2\2\u0097\u00aa\b\16"+
		"\1\2\u0098\u0099\7\b\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\t\2\2\u009b"+
		"\u009c\b\16\1\2\u009c\u00aa\3\2\2\2\u009d\u009e\7\35\2\2\u009e\u00aa\b"+
		"\16\1\2\u009f\u00a0\7\25\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\7\t\2\2\u00a2"+
		"\u00aa\b\16\1\2\u00a3\u00a4\7\36\2\2\u00a4\u00aa\b\16\1\2\u00a5\u00a6"+
		"\7\26\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00aa\b\16\1\2"+
		"\u00a9\u0096\3\2\2\2\u00a9\u0098\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u009f"+
		"\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\33\3\2\2\2\f$."+
		"<PZ^l\u0085\u0091\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
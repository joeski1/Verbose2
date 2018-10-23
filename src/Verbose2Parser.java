// Generated from Verbose2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Verbose2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NUMBER=29, CHARS=30, COMMENT=31, 
		WS=32;
	public static final int
		RULE_program = 0, RULE_functionDef = 1, RULE_params = 2, RULE_returnStatement = 3, 
		RULE_retBlock = 4, RULE_block = 5, RULE_statement = 6, RULE_expressionList = 7, 
		RULE_comparisonExpression = 8, RULE_mathExpression = 9, RULE_primary = 10;
	public static final String[] ruleNames = {
		"program", "functionDef", "params", "returnStatement", "retBlock", "block", 
		"statement", "expressionList", "comparisonExpression", "mathExpression", 
		"primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'MY FUNCTION CALLED '", "'TAKES THESE PARAMETERS('", "')'", "'{'", 
		"'}'", "','", "'RETURN '", "';'", "'IF IT HOLDS THAT'", "'('", "'OTHERWISE {'", 
		"'MY VARIABLE CALLED'", "'WILL BIND TO THE FOLLOWING VALUE'", "'<'", "'>'", 
		"'>='", "'<='", "'=='", "'!='", "'||'", "'&&'", "'!'", "'*'", "'/'", "'+'", 
		"'-'", "'TRUE'", "'FALSE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUMBER", "CHARS", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Verbose2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Verbose2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public RetBlockContext ret;
		public RetBlockContext retBlock() {
			return getRuleContext(RetBlockContext.class,0);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				functionDef();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			((ProgramContext)_localctx).ret = retBlock();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(29);
				functionDef();
				}
				}
				setState(34);
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

	public static class FunctionDefContext extends ParserRuleContext {
		public Token name;
		public ParamsContext paras;
		public RetBlockContext retBlock() {
			return getRuleContext(RetBlockContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(Verbose2Parser.CHARS, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			((FunctionDefContext)_localctx).name = match(CHARS);
			setState(37);
			match(T__1);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(38);
				((FunctionDefContext)_localctx).paras = params();
				}
			}

			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(43);
			retBlock();
			setState(44);
			match(T__4);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(Verbose2Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Verbose2Parser.CHARS, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(CHARS);
					setState(47);
					match(T__5);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(53);
			match(CHARS);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ComparisonExpressionContext expr;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__6);
			setState(56);
			((ReturnStatementContext)_localctx).expr = comparisonExpression(0);
			setState(57);
			match(T__7);
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

	public static class RetBlockContext extends ParserRuleContext {
		public ReturnStatementContext ret;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RetBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterRetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitRetBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitRetBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetBlockContext retBlock() throws RecognitionException {
		RetBlockContext _localctx = new RetBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_retBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			block();
			setState(60);
			((RetBlockContext)_localctx).ret = returnStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << CHARS))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalStatementContext extends StatementContext {
		public ComparisonExpressionContext comp;
		public BlockContext b1;
		public BlockContext b2;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public Token key;
		public MathExpressionContext expr;
		public TerminalNode CHARS() { return getToken(Verbose2Parser.CHARS, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompStatementContext extends StatementContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public CompStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterCompStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitCompStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitCompStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__21:
			case T__26:
			case T__27:
			case NUMBER:
			case CHARS:
				_localctx = new CompStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				comparisonExpression(0);
				setState(69);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(T__9);
				setState(73);
				((ConditionalStatementContext)_localctx).comp = comparisonExpression(0);
				setState(74);
				match(T__2);
				setState(75);
				match(T__3);
				setState(76);
				((ConditionalStatementContext)_localctx).b1 = block();
				setState(77);
				match(T__4);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(78);
					match(T__10);
					setState(79);
					((ConditionalStatementContext)_localctx).b2 = block();
					setState(80);
					match(T__4);
					}
				}

				}
				break;
			case T__11:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__11);
				setState(85);
				((AssignmentStatementContext)_localctx).key = match(CHARS);
				setState(86);
				match(T__12);
				setState(87);
				((AssignmentStatementContext)_localctx).expr = mathExpression(0);
				setState(88);
				match(T__7);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			comparisonExpression(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				match(T__5);
				setState(94);
				comparisonExpression(0);
				}
				}
				setState(99);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompNotContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext expr;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public CompNotContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterCompNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitCompNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitCompNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompMathExprContext extends ComparisonExpressionContext {
		public MathExpressionContext expr;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public CompMathExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterCompMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitCompMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitCompMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompLogicalContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext left;
		public Token op;
		public ComparisonExpressionContext right;
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public CompLogicalContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterCompLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitCompLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitCompLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompCompContext extends ComparisonExpressionContext {
		public MathExpressionContext left;
		public Token op;
		public MathExpressionContext right;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public CompCompContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterCompComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitCompComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitCompComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketCompContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext expr;
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public BracketCompContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterBracketComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitBracketComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitBracketComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_comparisonExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BracketCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				match(T__9);
				setState(102);
				((BracketCompContext)_localctx).expr = comparisonExpression(0);
				setState(103);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new CompCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((CompCompContext)_localctx).left = mathExpression(0);
				setState(106);
				((CompCompContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
					((CompCompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				((CompCompContext)_localctx).right = mathExpression(0);
				}
				break;
			case 3:
				{
				_localctx = new CompNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__21);
				setState(110);
				((CompNotContext)_localctx).expr = comparisonExpression(2);
				}
				break;
			case 4:
				{
				_localctx = new CompMathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				((CompMathExprContext)_localctx).expr = mathExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompLogicalContext(new ComparisonExpressionContext(_parentctx, _parentState));
					((CompLogicalContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
					setState(114);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(115);
					((CompLogicalContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
						((CompLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(116);
					((CompLogicalContext)_localctx).right = comparisonExpression(4);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	 
		public MathExpressionContext() { }
		public void copyFrom(MathExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpExprContext extends MathExpressionContext {
		public MathExpressionContext left;
		public Token op;
		public MathExpressionContext right;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public OpExprContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends MathExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends MathExpressionContext {
		public Token name;
		public ExpressionListContext exprList;
		public TerminalNode CHARS() { return getToken(Verbose2Parser.CHARS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends MathExpressionContext {
		public MathExpressionContext expr;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ParenExprContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_mathExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(T__9);
				setState(124);
				((ParenExprContext)_localctx).expr = mathExpression(0);
				setState(125);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				((FunctionCallContext)_localctx).name = match(CHARS);
				setState(128);
				match(T__9);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << CHARS))) != 0)) {
					{
					setState(129);
					((FunctionCallContext)_localctx).exprList = expressionList();
					}
				}

				setState(132);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new MathExpressionContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((OpExprContext)_localctx).right = mathExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new MathExpressionContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						((OpExprContext)_localctx).right = mathExpression(5);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryStringContext extends PrimaryContext {
		public TerminalNode CHARS() { return getToken(Verbose2Parser.CHARS, 0); }
		public PrimaryStringContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterPrimaryString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitPrimaryString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitPrimaryString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryBooleanContext extends PrimaryContext {
		public PrimaryBooleanContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterPrimaryBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitPrimaryBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitPrimaryBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryNumberContext extends PrimaryContext {
		public TerminalNode NUMBER() { return getToken(Verbose2Parser.NUMBER, 0); }
		public PrimaryNumberContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).enterPrimaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Verbose2Listener ) ((Verbose2Listener)listener).exitPrimaryNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Verbose2Visitor ) return ((Verbose2Visitor<? extends T>)visitor).visitPrimaryNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
				_localctx = new PrimaryBooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CHARS:
				_localctx = new PrimaryStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(CHARS);
				}
				break;
			case NUMBER:
				_localctx = new PrimaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(NUMBER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 9:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\7\2!\n\2\f\2\16\2"+
		"$\13\2\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7B\n\7\f\7"+
		"\16\7E\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bU\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\7\tb\n\t\f\t\16\t"+
		"e\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\n\3"+
		"\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0085\n\13\3\13\3\13\5\13\u0089\n\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0091\n\13\f\13\16\13\u0094\13\13\3\f\3\f\3\f\5\f\u0099\n\f\3"+
		"\f\2\4\22\24\r\2\4\6\b\n\f\16\20\22\24\26\2\7\3\2\20\25\3\2\26\27\3\2"+
		"\31\32\3\2\33\34\3\2\35\36\2\u00a3\2\33\3\2\2\2\4%\3\2\2\2\6\64\3\2\2"+
		"\2\b9\3\2\2\2\n=\3\2\2\2\fC\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22r\3\2\2"+
		"\2\24\u0088\3\2\2\2\26\u0098\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\""+
		"\5\n\6\2\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3"+
		"\2\2\2$\"\3\2\2\2%&\7\3\2\2&\'\7 \2\2\')\7\4\2\2(*\5\6\4\2)(\3\2\2\2)"+
		"*\3\2\2\2*+\3\2\2\2+,\7\5\2\2,-\7\6\2\2-.\5\n\6\2./\7\7\2\2/\5\3\2\2\2"+
		"\60\61\7 \2\2\61\63\7\b\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7 \2\28\7\3\2\2\29:\7\t"+
		"\2\2:;\5\22\n\2;<\7\n\2\2<\t\3\2\2\2=>\5\f\7\2>?\5\b\5\2?\13\3\2\2\2@"+
		"B\5\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EC\3\2\2"+
		"\2FG\5\22\n\2GH\7\n\2\2H]\3\2\2\2IJ\7\13\2\2JK\7\f\2\2KL\5\22\n\2LM\7"+
		"\5\2\2MN\7\6\2\2NO\5\f\7\2OT\7\7\2\2PQ\7\r\2\2QR\5\f\7\2RS\7\7\2\2SU\3"+
		"\2\2\2TP\3\2\2\2TU\3\2\2\2U]\3\2\2\2VW\7\16\2\2WX\7 \2\2XY\7\17\2\2YZ"+
		"\5\24\13\2Z[\7\n\2\2[]\3\2\2\2\\F\3\2\2\2\\I\3\2\2\2\\V\3\2\2\2]\17\3"+
		"\2\2\2^c\5\22\n\2_`\7\b\2\2`b\5\22\n\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2c"+
		"d\3\2\2\2d\21\3\2\2\2ec\3\2\2\2fg\b\n\1\2gh\7\f\2\2hi\5\22\n\2ij\7\5\2"+
		"\2js\3\2\2\2kl\5\24\13\2lm\t\2\2\2mn\5\24\13\2ns\3\2\2\2op\7\30\2\2ps"+
		"\5\22\n\4qs\5\24\13\2rf\3\2\2\2rk\3\2\2\2ro\3\2\2\2rq\3\2\2\2sy\3\2\2"+
		"\2tu\f\5\2\2uv\t\3\2\2vx\5\22\n\6wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z\23\3\2\2\2{y\3\2\2\2|}\b\13\1\2}~\7\f\2\2~\177\5\24\13\2\177\u0080"+
		"\7\5\2\2\u0080\u0089\3\2\2\2\u0081\u0082\7 \2\2\u0082\u0084\7\f\2\2\u0083"+
		"\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0089\7\5\2\2\u0087\u0089\5\26\f\2\u0088|\3\2\2\2\u0088\u0081"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u0092\3\2\2\2\u008a\u008b\f\7\2\2\u008b"+
		"\u008c\t\4\2\2\u008c\u0091\5\24\13\b\u008d\u008e\f\6\2\2\u008e\u008f\t"+
		"\5\2\2\u008f\u0091\5\24\13\7\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0099\t\6\2\2\u0096\u0099\7 \2\2\u0097\u0099"+
		"\7\37\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2"+
		"\u0099\27\3\2\2\2\21\33\")\64CT\\cry\u0084\u0088\u0090\u0092\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
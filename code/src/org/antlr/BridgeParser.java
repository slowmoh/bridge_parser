// Generated from /home/ben/Workspaces/ANTLR_IntelliJ/BParser/Bridge.g4 by ANTLR 4.5.1
package org.antlr;

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BridgeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OTHER=8, ID=9, 
		INT=10, TAB=11;
	public static final int
		RULE_prog = 0, RULE_token = 1, RULE_ref = 2, RULE_island = 3, RULE_water = 4, 
		RULE_lbrace = 5, RULE_rbrace = 6, RULE_lparenthesis = 7, RULE_rparenthesis = 8, 
		RULE_semicolon = 9, RULE_newline = 10;
	public static final String[] ruleNames = {
		"prog", "token", "ref", "island", "water", "lbrace", "rbrace", "lparenthesis", 
		"rparenthesis", "semicolon", "newline"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "';'", "'\r'", "'\n'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "OTHER", "ID", "INT", 
		"TAB"
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
	public String getGrammarFileName() { return "Bridge.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	 public static HashMap<String, String> islandMap = new HashMap<String, String>(){{
	        put("SOF", "EOF");
	        put("{", "}");
	        put("(", ")");
	    }};

	    public static HashMap<String, String> repairMap = new HashMap<String, String>(){{
	                put("{", "}");
	                put("(", ")");
	                put("}", "{");
	                put(")", "(");
	    }};

	    public static HashMap<String, String> refMap = new HashMap<String, String>(){{
	       put("TAB", "TAB");
	    }};

	    public static boolean matchBridges(String a, String b, int apos, int bpos){
	        return (a.equals(b) && apos == bpos);
	    }
	    public static boolean matchBrace(String a, String b, int apos, int bpos){ return (a.equals(b) && apos==bpos); }
	    public static boolean machtParenthesis(String a, String b,int apos, int bpos){ return (a.equals(b) && apos==bpos);}


	public BridgeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BridgeParser.EOF, 0); }
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OTHER) | (1L << ID) | (1L << INT) | (1L << TAB))) != 0)) {
				{
				{
				setState(22);
				token();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TokenContext extends ParserRuleContext {
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public IslandContext island() {
			return getRuleContext(IslandContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_token);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case T__4:
			case OTHER:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				water();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				island();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				ref();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				newline();
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(BridgeParser.TAB, 0); }
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TAB);
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

	public static class IslandContext extends ParserRuleContext {
		public LbraceContext lbrace() {
			return getRuleContext(LbraceContext.class,0);
		}
		public RbraceContext rbrace() {
			return getRuleContext(RbraceContext.class,0);
		}
		public LparenthesisContext lparenthesis() {
			return getRuleContext(LparenthesisContext.class,0);
		}
		public RparenthesisContext rparenthesis() {
			return getRuleContext(RparenthesisContext.class,0);
		}
		public IslandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_island; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterIsland(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitIsland(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitIsland(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IslandContext island() throws RecognitionException {
		IslandContext _localctx = new IslandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_island);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				lbrace();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				rbrace();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				lparenthesis();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				rparenthesis();
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

	public static class WaterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BridgeParser.ID, 0); }
		public TerminalNode INT() { return getToken(BridgeParser.INT, 0); }
		public TerminalNode OTHER() { return getToken(BridgeParser.OTHER, 0); }
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_water);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(INT);
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(OTHER);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				semicolon();
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

	public static class LbraceContext extends ParserRuleContext {
		public LbraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterLbrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitLbrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitLbrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbraceContext lbrace() throws RecognitionException {
		LbraceContext _localctx = new LbraceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lbrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
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

	public static class RbraceContext extends ParserRuleContext {
		public RbraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterRbrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitRbrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitRbrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbraceContext rbrace() throws RecognitionException {
		RbraceContext _localctx = new RbraceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rbrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
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

	public static class LparenthesisContext extends ParserRuleContext {
		public LparenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterLparenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitLparenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitLparenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LparenthesisContext lparenthesis() throws RecognitionException {
		LparenthesisContext _localctx = new LparenthesisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lparenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
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

	public static class RparenthesisContext extends ParserRuleContext {
		public RparenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterRparenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitRparenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitRparenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenthesisContext rparenthesis() throws RecognitionException {
		RparenthesisContext _localctx = new RparenthesisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rparenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BridgeListener ) ((BridgeListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BridgeVisitor ) return ((BridgeVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(60);
				match(T__5);
				}
			}

			setState(63);
			match(T__6);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rD\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\f@\n\f\3\f\3\f\3\f\2\2\r\2\4"+
		"\6\b\n\f\16\20\22\24\26\2\2C\2\33\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b,\3\2"+
		"\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\208\3\2\2\2\22:\3\2\2\2\24"+
		"<\3\2\2\2\26?\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3"+
		"\3\2\2\2 %\5\n\6\2!%\5\b\5\2\"%\5\6\4\2#%\5\26\f\2$ \3\2\2\2$!\3\2\2\2"+
		"$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\r\2\2\'\7\3\2\2\2(-\5\f\7\2)-\5"+
		"\16\b\2*-\5\20\t\2+-\5\22\n\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2"+
		"-\t\3\2\2\2.\63\7\13\2\2/\63\7\f\2\2\60\63\7\n\2\2\61\63\5\24\13\2\62"+
		".\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\13\3\2\2\2\64\65"+
		"\7\3\2\2\65\r\3\2\2\2\66\67\7\4\2\2\67\17\3\2\2\289\7\5\2\29\21\3\2\2"+
		"\2:;\7\6\2\2;\23\3\2\2\2<=\7\7\2\2=\25\3\2\2\2>@\7\b\2\2?>\3\2\2\2?@\3"+
		"\2\2\2@A\3\2\2\2AB\7\t\2\2B\27\3\2\2\2\7\33$,\62?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:/Users/8760659/Desenvolvimento/arara/grammar/Arara.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AraraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, INT=16, STRING=17, 
		OPSUM=18, OPMULT=19, OPCOMP=20, OPLOG=21, WS=22;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_atribuicao = 2, RULE_condicional = 3, 
		RULE_repeticao = 4, RULE_bloco = 5, RULE_expressao = 6, RULE_logica = 7, 
		RULE_comparacao = 8, RULE_soma = 9, RULE_termo = 10, RULE_fator = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "atribuicao", "condicional", "repeticao", "bloco", 
			"expressao", "logica", "comparacao", "soma", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'leia'", "'('", "')'", "';'", "'escreva'", "'<-'", "'se'", "'entao'", 
			"'senao'", "'fimse'", "'enquanto'", "'faca'", "'fimenquanto'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "INT", "STRING", "OPSUM", "OPMULT", "OPCOMP", 
			"OPLOG", "WS"
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
	public String getGrammarFileName() { return "Arara.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AraraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AraraParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34978L) != 0)) {
				{
				{
				setState(24);
				comando();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AraraParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(T__1);
				setState(34);
				match(ID);
				setState(35);
				match(T__2);
				setState(36);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__4);
				setState(38);
				match(T__1);
				setState(39);
				expressao();
				setState(40);
				match(T__2);
				setState(41);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				atribuicao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				condicional();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				repeticao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AraraParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(T__5);
			setState(50);
			expressao();
			setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public BlocoContext blocosenao;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__6);
			setState(54);
			expressao();
			setState(55);
			match(T__7);
			setState(56);
			bloco();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(57);
				match(T__8);
				setState(58);
				((CondicionalContext)_localctx).blocosenao = bloco();
				}
			}

			setState(61);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			expressao();
			setState(65);
			match(T__11);
			setState(66);
			bloco();
			setState(67);
			match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34978L) != 0)) {
				{
				{
				setState(69);
				comando();
				}
				}
				setState(74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicaContext extends ParserRuleContext {
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public List<TerminalNode> OPLOG() { return getTokens(AraraParser.OPLOG); }
		public TerminalNode OPLOG(int i) {
			return getToken(AraraParser.OPLOG, i);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			comparacao();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPLOG) {
				{
				{
				setState(78);
				match(OPLOG);
				setState(79);
				comparacao();
				}
				}
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ParserRuleContext {
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public TerminalNode OPCOMP() { return getToken(AraraParser.OPCOMP, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			soma();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPCOMP) {
				{
				setState(86);
				match(OPCOMP);
				setState(87);
				soma();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SomaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OPSUM() { return getTokens(AraraParser.OPSUM); }
		public TerminalNode OPSUM(int i) {
			return getToken(AraraParser.OPSUM, i);
		}
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			termo();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPSUM) {
				{
				{
				setState(91);
				match(OPSUM);
				setState(92);
				termo();
				}
				}
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OPMULT() { return getTokens(AraraParser.OPMULT); }
		public TerminalNode OPMULT(int i) {
			return getToken(AraraParser.OPMULT, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			fator();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMULT) {
				{
				{
				setState(99);
				match(OPMULT);
				setState(100);
				fator();
				}
				}
				setState(105);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode INT() { return getToken(AraraParser.INT, 0); }
		public TerminalNode STRING() { return getToken(AraraParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AraraParser.ID, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fator);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__13);
				setState(107);
				fator();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__1);
				setState(109);
				expressao();
				setState(110);
				match(T__2);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(ID);
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
		"\u0004\u0001\u0016v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005"+
		"J\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0003\bY\b\b\u0001\t\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\ta\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\nf\b\n\n\n\f\ni\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bt\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000x\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000"+
		"\u0000\u00065\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nH\u0001"+
		"\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eM\u0001\u0000\u0000"+
		"\u0000\u0010U\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014"+
		"b\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u0002\u0000\u0000"+
		"\"#\u0005\u000f\u0000\u0000#$\u0005\u0003\u0000\u0000$/\u0005\u0004\u0000"+
		"\u0000%&\u0005\u0005\u0000\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\f"+
		"\u0006\u0000()\u0005\u0003\u0000\u0000)*\u0005\u0004\u0000\u0000*/\u0001"+
		"\u0000\u0000\u0000+/\u0003\u0004\u0002\u0000,/\u0003\u0006\u0003\u0000"+
		"-/\u0003\b\u0004\u0000. \u0001\u0000\u0000\u0000.%\u0001\u0000\u0000\u0000"+
		".+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/\u0003\u0001\u0000\u0000\u000001\u0005\u000f\u0000\u000012\u0005"+
		"\u0006\u0000\u000023\u0003\f\u0006\u000034\u0005\u0004\u0000\u00004\u0005"+
		"\u0001\u0000\u0000\u000056\u0005\u0007\u0000\u000067\u0003\f\u0006\u0000"+
		"78\u0005\b\u0000\u00008;\u0003\n\u0005\u00009:\u0005\t\u0000\u0000:<\u0003"+
		"\n\u0005\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0005\n\u0000\u0000>\u0007\u0001\u0000\u0000\u0000"+
		"?@\u0005\u000b\u0000\u0000@A\u0003\f\u0006\u0000AB\u0005\f\u0000\u0000"+
		"BC\u0003\n\u0005\u0000CD\u0005\r\u0000\u0000D\t\u0001\u0000\u0000\u0000"+
		"EG\u0003\u0002\u0001\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0003\u000e\u0007\u0000"+
		"L\r\u0001\u0000\u0000\u0000MR\u0003\u0010\b\u0000NO\u0005\u0015\u0000"+
		"\u0000OQ\u0003\u0010\b\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000f\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0003\u0012\t\u0000VW\u0005"+
		"\u0014\u0000\u0000WY\u0003\u0012\t\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000Z_\u0003\u0014\n\u0000"+
		"[\\\u0005\u0012\u0000\u0000\\^\u0003\u0014\n\u0000][\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u0013\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bg\u0003\u0016\u000b\u0000cd\u0005\u0013\u0000\u0000df\u0003\u0016\u000b"+
		"\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0015\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0005\u000e\u0000\u0000kt\u0003\u0016\u000b"+
		"\u0000lm\u0005\u0002\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\u0003\u0000"+
		"\u0000ot\u0001\u0000\u0000\u0000pt\u0005\u0010\u0000\u0000qt\u0005\u0011"+
		"\u0000\u0000rt\u0005\u000f\u0000\u0000sj\u0001\u0000\u0000\u0000sl\u0001"+
		"\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000t\u0017\u0001\u0000\u0000\u0000\t\u001b.;HR"+
		"X_gs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
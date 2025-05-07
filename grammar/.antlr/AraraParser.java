// Generated from c:/Users/8760659/compiladores/grammar/Arara.g4 by ANTLR 4.13.1
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
		RULE_cond_opc = 4, RULE_repeticao = 5, RULE_bloco = 6, RULE_expressao = 7, 
		RULE_logica = 8, RULE_logica_suf = 9, RULE_comparacao = 10, RULE_comparacao_suf = 11, 
		RULE_soma = 12, RULE_soma_suf = 13, RULE_termo = 14, RULE_termo_suf = 15, 
		RULE_fator = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "atribuicao", "condicional", "cond_opc", "repeticao", 
			"bloco", "expressao", "logica", "logica_suf", "comparacao", "comparacao_suf", 
			"soma", "soma_suf", "termo", "termo_suf", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'leia'", "'('", "')'", "';'", "'escreva'", "'<-'", "'se'", "'entao'", 
			"'fimse'", "'senao'", "'enquanto'", "'faca'", "'fimenquanto'", "'!'"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34978L) != 0)) {
				{
				{
				setState(34);
				comando();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				setState(43);
				match(T__1);
				setState(44);
				match(ID);
				setState(45);
				match(T__2);
				setState(46);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__4);
				setState(48);
				match(T__1);
				setState(49);
				expressao();
				setState(50);
				match(T__2);
				setState(51);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				atribuicao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				condicional();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
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
			setState(58);
			match(ID);
			setState(59);
			match(T__5);
			setState(60);
			expressao();
			setState(61);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Cond_opcContext cond_opc() {
			return getRuleContext(Cond_opcContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__6);
			setState(64);
			expressao();
			setState(65);
			match(T__7);
			setState(66);
			bloco();
			setState(67);
			cond_opc();
			setState(68);
			match(T__8);
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
	public static class Cond_opcContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Cond_opcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_opc; }
	}

	public final Cond_opcContext cond_opc() throws RecognitionException {
		Cond_opcContext _localctx = new Cond_opcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond_opc);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__9);
				setState(71);
				condicional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__9);
				setState(73);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		enterRule(_localctx, 10, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__10);
			setState(78);
			expressao();
			setState(79);
			match(T__11);
			setState(80);
			bloco();
			setState(81);
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
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34978L) != 0)) {
				{
				{
				setState(83);
				comando();
				}
				}
				setState(88);
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
		enterRule(_localctx, 14, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public Logica_sufContext logica_suf() {
			return getRuleContext(Logica_sufContext.class,0);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			comparacao();
			setState(92);
			logica_suf();
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
	public static class Logica_sufContext extends ParserRuleContext {
		public TerminalNode OPLOG() { return getToken(AraraParser.OPLOG, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public Logica_sufContext logica_suf() {
			return getRuleContext(Logica_sufContext.class,0);
		}
		public Logica_sufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica_suf; }
	}

	public final Logica_sufContext logica_suf() throws RecognitionException {
		Logica_sufContext _localctx = new Logica_sufContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logica_suf);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPLOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(OPLOG);
				setState(95);
				comparacao();
				setState(96);
				logica_suf();
				}
				break;
			case T__2:
			case T__3:
			case T__7:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ComparacaoContext extends ParserRuleContext {
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public Comparacao_sufContext comparacao_suf() {
			return getRuleContext(Comparacao_sufContext.class,0);
		}
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			soma();
			setState(102);
			comparacao_suf();
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
	public static class Comparacao_sufContext extends ParserRuleContext {
		public TerminalNode OPCOMP() { return getToken(AraraParser.OPCOMP, 0); }
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public Comparacao_sufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao_suf; }
	}

	public final Comparacao_sufContext comparacao_suf() throws RecognitionException {
		Comparacao_sufContext _localctx = new Comparacao_sufContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparacao_suf);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCOMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(OPCOMP);
				setState(105);
				soma();
				}
				break;
			case T__2:
			case T__3:
			case T__7:
			case T__11:
			case OPLOG:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class SomaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Soma_sufContext soma_suf() {
			return getRuleContext(Soma_sufContext.class,0);
		}
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			termo();
			setState(110);
			soma_suf();
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
	public static class Soma_sufContext extends ParserRuleContext {
		public TerminalNode OPSUM() { return getToken(AraraParser.OPSUM, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Soma_sufContext soma_suf() {
			return getRuleContext(Soma_sufContext.class,0);
		}
		public Soma_sufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma_suf; }
	}

	public final Soma_sufContext soma_suf() throws RecognitionException {
		Soma_sufContext _localctx = new Soma_sufContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_soma_suf);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPSUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(OPSUM);
				setState(113);
				termo();
				setState(114);
				soma_suf();
				}
				break;
			case T__2:
			case T__3:
			case T__7:
			case T__11:
			case OPCOMP:
			case OPLOG:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Termo_sufContext termo_suf() {
			return getRuleContext(Termo_sufContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			fator();
			setState(120);
			termo_suf();
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
	public static class Termo_sufContext extends ParserRuleContext {
		public TerminalNode OPMULT() { return getToken(AraraParser.OPMULT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Termo_sufContext termo_suf() {
			return getRuleContext(Termo_sufContext.class,0);
		}
		public Termo_sufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_suf; }
	}

	public final Termo_sufContext termo_suf() throws RecognitionException {
		Termo_sufContext _localctx = new Termo_sufContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo_suf);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(OPMULT);
				setState(123);
				fator();
				setState(124);
				termo_suf();
				}
				break;
			case T__2:
			case T__3:
			case T__7:
			case T__11:
			case OPSUM:
			case OPCOMP:
			case OPLOG:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__13);
				setState(130);
				fator();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__1);
				setState(132);
				expressao();
				setState(133);
				match(T__2);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
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
		"\u0004\u0001\u0016\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006U\b\u0006\n\u0006"+
		"\f\u0006X\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\td\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bl\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rv\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0080\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u008b\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0000\u008b\u0000%\u0001\u0000\u0000\u0000\u00028\u0001\u0000"+
		"\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000"+
		"\bK\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fV\u0001\u0000"+
		"\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000"+
		"\u0012c\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016k"+
		"\u0001\u0000\u0000\u0000\u0018m\u0001\u0000\u0000\u0000\u001au\u0001\u0000"+
		"\u0000\u0000\u001cw\u0001\u0000\u0000\u0000\u001e\u007f\u0001\u0000\u0000"+
		"\u0000 \u008a\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001"+
		"\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u000f\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000.9\u0005\u0004\u0000\u0000/0\u0005\u0005\u0000"+
		"\u000001\u0005\u0002\u0000\u000012\u0003\u000e\u0007\u000023\u0005\u0003"+
		"\u0000\u000034\u0005\u0004\u0000\u000049\u0001\u0000\u0000\u000059\u0003"+
		"\u0004\u0002\u000069\u0003\u0006\u0003\u000079\u0003\n\u0005\u00008*\u0001"+
		"\u0000\u0000\u00008/\u0001\u0000\u0000\u000085\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0003\u0001\u0000"+
		"\u0000\u0000:;\u0005\u000f\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u0003"+
		"\u000e\u0007\u0000=>\u0005\u0004\u0000\u0000>\u0005\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0007\u0000\u0000@A\u0003\u000e\u0007\u0000AB\u0005\b\u0000"+
		"\u0000BC\u0003\f\u0006\u0000CD\u0003\b\u0004\u0000DE\u0005\t\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FG\u0005\n\u0000\u0000GL\u0003\u0006\u0003"+
		"\u0000HI\u0005\n\u0000\u0000IL\u0003\f\u0006\u0000JL\u0001\u0000\u0000"+
		"\u0000KF\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\u000b\u0000\u0000NO\u0003"+
		"\u000e\u0007\u0000OP\u0005\f\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005"+
		"\r\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SU\u0003\u0002\u0001\u0000"+
		"TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000YZ\u0003\u0010\b\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0003"+
		"\u0014\n\u0000\\]\u0003\u0012\t\u0000]\u0011\u0001\u0000\u0000\u0000^"+
		"_\u0005\u0015\u0000\u0000_`\u0003\u0014\n\u0000`a\u0003\u0012\t\u0000"+
		"ad\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000ef\u0003"+
		"\u0018\f\u0000fg\u0003\u0016\u000b\u0000g\u0015\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0014\u0000\u0000il\u0003\u0018\f\u0000jl\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0017\u0001\u0000"+
		"\u0000\u0000mn\u0003\u001c\u000e\u0000no\u0003\u001a\r\u0000o\u0019\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u0003\u001c\u000e\u0000"+
		"rs\u0003\u001a\r\u0000sv\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"up\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u001b\u0001\u0000"+
		"\u0000\u0000wx\u0003 \u0010\u0000xy\u0003\u001e\u000f\u0000y\u001d\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0013\u0000\u0000{|\u0003 \u0010\u0000|}\u0003"+
		"\u001e\u000f\u0000}\u0080\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007fz\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u001f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082"+
		"\u008b\u0003 \u0010\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u0085"+
		"\u0003\u000e\u0007\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u008b"+
		"\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u0010\u0000\u0000\u0088\u008b"+
		"\u0005\u0011\u0000\u0000\u0089\u008b\u0005\u000f\u0000\u0000\u008a\u0081"+
		"\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000\u008a\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b!\u0001\u0000\u0000\u0000\t%8KVcku\u007f"+
		"\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
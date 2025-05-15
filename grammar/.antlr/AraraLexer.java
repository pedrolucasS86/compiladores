// Generated from c:/Users/8760659/compilador_arara/grammar/Arara.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AraraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEIA=1, ESCREVA=2, SE=3, ENTAO=4, SENAO=5, FIMSE=6, ENQUANTO=7, FACA=8, 
		FIMENQ=9, LPAREN=10, RPAREN=11, SEMICOLON=12, ATRIB=13, OPSUM=14, OPMULT=15, 
		OPCOMP=16, OPLOG=17, NOT=18, STRING=19, INT=20, ID=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIMSE", "ENQUANTO", "FACA", 
			"FIMENQ", "LPAREN", "RPAREN", "SEMICOLON", "ATRIB", "OPSUM", "OPMULT", 
			"OPCOMP", "OPLOG", "NOT", "STRING", "INT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", "'fimse'", 
			"'enquanto'", "'faca'", "'fimenquanto'", "'('", "')'", "';'", "'<-'", 
			null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIMSE", "ENQUANTO", 
			"FACA", "FIMENQ", "LPAREN", "RPAREN", "SEMICOLON", "ATRIB", "OPSUM", 
			"OPMULT", "OPCOMP", "OPLOG", "NOT", "STRING", "INT", "ID", "WS"
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


	  from antlr4.error.Errors import LexerNoViableAltException


	public AraraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arara.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00a8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0081\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0087\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u008f\b\u0012\n\u0012\f\u0012\u0092"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0097\b\u0013"+
		"\u000b\u0013\f\u0013\u0098\u0001\u0014\u0001\u0014\u0005\u0014\u009d\b"+
		"\u0014\n\u0014\f\u0014\u00a0\t\u0014\u0001\u0015\u0004\u0015\u00a3\b\u0015"+
		"\u000b\u0015\f\u0015\u00a4\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000"+
		"\u0007\u0002\u0000++--\u0002\u0000**//\u0002\u0000\"\"\\\\\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00b2\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00032"+
		"\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007=\u0001\u0000"+
		"\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000"+
		"\rO\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000\u0000\u0011]\u0001"+
		"\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000"+
		"\u0000\u0017m\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001b"+
		"r\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f\u0080\u0001"+
		"\u0000\u0000\u0000!\u0086\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000"+
		"\u0000%\u008a\u0001\u0000\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000"+
		")\u009a\u0001\u0000\u0000\u0000+\u00a2\u0001\u0000\u0000\u0000-.\u0005"+
		"l\u0000\u0000./\u0005e\u0000\u0000/0\u0005i\u0000\u000001\u0005a\u0000"+
		"\u00001\u0002\u0001\u0000\u0000\u000023\u0005e\u0000\u000034\u0005s\u0000"+
		"\u000045\u0005c\u0000\u000056\u0005r\u0000\u000067\u0005e\u0000\u0000"+
		"78\u0005v\u0000\u000089\u0005a\u0000\u00009\u0004\u0001\u0000\u0000\u0000"+
		":;\u0005s\u0000\u0000;<\u0005e\u0000\u0000<\u0006\u0001\u0000\u0000\u0000"+
		"=>\u0005e\u0000\u0000>?\u0005n\u0000\u0000?@\u0005t\u0000\u0000@A\u0005"+
		"a\u0000\u0000AB\u0005o\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005"+
		"s\u0000\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000\u0000FG\u0005a\u0000"+
		"\u0000GH\u0005o\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005f\u0000"+
		"\u0000JK\u0005i\u0000\u0000KL\u0005m\u0000\u0000LM\u0005s\u0000\u0000"+
		"MN\u0005e\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0005e\u0000\u0000"+
		"PQ\u0005n\u0000\u0000QR\u0005q\u0000\u0000RS\u0005u\u0000\u0000ST\u0005"+
		"a\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000\u0000VW\u0005o\u0000"+
		"\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005a\u0000"+
		"\u0000Z[\u0005c\u0000\u0000[\\\u0005a\u0000\u0000\\\u0010\u0001\u0000"+
		"\u0000\u0000]^\u0005f\u0000\u0000^_\u0005i\u0000\u0000_`\u0005m\u0000"+
		"\u0000`a\u0005e\u0000\u0000ab\u0005n\u0000\u0000bc\u0005q\u0000\u0000"+
		"cd\u0005u\u0000\u0000de\u0005a\u0000\u0000ef\u0005n\u0000\u0000fg\u0005"+
		"t\u0000\u0000gh\u0005o\u0000\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005"+
		"(\u0000\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0005)\u0000\u0000l\u0016"+
		"\u0001\u0000\u0000\u0000mn\u0005;\u0000\u0000n\u0018\u0001\u0000\u0000"+
		"\u0000op\u0005<\u0000\u0000pq\u0005-\u0000\u0000q\u001a\u0001\u0000\u0000"+
		"\u0000rs\u0007\u0000\u0000\u0000s\u001c\u0001\u0000\u0000\u0000tu\u0007"+
		"\u0001\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005=\u0000\u0000"+
		"w\u0081\u0005=\u0000\u0000xy\u0005!\u0000\u0000y\u0081\u0005=\u0000\u0000"+
		"z\u0081\u0005<\u0000\u0000{|\u0005<\u0000\u0000|\u0081\u0005=\u0000\u0000"+
		"}\u0081\u0005>\u0000\u0000~\u007f\u0005>\u0000\u0000\u007f\u0081\u0005"+
		"=\u0000\u0000\u0080v\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000"+
		"\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080"+
		"}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081 \u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005&\u0000\u0000\u0083\u0087\u0005&\u0000"+
		"\u0000\u0084\u0085\u0005|\u0000\u0000\u0085\u0087\u0005|\u0000\u0000\u0086"+
		"\u0082\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\"\u0001\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000\u0089$\u0001"+
		"\u0000\u0000\u0000\u008a\u0090\u0005\"\u0000\u0000\u008b\u008f\b\u0002"+
		"\u0000\u0000\u008c\u008d\u0005\\\u0000\u0000\u008d\u008f\t\u0000\u0000"+
		"\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\"\u0000\u0000"+
		"\u0094&\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0003\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"(\u0001\u0000\u0000\u0000\u009a\u009e\u0007\u0004\u0000\u0000\u009b\u009d"+
		"\u0007\u0005\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f*\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0007\u0006\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0006\u0015\u0000\u0000\u00a7,\u0001\u0000"+
		"\u0000\u0000\b\u0000\u0080\u0086\u008e\u0090\u0098\u009e\u00a4\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
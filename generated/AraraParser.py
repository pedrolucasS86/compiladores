# Generated from grammar/Arara.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,22,139,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,1,0,5,0,36,8,0,10,0,12,0,39,9,0,1,
        0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,
        1,57,8,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,
        1,4,3,4,74,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,5,6,83,8,6,10,6,12,6,
        86,9,6,1,7,1,7,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,3,9,98,8,9,1,10,1,
        10,1,10,1,11,1,11,1,11,3,11,106,8,11,1,12,1,12,1,12,1,13,1,13,1,
        13,1,13,1,13,3,13,116,8,13,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,
        15,3,15,126,8,15,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,3,
        16,137,8,16,1,16,0,0,17,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,0,0,136,0,37,1,0,0,0,2,56,1,0,0,0,4,58,1,0,0,0,6,63,1,0,0,
        0,8,73,1,0,0,0,10,75,1,0,0,0,12,84,1,0,0,0,14,87,1,0,0,0,16,89,1,
        0,0,0,18,97,1,0,0,0,20,99,1,0,0,0,22,105,1,0,0,0,24,107,1,0,0,0,
        26,115,1,0,0,0,28,117,1,0,0,0,30,125,1,0,0,0,32,136,1,0,0,0,34,36,
        3,2,1,0,35,34,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,
        38,40,1,0,0,0,39,37,1,0,0,0,40,41,5,0,0,1,41,1,1,0,0,0,42,43,5,1,
        0,0,43,44,5,2,0,0,44,45,5,15,0,0,45,46,5,3,0,0,46,57,5,4,0,0,47,
        48,5,5,0,0,48,49,5,2,0,0,49,50,3,14,7,0,50,51,5,3,0,0,51,52,5,4,
        0,0,52,57,1,0,0,0,53,57,3,4,2,0,54,57,3,6,3,0,55,57,3,10,5,0,56,
        42,1,0,0,0,56,47,1,0,0,0,56,53,1,0,0,0,56,54,1,0,0,0,56,55,1,0,0,
        0,57,3,1,0,0,0,58,59,5,15,0,0,59,60,5,6,0,0,60,61,3,14,7,0,61,62,
        5,4,0,0,62,5,1,0,0,0,63,64,5,7,0,0,64,65,3,14,7,0,65,66,5,8,0,0,
        66,67,3,12,6,0,67,68,3,8,4,0,68,69,5,9,0,0,69,7,1,0,0,0,70,71,5,
        10,0,0,71,74,3,12,6,0,72,74,1,0,0,0,73,70,1,0,0,0,73,72,1,0,0,0,
        74,9,1,0,0,0,75,76,5,11,0,0,76,77,3,14,7,0,77,78,5,12,0,0,78,79,
        3,12,6,0,79,80,5,13,0,0,80,11,1,0,0,0,81,83,3,2,1,0,82,81,1,0,0,
        0,83,86,1,0,0,0,84,82,1,0,0,0,84,85,1,0,0,0,85,13,1,0,0,0,86,84,
        1,0,0,0,87,88,3,16,8,0,88,15,1,0,0,0,89,90,3,20,10,0,90,91,3,18,
        9,0,91,17,1,0,0,0,92,93,5,21,0,0,93,94,3,20,10,0,94,95,3,18,9,0,
        95,98,1,0,0,0,96,98,1,0,0,0,97,92,1,0,0,0,97,96,1,0,0,0,98,19,1,
        0,0,0,99,100,3,24,12,0,100,101,3,22,11,0,101,21,1,0,0,0,102,103,
        5,20,0,0,103,106,3,24,12,0,104,106,1,0,0,0,105,102,1,0,0,0,105,104,
        1,0,0,0,106,23,1,0,0,0,107,108,3,28,14,0,108,109,3,26,13,0,109,25,
        1,0,0,0,110,111,5,18,0,0,111,112,3,28,14,0,112,113,3,26,13,0,113,
        116,1,0,0,0,114,116,1,0,0,0,115,110,1,0,0,0,115,114,1,0,0,0,116,
        27,1,0,0,0,117,118,3,32,16,0,118,119,3,30,15,0,119,29,1,0,0,0,120,
        121,5,19,0,0,121,122,3,32,16,0,122,123,3,30,15,0,123,126,1,0,0,0,
        124,126,1,0,0,0,125,120,1,0,0,0,125,124,1,0,0,0,126,31,1,0,0,0,127,
        128,5,14,0,0,128,137,3,32,16,0,129,130,5,2,0,0,130,131,3,14,7,0,
        131,132,5,3,0,0,132,137,1,0,0,0,133,137,5,16,0,0,134,137,5,17,0,
        0,135,137,5,15,0,0,136,127,1,0,0,0,136,129,1,0,0,0,136,133,1,0,0,
        0,136,134,1,0,0,0,136,135,1,0,0,0,137,33,1,0,0,0,9,37,56,73,84,97,
        105,115,125,136
    ]

class AraraParser ( Parser ):

    grammarFileName = "Arara.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'leia'", "'('", "')'", "';'", "'escreva'", 
                     "'<-'", "'se'", "'entao'", "'fimse'", "'senao'", "'enquanto'", 
                     "'faca'", "'fimenquanto'", "'!'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "INT", 
                      "STRING", "OPSUM", "OPMULT", "OPCOMP", "OPLOG", "WS" ]

    RULE_programa = 0
    RULE_comando = 1
    RULE_atribuicao = 2
    RULE_condicional = 3
    RULE_cond_opc = 4
    RULE_repeticao = 5
    RULE_bloco = 6
    RULE_expressao = 7
    RULE_logica = 8
    RULE_logica_suf = 9
    RULE_comparacao = 10
    RULE_comparacao_suf = 11
    RULE_soma = 12
    RULE_soma_suf = 13
    RULE_termo = 14
    RULE_termo_suf = 15
    RULE_fator = 16

    ruleNames =  [ "programa", "comando", "atribuicao", "condicional", "cond_opc", 
                   "repeticao", "bloco", "expressao", "logica", "logica_suf", 
                   "comparacao", "comparacao_suf", "soma", "soma_suf", "termo", 
                   "termo_suf", "fator" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    ID=15
    INT=16
    STRING=17
    OPSUM=18
    OPMULT=19
    OPCOMP=20
    OPLOG=21
    WS=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(AraraParser.EOF, 0)

        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.ComandoContext)
            else:
                return self.getTypedRuleContext(AraraParser.ComandoContext,i)


        def getRuleIndex(self):
            return AraraParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = AraraParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34978) != 0):
                self.state = 34
                self.comando()
                self.state = 39
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 40
            self.match(AraraParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(AraraParser.ID, 0)

        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def atribuicao(self):
            return self.getTypedRuleContext(AraraParser.AtribuicaoContext,0)


        def condicional(self):
            return self.getTypedRuleContext(AraraParser.CondicionalContext,0)


        def repeticao(self):
            return self.getTypedRuleContext(AraraParser.RepeticaoContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_comando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando" ):
                listener.enterComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando" ):
                listener.exitComando(self)




    def comando(self):

        localctx = AraraParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_comando)
        try:
            self.state = 56
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 42
                self.match(AraraParser.T__0)
                self.state = 43
                self.match(AraraParser.T__1)
                self.state = 44
                self.match(AraraParser.ID)
                self.state = 45
                self.match(AraraParser.T__2)
                self.state = 46
                self.match(AraraParser.T__3)
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 47
                self.match(AraraParser.T__4)
                self.state = 48
                self.match(AraraParser.T__1)
                self.state = 49
                self.expressao()
                self.state = 50
                self.match(AraraParser.T__2)
                self.state = 51
                self.match(AraraParser.T__3)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 53
                self.atribuicao()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 54
                self.condicional()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 5)
                self.state = 55
                self.repeticao()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(AraraParser.ID, 0)

        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_atribuicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtribuicao" ):
                listener.enterAtribuicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtribuicao" ):
                listener.exitAtribuicao(self)




    def atribuicao(self):

        localctx = AraraParser.AtribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_atribuicao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.match(AraraParser.ID)
            self.state = 59
            self.match(AraraParser.T__5)
            self.state = 60
            self.expressao()
            self.state = 61
            self.match(AraraParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def bloco(self):
            return self.getTypedRuleContext(AraraParser.BlocoContext,0)


        def cond_opc(self):
            return self.getTypedRuleContext(AraraParser.Cond_opcContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_condicional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicional" ):
                listener.enterCondicional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicional" ):
                listener.exitCondicional(self)




    def condicional(self):

        localctx = AraraParser.CondicionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_condicional)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(AraraParser.T__6)
            self.state = 64
            self.expressao()
            self.state = 65
            self.match(AraraParser.T__7)
            self.state = 66
            self.bloco()
            self.state = 67
            self.cond_opc()
            self.state = 68
            self.match(AraraParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Cond_opcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def bloco(self):
            return self.getTypedRuleContext(AraraParser.BlocoContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_cond_opc

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCond_opc" ):
                listener.enterCond_opc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCond_opc" ):
                listener.exitCond_opc(self)




    def cond_opc(self):

        localctx = AraraParser.Cond_opcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_cond_opc)
        try:
            self.state = 73
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 70
                self.match(AraraParser.T__9)
                self.state = 71
                self.bloco()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RepeticaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def bloco(self):
            return self.getTypedRuleContext(AraraParser.BlocoContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_repeticao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRepeticao" ):
                listener.enterRepeticao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRepeticao" ):
                listener.exitRepeticao(self)




    def repeticao(self):

        localctx = AraraParser.RepeticaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_repeticao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self.match(AraraParser.T__10)
            self.state = 76
            self.expressao()
            self.state = 77
            self.match(AraraParser.T__11)
            self.state = 78
            self.bloco()
            self.state = 79
            self.match(AraraParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlocoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.ComandoContext)
            else:
                return self.getTypedRuleContext(AraraParser.ComandoContext,i)


        def getRuleIndex(self):
            return AraraParser.RULE_bloco

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBloco" ):
                listener.enterBloco(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBloco" ):
                listener.exitBloco(self)




    def bloco(self):

        localctx = AraraParser.BlocoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_bloco)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34978) != 0):
                self.state = 81
                self.comando()
                self.state = 86
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def logica(self):
            return self.getTypedRuleContext(AraraParser.LogicaContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_expressao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao" ):
                listener.enterExpressao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao" ):
                listener.exitExpressao(self)




    def expressao(self):

        localctx = AraraParser.ExpressaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_expressao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.logica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LogicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comparacao(self):
            return self.getTypedRuleContext(AraraParser.ComparacaoContext,0)


        def logica_suf(self):
            return self.getTypedRuleContext(AraraParser.Logica_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_logica

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLogica" ):
                listener.enterLogica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLogica" ):
                listener.exitLogica(self)




    def logica(self):

        localctx = AraraParser.LogicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_logica)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            self.comparacao()
            self.state = 90
            self.logica_suf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Logica_sufContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPLOG(self):
            return self.getToken(AraraParser.OPLOG, 0)

        def comparacao(self):
            return self.getTypedRuleContext(AraraParser.ComparacaoContext,0)


        def logica_suf(self):
            return self.getTypedRuleContext(AraraParser.Logica_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_logica_suf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLogica_suf" ):
                listener.enterLogica_suf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLogica_suf" ):
                listener.exitLogica_suf(self)




    def logica_suf(self):

        localctx = AraraParser.Logica_sufContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_logica_suf)
        try:
            self.state = 97
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [21]:
                self.enterOuterAlt(localctx, 1)
                self.state = 92
                self.match(AraraParser.OPLOG)
                self.state = 93
                self.comparacao()
                self.state = 94
                self.logica_suf()
                pass
            elif token in [3, 4, 8, 12]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComparacaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def soma(self):
            return self.getTypedRuleContext(AraraParser.SomaContext,0)


        def comparacao_suf(self):
            return self.getTypedRuleContext(AraraParser.Comparacao_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_comparacao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparacao" ):
                listener.enterComparacao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparacao" ):
                listener.exitComparacao(self)




    def comparacao(self):

        localctx = AraraParser.ComparacaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_comparacao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.soma()
            self.state = 100
            self.comparacao_suf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comparacao_sufContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPCOMP(self):
            return self.getToken(AraraParser.OPCOMP, 0)

        def soma(self):
            return self.getTypedRuleContext(AraraParser.SomaContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_comparacao_suf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparacao_suf" ):
                listener.enterComparacao_suf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparacao_suf" ):
                listener.exitComparacao_suf(self)




    def comparacao_suf(self):

        localctx = AraraParser.Comparacao_sufContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_comparacao_suf)
        try:
            self.state = 105
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 102
                self.match(AraraParser.OPCOMP)
                self.state = 103
                self.soma()
                pass
            elif token in [3, 4, 8, 12, 21]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SomaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termo(self):
            return self.getTypedRuleContext(AraraParser.TermoContext,0)


        def soma_suf(self):
            return self.getTypedRuleContext(AraraParser.Soma_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_soma

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSoma" ):
                listener.enterSoma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSoma" ):
                listener.exitSoma(self)




    def soma(self):

        localctx = AraraParser.SomaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_soma)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.termo()
            self.state = 108
            self.soma_suf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Soma_sufContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPSUM(self):
            return self.getToken(AraraParser.OPSUM, 0)

        def termo(self):
            return self.getTypedRuleContext(AraraParser.TermoContext,0)


        def soma_suf(self):
            return self.getTypedRuleContext(AraraParser.Soma_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_soma_suf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSoma_suf" ):
                listener.enterSoma_suf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSoma_suf" ):
                listener.exitSoma_suf(self)




    def soma_suf(self):

        localctx = AraraParser.Soma_sufContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_soma_suf)
        try:
            self.state = 115
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [18]:
                self.enterOuterAlt(localctx, 1)
                self.state = 110
                self.match(AraraParser.OPSUM)
                self.state = 111
                self.termo()
                self.state = 112
                self.soma_suf()
                pass
            elif token in [3, 4, 8, 12, 20, 21]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fator(self):
            return self.getTypedRuleContext(AraraParser.FatorContext,0)


        def termo_suf(self):
            return self.getTypedRuleContext(AraraParser.Termo_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_termo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo" ):
                listener.enterTermo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo" ):
                listener.exitTermo(self)




    def termo(self):

        localctx = AraraParser.TermoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_termo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            self.fator()
            self.state = 118
            self.termo_suf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Termo_sufContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPMULT(self):
            return self.getToken(AraraParser.OPMULT, 0)

        def fator(self):
            return self.getTypedRuleContext(AraraParser.FatorContext,0)


        def termo_suf(self):
            return self.getTypedRuleContext(AraraParser.Termo_sufContext,0)


        def getRuleIndex(self):
            return AraraParser.RULE_termo_suf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo_suf" ):
                listener.enterTermo_suf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo_suf" ):
                listener.exitTermo_suf(self)




    def termo_suf(self):

        localctx = AraraParser.Termo_sufContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_termo_suf)
        try:
            self.state = 125
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [19]:
                self.enterOuterAlt(localctx, 1)
                self.state = 120
                self.match(AraraParser.OPMULT)
                self.state = 121
                self.fator()
                self.state = 122
                self.termo_suf()
                pass
            elif token in [3, 4, 8, 12, 18, 20, 21]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fator(self):
            return self.getTypedRuleContext(AraraParser.FatorContext,0)


        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def INT(self):
            return self.getToken(AraraParser.INT, 0)

        def STRING(self):
            return self.getToken(AraraParser.STRING, 0)

        def ID(self):
            return self.getToken(AraraParser.ID, 0)

        def getRuleIndex(self):
            return AraraParser.RULE_fator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFator" ):
                listener.enterFator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFator" ):
                listener.exitFator(self)




    def fator(self):

        localctx = AraraParser.FatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_fator)
        try:
            self.state = 136
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 127
                self.match(AraraParser.T__13)
                self.state = 128
                self.fator()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 129
                self.match(AraraParser.T__1)
                self.state = 130
                self.expressao()
                self.state = 131
                self.match(AraraParser.T__2)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 3)
                self.state = 133
                self.match(AraraParser.INT)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 4)
                self.state = 134
                self.match(AraraParser.STRING)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 5)
                self.state = 135
                self.match(AraraParser.ID)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx






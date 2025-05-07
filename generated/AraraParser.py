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
        4,1,22,118,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,5,0,26,8,0,10,
        0,12,0,29,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,3,1,47,8,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,
        1,3,3,3,60,8,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,5,5,71,8,5,10,
        5,12,5,74,9,5,1,6,1,6,1,7,1,7,1,7,5,7,81,8,7,10,7,12,7,84,9,7,1,
        8,1,8,1,8,3,8,89,8,8,1,9,1,9,1,9,5,9,94,8,9,10,9,12,9,97,9,9,1,10,
        1,10,1,10,5,10,102,8,10,10,10,12,10,105,9,10,1,11,1,11,1,11,1,11,
        1,11,1,11,1,11,1,11,1,11,3,11,116,8,11,1,11,0,0,12,0,2,4,6,8,10,
        12,14,16,18,20,22,0,0,120,0,27,1,0,0,0,2,46,1,0,0,0,4,48,1,0,0,0,
        6,53,1,0,0,0,8,63,1,0,0,0,10,72,1,0,0,0,12,75,1,0,0,0,14,77,1,0,
        0,0,16,85,1,0,0,0,18,90,1,0,0,0,20,98,1,0,0,0,22,115,1,0,0,0,24,
        26,3,2,1,0,25,24,1,0,0,0,26,29,1,0,0,0,27,25,1,0,0,0,27,28,1,0,0,
        0,28,30,1,0,0,0,29,27,1,0,0,0,30,31,5,0,0,1,31,1,1,0,0,0,32,33,5,
        1,0,0,33,34,5,2,0,0,34,35,5,15,0,0,35,36,5,3,0,0,36,47,5,4,0,0,37,
        38,5,5,0,0,38,39,5,2,0,0,39,40,3,12,6,0,40,41,5,3,0,0,41,42,5,4,
        0,0,42,47,1,0,0,0,43,47,3,4,2,0,44,47,3,6,3,0,45,47,3,8,4,0,46,32,
        1,0,0,0,46,37,1,0,0,0,46,43,1,0,0,0,46,44,1,0,0,0,46,45,1,0,0,0,
        47,3,1,0,0,0,48,49,5,15,0,0,49,50,5,6,0,0,50,51,3,12,6,0,51,52,5,
        4,0,0,52,5,1,0,0,0,53,54,5,7,0,0,54,55,3,12,6,0,55,56,5,8,0,0,56,
        59,3,10,5,0,57,58,5,9,0,0,58,60,3,10,5,0,59,57,1,0,0,0,59,60,1,0,
        0,0,60,61,1,0,0,0,61,62,5,10,0,0,62,7,1,0,0,0,63,64,5,11,0,0,64,
        65,3,12,6,0,65,66,5,12,0,0,66,67,3,10,5,0,67,68,5,13,0,0,68,9,1,
        0,0,0,69,71,3,2,1,0,70,69,1,0,0,0,71,74,1,0,0,0,72,70,1,0,0,0,72,
        73,1,0,0,0,73,11,1,0,0,0,74,72,1,0,0,0,75,76,3,14,7,0,76,13,1,0,
        0,0,77,82,3,16,8,0,78,79,5,21,0,0,79,81,3,16,8,0,80,78,1,0,0,0,81,
        84,1,0,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,15,1,0,0,0,84,82,1,0,0,
        0,85,88,3,18,9,0,86,87,5,20,0,0,87,89,3,18,9,0,88,86,1,0,0,0,88,
        89,1,0,0,0,89,17,1,0,0,0,90,95,3,20,10,0,91,92,5,18,0,0,92,94,3,
        20,10,0,93,91,1,0,0,0,94,97,1,0,0,0,95,93,1,0,0,0,95,96,1,0,0,0,
        96,19,1,0,0,0,97,95,1,0,0,0,98,103,3,22,11,0,99,100,5,19,0,0,100,
        102,3,22,11,0,101,99,1,0,0,0,102,105,1,0,0,0,103,101,1,0,0,0,103,
        104,1,0,0,0,104,21,1,0,0,0,105,103,1,0,0,0,106,107,5,14,0,0,107,
        116,3,22,11,0,108,109,5,2,0,0,109,110,3,12,6,0,110,111,5,3,0,0,111,
        116,1,0,0,0,112,116,5,16,0,0,113,116,5,17,0,0,114,116,5,15,0,0,115,
        106,1,0,0,0,115,108,1,0,0,0,115,112,1,0,0,0,115,113,1,0,0,0,115,
        114,1,0,0,0,116,23,1,0,0,0,9,27,46,59,72,82,88,95,103,115
    ]

class AraraParser ( Parser ):

    grammarFileName = "Arara.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'leia'", "'('", "')'", "';'", "'escreva'", 
                     "'<-'", "'se'", "'entao'", "'senao'", "'fimse'", "'enquanto'", 
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
    RULE_repeticao = 4
    RULE_bloco = 5
    RULE_expressao = 6
    RULE_logica = 7
    RULE_comparacao = 8
    RULE_soma = 9
    RULE_termo = 10
    RULE_fator = 11

    ruleNames =  [ "programa", "comando", "atribuicao", "condicional", "repeticao", 
                   "bloco", "expressao", "logica", "comparacao", "soma", 
                   "termo", "fator" ]

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
            self.state = 27
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34978) != 0):
                self.state = 24
                self.comando()
                self.state = 29
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 30
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
            self.state = 46
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 32
                self.match(AraraParser.T__0)
                self.state = 33
                self.match(AraraParser.T__1)
                self.state = 34
                self.match(AraraParser.ID)
                self.state = 35
                self.match(AraraParser.T__2)
                self.state = 36
                self.match(AraraParser.T__3)
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.match(AraraParser.T__4)
                self.state = 38
                self.match(AraraParser.T__1)
                self.state = 39
                self.expressao()
                self.state = 40
                self.match(AraraParser.T__2)
                self.state = 41
                self.match(AraraParser.T__3)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 43
                self.atribuicao()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 44
                self.condicional()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 5)
                self.state = 45
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
            self.state = 48
            self.match(AraraParser.ID)
            self.state = 49
            self.match(AraraParser.T__5)
            self.state = 50
            self.expressao()
            self.state = 51
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
            self.blocosenao = None # BlocoContext

        def expressao(self):
            return self.getTypedRuleContext(AraraParser.ExpressaoContext,0)


        def bloco(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.BlocoContext)
            else:
                return self.getTypedRuleContext(AraraParser.BlocoContext,i)


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
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(AraraParser.T__6)
            self.state = 54
            self.expressao()
            self.state = 55
            self.match(AraraParser.T__7)
            self.state = 56
            self.bloco()
            self.state = 59
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==9:
                self.state = 57
                self.match(AraraParser.T__8)
                self.state = 58
                localctx.blocosenao = self.bloco()


            self.state = 61
            self.match(AraraParser.T__9)
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
        self.enterRule(localctx, 8, self.RULE_repeticao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(AraraParser.T__10)
            self.state = 64
            self.expressao()
            self.state = 65
            self.match(AraraParser.T__11)
            self.state = 66
            self.bloco()
            self.state = 67
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
        self.enterRule(localctx, 10, self.RULE_bloco)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34978) != 0):
                self.state = 69
                self.comando()
                self.state = 74
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
        self.enterRule(localctx, 12, self.RULE_expressao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
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

        def comparacao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.ComparacaoContext)
            else:
                return self.getTypedRuleContext(AraraParser.ComparacaoContext,i)


        def OPLOG(self, i:int=None):
            if i is None:
                return self.getTokens(AraraParser.OPLOG)
            else:
                return self.getToken(AraraParser.OPLOG, i)

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
        self.enterRule(localctx, 14, self.RULE_logica)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self.comparacao()
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==21:
                self.state = 78
                self.match(AraraParser.OPLOG)
                self.state = 79
                self.comparacao()
                self.state = 84
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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

        def soma(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.SomaContext)
            else:
                return self.getTypedRuleContext(AraraParser.SomaContext,i)


        def OPCOMP(self):
            return self.getToken(AraraParser.OPCOMP, 0)

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
        self.enterRule(localctx, 16, self.RULE_comparacao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.soma()
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==20:
                self.state = 86
                self.match(AraraParser.OPCOMP)
                self.state = 87
                self.soma()


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

        def termo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.TermoContext)
            else:
                return self.getTypedRuleContext(AraraParser.TermoContext,i)


        def OPSUM(self, i:int=None):
            if i is None:
                return self.getTokens(AraraParser.OPSUM)
            else:
                return self.getToken(AraraParser.OPSUM, i)

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
        self.enterRule(localctx, 18, self.RULE_soma)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.termo()
            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==18:
                self.state = 91
                self.match(AraraParser.OPSUM)
                self.state = 92
                self.termo()
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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

        def fator(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AraraParser.FatorContext)
            else:
                return self.getTypedRuleContext(AraraParser.FatorContext,i)


        def OPMULT(self, i:int=None):
            if i is None:
                return self.getTokens(AraraParser.OPMULT)
            else:
                return self.getToken(AraraParser.OPMULT, i)

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
        self.enterRule(localctx, 20, self.RULE_termo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.fator()
            self.state = 103
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==19:
                self.state = 99
                self.match(AraraParser.OPMULT)
                self.state = 100
                self.fator()
                self.state = 105
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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
        self.enterRule(localctx, 22, self.RULE_fator)
        try:
            self.state = 115
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 106
                self.match(AraraParser.T__13)
                self.state = 107
                self.fator()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 108
                self.match(AraraParser.T__1)
                self.state = 109
                self.expressao()
                self.state = 110
                self.match(AraraParser.T__2)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 3)
                self.state = 112
                self.match(AraraParser.INT)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 4)
                self.state = 113
                self.match(AraraParser.STRING)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 5)
                self.state = 114
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






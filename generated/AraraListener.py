# Generated from grammar/Arara.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .AraraParser import AraraParser
else:
    from AraraParser import AraraParser

# This class defines a complete listener for a parse tree produced by AraraParser.
class AraraListener(ParseTreeListener):

    # Enter a parse tree produced by AraraParser#programa.
    def enterPrograma(self, ctx:AraraParser.ProgramaContext):
        pass

    # Exit a parse tree produced by AraraParser#programa.
    def exitPrograma(self, ctx:AraraParser.ProgramaContext):
        pass


    # Enter a parse tree produced by AraraParser#comando.
    def enterComando(self, ctx:AraraParser.ComandoContext):
        pass

    # Exit a parse tree produced by AraraParser#comando.
    def exitComando(self, ctx:AraraParser.ComandoContext):
        pass


    # Enter a parse tree produced by AraraParser#atribuicao.
    def enterAtribuicao(self, ctx:AraraParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by AraraParser#atribuicao.
    def exitAtribuicao(self, ctx:AraraParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by AraraParser#condicional.
    def enterCondicional(self, ctx:AraraParser.CondicionalContext):
        pass

    # Exit a parse tree produced by AraraParser#condicional.
    def exitCondicional(self, ctx:AraraParser.CondicionalContext):
        pass


    # Enter a parse tree produced by AraraParser#repeticao.
    def enterRepeticao(self, ctx:AraraParser.RepeticaoContext):
        pass

    # Exit a parse tree produced by AraraParser#repeticao.
    def exitRepeticao(self, ctx:AraraParser.RepeticaoContext):
        pass


    # Enter a parse tree produced by AraraParser#bloco.
    def enterBloco(self, ctx:AraraParser.BlocoContext):
        pass

    # Exit a parse tree produced by AraraParser#bloco.
    def exitBloco(self, ctx:AraraParser.BlocoContext):
        pass


    # Enter a parse tree produced by AraraParser#expressao.
    def enterExpressao(self, ctx:AraraParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by AraraParser#expressao.
    def exitExpressao(self, ctx:AraraParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by AraraParser#logica.
    def enterLogica(self, ctx:AraraParser.LogicaContext):
        pass

    # Exit a parse tree produced by AraraParser#logica.
    def exitLogica(self, ctx:AraraParser.LogicaContext):
        pass


    # Enter a parse tree produced by AraraParser#comparacao.
    def enterComparacao(self, ctx:AraraParser.ComparacaoContext):
        pass

    # Exit a parse tree produced by AraraParser#comparacao.
    def exitComparacao(self, ctx:AraraParser.ComparacaoContext):
        pass


    # Enter a parse tree produced by AraraParser#soma.
    def enterSoma(self, ctx:AraraParser.SomaContext):
        pass

    # Exit a parse tree produced by AraraParser#soma.
    def exitSoma(self, ctx:AraraParser.SomaContext):
        pass


    # Enter a parse tree produced by AraraParser#termo.
    def enterTermo(self, ctx:AraraParser.TermoContext):
        pass

    # Exit a parse tree produced by AraraParser#termo.
    def exitTermo(self, ctx:AraraParser.TermoContext):
        pass


    # Enter a parse tree produced by AraraParser#fator.
    def enterFator(self, ctx:AraraParser.FatorContext):
        pass

    # Exit a parse tree produced by AraraParser#fator.
    def exitFator(self, ctx:AraraParser.FatorContext):
        pass



del AraraParser
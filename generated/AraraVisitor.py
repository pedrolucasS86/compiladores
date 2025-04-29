# Generated from grammar/Arara.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .AraraParser import AraraParser
else:
    from AraraParser import AraraParser

# This class defines a complete generic visitor for a parse tree produced by AraraParser.

class AraraVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by AraraParser#programa.
    def visitPrograma(self, ctx:AraraParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comando.
    def visitComando(self, ctx:AraraParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#atribuicao.
    def visitAtribuicao(self, ctx:AraraParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#condicional.
    def visitCondicional(self, ctx:AraraParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#repeticao.
    def visitRepeticao(self, ctx:AraraParser.RepeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#bloco.
    def visitBloco(self, ctx:AraraParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#expressao.
    def visitExpressao(self, ctx:AraraParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#logica.
    def visitLogica(self, ctx:AraraParser.LogicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comparacao.
    def visitComparacao(self, ctx:AraraParser.ComparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#soma.
    def visitSoma(self, ctx:AraraParser.SomaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#termo.
    def visitTermo(self, ctx:AraraParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#fator.
    def visitFator(self, ctx:AraraParser.FatorContext):
        return self.visitChildren(ctx)



del AraraParser
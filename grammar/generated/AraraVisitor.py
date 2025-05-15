# Generated from Arara.g4 by ANTLR 4.13.0
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


    # Visit a parse tree produced by AraraParser#comandoLeia.
    def visitComandoLeia(self, ctx:AraraParser.ComandoLeiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comandoEscreva.
    def visitComandoEscreva(self, ctx:AraraParser.ComandoEscrevaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comandoAtrib.
    def visitComandoAtrib(self, ctx:AraraParser.ComandoAtribContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comandoCondicional.
    def visitComandoCondicional(self, ctx:AraraParser.ComandoCondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comandoRepeticao.
    def visitComandoRepeticao(self, ctx:AraraParser.ComandoRepeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comandoDeclaracao.
    def visitComandoDeclaracao(self, ctx:AraraParser.ComandoDeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#condicional.
    def visitCondicional(self, ctx:AraraParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#cond_opc.
    def visitCond_opc(self, ctx:AraraParser.Cond_opcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#repeticao.
    def visitRepeticao(self, ctx:AraraParser.RepeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#declaracao.
    def visitDeclaracao(self, ctx:AraraParser.DeclaracaoContext):
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


    # Visit a parse tree produced by AraraParser#logica_suf.
    def visitLogica_suf(self, ctx:AraraParser.Logica_sufContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comparacao.
    def visitComparacao(self, ctx:AraraParser.ComparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#comparacao_suf.
    def visitComparacao_suf(self, ctx:AraraParser.Comparacao_sufContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#soma.
    def visitSoma(self, ctx:AraraParser.SomaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#soma_suf.
    def visitSoma_suf(self, ctx:AraraParser.Soma_sufContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#termo.
    def visitTermo(self, ctx:AraraParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#termo_suf.
    def visitTermo_suf(self, ctx:AraraParser.Termo_sufContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AraraParser#fator.
    def visitFator(self, ctx:AraraParser.FatorContext):
        return self.visitChildren(ctx)



del AraraParser
import sys
from antlr4 import *
from antlr4.tree.Tree import ParseTreeVisitor

from generated.AraraLexer import *
from generated.AraraParser import *

class Interpreter(ParseTreeVisitor):
    def __init__(self):
        self.memory = {}
    
    def visitPrograma(self, ctx: AraraParser.ProgramaContext):
        for comando in ctx.comando():
            self.visit(comando)
        return None

    def visitAtribuicao(self, ctx: AraraParser.AtribuicaoContext):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expressao())
        self.memory[var_name] = value
        return None

    def visitLeia(self, ctx: AraraParser.ComandoContext):
        var_name = ctx.ID().getText()
        user_input = input(f"Entrada para {var_name}: ")
        if user_input.isdigit():
            self.memory[var_name] = int(user_input)
        else:
            self.memory[var_name] = user_input
        return None

    def visitEscreva(self, ctx: AraraParser.ComandoContext):
        value = self.visit(ctx.expressao())
        print(value)
        return None

    def visitCondicional(self, ctx: AraraParser.CondicionalContext):
        condition = self.visit(ctx.expressao())
        if condition:
            self.visit(ctx.bloco(0))
        elif ctx.cond_opc() is not None:
            self.visit(ctx.cond_opc())
        return None

    def visitCond_opc(self, ctx: AraraParser.Cond_opcContext):
        if ctx.bloco():
            self.visit(ctx.bloco())
        return None

    def visitRepeticao(self, ctx: AraraParser.RepeticaoContext):
        while self.visit(ctx.expressao()):
            self.visit(ctx.bloco())
        return None

    def visitExpressao(self, ctx: AraraParser.ExpressaoContext):
        return self.visit(ctx.logica())

    def visitLogica(self, ctx: AraraParser.LogicaContext):
        left = self.visit(ctx.comparacao())
        if ctx.logica_suf():
            op = ctx.logica_suf().OPLOG().getText()
            right = self.visit(ctx.logica_suf().comparacao())
            if op == "&&":
                return left and right
            elif op == "||":
                return left or right
        return left

    def visitComparacao(self, ctx: AraraParser.ComparacaoContext):
        left = self.visit(ctx.soma())
        if ctx.comparacao_suf():
            op = ctx.comparacao_suf().OPCOMP().getText()
            right = self.visit(ctx.comparacao_suf().soma())
            if op == "==":
                return left == right
            elif op == "!=":
                return left != right
            elif op == "<":
                return left < right
            elif op == "<=":
                return left <= right
            elif op == ">":
                return left > right
            elif op == ">=":
                return left >= right
        return left

    def visitSoma(self, ctx: AraraParser.SomaContext):
        result = self.visit(ctx.termo())
        if ctx.soma_suf():
            op = ctx.soma_suf().OPSUM().getText()
            next_term = self.visit(ctx.soma_suf().termo())
            if op == "+":
                return result + next_term
            elif op == "-":
                return result - next_term
        return result

    def visitTermo(self, ctx: AraraParser.TermoContext):
        result = self.visit(ctx.fator())
        if ctx.termo_suf():
            op = ctx.termo_suf().OPMULT().getText()
            next_factor = self.visit(ctx.termo_suf().fator())
            if op == "*":
                return result * next_factor
            elif op == "/":
                return result // next_factor
        return result

    def visitFator(self, ctx: AraraParser.FatorContext):
        if ctx.INT():
            return int(ctx.INT().getText())
        elif ctx.STRING():
            return ctx.STRING().getText().strip('"')
        elif ctx.ID():
            var_name = ctx.ID().getText()
            if var_name not in self.memory:
                raise RuntimeError(f"Variable '{var_name}' is not initialized.")
            return self.memory[var_name]
        elif ctx.expressao():
            return self.visit(ctx.expressao())
        elif ctx.getChild(0).getText() == '!':
            return not self.visit(ctx.fator())
        return None
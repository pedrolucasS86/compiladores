import logging

class CustomSemanticErrorListener:
    def __init__(self):
        logging.basicConfig(filename="analisador.log", level=logging.WARNING, filemode="a",
            format="SEMÂNTICO: %(message)s")
        self.errors = [] 

    def semanticError(self, msg, line, column):
        mensagem = f"ERRO SEMÂNTICO [Linha {line}, Coluna {column}]: {msg}"
        print(f"\033[91m{mensagem}\033[0m")
        logging.warning(mensagem)
        self.errors.append(mensagem) 

from grammar.generated.AraraVisitor import AraraVisitor

class AnalisadorSemantico(AraraVisitor):
    def __init__(self, error_listener):
        self.tabela_simbolos = {}
        self.error_listener = error_listener

    def print_erro_semantico(self, msg, ctx):
        linha = ctx.start.line
        coluna = ctx.start.column
        self.error_listener.semanticError(msg, linha, coluna)

    def visitDeclaracao(self, ctx):
        nome = ctx.ID().getText()
        tipo = ctx.TIPO().getText()
        if nome in self.tabela_simbolos:
            self.print_erro_semantico(f"Variável '{nome}' já declarada.", ctx)
        else:
            self.tabela_simbolos[nome] = tipo
        return None

    def visitComandoAtrib(self, ctx):
        nome = ctx.ID().getText()
        if nome not in self.tabela_simbolos:
            self.print_erro_semantico(f"Variável '{nome}' usada sem declaração.", ctx)
        self.visit(ctx.expressao())
        return None

    def visitFator(self, ctx):
        if ctx.ID():
            nome = ctx.ID().getText()
            if nome not in self.tabela_simbolos:
                self.print_erro_semantico(f"Variável '{nome}' usada sem declaração.", ctx)
            return self.tabela_simbolos.get(nome, "desconhecido")

        elif ctx.INT():
            return "inteiro"
        elif ctx.STRING():
            return "string"
        elif ctx.expressao():
            return self.visit(ctx.expressao())
        elif ctx.NOT():
            return self.visit(ctx.fator())

        return "desconhecido"

    def visitTermo(self, ctx):
        tipo1 = self.visit(ctx.fator())
        return self.visitar_termo_suf(ctx.termo_suf(), tipo1)

    def visitar_termo_suf(self, ctx, tipo_atual):
        if ctx.getChildCount() == 0:
            return tipo_atual
        
        operador = ctx.getChild(0).getText()
        fator = ctx.fator()
        tipo2 = self.visit(fator)

        # Verificação de divisão por zero
        if operador == '/' and fator.INT() and fator.getText() == '0':
            self.print_erro_semantico("Divisão por zero.", ctx)

        # Verificação de tipos incompatíveis
        if tipo_atual == "string" or tipo2 == "string":
            self.print_erro_semantico(f"Operação '{operador}' inválida com tipo string.", ctx)
            return "desconhecido"

        if tipo_atual == "real" or tipo2 == "real":
            return "real"
        else:
            return "inteiro"

    def visitSoma(self, ctx):
        tipo1 = self.visit(ctx.termo())
        return self.visitar_soma_suf(ctx.soma_suf(), tipo1)

    def visitar_soma_suf(self, ctx, tipo_atual):
        if ctx.getChildCount() == 0:
            return tipo_atual
        
        operador = ctx.getChild(0).getText()
        termo = ctx.termo()
        tipo2 = self.visit(termo)

        if tipo_atual == "string" or tipo2 == "string":
            self.print_erro_semantico(f"Operação '{operador}' inválida com tipo string.", ctx)
            return "desconhecido"

        if tipo_atual == "real" or tipo2 == "real":
            return "real"
        else:
            return "inteiro"

    def visitComparacao(self, ctx):
        return self.visitChildren(ctx)

    def visitLogica(self, ctx):
        return self.visitChildren(ctx)

    def visitExpressao(self, ctx):
        return self.visit(ctx.logica())

    def visitPrograma(self, ctx):
        for comando in ctx.comando():
            self.visit(comando)


    


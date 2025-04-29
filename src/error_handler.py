from antlr4.error.ErrorListener import ErrorListener
import sys

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        nome = recognizer.__class__.__name__
        tipo = "LÉXICO" if nome.endswith("Lexer") else "SINTÁTICO"

        print(f"ERRO {tipo} [Linha {line}, Coluna {column}]: {msg}")
        sys.exit(1) 

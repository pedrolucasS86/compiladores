import sys
import os
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from antlr4 import *
from generated.AraraLexer import AraraLexer
from generated.AraraParser import AraraParser
from src.error_handler import CustomErrorListener
from src.ast_generator import ASTDotVisitor
import logging
import subprocess

logging.basicConfig(filename="analisador.log", filemode='w', encoding="utf-8", level=logging.INFO)

def analisar_arquivo(caminho):
    with open(caminho, encoding="utf-8") as f:
        entrada = f.read()
    print("Código de entrada:\n" + "-"*40)
    print(entrada)
    print("-"*40)

    input_stream = InputStream(entrada)
    lexer = AraraLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(CustomErrorListener())

    token_stream = CommonTokenStream(lexer)
    parser = AraraParser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())

    arvore = parser.programa()

    visitor = ASTDotVisitor()
    visitor.visit(arvore)

    with open("ast.dot", "w", encoding="utf-8") as f:
        f.write(visitor.get_dot())

    subprocess.run(["dot", "-Tpng", "ast.dot", "-o", "ast.png"])
    print("AST gerada como ast.png")

if __name__ == "__main__":
    analisar_arquivo("exemplos/triangulo.arara")

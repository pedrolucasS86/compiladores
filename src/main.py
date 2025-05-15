import os
import sys
import subprocess
import logging

from antlr4 import InputStream, CommonTokenStream

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from src.semantico.analisador_semantico import AnalisadorSemantico, CustomSemanticErrorListener
from grammar.generated.AraraLexer import AraraLexer
from grammar.generated.AraraParser import AraraParser
from src.error_handler import CustomErrorListener
from src.ast_generator import ASTDotVisitor

# Configura o logging uma vez para todo o programa, incluindo semântico
logging.basicConfig(filename="analisador.log", filemode='w', encoding="utf-8", level=logging.WARNING,
                    format="%(levelname)s: %(message)s")

def analisar_arquivo(caminho):
    with open(caminho, encoding="utf-8") as f:
        entrada = f.read()
        
    print("-"*40)
    print("Código de entrada:\n" + "-"*40)
    print(entrada)
    print("-"*40)

    input_stream = InputStream(entrada)
    lexer = AraraLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(CustomErrorListener())

    print("Tokens reconhecidos:\n" + "-"*40)
    token_stream_temp = CommonTokenStream(lexer)
    token_stream_temp.fill()
    for token in token_stream_temp.tokens:
        token_name = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else str(token.type)
        print(f"<{token_name}, {token.text}, Linha {token.line}, Coluna {token.column}>;")

    # Recria lexer e parser para análise sintática
    lexer = AraraLexer(InputStream(entrada))
    lexer.removeErrorListeners()
    lexer.addErrorListener(CustomErrorListener())

    token_stream = CommonTokenStream(lexer)
    parser = AraraParser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())

    # Gera a árvore de análise sintática
    arvore = parser.programa()

    # Análise semântica (antes de imprimir a árvore)
    semantico_listener = CustomSemanticErrorListener()
    semantico = AnalisadorSemantico(semantico_listener)
    semantico.visit(arvore)

    print("-"*40)
    print("ARVORE:")
    print("-"*40)
    print(">>> Root node do programa:\n", arvore.toStringTree(recog=parser))
    print("-"*40)

    # Gerar AST
    visitor = ASTDotVisitor()
    visitor.visit(arvore)

    dot_output = visitor.get_dot()

    os.makedirs("docs", exist_ok=True)
    with open("docs/ast.dot", "w", encoding="utf-8") as f:
        f.write(dot_output)

    print("Arquivo docs/ast.dot gerado.")
    print("Gerando imagem com Graphviz...")

    result = subprocess.run(["dot", "-Tpng", "docs/ast.dot", "-o", "docs/ast.png"], capture_output=True, text=True)

    if result.returncode != 0:
        print("❌ Erro ao gerar imagem do AST:")
        print(result.stderr)
    else:
        print("✅ AST gerada com sucesso como 'docs/ast.png'!\n")

    print("-"*40)

if __name__ == "__main__":
    analisar_arquivo("exemplos/semantico.arara")

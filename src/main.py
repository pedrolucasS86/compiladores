import os
import sys
import subprocess
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from generated.AraraLexer import *
from generated.AraraParser import *
from src.error_handler import CustomErrorListener
from src.ast_generator import ASTDotVisitor
import logging

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
    print(">>> Root node do programa:", arvore.toStringTree(recog=parser))

    # AST
    visitor = ASTDotVisitor()
    visitor.visit(arvore)

    dot_output = visitor.get_dot()
    
    # Criar pasta docs se não existir
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
        print("✅ AST gerada com sucesso como 'docs/ast.png'!")

if __name__ == "__main__":
    analisar_arquivo("exemplos/triangulo.arara")

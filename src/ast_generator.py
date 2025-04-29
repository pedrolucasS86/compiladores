from antlr4 import *
from generated.AraraVisitor import AraraVisitor

class ASTDotVisitor(AraraVisitor):
    def __init__(self):
        self.node_id = 0
        self.dot = "digraph AST {\n"

    def escape(self, texto):
        return texto.replace('"', r'\"')  # Escapa aspas para DOT

    def nova_label(self, texto):
        self.node_id += 1
        nome = f"n{self.node_id}"
        self.dot += f'{nome} [label="{self.escape(texto)}"];\n'
        return nome

    def visitChildren(self, node):
        pai = self.nova_label(type(node).__name__)
        for filho in node.getChildren():
            if hasattr(filho, 'getText'):
                filho_id = self.nova_label(filho.getText())
            else:
                filho_id = self.visit(filho)
            self.dot += f"{pai} -> {filho_id};\n"
        return pai

    def get_dot(self):
        return self.dot + "}"

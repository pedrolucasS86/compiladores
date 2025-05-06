from antlr4.tree.Tree import ParseTreeVisitor

class ASTDotVisitor(ParseTreeVisitor):
    def __init__(self):
        self.dot = ["digraph AST {"]
        self.count = 0
        self.pilha = []

    def get_dot(self):
        self.dot.append("}")
        return "\n".join(self.dot)

    def nova_label(self, label):
        node_name = f"n{self.count}"
        self.dot.append(f'{node_name} [label="{label}"];')
        if self.pilha:
            self.dot.append(f'{self.pilha[-1]} -> {node_name};')
        self.pilha.append(node_name)
        self.count += 1
        return node_name

    def visitChildren(self, node):
        rule_name = type(node).__name__.replace("Context", "")
        current_node = self.nova_label(rule_name)

        for i in range(node.getChildCount()):
            self.visit(node.getChild(i))

        self.pilha.pop()

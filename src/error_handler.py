import logging
import sys
from antlr4.error.ErrorListener import ErrorListener

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.tem_erro = False

        # Configuração de log
        logging.basicConfig(filename="analisador.log", level=logging.WARNING, filemode="w",
                            format="%(levelname)s: %(message)s")

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.tem_erro = True
        nome_classe = recognizer.__class__.__name__
        tipo_erro = "LÉXICO" if nome_classe.endswith("Lexer") else "SINTÁTICO"

        # ERRO LÉXICO
        if "token recognition error" in msg:
            simbolo = offendingSymbol.text if offendingSymbol else msg.split(":")[-1].strip().strip("'")
            mensagem = f"ERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido."
        else:
            # ERRO SINTÁTICO
            esperado = "outro elemento válido"
            encontrado = offendingSymbol.text if offendingSymbol else "EOF"

            if hasattr(e, "getExpectedTokens"):
                expected = list(e.getExpectedTokens())
                nomes = recognizer.literalNames if hasattr(recognizer, "literalNames") else []
                esperado_tokens = []

                for i in expected:
                    if i < len(nomes) and nomes[i] is not None:
                        esperado_tokens.append(nomes[i].strip("'"))

                if esperado_tokens:
                    esperado = "', '".join(esperado_tokens)

            mensagem = f"ERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado '{esperado}', encontrado '{encontrado}'."

        # Saída colorida no terminal
        print(f"\033[91m{mensagem}\033[0m")
        logging.warning(mensagem)

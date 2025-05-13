# 🦜 ARARA — Compilador Acadêmico

ARARA é uma linguagem de programação fictícia com comandos em **português**, inspirada na linguagem Tiny. Criada com fins didáticos, ela possui **sintaxe clara**, **tipagem simples** e **estrutura de controle completa**, sendo ideal para o estudo de compiladores.

---

## 🎯 Objetivos do Projeto

✅ Implementar um compilador completo com:

- Análise **léxica**
- Análise **sintática**
- Geração de **Árvore Sintática Abstrata (AST)**
- Tratamento de **erros personalizados**
- Uso de **ANTLR4** com gramática LL(1)

---

## 🧠 Funcionalidades da Linguagem

🔤 **Tipos primitivos:**  
`int`, `string`

📥 **Entrada:**  
`leia(x)`

📤 **Saída:**  
`escreva(...)`

📝 **Atribuição:**  
`variavel <- expressao`

🔁 **Controle de fluxo:**

```arara
se ... entao ... senao ... fimse  
enquanto ... faca ... fimenquanto
```

🧮 **Expressões:**

- Aritméticas: `+`, `-`, `*`, `/`
- Comparações: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Lógicas: `&&`, `||`, `!`
- Suporte a parênteses e precedência correta
- Avaliação encadeada de expressões (ex: `a + b * c <= d || e != f`)

---

## 📐 Exemplo de Sintaxe

```arara
leia(x);
se x > 0 entao
    escreva("Positivo");
senao
    escreva("Negativo ou zero");
fimse
```

---

## 🗂 Estrutura do Projeto

```
arara/
├── grammar/         → Arquivo Arara.g4 (gramática ANTLR)
├── generated/       → Arquivos gerados pelo ANTLR
├── exemplos/        → Códigos de exemplo (.arara)
├── src/             → Código-fonte do compilador
│   ├── main.py
│   ├── error_handler.py
│   ├── ast_generator.py
│   └── visitor.py
├── docs/            → AST visual (.dot e .png)
├── analisador.log   → Log de execução (opcional)
├── antlr-4.13.1-complete.jar
└── README.md        → Este arquivo ✨
```

---

## ⚙️ Como Executar

### 1. Gerar arquivos ANTLR:

```bash
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 -o generated grammar/Arara.g4
```

### 2. Executar o compilador:

```bash
python src/main.py exemplos/<arquivo>.arara
```

### 3. Gerar imagem da AST:

```bash
dot -Tpng docs/ast.dot -o docs/ast.png
```

---

## 📌 Observações

- Suporte completo à gramática recursiva com sufixos (`soma_suf`, `termo_suf`, etc)
- Condicionais aninhadas com `senao` opcionais
- Erros léxicos e sintáticos tratados com mensagens personalizadas

---

## 👨‍🏫 Autor

📚 Projeto da disciplina de **Compiladores (2025)**  
🔗 [GitHub do projeto](https://github.com/pedrolucasS86/compiladores)

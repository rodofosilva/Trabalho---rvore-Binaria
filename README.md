# Trabalho Prático – Árvores Binárias e Recursividade

**Disciplina:** Estrutura de Dados  
**Professor:** Prof. Anderson Soares 

------

## Parte 1 – Conceito e Explicação

### 1. O que é recursividade?
É quando uma função chama a si mesma para resolver partes menores de um problema, até chegar a um **caso base**, que encerra as chamadas.  
Exemplo: calcular fatorial ou percorrer nós de uma árvore.

### 2. Como a recursividade é usada na travessia de uma árvore binária?
Ela é usada para visitar cada nó da árvore chamando a mesma função para as **subárvores esquerda e direita**, até chegar a nós nulos.  
Exemplo: em ordem → esquerda → raiz → direita.

### 3. Qual a diferença entre recursão e laço (for/while)?
A recursão repete **chamando a própria função**; o laço repete **no mesmo bloco de código**.  
Recursão usa chamadas de função (pilha), e laços usam contadores e iterações.

---

## Parte 2 – Implementação

- A árvore foi implementada com os métodos:
  - `inserir(int valor)`
  - `buscar(int valor)`
  - `preOrdem()`
  - `emOrdem()`
  - `posOrdem()`

- Todos os métodos usam **recursão** e possuem **caso base** documentado no código.  
- As duplicatas não são inseridas.

---

## Como compilar e executar

No terminal:
```bash
javac *.java
java Main
Inserindo valores: 50, 30, 70, 20, 40, 60, 80

Buscas:
buscar(60) -> true
buscar(99) -> false

Percursos:
Pré-ordem: [50, 30, 20, 40, 70, 60, 80]
Em-ordem:  [20, 30, 40, 50, 60, 70, 80]
Pós-ordem: [20, 40, 30, 60, 80, 70, 50]

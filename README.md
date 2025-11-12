# Trabalho Prático – Árvores Binárias e Recursividade

**Disciplina:** Estrutura de Dados  
**Professor:** Anderson Soares

---

## Parte 1 – Conceito e Explicação

### 1. O que é recursividade?
É quando uma função chama a si mesma para resolver um problema menor, até chegar a um **caso base** que encerra as chamadas.

### 2. Como a recursividade é usada na árvore binária?
Ela é usada para percorrer os nós chamando a mesma função para as subárvores **esquerda** e **direita**, até chegar em nós nulos.

### 3. Diferença entre recursão e laço (for/while)
A recursão repete através de chamadas de função; o laço repete o código dentro do mesmo bloco.  
Recursão usa pilha de chamadas, enquanto laços usam contadores.

---

## Parte 2 – Implementação

### Métodos implementados
- `inserir(int valor)`  
- `buscar(int valor)`  
- `emOrdem()`  
- `preOrdem()`  
- `posOrdem()`

Todos usam **recursão** e têm **caso base** bem definido.  
Valores duplicados não são inseridos.

---

## Como compilar e executar

No terminal, dentro da pasta do projeto:
```bash

Inserindo valores: 18 3 10 1 6 14 4 7 131
Em ordem: 1 3 4 6 7 10 14 18 131
Pre-ordem: 18 3 1 10 6 4 7 14 131
Pos-ordem: 1 4 7 6 14 10 3 131 18
Buscar 10: true
Buscar 5: false

javac *.java
java Main

# Three in One e 10.1-2

Temos dois exercícios bastante semelhantes com a mesma proposta de criar um array que gerencie duas ou três pilhas.

### Enunciado Cracking the code

> Describe how you could use a single array to implement three stacks.

### Enunciado Cormen 10.1-2

> Explique como implementar suas pilhas em um único arranjo A[1...n] de tal modo que nenhuma delas sofra um estouro a menos que o total de elementos na pilha juntas seja n. As operações PUSH e POP devem ser executadas em O(1).

## Algoritmo Leigo

Fiz os primeiros testes com `NaiveStack`. Inicialmente pensei em fazer uma divisão genérica, mas não era bem o caso.

## Formas de solucionar

[Repositorio de soluções do cracking the code](https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_01_Three_in_One/)

[Solução do Cracking the code - Python](https://quastor.org/cracking-the-coding-interview/stacks-and-queues/three-in-one)

[Solução do Cormen](https://walkccc.me/CLRS/Chap10/10.1/)

## O que falha no algoritmo leigo

PUSH e POP nao sao feitos em O(1), mas sim, O(n).
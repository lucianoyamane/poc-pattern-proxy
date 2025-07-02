# 004 - Inicialização de Atributos no Construtor do BookRepository

## Contexto

Durante a implementação do singleton `BookRepository`, surgiu a necessidade de garantir que todos os atributos fossem corretamente inicializados, independentemente do contexto de uso (produção, testes, mocks, etc).

## Decisão

Optou-se por inicializar os atributos `books` e `nextId` dentro do construtor da classe, ao invés de inicializá-los diretamente na declaração.

## Consequências

- Garante que toda instância criada (mesmo em testes ou mocks) esteja corretamente inicializada.
- O construtor fica explícito, facilitando a leitura e manutenção do código.
- Evita problemas de inicialização fora de ordem, especialmente em cenários de herança ou testes.
- Segue boas práticas de orientação a objetos em Java. 
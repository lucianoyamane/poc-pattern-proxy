# 002 - Repository Singleton e Static Factory Method

## Contexto

Era necessário simular uma persistência centralizada e garantir que todos os serviços compartilhassem o mesmo repositório de livros, além de facilitar a inicialização controlada das dependências.

## Decisão

Foi adotado o padrão **Singleton** para o `BookRepository`, garantindo uma única instância compartilhada. Para inicialização de serviços e repositórios, foram utilizados métodos de fábrica estáticos (`static factory method`), encapsulando a lógica de obtenção de instâncias e facilitando futuras mudanças.

## Consequências

- O repositório é compartilhado entre todos os serviços, simulando persistência global.
- A inicialização via métodos estáticos deixa o código mais limpo e preparado para injeção de dependências.
- Facilita testes e futuras expansões (ex: cache, subclasses, etc). 
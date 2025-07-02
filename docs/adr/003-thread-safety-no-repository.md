# 003 - Thread Safety no BookRepository

## Contexto

O projeto utiliza um singleton `BookRepository` para simular a persistência de livros em memória. Como singletons podem ser acessados por múltiplas threads simultaneamente (especialmente em ambientes web ou aplicações concorrentes), existe o risco de condições de corrida e corrupção de dados.

## Decisão

Foi decidido marcar os métodos críticos do `BookRepository` como `synchronized`, garantindo que operações como salvar livros e criar a instância singleton sejam thread-safe. Isso evita problemas como IDs duplicados, dados inconsistentes ou exceções inesperadas.

## Consequências

- O repositório pode ser usado com segurança em ambientes multithread.
- O desempenho pode ser levemente impactado em cenários de alta concorrência, mas a integridade dos dados é garantida.
- Para projetos maiores, pode-se considerar coleções thread-safe ou frameworks de persistência.

## Pontos analisados no projeto

- O uso de `synchronized` está adequado no método `save` e no método `getInstance` do `BookRepository`.
- Os demais serviços e fluxos não manipulam diretamente recursos compartilhados críticos, pois dependem do repositório para persistência.
- Não há necessidade de adicionar `synchronized` em outros pontos do projeto no cenário atual. 
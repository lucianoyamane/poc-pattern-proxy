# 001 - Uso do Proxy Pattern no Cadastro de Livros

## Contexto

No cenário de cadastro de livros, era necessário separar as responsabilidades de conversão entre DTOs e Models, além de permitir a inclusão de lógica extra (validação, logs, cache, etc) sem poluir o controller ou o service.

## Decisão

Foi adotado o padrão de projeto **Proxy**. O proxy recebe o DTO de entrada, converte para o model, delega ao serviço real e converte o resultado para DTO de resposta. Assim, o controller lida apenas com DTOs e o service permanece focado na lógica de negócio.

## Consequências

- O controller fica desacoplado da lógica de conversão.
- Fica fácil adicionar lógica extra no proxy.
- O padrão pode ser reutilizado para outros fluxos semelhantes. 
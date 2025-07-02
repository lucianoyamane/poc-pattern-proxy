# 007 - Inversão de Dependência e Proxy

## Contexto

Durante a evolução do projeto, buscou-se promover maior desacoplamento entre as camadas, facilitar testes e permitir a troca de implementações sem impactar o código de alto nível (controller).

## Decisão

Foi adotado o princípio da **Inversão de Dependência** (Dependency Inversion Principle - DIP), um dos princípios do SOLID. O controller passou a depender de uma abstração (proxy/interface) ao invés de uma implementação concreta do serviço. O proxy, por sua vez, depende de uma interface genérica, permitindo a troca fácil da implementação real.

## Consequências

- O controller não conhece detalhes da implementação do serviço, apenas a interface/proxy.
- Facilita a troca de implementações (ex: mocks, stubs, proxies com lógica extra) sem alterar o controller.
- Melhora a testabilidade e manutenção do código.
- O padrão Proxy atua como intermediário, reforçando o desacoplamento e a flexibilidade do sistema.

## Exemplo

```java
BookServiceProxy proxy = BookServiceProxy.create();
BookController controller = BookController.create(proxy);
```

O controller pode receber qualquer implementação de serviço que siga o contrato esperado, promovendo inversão de dependência. 
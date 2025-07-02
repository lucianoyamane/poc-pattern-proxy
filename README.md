# Padrão Proxy em Java Puro

Este projeto demonstra o uso do padrão de projeto **Proxy** em Java puro, inspirado no exemplo do [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/proxy/java/example).

## Estrutura

- `proxy.service.Video` — Classe simples de vídeo
- `proxy.service.VideoService` — Interface do serviço de vídeos
- `proxy.service.RealVideoService` — Implementação real (simula acesso lento)
- `proxy.proxy.VideoServiceProxy` — Proxy que adiciona cache
- `proxy.app.App` — Classe principal para rodar o exemplo

## Como executar

1. Compile os arquivos Java:

```sh
javac -d out src/main/java/proxy/service/*.java src/main/java/proxy/proxy/*.java src/main/java/proxy/app/*.java
```

2. Execute a aplicação:

```sh
java -cp out proxy.app.App
```

## O que o exemplo mostra?

- O acesso direto ao serviço real é sempre "lento" (simula latência de rede).
- O acesso via Proxy utiliza cache, tornando chamadas repetidas muito mais rápidas.

## Referência

- [Refactoring Guru — Proxy em Java](https://refactoring.guru/pt-br/design-patterns/proxy/java/example)
# 006 - Uso do Builder Pattern em DTOs

## Contexto

Durante a evolução do projeto, percebeu-se a necessidade de facilitar a criação de objetos DTOs (`BookRequestDTO` e `BookResponseDTO`), especialmente em cenários com múltiplos campos e possíveis expansões futuras.

## Decisão

Foi implementado o padrão de projeto **Builder** nas classes `BookRequestDTO` e `BookResponseDTO`. O Builder permite a criação fluente e segura dos objetos, tornando o código mais legível e flexível para futuras alterações.

## Consequências

- Facilita a criação de instâncias dos DTOs, especialmente quando há muitos campos.
- Melhora a legibilidade e manutenção do código.
- Permite expansão dos DTOs sem quebrar código existente.
- Mantém compatibilidade com os construtores tradicionais.

## Exemplo de uso

```java
BookRequestDTO req = BookRequestDTO.builder()
    .title("Clean Code")
    .author("Robert C. Martin")
    .build();

BookResponseDTO res = BookResponseDTO.builder()
    .id(1L)
    .title("Clean Code")
    .author("Robert C. Martin")
    .build();
``` 
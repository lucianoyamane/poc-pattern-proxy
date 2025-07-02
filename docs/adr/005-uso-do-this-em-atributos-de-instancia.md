# 005 - Uso do `this` em Atributos de Instância

## Contexto

Durante o desenvolvimento do projeto, surgiu a dúvida sobre quando utilizar o prefixo `this` para acessar atributos de instância nas classes Java.

## Decisão

O projeto seguirá o seguinte padrão:

1. **Sempre usar `this` quando houver ambiguidade**
   - Exemplo: em construtores ou métodos onde o nome do parâmetro é igual ao do atributo.
   ```java
   public class Book {
       private String title;
       public Book(String title) {
           this.title = title; // Necessário
       }
   }
   ```

2. **Nos demais casos, o uso de `this` é opcional**
   - Exemplo: quando não há ambiguidade, pode-se acessar o atributo diretamente.
   ```java
   public void addBook(Book book) {
       books.add(book); // Sem ambiguidade
   }
   ```

3. **Consistência**
   - Recomenda-se manter o padrão em todo o projeto para facilitar a leitura e manutenção.

## Consequências

- O código fica mais limpo e legível, evitando redundância desnecessária.
- O uso do `this` é reservado para situações onde realmente agrega clareza.
- Novos colaboradores podem seguir o mesmo padrão, mantendo a consistência do código. 
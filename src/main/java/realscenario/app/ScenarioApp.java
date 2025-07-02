package realscenario.app;

import realscenario.controller.BookController;
import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;

public class ScenarioApp {
    public static void main(String[] args) {
        BookController controller = BookController.create();

        BookRequestDTO dto1 = BookRequestDTO.builder()
            .title("O Senhor dos Anéis")
            .author("J.R.R. Tolkien")
            .build();
        BookRequestDTO dto2 = BookRequestDTO.builder()
            .title("Dom Quixote")
            .author("Miguel de Cervantes")
            .build();

        BookResponseDTO response1 = controller.createBook(dto1);
        BookResponseDTO response2 = controller.createBook(dto2);

        System.out.println("\nLivros cadastrados:");
        System.out.println(response1.getId() + ": " + response1.getTitle() + " - " + response1.getAuthor());
        System.out.println(response2.getId() + ": " + response2.getTitle() + " - " + response2.getAuthor());
    }
} 
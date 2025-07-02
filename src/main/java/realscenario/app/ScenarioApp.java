package realscenario.app;

import realscenario.controller.BookController;
import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.service.BookService;

public class ScenarioApp {
    public static void main(String[] args) {
        BookController controller = new BookController(new BookService());

        BookRequestDTO dto1 = new BookRequestDTO("O Senhor dos Anéis", "J.R.R. Tolkien");
        BookRequestDTO dto2 = new BookRequestDTO("Dom Quixote", "Miguel de Cervantes");

        BookResponseDTO response1 = controller.createBook(dto1);
        BookResponseDTO response2 = controller.createBook(dto2);

        System.out.println("\nLivros cadastrados:");
        System.out.println(response1.getId() + ": " + response1.getTitle() + " - " + response1.getAuthor());
        System.out.println(response2.getId() + ": " + response2.getTitle() + " - " + response2.getAuthor());
    }
} 
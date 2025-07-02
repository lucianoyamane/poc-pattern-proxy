package realscenario.app;

import realscenario.controller.BookController;
import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;

public class ScenarioApp {
    public static void main(String[] args) {
        BookController controller = BookController.create();

        BookRequestDTO tolkienDTO = BookRequestDTO.builder()
            .title("O Senhor dos Anéis")
            .author("J.R.R. Tolkien")
            .build();
        BookRequestDTO cervantesDTO = BookRequestDTO.builder()
            .title("Dom Quixote")
            .author("Miguel de Cervantes")
            .build();

        BookResponseDTO tolkienResponse = controller.createBook(tolkienDTO);
        BookResponseDTO cervantesResponse = controller.createBook(cervantesDTO);

        System.out.println("\nLivros cadastrados:");
        System.out.println(tolkienResponse.getId() + ": " + tolkienResponse.getTitle() + " - " + tolkienResponse.getAuthor());
        System.out.println(cervantesResponse.getId() + ": " + cervantesResponse.getTitle() + " - " + cervantesResponse.getAuthor());
    }
    
} 
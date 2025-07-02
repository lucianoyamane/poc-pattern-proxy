package realscenario.dto;

public class BookRequestDTO {
    private String title;
    private String author;

    public BookRequestDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
} 
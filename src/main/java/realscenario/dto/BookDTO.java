package realscenario.dto;

public class BookDTO {
    private String title;
    private String author;

    public BookDTO(String title, String author) {
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
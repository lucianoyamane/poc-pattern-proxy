package realscenario.dto;

public class BookRequestDTO {
    private String title;
    private String author;

    public BookRequestDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

    private BookRequestDTO(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String author;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public BookRequestDTO build() {
            return new BookRequestDTO(this);
        }
    }
} 
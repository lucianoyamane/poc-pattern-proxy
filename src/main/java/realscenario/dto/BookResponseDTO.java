package realscenario.dto;

public class BookResponseDTO {
    private Long id;
    private String title;
    private String author;

    public BookResponseDTO(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    private BookResponseDTO(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return "{" +
            "\"id\":" + id + ", " +
            "\"title\":\"" + title + "\", " +
            "\"author\":\"" + author + "\"" +
            "}";
    }

    public static class Builder {
        private Long id;
        private String title;
        private String author;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public BookResponseDTO build() {
            return new BookResponseDTO(this);
        }
    }
} 
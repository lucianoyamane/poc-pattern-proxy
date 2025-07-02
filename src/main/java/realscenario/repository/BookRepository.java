package realscenario.repository;

import java.util.ArrayList;
import java.util.List;

import realscenario.model.Book;

public class BookRepository implements IRepository<Book> {
    private static BookRepository instance;
    private final List<Book> books;
    private long nextId;

    private BookRepository() {
        this.books = new ArrayList<>();
        this.nextId = 1;
    }

    public static synchronized BookRepository getInstance() {
        if (instance == null) {
            instance = new BookRepository();
        }
        return instance;
    }

    public synchronized Book save(Book book) {
        Book bookToSave = Book.builder()
            .id(nextId++)
            .title(book.getTitle())
            .author(book.getAuthor())
            .build();
        books.add(bookToSave);
        return bookToSave;
    }
} 
package realscenario.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import realscenario.model.Book;

public class BookRepository {
    private static BookRepository instance;
    private final List<Book> books = new ArrayList<>();
    private long nextId = 1;

    private BookRepository() {}

    public static synchronized BookRepository getInstance() {
        if (instance == null) {
            instance = new BookRepository();
        }
        return instance;
    }

    public synchronized Book save(Book book) {
        Book bookToSave = new Book(nextId++, book.getTitle(), book.getAuthor());
        books.add(bookToSave);
        return bookToSave;
    }

    public List<Book> getAll() {
        return Collections.unmodifiableList(books);
    }
} 
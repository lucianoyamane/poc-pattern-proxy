package realscenario.service;

import java.util.ArrayList;
import java.util.List;

import realscenario.dto.BookResponseDTO;
import realscenario.model.Book;

public class BookService {
    private List<Book> books = new ArrayList<>();
    private long nextId = 1;

    public BookResponseDTO save(Book book) {
        Book bookToSave = new Book(nextId++, book.getTitle(), book.getAuthor());
        books.add(bookToSave);
        System.out.println("Livro salvo: " + bookToSave.getTitle() + " (ID: " + bookToSave.getId() + ")");
        return new BookResponseDTO(bookToSave.getId(), bookToSave.getTitle(), bookToSave.getAuthor());
    }

    public List<Book> getAll() {
        return books;
    }
} 
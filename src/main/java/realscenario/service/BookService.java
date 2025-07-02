package realscenario.service;

import realscenario.model.Book;
import realscenario.repository.BookRepository;

public class BookService implements IBookService<Book, Book> {
    private final BookRepository repository;

    private BookService(BookRepository repository) {
        this.repository = repository;
    }

    public static BookService create() {
        return new BookService(BookRepository.getInstance());
    }

    @Override
    public Book save(Book book) {
        Book bookToSave = repository.save(book);
        System.out.println("Livro salvo: " + bookToSave.getTitle() + " (ID: " + bookToSave.getId() + ")");
        return bookToSave;
    }
} 
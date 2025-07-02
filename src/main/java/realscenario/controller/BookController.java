package realscenario.controller;

import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.model.Book;
import realscenario.service.BookService;

public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public BookResponseDTO createBook(BookRequestDTO dto) {
        Book book = new Book(null, dto.getTitle(), dto.getAuthor());
        return bookService.save(book);
    }
} 
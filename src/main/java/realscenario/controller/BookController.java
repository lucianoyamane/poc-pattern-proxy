package realscenario.controller;

import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.service.BookServiceProxy;
import realscenario.service.IBookService;

public class BookController {
    private final IBookService<BookRequestDTO, BookResponseDTO> bookService;

    public static BookController create() {
        IBookService<BookRequestDTO, BookResponseDTO> proxy = BookServiceProxy.create();
        return new BookController(proxy);
    }

    public BookController(IBookService<BookRequestDTO, BookResponseDTO> bookService) {
        this.bookService = bookService;
    }

    public BookResponseDTO createBook(BookRequestDTO dto) {
        return bookService.save(dto);
    }
} 
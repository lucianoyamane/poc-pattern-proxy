package realscenario.controller;

import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.service.BookServiceProxy;

public class BookController {
    private BookServiceProxy bookServiceProxy;

    public static BookController create() {
        BookServiceProxy proxy = BookServiceProxy.create();
        return new BookController(proxy);
    }

    public BookController(BookServiceProxy bookServiceProxy) {
        this.bookServiceProxy = bookServiceProxy;
    }

    public BookResponseDTO createBook(BookRequestDTO dto) {
        return bookServiceProxy.save(dto);
    }
} 
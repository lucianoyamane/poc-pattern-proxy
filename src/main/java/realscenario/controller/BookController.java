package realscenario.controller;

import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.service.BookServiceProxy;
import realscenario.service.IBookService;

public class BookController {
    private IBookService<BookRequestDTO, BookResponseDTO> bookServiceProxy;

    public static BookController create() {
        IBookService<BookRequestDTO, BookResponseDTO> proxy = BookServiceProxy.create();
        return new BookController(proxy);
    }

    public BookController(IBookService<BookRequestDTO, BookResponseDTO> bookServiceProxy) {
        this.bookServiceProxy = bookServiceProxy;
    }

    public BookResponseDTO createBook(BookRequestDTO dto) {
        return bookServiceProxy.save(dto);
    }
} 
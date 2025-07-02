package realscenario.service;

import realscenario.dto.BookRequestDTO;
import realscenario.dto.BookResponseDTO;
import realscenario.model.Book;

public class BookServiceProxy implements IBookService<BookRequestDTO, BookResponseDTO>{
    private IBookService<Book, Book> bookService;

    public static BookServiceProxy create() {
        BookService realService = BookService.create();
        return new BookServiceProxy(realService);
    }

    public BookServiceProxy(IBookService<Book, Book> bookService) {
        this.bookService = bookService;
    }

    @Override
    public BookResponseDTO save(BookRequestDTO requestDTO) {

        Book book = new Book(null, requestDTO.getTitle(), requestDTO.getAuthor());
        Book bookSaved = bookService.save(book);
        return BookResponseDTO.builder()
            .id(bookSaved.getId())
            .title(bookSaved.getTitle())
            .author(bookSaved.getAuthor())
            .build();
    }
} 
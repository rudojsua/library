package com.olua.library.controller;

import com.olua.library.model.Book;
import com.olua.library.servises.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/")
    public Iterable<Book> getAllBooks(
            @RequestParam(required = false) String title
    ) {
        if (title == null) {
            return bookService.findAll();
        } else
            return bookService.findBookByTitle(title);
    }
}

package com.olua.library.servises;

import com.olua.library.model.Book;
import com.olua.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
@EnableJdbcRepositories
@Service
public class BookService {
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    public List<Book> findBookByTitle(String title) {
        return bookRepository.findBooksByTitle(title);
    }

    public Book findBookById(long id) {
        return bookRepository.findBookById(id);
    }
}

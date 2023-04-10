package com.olua.library.repositories;

import com.olua.library.model.Book;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@EnableJdbcRepositories
public interface BookRepository extends CrudRepository <Book, Long> {

    @Query("SELECT * FROM book WHERE id= :id")
    Book findBookById(long id);
    @Query("SELECT*FROM book WHERE title= :title")
    List<Book> findBooksByTitle(String title);

}

package org.generation.italy.helloSpringWeb.model.services;

import org.generation.italy.helloSpringWeb.model.entities.Book;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    List<Book> getAllBooks();
    Optional<Book> findBookById(long id);
    boolean updateBook(Book newBook);
    boolean deleteBook(long id);
    Book save(Book newBook);
}

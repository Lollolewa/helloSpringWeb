package org.generation.italy.helloSpringWeb.model.services;

import org.generation.italy.helloSpringWeb.model.entites.Book;
import org.generation.italy.helloSpringWeb.model.repositories.BookRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LibraryServiceJPA implements LibraryService{
    private BookRepositoryJPA bookRepo;

    @Autowired
    public LibraryServiceJPA(BookRepositoryJPA bookRepo){
        this.bookRepo = bookRepo;
        System.out.println("Chiamato il costruttore del library service");
        System.out.println(this.bookRepo.getClass().getName());
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> findBookById(long id) {
        return bookRepo.findById(id);
    }

    @Override
    public boolean updateBook(Book newBook) {
        if (!bookRepo.existsById(newBook.getId())){
            return false;
        }
        bookRepo.save(newBook);
        return true;
    }

    @Override
    public boolean deleteBook(long id) {
        if (!bookRepo.existsById(id)){
            return false;
        }
        bookRepo.deleteById(id);
        return true;
    }

    @Override
    public Book save(Book newBook) {
        return bookRepo.save(newBook);
    }
}

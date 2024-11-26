package org.generation.italy.helloSpringWeb.controllers;

import org.generation.italy.helloSpringWeb.model.entites.Book;
import org.generation.italy.helloSpringWeb.model.services.LibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    private LibraryService libraryService;
    public BookController(LibraryService libraryService) {
        this.libraryService = libraryService;
        System.out.println("Chiamato il costruttore del BookController");
    }
    @GetMapping
    public String listBooks(Model model){
        List<Book> books = this.libraryService.getAllBooks();
        model.addAttribute("BOOKS",books);
        return "books/list";
    }
}
package org.generation.italy.helloSpringWeb.controllers;


import org.generation.italy.helloSpringWeb.model.entites.Book;
import org.generation.italy.helloSpringWeb.model.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
//    private List<Book> books = List.of(
//            new Book(1,"DarkGay", 444,250),
//            new Book(2,"BlackSlave_Nigger",999,35)
//    );
    private LibraryService libraryService;
    @Autowired
    public BookController(LibraryService libraryService){
        this.libraryService = libraryService;
        System.out.println("chiamato il costruttore del bookController");
    }
    @GetMapping
    public String listBooks(Model model){
        List<Book> books = this.libraryService.getAllBooks();
        model.addAttribute("BOOKS",books);
        return "books/list";
    }
    @PostMapping
    public String saveBook(@ModelAttribute("BOOK") Book book){
        this.libraryService.save(book);
        return "redirect:/books";
    }
    @GetMapping("/create")
    public String createBook(Model model){
        model.addAttribute("BOOK", new Book());
        return "books/form";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.libraryService.deleteBook(id);
        return "redirect:/books";
    }
}

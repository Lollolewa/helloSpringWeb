package org.generation.italy.helloSpringWeb.controllers;

import org.generation.italy.helloSpringWeb.model.entites.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    private List<Book> books = List.of(
            new Book(1,"Cl-IT", 350,29.99),
            new Book(2,"Il Signore dei Piselli",590,35.99)
    );
    @GetMapping
    public String listBooks(Model model){
        model.addAttribute("BOOKS",books);
        return "books/list";
    }
}
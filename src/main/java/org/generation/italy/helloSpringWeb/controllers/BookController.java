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
            new Book(1,"DarkGay", 444,250),
            new Book(2,"BlackSlave_Nigger",999,35)
    );
    @GetMapping
    public String listBooks(Model model){
        model.addAttribute("BOOKS",books);
        return "books/list";
    }

}

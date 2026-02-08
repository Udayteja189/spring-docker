package com.dev.docker.controller;

import com.dev.docker.entity.Book;
import com.dev.docker.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @PostMapping()
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

}

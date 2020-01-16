package com.jony.controller;

import com.jony.pojo.Book;
import com.jony.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    // controller call service
    @Resource
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // Query all books and show then in browser
    @RequestMapping("/all")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.queryAllBooks();
        System.out.println("yes!");
        model.addAttribute("books", books);
        return "all_book";
    }
}

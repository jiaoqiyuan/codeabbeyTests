package com.jony.service;

import com.jony.pojo.Book;

import java.util.List;

public interface BookService {
    // add
    int addBook(Book book);

    // delete
    int deleteBookById(int bookId);

    // modify
    int updateBook(Book book);

    // query
    Book queryBookById(int id);

    List<Book> queryAllBooks();
}
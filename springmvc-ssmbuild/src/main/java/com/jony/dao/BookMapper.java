package com.jony.dao;

import com.jony.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // add
    int addBook(Book book);

    // delete
    int deleteBookById(@Param("bookId") int bookId);

    // modify
    int updateBook(Book book);

    // query
    Book queryBookById(@Param("bookId") int bookId);

    List<Book> queryAllBooks();
}

package com.jony.service;

import com.jony.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookServiceTest {
    @Test
    public void testBookServiceImpl() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        List<Book> books = bookServiceImpl.queryAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

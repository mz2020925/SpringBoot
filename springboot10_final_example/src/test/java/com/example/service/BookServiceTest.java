package com.example.service;

import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void getById(){
        Book book = bookService.getById(2);
        System.out.println(book);  // 正规测试中需要用assert作断言匹配测试，这里只是打印一下
    }

    @Test
    public void getAll(){
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);
    }
}

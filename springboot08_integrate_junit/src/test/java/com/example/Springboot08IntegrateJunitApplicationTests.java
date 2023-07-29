package com.example;

import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot08IntegrateJunitApplication.class)
class Springboot08IntegrateJunitApplicationTests {
	@Autowired
	private BookService bookService;
	@Test
	public void save() {
		bookService.save();
	}

}

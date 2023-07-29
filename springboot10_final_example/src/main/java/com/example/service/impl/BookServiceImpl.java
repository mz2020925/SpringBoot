package com.example.service.impl;

import com.example.controller.Code;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.exception.BusinessException;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        // 测试异常捕获与处理，把异常封装成自定义异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请勿进行非法操作");
        }

        // try {
        //     int i = 1/0;
        // }catch (Exception e){
        //     throw new SystemException(Code.SYSTEM_ERR, "服务器访问超时，请重试", e);
        // }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

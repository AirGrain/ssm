package com.xuyuan.service.impl;

import com.xuyuan.dao.BookDao;
import com.xuyuan.domain.Book;
import com.xuyuan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 0:21
 * @Description:
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(int id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

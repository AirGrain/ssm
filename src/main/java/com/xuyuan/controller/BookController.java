package com.xuyuan.controller;

import com.xuyuan.domain.Book;
import com.xuyuan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 0:28
 * @Description:
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        if (flag) return new Result().setCode(ResCode.SAVE_OK).setData(flag);
        else return new Result().setCode(ResCode.SAVE_ERR).setData(flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        if (flag) return new Result().setCode(ResCode.UPDATE_OK).setData(flag);
        else return new Result().setCode(ResCode.UPDATE_ERR).setData(flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        boolean flag = bookService.delete(id);
        if (flag) return new Result().setCode(ResCode.DELETE_OK).setData(flag);
        else return new Result().setCode(ResCode.DELETE_ERR).setData(flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {

        // 模拟异常
        //if (id == 1) {
        //    int i = 1 / 0;
        //}

        Book book = bookService.getById(id);
        int code = book != null ? ResCode.GET_OK : ResCode.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试！";
        return new Result().setCode(code).setData(book).setMsg(msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        int code = bookList != null ? ResCode.GET_OK : ResCode.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试！";
        return new Result().setCode(code).setData(bookList).setMsg(msg);
    }
}

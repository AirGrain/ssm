package com.xuyuan.service;

import com.xuyuan.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 0:20
 * @Description:
 */

@Transactional
public interface BookService {
    /**
     * 添加书籍
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 修改书籍
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 删除书籍
     * @param id
     * @return
     */
    boolean delete(int id);

    /**
     * 按id查找
     * @param id
     * @return
     */
    Book getById(int id);

    /**
     * 查找全部
     * @return
     */
    List<Book> getAll();
}

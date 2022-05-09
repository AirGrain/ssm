package com.xuyuan.dao;

import com.xuyuan.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 0:13
 * @Description: Book的数据层接口
 */

//TODO 添加Mapper映射，进行自动代理
@Mapper
public interface BookDao {
    //@Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description})")
    void save(Book book);

    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id = #{id}")
    void update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    void delete(int id);

    @Select("select * from tbl_book where id = #{id}")
    Book getById(int id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}

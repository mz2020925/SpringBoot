package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper，通过代理开发的方式创建接口的实现类
@Mapper
public interface BookDao {
    // @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description})")  // 这里的#{type}是Book类的属性，不是表里面的列名
    @Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    // 前面的(type, name, description)是表里面的列名，后面的的#{type}是Book类的属性，不是表里面的列名
    int save(Book book);

    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    int update(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    int delete(Integer id);

    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}

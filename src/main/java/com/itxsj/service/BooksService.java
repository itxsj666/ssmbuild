package com.itxsj.service;

import com.itxsj.pojo.Books;

import java.util.List;

public interface BooksService {
    //查询全部
    List<Books> findAll();

    //根据id查询
    Books findId(int bookid);

    //根据id删除
    Integer findDel(int bookid);

    //添加
    Integer findAdd(Books books);

    //修改
    Integer findUpd(Books books);

    //根据名称查询
    List<Books> findList(String bookName);
}

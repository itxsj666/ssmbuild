package com.itxsj.service.impl;

import com.itxsj.mapper.BooksMapper;
import com.itxsj.pojo.Books;
import com.itxsj.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksSerivceimpl implements BooksService {
    //调用mapper
    private BooksMapper booksMapper;

    public BooksSerivceimpl(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public List<Books> findAll() {
        return booksMapper.findAll();
    }

    @Override
    public Books findId(int bookid) {
        return booksMapper.findId(bookid);
    }

    @Override
    public Integer findDel(int bookid) {
        return booksMapper.findDel(bookid);
    }

    @Override
    public Integer findAdd(Books books) {
        return booksMapper.findAdd(books);
    }

    @Override
    public Integer findUpd(Books books) {
        return booksMapper.findUpd(books);
    }

    @Override
    public List<Books> findList(String bookName) {
        return booksMapper.findList(bookName);
    }

    public void setBooksMapper(BooksMapper booksMapper) {
    }
}

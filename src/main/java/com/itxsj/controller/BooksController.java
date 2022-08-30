package com.itxsj.controller;

import com.itxsj.pojo.Books;
import com.itxsj.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BooksController {

    @Autowired
    private BooksService booksService;

    @RequestMapping("/book")
    public String findAll(Model model) {
        List<Books> booksList = booksService.findAll();
        model.addAttribute("booksList", booksList);
        return "book";
    }

    @RequestMapping("/bookupd")
    public String findupd(int id, Model model) {
        //点击修改按钮获取id跳转到修改页面
        Books id1 = booksService.findId(id);
        model.addAttribute("bk", id1);
        return "upd";
    }

    @RequestMapping("/bookupds")
    public String tofindupd(Books books) {
        booksService.findUpd(books);
        return "redirect:/book";//重定向
    }

    //删除
    @RequestMapping("/bookdel")
    public String finddel(Model model, int id) {
        System.out.println(id);
        booksService.findDel(id);
        List<Books> booksList = booksService.findAll();
        model.addAttribute("booksList", booksList);
        return "redirect:/book";//重定向
    }

    @RequestMapping("/bookins")
    public String findins() {
        return "ins";
    }

    @RequestMapping("/bookinss")
    public String findinss(Books books,Model model) {
        booksService.findAdd(books);
        List<Books> booksList = booksService.findAll();
        model.addAttribute("booksList", booksList);
        return "redirect:/book";
    }

    @RequestMapping("/bookList")
    public String findList(String bookName,Model model) {
        List<Books> list = booksService.findList(bookName);
        model.addAttribute("booksList", list);
        return "book";
    }
}

package com.arshadansari.BookStrore.Controller;

import com.arshadansari.BookStrore.Entity.Book;
import com.arshadansari.BookStrore.Entity.MyBook;
import com.arshadansari.BookStrore.Service.BookService;
import com.arshadansari.BookStrore.Service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    MyBookService myBookService;

    @GetMapping("/home")
    public String hello(){
        return "home";
    }

    @GetMapping("/book_register")
    public String book_register(){
        return "book_register";
    }

//    @GetMapping("/available_books")
//    public String available_books(){
//        return "available_books";
//    }

//    @GetMapping("/my_books")
//    public String my_books(){
//        return "my_books";
//    }


    @PostMapping("/save")
    public String saveBook(@ModelAttribute Book book){
        bookService.save(book);
        return "redirect:/available_books";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBooks(){
        List<Book> list = bookService.getAllBooks();
//        ModelAndView m = new ModelAndView();
//        m.setViewName("available_books");
//        m.addObject("book", list);
        return new ModelAndView("available_books", "book", list);
    }

    @RequestMapping("/mylist/{id}")
    public String addBookToMyBooks(@PathVariable("id") int id){
        Book book = bookService.getBookById(id);
        MyBook myBook = new MyBook(book.getId(), book.getName(), book.getAuthor(), book.getPrice());
        myBookService.saveById(myBook);

        return "redirect:/my_books";
    }

    @GetMapping("/my_books")
    public ModelAndView my_books(){
        List<MyBook> myBookList = myBookService.getAllMyBooks();

        return new ModelAndView("my_books", "mybook", myBookList);
    }

    @RequestMapping("/deletemybook/{id}")
    public String deleteMyBookById(@PathVariable("id") int id){
        myBookService.deleteMyBookById(id);
        return "redirect:/my_books";
    }
}

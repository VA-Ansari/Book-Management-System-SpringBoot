package com.arshadansari.BookStrore.Service;

import com.arshadansari.BookStrore.Entity.Book;
import com.arshadansari.BookStrore.Entity.MyBook;
import com.arshadansari.BookStrore.Repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyBookServiceImpl implements MyBookService {
    @Autowired
    MyBookRepository myBookRepository;
    @Autowired
    BookService bookService;

    @Override
    public void saveById(MyBook myBook) {
         myBookRepository.save(myBook);
    }

    @Override
    public List<MyBook> getAllMyBooks() {
        return myBookRepository.findAll();
    }

    @Override
    public void deleteMyBookById(int id) {
        myBookRepository.deleteById(id);
    }
}

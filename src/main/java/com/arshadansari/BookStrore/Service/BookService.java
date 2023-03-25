package com.arshadansari.BookStrore.Service;

import com.arshadansari.BookStrore.Entity.Book;

import java.util.List;


public interface BookService {
    Book save(Book book);

    List<Book> getAllBooks();

    Book getBookById(int id);
}

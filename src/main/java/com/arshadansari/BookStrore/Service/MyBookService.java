package com.arshadansari.BookStrore.Service;


import com.arshadansari.BookStrore.Entity.MyBook;

import java.util.List;

public interface MyBookService {
    void saveById(MyBook myBook);

    List<MyBook> getAllMyBooks();

    void deleteMyBookById(int id);
}

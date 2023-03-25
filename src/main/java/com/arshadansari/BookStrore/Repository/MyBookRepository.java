package com.arshadansari.BookStrore.Repository;

import com.arshadansari.BookStrore.Entity.MyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBook, Integer> {

}

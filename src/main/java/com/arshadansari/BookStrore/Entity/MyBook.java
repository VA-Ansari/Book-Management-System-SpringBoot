package com.arshadansari.BookStrore.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mybook_table")
public class MyBook {
    @Id
    @Column(name = "book_id")
    private int id;
    private String name;
    private String author;
    private String price;
}


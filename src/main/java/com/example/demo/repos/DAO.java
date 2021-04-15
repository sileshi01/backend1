package com.example.demo.repos;

import com.example.demo.models.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 12:23
 * Project:backend1
 * Copyright: MIT
 */
public class DAO {
    public List<Book> getAllBooks(){
        Book b1 = new Book(1,"t1","a1");
        Book b2 = new Book(2,"t2","a2");
        Book b3 = new Book(3,"t3","a3");
        Book b4 = new Book(4,"t4","a4");
        Book b5 = new Book(5,"t5","a5");
        Book b6 = new Book(6,"t6","a6");

        //return Arrays.asList(b1,b2,b3,b4,b5,b6);
        List<Book>mybooks=new ArrayList<>();
        mybooks.add(b1);
        mybooks.add(b2);
        mybooks.add(b3);
        mybooks.add(b4);
        mybooks.add(b5);
        mybooks.add(b6);


        return mybooks;

    }
}

package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Message;
import com.example.demo.repos.DAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 12:34
 * Project:backend1
 * Copyright: MIT
 */
@RestController
public class BookControler {
    @RestController
    public class BookController {
        DAO db = new DAO();
        List<Book> myBooks = db.getAllBooks();

        @RequestMapping("/book")
        public List<Book> book() {
            return myBooks;

        }

        @RequestMapping("/book/{id}")
        public Book bookById(@PathVariable int id) {
            for (Book b : myBooks) {
                if (b.getId() == id) {
                    return b;
                }

            }
            return null;

        }

        @PostMapping("/book/add")
        public String addBookById(@RequestBody Book b) {
            myBooks.add(b);
            return "book added";

        }

        @RequestMapping("/book/{id}/delete")
        public String deleteBookById(@PathVariable int id) {
            int indexToRemove = -1;

            for (int i = 0; i < myBooks.size(); i++) {
                if (myBooks.get(i).getId() == id) {
                    indexToRemove = i;
                }

            }
            if (indexToRemove != -1) {
                myBooks.remove(indexToRemove);
                return "Boken med id " + id + "är borttagen";
            }
            return "Bokem med id "+id + "kund inte tas bort";

        }
        @PostMapping("/book/upsert")
        public Message upsertBook(@RequestBody Book b){
            int indexToUpdate = -1;
            for (int i= 0; i<myBooks.size();i++) {
                if (myBooks.get(i).getId()==b.getId()) {
                    indexToUpdate=i;
                }

            }
            if (indexToUpdate==-1){
                myBooks.add(b);
                Message m = new Message(true,"Book was created");
                return m;
            }
            else {
                myBooks.set(indexToUpdate,b);
                Message m = new Message(true,"Book was updated");
                return m;
            }


        }
    }

}

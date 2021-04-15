package com.example.demo.models;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 13:23
 * Project:backend1
 * Copyright: MIT
 */
public class Book {
    protected int id;
    protected String title;
    protected String author;

    public Book(){}
    public Book(int id,String title,String author){
        this.id= id;
        this.title= title;
        this.author= author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

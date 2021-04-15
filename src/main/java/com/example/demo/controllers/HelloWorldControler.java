package com.example.demo.controllers;

import com.example.demo.models.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 13:34
 * Project:backend1
 * Copyright: MIT
 */
@RestController
public class HelloWorldControler {
    @RequestMapping("/")
    public String index() {
        return "Hello Worldaa";
    }

    @RequestMapping("/a")
    public String index2() {
        return "Hello Worldaaaa";
    }

    @RequestMapping("/hej")
    public String hej(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hej2")
    public String hej2(@RequestParam String firstname, @RequestParam String lastname) {
        return "Hello " + firstname + " " + lastname;
    }

    @RequestMapping("/hej3")
    public String hej3(@RequestParam List<String> names) {
        return "Hello " + names;
    }
    @RequestMapping("/swe")
    public String indexSvenska(){
        return "Hejsan världen";
    }
    @RequestMapping("/esp")
    public String indexEsp(){
        return "Hola Mundo";
    }
    @RequestMapping("/helloOptional")
    public String helloOptional(@RequestParam(required = false) String firstname,@RequestParam(required = false) String lastname) {
        String name =" ";
        if (firstname != null){
            name= firstname;
        }
        if (lastname != null){
            if (name.length()==0) name= lastname;
            else name+= " "+ lastname;
        }
        return "Hej " + name;

    }
    @RequestMapping("/defaultHello")
    public String defaultHello(@RequestParam(defaultValue = "sileshi") String name){
        return "Hej "+ name;
    }
    @RequestMapping("/helloHTML")
    public String helloHTML(@RequestParam String firstname, @RequestParam String lastname){
        return "<h1>Hejsan " + firstname + " "+ lastname + "</h1>";
    }
    @RequestMapping("/bookJSON")
    public Book bookJSON(){
        return new Book(3,"java","dannis");
    }


}

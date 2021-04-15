package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.repos.DAOKompis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 12:34
 * Project:backend1
 * Copyright: MIT
 */
@RestController
public class KompisController {
    DAOKompis kdo = new DAOKompis();
    List<Kompis> friends= kdo.getAllKompis();

    @RequestMapping("/kompis")
    public List<Kompis> kompis() {
        return friends;

    }
}

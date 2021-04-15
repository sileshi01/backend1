package com.example.demo.repos;

import com.example.demo.models.Kompis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 12:43
 * Project:backend1
 * Copyright: MIT
 */
public class DAOKompis {
    public List<Kompis> getAllKompis(){
        Kompis k1 = new Kompis(1,"sileshi","lagman","0723334");
        Kompis k2 = new Kompis(2,"misrak","fittja","0723376");
        Kompis k3 = new Kompis(3,"yodeal","husby","0723456");

        List<Kompis> friends = new ArrayList<>();
        friends.add(k1);
        friends.add(k2);
        friends.add(k3);
        return friends;
    }
}

package com.example.demo.models;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-15
 * Time: 13:24
 * Project:backend1
 * Copyright: MIT
 */
public class Kompis {
    protected int id;
    protected String name;
    protected String address;
    protected String telefonNumber;
    public Kompis(){}
    public Kompis(int id,String name,String address, String telefonNumber){
        this.id=id;
        this.name=name;
        this.address=address;
        this.telefonNumber=telefonNumber;
    }

    @Override
    public String toString() {
        return "Kompis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }
}

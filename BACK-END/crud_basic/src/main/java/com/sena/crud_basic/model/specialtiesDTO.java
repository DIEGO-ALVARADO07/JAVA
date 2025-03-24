package com.sena.crud_basic.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class specialtiesDTO {

    @Entity(name = "specialties") 
    public class usersDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_specialties;

    @Column(name="name",nullable = false,length = 15)
    private String name;

    public int getId(){
        return id_specialties;
    }

    public void setId(int id_specialties){
        this.id_specialties = id_specialties;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
}


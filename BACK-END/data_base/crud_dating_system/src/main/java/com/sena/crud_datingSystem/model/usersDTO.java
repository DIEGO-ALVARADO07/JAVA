package com.sena.crud_datingSystem.model;

import java.lang.annotation.Documented;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Para indicar que la clase es un mode, se utiliza
  la anotación bean @Entity

 * name=El nombre de la entidad en la base de datos

*/

@Entity(name = "users")
public class usersDTO {
    /*
     * DTO= Data Transfer Object
     * las clases DTO contienen las entidades de la base
     * de datos
     */
    // id=PRIMARY KEY
    // GeneratedValue=Auto incremental
    // @Column=para indicar que el atributo es una columna
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id_user;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "role", nullable = false)
    private Rrole role; 

    // SETTERS AND GETTERS
    public int getId_user() {
        return id_user;
    }

    public void setId_user (){
        this.id_user = id_user;
    }
    
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name() {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name() {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String setPhone() {
        return phone;
    }

    public void getPhone() {
        this.phone = phone;
    }

    public Rrole setRole() {
        return role; 
    }

    public void getRole() {
        this.role = role;
    }

}

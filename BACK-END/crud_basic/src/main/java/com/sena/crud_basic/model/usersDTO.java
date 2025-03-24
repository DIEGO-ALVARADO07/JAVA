package com.sena.crud_basic.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Para indicar que la clase es un modelo, se utiliza
 * la anotación bean @Entity
 * name=El nombre de la entidad en la base datos
 */
@Entity(name = "users")
public class usersDTO {
    /*
     * DTO= Data Transfer Object
     * las clases DTO contienen las entidades de la base
     * de datos
     */
    //id=PRIMARY KEY
    //GeneratedValue=Auto incremental
    //@Column=para indicar que el atributo es una columna
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_user;

    @Column(name="first_name",nullable = false,length = 15)
    private String first_name;

    @Column(name="last_name",nullable = false,length = 15)
    private String last_name;

    @Column(name="email",nullable = false,length = 50)
    private String email;

    @Column(name="phone",nullable = false,length = 20)
    private String phone;

    @Column(name="role", nullable = false)
    private UserRole role;

    
// agregar la n cantidad de columnas

    public usersDTO(int id_user, String first_name, String last_name, String email, String phone, UserRole role) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public UserRole getRole(){
        return role;
    }

    public void setRole(UserRole role){
        this.role = role;
    }

}

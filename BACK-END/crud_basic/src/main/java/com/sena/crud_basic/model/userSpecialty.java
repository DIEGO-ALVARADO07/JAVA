package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity(name = "user_specialty")
public class userSpecialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_specialty")
    private int id_user_specialty;

    @Column(name = "id_user")
    private usersDTO id_user;

    @Column(name = "id_specialties")
    private specialtiesDTO id_specialties;

    public userSpecialty(int id_user_specialty, usersDTO id_user, specialtiesDTO id_specialties) {
        this.id_user_specialty = id_user_specialty;
        this.id_user = id_user;
        this.id_specialties = id_specialties;
    }

    public int getIdUserSpecialty(){
        return id_user_specialty;
    }

    public void setIdUserSpecialty(int id_user_specialty){
        this.id_user_specialty = id_user_specialty;
    }
    
    public usersDTO getIdUser(){
        return id_user;
    }

    public void setIdUser(usersDTO id_user){
        this.id_user = id_user;
    }

    public specialtiesDTO setIdSpecialties(){
        return id_specialties;
    }

    public void getIdSpecialties(specialtiesDTO id_specialties){
        this.id_specialties = id_specialties;
    }
}

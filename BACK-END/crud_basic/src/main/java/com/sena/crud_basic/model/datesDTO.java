package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity(name = "dates")
public class datesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_date")
    private int id_date;

    @Column(name = "id_user")
    private usersDTO id_user;

    @Column(name = "id_timeTable")
    private timeTableDTO id_timeTable;

}

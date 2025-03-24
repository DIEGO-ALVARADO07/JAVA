package com.sena.crud_basic.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity(name = "timetables")
public class timeTableDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_timetable")
    private int id_timetable;

    @Column(name = "id_user")
    private usersDTO id_user;

    @Column(name = "hour")
    private LocalDateTime hour;

    @Column(name = "duration")
    private LocalTime duration;




}

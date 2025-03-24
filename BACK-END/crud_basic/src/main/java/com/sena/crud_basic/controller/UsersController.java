package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.model.usersDTO;
import com.sena.crud_basic.service.UsersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    //método para crear un registro POST
    @PostMapping("/")
    public String registerUser(
        @RequestBody usersDTO user
        ){
            usersService.save(user);
        return "register ok";
    }


    @GetMapping("/")
    public ResponseEntity<Object> getUserAll() {
        var prueba=usersService.getAllUser();
        
        return new ResponseEntity<>(prueba, HttpStatus.OK);
    }

    

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserId(@PathVariable int id) {
        var prueba=usersService.getUserById(id);
        
        return new ResponseEntity<>(prueba, HttpStatus.OK);
    }

}

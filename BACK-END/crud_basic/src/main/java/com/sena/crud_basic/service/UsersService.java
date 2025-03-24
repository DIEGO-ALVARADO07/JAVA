package com.sena.crud_basic.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.crud_basic.repository.IUsersRepository;
import com.sena.crud_basic.model.usersDTO;

/*
 * Agregamos la anotación bean @Service
 * Para indicar que el archivo es un servicio
 */
@Service
public class UsersService{

    //se realiza la conexión con el repositorio
    @Autowired
    private IUsersRepository ICustomerRepository;

    /*
     * crear
     * eliminar
     * actualizar
     * leer lista completa
     * leer el cliente por id
     * adicional los requeridos
     * 
     */





    public List<usersDTO> getAllCustomer(){
        return ICustomerRepository.findAll();
    }

    public usersDTO getCustomerById(int id){
        return IUsersRepository.findById(id).get();
    }

    public boolean save(usersDTO user){
        /*
         * if(customer.getId==0)register or create
         * else update
         */
        ICustomerRepository.save(user);
        return true;
    }
    
}

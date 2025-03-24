package com.sena.crud_basic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crud_basic.model.usersDTO;
//extedemos de JPA para generar la conexión
//JpaRepository<modelo,tipoPK>
public interface IUsersRepository extends JpaRepository<usersDTO,Integer>{

    /*
     * C
     * R
     * U
     * D
     */
    
} 

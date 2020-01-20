package com.italoalmeida.ptg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.italoalmeida.ptg.models.User;

import javax.transaction.Transactional;


public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("SELECT u FROM User u WHERE u.phones = ?1")
    public User findByEmail(String email);





    //UPDATE employees
    //SET
    //    email = 'mary.patterson@classicmodelcars.com'
    //WHERE
    //    employeeNumber = 1056;


}

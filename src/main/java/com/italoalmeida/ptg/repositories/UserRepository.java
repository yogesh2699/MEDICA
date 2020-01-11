package com.italoalmeida.ptg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.italoalmeida.ptg.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.phones = ?1")
    public User findByEmail(Long email);

}

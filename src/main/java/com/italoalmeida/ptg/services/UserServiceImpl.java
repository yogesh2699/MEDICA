package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italoalmeida.ptg.models.User;
import com.italoalmeida.ptg.repositories.UserRepository;
import com.italoalmeida.ptg.validators.UserValidator;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserValidator userValidator;
	
	@Override
	public User save(User user) throws Exception {
		
		userValidator.validate(user);
		
		this.encryptPassword(user);
		
		return userRepository.save(user);
	}

	@Override
	public User findByPhones(String phone) {
		Optional<User> result = userRepository.findById(phone);

		User user = null;

		if (result.isPresent()) {
			user = result.get();
		}
		else {

			throw new RuntimeException("Did not find User by Phone - " + phone);
		}

		return user;
	}




	private void encryptPassword(User user) {
		String encryptedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		//user.setPassword(encryptedPassword);
	}

}

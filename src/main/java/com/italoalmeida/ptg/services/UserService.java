package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.User;

public interface UserService {
	
	public User save(User user) throws Exception;

	public User findByPhones(String phone);



}

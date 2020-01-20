package com.italoalmeida.ptg.restcontrollers;

import javax.servlet.http.HttpServletRequest;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.User;
import com.italoalmeida.ptg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.italoalmeida.ptg.security.JwtTokenUtil;
import com.italoalmeida.ptg.security.JwtUser;
import com.italoalmeida.ptg.services.AuthorizationService;


@RestController
@RequestMapping(value = "/")
public class UserRestController {

	UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@Value("${jwt.header.authorization}")
    private String authorization;

	@Autowired
	AuthorizationService authorizationService;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	@GetMapping("/me")
	private ResponseEntity<Object> me(HttpServletRequest request) 
			throws Exception {

		String token = request.getHeader(authorization);
		
		authorizationService.authorize(token);
		
		JwtUser jwtUser = jwtTokenUtil.getUserFromToken(token);
		
		return ResponseEntity.ok().body(jwtUser);
	}

	@GetMapping("/mebyPhone")
	public User getbyPhone(@RequestParam String Phone) {

		User user = userService.findByPhones(Phone);

		if (user == null) {
			throw new RuntimeException("User is not found - " +Phone);
		}

		return user;
	}

	@PatchMapping("/Update")
	public User updateUser(@RequestBody User user) throws Exception {

		userService.save(user);

		return user;
	}




}

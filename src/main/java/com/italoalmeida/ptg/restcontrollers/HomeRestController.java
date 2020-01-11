package com.italoalmeida.ptg.restcontrollers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class HomeRestController {
	
	@GetMapping
	private ResponseEntity<Object> home() {
		return ResponseEntity.ok().body("API RESTful for user authentication");
	}

}

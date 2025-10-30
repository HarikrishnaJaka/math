package com.hk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Math {

	@GetMapping("/add")
	public ResponseEntity<String>add(){
		return new ResponseEntity<String>("addition",HttpStatus.OK);
	}
}

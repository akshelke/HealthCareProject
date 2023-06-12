package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserDoa;
import com.app.dto.Logindto;
import com.app.pojo.User;
@CrossOrigin
@RestController
@RequestMapping("userl")
public class Login {
	@Autowired
	private UserDoa dao;
	
	@PostMapping("/logins")
	public ResponseEntity<?>  loginuser(@RequestBody Logindto dto) {
		
		System.out.println(dto.getEmail()+"    Password   "+dto.getPassword());
		User u= dao.findByEmailAndPassword(dto.getEmail(), dto.getPassword());
		
		return new ResponseEntity<>(u,HttpStatus.OK);
	}
}

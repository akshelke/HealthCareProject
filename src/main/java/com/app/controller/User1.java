package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Medical;
import com.app.pojo.User;
import com.app.service.UserSeervies;
@CrossOrigin
@Controller
@RequestMapping("/")
public class User1 {
	@Autowired
	private	UserSeervies ur;
	@GetMapping("/user")
	public ResponseEntity<?>  allUser() {
		System.out.println("Inside get User ");
		List<User> use=ur.returnalluser();
		System.out.println(use);
		return new ResponseEntity<>(use, HttpStatus.OK);
	}
	@PostMapping("/useradd")
	public ResponseEntity<?> addUser(@RequestBody User url) {
		System.out.println("User added");
		String str=ur.addUser(url);
		System.out.println(str);
		return  new ResponseEntity<>(str, HttpStatus.OK);
	 

	}
	@PostMapping("/deleteuser")
	public ResponseEntity<?>deleteUser(@PathVariable Long id){
		System.out.println("User Deleted");
		String str = ur.deleteUser(id);
		return new ResponseEntity<>(str, HttpStatus.OK);

	}
	@PostMapping("/medical")
	public ResponseEntity<?>addmedical(@RequestBody Medical add){
		System.out.println("Medical Added");
		String str = ur.addmedical(add);
		return new ResponseEntity<>(str, HttpStatus.OK);
		
	}



}

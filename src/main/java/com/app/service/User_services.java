package com.app.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.dao.UserDoa;
import com.app.pojo.Medical;



@Service

public class User_services implements UserSeervies{
	@Autowired
	public UserDoa dao;

	@Override
	public List<com.app.pojo.User> returnalluser() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String addUser(User ur) {
		
		dao.save(ur);
		return "User added Successfully";
	}
	@Override
	public String deleteUser(Long id) {
		dao.deleteById(id);
		return "User Delete Successfully";
		
	}

	@Override
	public String addmedical(Medical add) {
		dao.save(add);
		return "User added Successfully";
	}

	@Override
	public String addUser(com.app.pojo.User ur) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}

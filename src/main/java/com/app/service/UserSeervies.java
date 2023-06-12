package com.app.service;


import org.springframework.stereotype.Service;

import com.app.pojo.Medical;
import com.app.pojo.User;


@Service
public interface UserSeervies {
	public  java.util.List<com.app.pojo.User> returnalluser();
	public String addUser(User ur);
	public String deleteUser(Long ur);
	
	public String addmedical(Medical add);
	String addUser(org.apache.catalina.User ur);
}

package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojo.Medical;
import com.app.pojo.User;


@Repository
@RequestMapping("/user")
public interface UserDoa extends JpaRepository<User,Long> {

	

	User findByEmailAndPassword(String email, String password);



}

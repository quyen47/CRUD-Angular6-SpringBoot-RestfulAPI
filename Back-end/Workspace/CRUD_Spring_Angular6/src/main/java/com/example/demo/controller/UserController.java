package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/user-portal/users")
public class UserController {
	ArrayList<User> users;
	public List<User> initUser() {
		users = new ArrayList<>();
		User u1 = new User(1,"A","B","C");
		User u2 = new User(2,"D","B","C");
		User u3 = new User(3,"E","B","C");
		User u4 = new User(4,"F","B","C");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		return users;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUser() {
		return initUser();
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public User getUserById(@RequestParam(value="id") String id) {
//		
//		return users.get(Integer.parseInt(id));
//	}
}

package com.acmsk.dortkafadar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acmsk.dortkafadar.entities.User;
import com.acmsk.dortkafadar.service.UserService;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/saveUser",method = RequestMethod.POST)
	public User saveUser(@RequestBody User data) {
		return userService.saveUser(data);
	}
	
	@RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
}

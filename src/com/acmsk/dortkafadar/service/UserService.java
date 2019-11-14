package com.acmsk.dortkafadar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acmsk.dortkafadar.entities.User;
import com.acmsk.dortkafadar.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User data) {
		return userRepository.save(data);
	}
	
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "deleteUser by " +id +" completed";
	}
	
	public User getUserById(Long id) {
		return userRepository.getOne(id);
	}
}

package com.springboot.spacecrafts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spacecrafts.model.User;
import com.springboot.spacecrafts.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	public UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> one(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
}

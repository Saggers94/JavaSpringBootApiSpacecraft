package com.springboot.spacecrafts.controller;

import com.springboot.spacecrafts.model.Spacecraft;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spacecrafts.repository.SpacecraftRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class SpacecraftController {

	@Autowired
	private SpacecraftRepository spacecraftRepository;
	
	@GetMapping("/spacecrafts")
	public List<Spacecraft> getAllSpacecrafts(){
		return spacecraftRepository.findAll();
	}
	
	@GetMapping("/spacecrafts/{id}")
	public Optional<Spacecraft> one(@PathVariable Long id){
		return spacecraftRepository.findById(id);
	}
}

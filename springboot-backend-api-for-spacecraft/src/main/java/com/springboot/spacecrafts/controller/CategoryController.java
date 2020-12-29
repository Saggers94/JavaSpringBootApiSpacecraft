package com.springboot.spacecrafts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spacecrafts.model.Category;
import com.springboot.spacecrafts.repository.CategoryRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class CategoryController {

	@Autowired
	public CategoryRepository categoryRepository;

	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	@GetMapping("/categories/{id}")
	public Optional<Category> one(@PathVariable long id){
		return categoryRepository.findById(id);
	}
	
	
}

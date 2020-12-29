package com.springboot.spacecrafts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.spacecrafts.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package com.springboot.spacecrafts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.spacecrafts.model.Spacecraft;

@Repository
public interface SpacecraftRepository extends JpaRepository<Spacecraft, Long>{

}

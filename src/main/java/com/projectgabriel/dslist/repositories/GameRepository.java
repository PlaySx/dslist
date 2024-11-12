package com.projectgabriel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgabriel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	 
}

package com.projectgabriel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgabriel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	 
}

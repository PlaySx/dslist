package com.projectgabriel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectgabriel.dslist.dto.GameDto;
import com.projectgabriel.dslist.dto.GameMinDto;
import com.projectgabriel.dslist.entities.Game;
import com.projectgabriel.dslist.projections.GameMinProjection;
import com.projectgabriel.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDto dto = new GameDto(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x-> new GameMinDto(x)).toList();
		}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDto(x)).toList();
		}
}

package com.devmatheus.dslist.services;

import java.util.List;

import com.devmatheus.dslist.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmatheus.dslist.dto.GameMinDTO;
import com.devmatheus.dslist.entities.Game;
import com.devmatheus.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	 
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}

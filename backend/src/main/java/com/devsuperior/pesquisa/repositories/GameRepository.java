package com.devsuperior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

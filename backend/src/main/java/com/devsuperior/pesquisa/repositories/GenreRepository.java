package com.devsuperior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}

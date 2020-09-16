package com.devsuperior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}

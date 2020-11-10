package com.theGames.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theGames.LojaGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}

package com.projetoFarmacia.projetoFarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoFarmacia.projetoFarmacia.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
	public List<Categoria> findAllByTipoProdutoContainingIgnoreCase(String tipoProduto);
	

}

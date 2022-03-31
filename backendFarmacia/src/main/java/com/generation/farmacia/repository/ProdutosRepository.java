package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.ProdutoModel;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutoModel, Long>{
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase (String nome);
}

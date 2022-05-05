package com.santander.devweek.banklineapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.devweek.banklineapi.model.Movimentaçao;

public interface MovimentaçaoRepository extends JpaRepository<Movimentaçao, Integer>{
	public List<Movimentaçao>findByIdConta(Integer idConta);

}

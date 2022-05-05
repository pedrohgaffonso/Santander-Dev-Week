package com.santander.devweek.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.devweek.banklineapi.dto.NovaMovimentaçao;
import com.santander.devweek.banklineapi.model.Movimentaçao;

import com.santander.devweek.banklineapi.repository.MovimentaçaoRepository;
import com.santander.devweek.banklineapi.service.MovimentaçaoService;


@RestController
@RequestMapping("/movimentacoes")
public class MovimentaçaoController {
	@Autowired
	private MovimentaçaoRepository repository;
	
	@Autowired
	private MovimentaçaoService service;
	
	@GetMapping
	public List<Movimentaçao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentaçao movimentaçao) {
		service.save(movimentaçao);
	}
	@GetMapping("/{idConta}")
	public List<Movimentaçao> findAll(@PathVariable("idConta") Integer idConta){
		return repository.findByIdConta(idConta);
	}
}
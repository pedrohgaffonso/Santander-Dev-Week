package com.santander.devweek.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.devweek.banklineapi.dto.NovoCorrentista;
import com.santander.devweek.banklineapi.model.Conta;
import com.santander.devweek.banklineapi.model.Correntistas;
import com.santander.devweek.banklineapi.repository.CorrentistaRepository;


@Service
public class CorrentistaService {
	@Autowired
	private CorrentistaRepository repository;
	
	public void save(NovoCorrentista novoCorrentista) {
		Correntistas correntista = new Correntistas();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		repository.save(correntista);
	}
}
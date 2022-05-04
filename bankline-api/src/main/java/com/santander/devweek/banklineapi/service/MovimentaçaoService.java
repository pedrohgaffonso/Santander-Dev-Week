package com.santander.devweek.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.devweek.banklineapi.dto.NovaMovimentaçao;
import com.santander.devweek.banklineapi.model.Correntistas;
import com.santander.devweek.banklineapi.model.Movimentaçao;
import com.santander.devweek.banklineapi.model.MovimentaçaoTipo;
import com.santander.devweek.banklineapi.repository.CorrentistaRepository;
import com.santander.devweek.banklineapi.repository.MovimentaçaoRepository;



@Service
public class MovimentaçaoService {
	@Autowired
	private MovimentaçaoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	public void save(NovaMovimentaçao novaMovimentacao) {
		Movimentaçao movimentacao = new Movimentaçao();
		
		//Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		
		Double valor = novaMovimentacao.getValor();
		if(novaMovimentacao.getTipo() == MovimentaçaoTipo.DESPESA)
			valor = valor * -1;
			
		movimentacao.setDatehora(LocalDateTime.now());
		movimentacao.setDescriçao(novaMovimentacao.getDescriçao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntistas correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		repository.save(movimentacao);
		
	}
}
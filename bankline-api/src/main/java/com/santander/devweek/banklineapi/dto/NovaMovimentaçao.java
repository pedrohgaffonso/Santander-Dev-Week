package com.santander.devweek.banklineapi.dto;

import com.santander.devweek.banklineapi.model.MovimentaçaoTipo;

public class NovaMovimentaçao {
    private String descricao;
    
    private Double valor;
    

    public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentaçaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentaçaoTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	private MovimentaçaoTipo tipo;

    private Integer idConta;
}

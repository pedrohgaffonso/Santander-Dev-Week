package com.santander.devweek.banklineapi.dto;

import com.santander.devweek.banklineapi.model.MovimentaçaoTipo;

public class NovaMovimentaçao {
    private String descriçao;
    
    private Double valor;
    

    public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
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

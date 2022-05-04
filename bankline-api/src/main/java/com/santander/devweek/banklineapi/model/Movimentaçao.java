package com.santander.devweek.banklineapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movimentacao")

public class Movimentaçao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "data_hora")
    private LocalDateTime datehora;
	
    private String descriçao;
    
    private Double valor;
    
    @Enumerated(EnumType.STRING)
    private MovimentaçaoTipo tipo;
    @Column(name = "id_conta")
    private Integer idConta;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getDatehora() {
        return datehora;
    }
    public void setDatehora(LocalDateTime datehora) {
        this.datehora = datehora;
    }
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
}

package com.santander.devweek.banklineapi.model;

import java.time.LocalDateTime;

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
    private LocalDateTime datahora;
    private String descriçao;
    private Double valor;
    
    @Enumerated(EnumType.STRING)
    private MovimentaçaoTipo tipo;
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
}

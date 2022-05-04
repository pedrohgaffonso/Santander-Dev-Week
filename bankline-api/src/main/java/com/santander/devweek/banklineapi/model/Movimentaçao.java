package com.santander.devweek.banklineapi.model;

import java.time.LocalDateTime;

public class Movimentaçao {
    private Integer id;
    private LocalDateTime datehora;
    private String descriçao;
    private Double valor;
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

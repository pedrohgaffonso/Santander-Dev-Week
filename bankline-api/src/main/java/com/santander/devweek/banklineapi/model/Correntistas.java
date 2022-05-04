package com.santander.devweek.banklineapi.model;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.ContainerType;

public class Correntistas {
    private Integer id;
    private String cpf;
    private String nome;

    private Conta conta;

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

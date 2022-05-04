package com.santander.devweek.banklineapi.model;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.ContainerType;

public class Correntistas {
    private Integer id;
    private Strimg cpf;
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
    public Strimg getCpf() {
        return cpf;
    }
    public void setCpf(Strimg cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

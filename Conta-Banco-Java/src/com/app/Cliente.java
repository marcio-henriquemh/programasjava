package com.app;


//ClasseCliente
public class Cliente {
    protected String nome;
    protected String cpf;
    
    // Construtor padrão
    public Cliente() {
    }

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

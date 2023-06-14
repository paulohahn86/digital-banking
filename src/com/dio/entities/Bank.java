package com.dio.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static int SEQUENCIAL = 1;
    private int codigo;
    private String nome;
    private List<Account> contas = new ArrayList<Account>();

    public Bank(String nome) {
        this.nome = nome;
        this.codigo = SEQUENCIAL++;
    }

    public List<Account> getContas(){
        return contas;
    }
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

}


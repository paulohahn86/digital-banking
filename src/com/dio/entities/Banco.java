package com.dio.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static int SEQUENCIAL = 1;

    private int codigo;
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();


    public Banco(String nome) {
        this.nome = nome;
        this.codigo = SEQUENCIAL++;
    }

    protected void adicionarBanco(Conta conta) {
        this.contas.add(conta);
    }

    protected void imprimirBancos() {

        System.out.println("***** LISTA DE CLIENTE " + this.nome + " *****");
        for(Conta conta : contas) {
            System.out.println(this.codigo);
            System.out.println(conta.cliente.getNome());
            System.out.println(conta.getAgencia());
        }

    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public int getCodigo() {
        return codigo;
    }











}

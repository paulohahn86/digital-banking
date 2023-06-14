package com.dio.entities;

public class CurrentAccount extends Account {

    public CurrentAccount(Client cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***** Extrato Conta Corrente *****");
    }




}

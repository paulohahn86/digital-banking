package com.dio.entities;

public class SavingsAccount extends Account {

    public SavingsAccount(Client cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***** Extrato Conta Poupança *****");
    }




}


package com.dio.services;

import com.dio.entities.Account;
import com.dio.repositories.AccountRepository;

public class AccountService implements AccountRepository {

    private Account conta;

    public AccountService(Account conta){
        this.conta = conta;
    }

    @Override
    public void sacar(double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
    }

    @Override
    public void depositar(double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    @Override
    public void transferir(Account contaDestino, double valor) {

    }

    @Override
    public void imprimirExtrato() {
        conta.imprimirExtrato();
        System.out.println("Conta -> " + conta.getNumero());
        System.out.println("Cliente -> " + conta.getCliente().getNome());
        System.out.println("Saldo -> " + conta.getSaldo());

    }
}

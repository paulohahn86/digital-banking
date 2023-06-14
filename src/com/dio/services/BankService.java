package com.dio.services;

import com.dio.entities.Account;
import com.dio.entities.Bank;
import com.dio.repositories.BankRepository;

import java.util.List;

public class BankService implements BankRepository {
    public BankService(){
    }
    @Override
    public void adicionarConta(Bank banco, Account conta) {
        banco.getContas().add(conta);
    }

    public void imprimirBanco(Bank banco) {
        List<Account> contas = banco.getContas();
        System.out.println("***** LISTA DE CLIENTE " + banco.getNome() + "  *****");
        for(Account conta : contas) {
            System.out.printf("%s --- Conta: %d%n"
                    ,conta.getCliente().getNome(),conta.getNumero());
        }

    }
}

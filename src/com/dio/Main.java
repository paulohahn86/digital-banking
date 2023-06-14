package com.dio;

import com.dio.entities.*;
import com.dio.services.AccountService;
import com.dio.services.BankService;

public class Main {

    public static void main(String[] args) {
        Bank paribas = new Bank("Paribas Bank"); // CREATED BANK
        Bank santander = new Bank("Santander Bank"); // CREATED BANK

        Client paulo = new Client("PAULO AUGUSTO HAHN"); // ADD CLIENT
        Client joao = new Client("JOAO BATISTA HAHN"); // ADD CLIENT
        Client fran = new Client("FRANCINI KAMERS"); // ADD CLIENT

        Client francisco = new Client("FRANCISCO WAGNER"); // ADD CLIENTE
        Client gabriel = new Client("JOAO GABRIEL PORTAL"); // ADD CLIENTE

        Account cc1 = new CurrentAccount(paulo); // PAULO'S ACCOUNT
        Account cc2 = new CurrentAccount(joao); // BATISTA'S ACCOUNT
        Account cc3 = new CurrentAccount(fran); // FRANCINI'S ACCOUNT
        Account cp1 = new SavingsAccount(francisco); // FRANCISCO'S ACCOUNT
        Account cp2 = new SavingsAccount(gabriel); // GABRIEL'S ACCOUNT

        BankService bancoService = new BankService();
        bancoService.adicionarConta(paribas, cc1);
        bancoService.adicionarConta(paribas, cc2);
        bancoService.adicionarConta(paribas, cp1);
        bancoService.adicionarConta(santander, cc3);
        bancoService.adicionarConta(santander, cp2);

        bancoService.imprimirBanco(paribas);
        System.out.println();
        bancoService.imprimirBanco(santander);


        AccountService servicecp1 = new AccountService(cp1);
        servicecp1.depositar(1000);
        servicecp1.sacar(50);
        servicecp1.imprimirExtrato();

        System.out.println();

        AccountService servicecp2 = new AccountService(cc3);
        servicecp2.depositar(6000);
        servicecp2.sacar(3000);
        servicecp2.imprimirExtrato();

    }
}
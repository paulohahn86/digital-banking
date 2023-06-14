package com.dio.entities;

public class Principal {

    public static void main(String[] args) {
        Banco brasil = new Banco("Banco do brasil"); // CRIADO BANCO
        Banco caixa = new Banco("Caixa Economica Federal"); // CRIADO BANCO

        Cliente paulo = new Cliente("PAULO AUGUSTO HAHN"); // ADD CLIENTE

        Cliente fran = new Cliente("FRANCINI"); // ADD CLIENTE

        Conta cc = new ContaCorrente(paulo); // CONTA CLIENTE PAULO
        brasil.adicionarBanco(cc); // ADD CONTA PAULO EM BANCO


        Conta cp = new ContaPoupanca(fran); // CONTA CLIENTE FRAN
        caixa.adicionarBanco(cp); // ADD CONTA FRAN EM BANCO

        brasil.imprimirBancos(); // IMPRIMINDO LISTA DE BANCOS

        caixa.imprimirBancos();


		/*
		cc.depositar(100);
		cc.transferir(cp, 100);

		cc.imprimirExtrato();
		System.out.println();
		System.out.println();
		cp.imprimirExtrato();


		*/


    }
}



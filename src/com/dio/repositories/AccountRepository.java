package com.dio.repositories;

import com.dio.entities.Account;

public interface AccountRepository {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Account contaDestino, double valor);

    void imprimirExtrato();

}

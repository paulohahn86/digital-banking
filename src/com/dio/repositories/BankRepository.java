package com.dio.repositories;

import com.dio.entities.Account;
import com.dio.entities.Bank;

public interface BankRepository {
    void adicionarConta(Bank banco, Account conta);
    void imprimirBanco(Bank banco);
}

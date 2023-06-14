package com.dio.entities;

public abstract class Account {

    private static final int AGENCIA_PADRAO = 2600;
    private static int SEQUENCIAL = 1; // simulates the creation of a random account

    protected int numero;
    private double saldo;
    protected Client cliente;
    public Account(Client cliente) {

        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public abstract void imprimirExtrato();

}
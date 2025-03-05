/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author leandro
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;
    

    public String getNumero() {

        return numero;

    }

    public void setNumero(String numero) {

        this.numero = numero;

        if (numero.trim().isEmpty()) {

            throw new IllegalArgumentException("O numero da conta esta inválido!");

        }

    }

    public String getTitular() {

        return this.titular;

    }

    public void setTitular(String titular) {

        this.titular = titular;

        if (titular.trim().isEmpty()) {

            throw new IllegalArgumentException("Titular da conta é inválido!");

        }

    }

    public double getSaldo() {

        return saldo;

    }

    public void depositar(double valor) {

        if (valor <= 0) {

            throw new IllegalArgumentException("Valor para de deposito invalido!");

        }

        this.saldo += valor;

    }

    public void sacar(double valor) {

        if ((this.saldo - valor) <= 0 || valor > this.saldo) {

            throw new IllegalArgumentException("O valor de saque nao pode ser 0 ou saldo insuficiente!");

        }

        this.saldo -= valor;

    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
}

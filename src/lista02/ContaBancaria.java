/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista02;

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
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        if (valor < 0) {
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para saque!");
        } else if (valor > saldo) {
            System.out.println("Valor de saque maior que o saldo bancario!");
        } else {
            saldo -= valor;

        }
    }   
        
    

   
}




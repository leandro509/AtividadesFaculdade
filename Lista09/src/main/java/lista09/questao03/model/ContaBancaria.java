/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista09.questao03.model;

import java.util.ArrayList;

/**
 *
 * @author kleut
 */
public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos = new ArrayList<>();

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    protected void incluirMovimento(Movimento m){
        movimentos.add(m);
    }
  
    

    public ContaBancaria(String numero, double saldo) {
        setNumero(numero);
        this.saldo = 0;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O numero nao pode estar em branco!");
        }
        
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if(saldo < 0 ) {
            throw new IllegalArgumentException("Saldo nao pode ser negativo!");
        }
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        // Movimento movimento = new Movimento();
        if(valor <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser 0 ou negativo!");
        }
        
        setSaldo(saldo += valor);
    }
    
    public void sacar(double valor) {
        if(valor > saldo || valor <= 0) {
            throw new IllegalArgumentException("Valor indisponivel para saque!");
        }
        setSaldo(saldo -= valor);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        contaDestino.depositar(valor);
    }
}

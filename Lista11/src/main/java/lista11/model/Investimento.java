/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

/**
 *
 * @author leandro
 */
public abstract class Investimento implements Pagavel{
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if(saldo < 0) {
            throw new IllegalArgumentException("O saldo nao pode ser negativo!");
        }
        this.saldo = saldo;
    }
    
    
}

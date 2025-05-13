/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

/**
 *
 * @author leandro
 */
public class PrevidenciaPrivada extends Investimento {
    private double valor;
    
    @Override
    public double calcularValorPagar() {
        return valor;
    }
    
    public void setValor(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser 0 ou negativo!");
        }
        this.valor = valor;
    }
    
    public void investir() {
        double saldo = super.getSaldo();
       
        if(valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para Investir!");
        }
        double restante = saldo -= valor;
        super.setSaldo(restante);
        
    }
    
    
}

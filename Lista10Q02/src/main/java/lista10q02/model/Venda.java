/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10q02.model;

/**
 *
 * @author leandro
 */
public class Venda {
    private double valor;
    
    public Venda(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser 0 ou negativo!");
        }
        this.valor = valor;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

/**
 *
 * @author leandro
 */
public class MensalidadeEnsino implements Pagavel {
    private int nrCreditos;
    private double precoCredito;
    
    

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        if(nrCreditos < 0) {
            throw new IllegalArgumentException("O numero de credito nao pode ser negativo!");
        }
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(double precoCredito) {
        if(precoCredito < 0) {
            throw new IllegalArgumentException("O preco do credito nao pode ser menor que 0");
        }
        this.precoCredito = precoCredito;
    }
    
    
    
    @Override
    public double calcularValorPagar() {
        return (precoCredito * nrCreditos);
    }
}

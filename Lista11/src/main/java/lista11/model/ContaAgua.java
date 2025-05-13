/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

/**
 *
 * @author leandro
 */
public class ContaAgua implements Pagavel {
    private int metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        setMetrosCubicos(metrosCubicos);
        setPrecoMetroCubico(precoMetroCubico);
    }
    
    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
        if(metrosCubicos <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser 0 ou negativo!");
        }
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    public void setPrecoMetroCubico(double precoMetroCubico) {
        if(precoMetroCubico <= 0) {
            throw new IllegalArgumentException("O preco nao pode ser 0 ou negativo!");
        }
        this.precoMetroCubico = precoMetroCubico;
    }
    
    @Override
    public double calcularValorPagar() {
        return (precoMetroCubico * metrosCubicos);
    }
}

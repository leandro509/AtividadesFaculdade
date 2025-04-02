/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07.model;
/**
 *
 * @author lgonascimento
 */
public class Imovel {
    private String endereco;
    private int area;
    private Finalidade finalidade;
    private Bairro bairro;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.isEmpty()) {
            throw new IllegalArgumentException("O endereco nao pode estar em branco!");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area <= 0) {
            throw new IllegalArgumentException("Area nao pode ser menor ou igual a 0!");
        }
        
        this.area = area;
    }
    
    public void setFinalidade(Finalidade finalidade) {
        if(finalidade == null) {
            throw new IllegalArgumentException("Finalidade nao pode ser nula!");
        }
        this.finalidade = finalidade;
    }
    
    public Finalidade getFinalidade() {
        return this.finalidade;
    }
    
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    public Bairro getBairro() {
        return this.bairro;
    }
    
    public double calcularIptu() {
        
        if(this.area <= 0) {
            throw new IllegalArgumentException("A area nao pode ser 0 ou negativa!");
        }
        
        if(this.finalidade == null) {
            throw new IllegalArgumentException("Finalidade nao pode ser nula");
        }
        
        if(this.bairro == null) {
            throw new IllegalArgumentException("Bairro nao pode ser nulo");
        }
        
        if(this.finalidade == finalidade.RESIDENCIAL) {
            return ((1 * this.area) * bairro.getCoeficienteIptu());
        }else if(this.finalidade == finalidade.COMERCIAL) {
            if(this.area <= 100) {
                return (500 * bairro.getCoeficienteIptu());
            }else if(this.area > 100 && this.area <= 400) {
                return (1000 * bairro.getCoeficienteIptu());
            }else{
                return ((2.55 * this.area) * bairro.getCoeficienteIptu());
            }
        }else{
            if(this.area <= 2000) {
                return (1000 * bairro.getCoeficienteIptu());
            }else {
                return ((0.55 * this.area) * bairro.getCoeficienteIptu());
            }
        }
    }
    
    
}

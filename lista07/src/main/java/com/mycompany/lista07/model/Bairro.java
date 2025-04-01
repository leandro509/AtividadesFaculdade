/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07.model;

/**
 *
 * @author lgonascimento
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()) {
            throw new IllegalArgumentException("O nome do bairro nao pode estar vazio!");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if(coeficienteIptu <= 0) {
            throw new IllegalArgumentException("O coeficiente nao pode ser zero ou negativo!");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    
}

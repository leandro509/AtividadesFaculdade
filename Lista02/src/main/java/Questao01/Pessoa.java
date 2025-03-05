/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author lgonascimento
 */
public class Pessoa {

    private double altura;
    private double peso;
    private String nome;

    public double calcularImc() {

        return peso / (altura * altura);

    }

    public void setAltura(double altura) {

        if (altura < 0) {

            throw new IllegalArgumentException("O valor da altura invalido!");

        }

        this.altura = altura;

    }

    public double getAltura() {

        return altura;

    }

    public void setPeso(double peso) {

        if (peso < 0) {

            throw new IllegalArgumentException("O valor de peso invalido!");

        }

        this.peso = peso;

    }


    public double getPeso() {

        return peso;

    }

    public void setNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {

            throw new IllegalArgumentException("O nome nao pode estar em branco!");

        }

        this.nome = nome;

    }
    
    public String getNome() {

        return nome;

    }
}

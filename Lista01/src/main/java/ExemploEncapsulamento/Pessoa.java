/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploEncapsulamento;

/**
 *
 * @author lgonascimento
 */
public class Pessoa {

    /** 
     * @param altura
     */
    
    
    private double altura;
    private double peso;

    /**
     * Realiza o calculo do IMC para o objeto
     *
     * @return o resultado do calculo
     */
    public double calcularImc() {

        return peso / (altura * altura);
    }

    public void setAltura(double altura) {

        if (altura < 0) {

            throw new IllegalArgumentException("Altura Invalida!");

        }

        this.altura = altura;

    }

    public double getAltura() {

        return this.altura;

    }

    public void setPeso(double peso) {

        if (peso < 0) {

            throw new IllegalArgumentException("Peso invalido!");

        }

        this.peso = peso;

    }

    public double getPeso() {

        return this.peso;

    }

}

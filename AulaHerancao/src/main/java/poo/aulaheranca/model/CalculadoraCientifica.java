/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.aulaheranca.model;

/**
 *
 * @author lgonascimento
 */
public class CalculadoraCientifica extends Calculadora {
    public double potencia(double valor, double potencia) {
         memoria = (Math.pow(valor,potencia));
         return memoria;
    }
    
    
    public double raizQuadrada(double valor) {
        memoria = Math.sqrt(valor);
        return memoria;
    }
}

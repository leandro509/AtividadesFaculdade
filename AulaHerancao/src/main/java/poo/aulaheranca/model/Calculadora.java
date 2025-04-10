/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.aulaheranca.model;

/**
 *
 * @author lgonascimento
 */
public class Calculadora {
    protected double memoria;
    public double somar(double a, double b) {
        memoria = a + b;
        return memoria;
    }
    
    public double subtrair(double a, double b) {
        memoria = a - b;
        return memoria;
    }
    
    public double multiplicar(double a, double b) {
        memoria = a * b;
        return memoria;
    }
    
    public double dividir(double a, double b) {
        memoria = a / b;
        return memoria;
    }

    public double getMemoria() {
        return memoria;
    }
    
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
}

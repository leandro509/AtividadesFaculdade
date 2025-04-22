/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lgonascimento
 */
public class Calculadora {

    public int somar(int a, int b) {
        return (a + b);
    }

    public float somar(float a, float b) {

        return (a + b);

    }
    
    public float dividir(float a, float b) {
    
        if(b == 0) {
            throw new IllegalArgumentException("Divisao por 0");
        }
        
         return (a / b);
    
    }
}

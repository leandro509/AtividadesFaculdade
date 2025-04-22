/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.aulaheranca.model;

/**
 *
 * @author lgonascimento
 */
public class AulaHeranca {
    public static void main(String[] args) {
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        
        calcCientifica.potencia(2, 2);
        
        System.out.println(calcCientifica.getMemoria());
        
    }
}

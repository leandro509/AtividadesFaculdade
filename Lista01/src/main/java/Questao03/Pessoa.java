/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao03;

import Questao02.*;



/**
 *
 * @author lgonascimento
 */
public class Pessoa {
    double altura;
    double peso;
    
    
    public double calcularImc() {
    
        return peso/ (altura * altura);
    
    }
}

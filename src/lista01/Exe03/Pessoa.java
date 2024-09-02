/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe03;

import lista01.Exe02.*;
import lista01.Exe01.*;
import lista01.*;

/**
 *
 * @author leandro
 */
public class Pessoa {
   public double peso;
   public double altura;
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
}

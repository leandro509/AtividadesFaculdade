/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

import Questao01.lista04.model.*;


/**
 *
 * @author lgonascimento
 */
public class Retangulo {

    private int altura;
    private int comprimento;

    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;

    }

    public Retangulo(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public void setAltura(int altura) {
        
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para a altura: "  + altura);
        }
        
        this.altura = altura;

    }

    public int getAltura() {

        return this.altura;
    }

    public void setComprimento(int comprimento) {
         if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para a altura: "  + comprimento);
        }
        this.comprimento = comprimento;

    }

    public int getComprimento() {
        
        return this.comprimento;

    }
    
    public int calcularPerimetro() {
    
        return (2 * altura) + (2 * comprimento);
    
    }
    
    public int calcularArea() {
    
        return (altura * comprimento);
    
    }
}

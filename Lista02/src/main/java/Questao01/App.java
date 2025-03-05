/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

import java.util.Scanner;

/**
 *
 * @author lgonascimento
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        double peso;
        double altura;
        
        Pessoa pessoa[] = new Pessoa[3];
        
        
        for(int i = 0; i < pessoa.length; i ++ ) {
        
            pessoa[i] = new Pessoa();
            
            System.out.println("Digite o nome da pessoa " + (i + 1) + " : ");
            nome = scan.next();
            pessoa[i].setNome(nome);
            
            
            System.out.println("Digite o peso da pessoa " + (i + 1) + " : ");
            peso = scan.nextDouble();
            pessoa[i].setPeso(peso);
            
            System.out.println("Digite a altura da pessoa " + (i + 1) + " : ");
            altura = scan.nextDouble();
            pessoa[i].setAltura(altura);           
            
            
        }
        
        for(int j = 2; j >= 0; j--) {
        
            System.out.println("Nome : " + pessoa[j].getNome());
            System.out.println("Peso : " + pessoa[j].getPeso());
            System.out.println("Altura : " +  pessoa[j].getAltura());
            System.out.println("IMC : " + pessoa[j].calcularImc());
            System.out.println("-----------------------------------");
            
        }
        
        scan.close();
    }
}

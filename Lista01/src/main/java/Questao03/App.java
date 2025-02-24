/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Questao03;

import Questao02.*;
import java.util.Scanner;

/**
 *
 * @author lgonascimento
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];
        
       pessoas[0] = new Pessoa();
       pessoas[1] = new Pessoa();
       pessoas[2] = new Pessoa();

        for (int i = 0; i < 3; i++) {
            
            
            System.out.println("Digite a sua altura : ");
            pessoas[i].altura = scan.nextDouble();
            System.out.println("Digite seu peso : ");
            pessoas[i].peso = scan.nextDouble();
            System.out.println("O imc da pessoa " + (i+1) + " eh : " + pessoas[i].calcularImc());

        }

    }
}

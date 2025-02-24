/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Questao04;

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

            System.out.println("Digite o nome da pessoa : ");
            pessoas[i].nome = scan.nextLine();
            System.out.println("Digite a altura da pessoa : ");
            pessoas[i].altura = scan.nextDouble();
            System.out.println("Digite seu peso : ");
            pessoas[i].peso = scan.nextDouble();
            scan.nextLine();

        }

        for (int j = 2; j > -1; j--) {

            System.out.println(pessoas[j].nome);
            System.out.println(pessoas[j].altura);
            System.out.println(pessoas[j].peso);
            System.out.println(pessoas[j].calcularImc());
            System.out.println("");

        }
        scan.close();
    }
}

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
        double peso01 = 0;
        double peso02 = 0;
        double peso03 = 0;

        double altura01 = 0;
        double altura02 = 0;
        double altura03 = 0;

        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa02 = new Pessoa();
        Pessoa pessoa03 = new Pessoa();

        System.out.println("Digite a sua altura : ");
        altura01 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso01 = scan.nextDouble();
        pessoa01.altura = altura01;
        pessoa01.peso = peso01;
        System.out.println("O imc da pessoa 1 eh : " + pessoa01.calcularImc());

        System.out.println("Digite a sua altura : ");
        altura02 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso02 = scan.nextDouble();
        pessoa02.altura = altura02;
        pessoa02.peso = peso02;
        System.out.println("O imc da pessoa 2 eh : " + pessoa02.calcularImc());

        System.out.println("Digite a sua altura : ");
        altura03 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso03 = scan.nextDouble();
        pessoa03.altura = altura03;
        pessoa03.peso = peso03;
        System.out.println("O imc da pessoa 3 eh : " + pessoa03.calcularImc());

    }
}

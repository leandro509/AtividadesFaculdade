/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Questao04;

import Questao03.*;
import Questao02.*;
import java.util.Scanner;

/**
 *
 * @author lgonascimento
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome01;
        String nome02;
        String nome03;
        
        double peso01 = 0;
        double peso02 = 0;
        double peso03 = 0;

        double altura01 = 0;
        double altura02 = 0;
        double altura03 = 0;

        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa02 = new Pessoa();
        Pessoa pessoa03 = new Pessoa();

        System.out.println("Digite seu nome: ");
        nome01 = scan.next();
        System.out.println("Digite a sua altura : ");
        altura01 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso01 = scan.nextDouble();
        pessoa01.nome = nome01;
        pessoa01.altura = altura01;
        pessoa01.peso = peso01;
       

        System.out.println("Digite seu nome: ");
        nome02 = scan.next();
        System.out.println("Digite a sua altura : ");
        altura02 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso02 = scan.nextDouble();
        pessoa02.nome = nome02;
        pessoa02.altura = altura02;
        pessoa02.peso = peso02;
       

        System.out.println("Digite seu nome: ");
        nome03 = scan.next();
        System.out.println("Digite a sua altura : ");
        altura03 = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        peso03 = scan.nextDouble();
        pessoa03.nome = nome03;
        pessoa03.altura = altura03;
        pessoa03.peso = peso03;
       
        System.out.println("Nome : " + pessoa03.nome);
        System.out.println("Peso : " + pessoa03.peso);
        System.out.println("Altura : " + pessoa03.altura);
        System.out.println("IMC : " + pessoa03.calcularImc());
        
        System.out.println("");
        
        System.out.println("Nome : " + pessoa02.nome);
        System.out.println("Peso : " + pessoa02.peso);
        System.out.println("Altura : " + pessoa02.altura);
        System.out.println("IMC : " + pessoa02.calcularImc());
        
        System.out.println("");
        
        System.out.println("Nome : " + pessoa01.nome);
        System.out.println("Peso : " + pessoa01.peso);
        System.out.println("Altura : " + pessoa01.altura);
        System.out.println("IMC : " + pessoa01.calcularImc());

    }
}

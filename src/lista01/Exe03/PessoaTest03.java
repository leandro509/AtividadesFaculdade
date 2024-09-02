/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe03;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class PessoaTest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        lista01.Pessoa pessoa01 = new lista01.Pessoa();
        lista01.Pessoa pessoa02 = new lista01.Pessoa();
        lista01.Pessoa pessoa03 = new lista01.Pessoa();
        pessoa01.altura = scan.nextDouble();
        pessoa01.peso = scan.nextDouble();
            System.out.println("-------------");
        System.out.println(pessoa01.calcularImc());
        
        pessoa02.altura = scan.nextDouble();
        pessoa02.peso = scan.nextDouble();
            System.out.println("---------------");
        System.out.println(pessoa02.calcularImc());
        
        pessoa03.altura = scan.nextDouble();
        pessoa03.peso = scan.nextDouble();
        
        System.out.println(pessoa03.calcularImc());
               
    }
}

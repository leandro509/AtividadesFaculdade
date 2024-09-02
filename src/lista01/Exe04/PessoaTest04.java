/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe04;

import java.util.Scanner;
import lista01.Exe04.Pessoa02;
/**
 *
 * @author leandro
 */
public class PessoaTest04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa02 pessoa01 = new Pessoa02();
        Pessoa02 pessoa02 = new Pessoa02();
        Pessoa02 pessoa03 = new Pessoa02();
        
        pessoa01.nome = scan.next();
        pessoa01.altura = scan.nextDouble();
        pessoa01.peso = scan.nextDouble();
           
        
        System.out.println("-------------");
        
        pessoa02.nome = scan.next();
        pessoa02.altura = scan.nextDouble();
        pessoa02.peso = scan.nextDouble();
            
       
        System.out.println("---------------");
        
        pessoa03.nome = scan.next();
        pessoa03.altura = scan.nextDouble();
        pessoa03.peso = scan.nextDouble();
        
        System.out.println("------------------- ");
        pessoa03.imprime();
        System.out.println("------------------- ");
        pessoa02.imprime();
        System.out.println("------------------- ");
        pessoa01.imprime();
        
        
               
    }
}

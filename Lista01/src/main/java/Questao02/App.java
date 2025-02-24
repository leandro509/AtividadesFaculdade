/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Questao02;

import java.util.Scanner;

/**
 *
 * @author lgonascimento
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite a sua altura : " );
        pessoa.altura = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        pessoa.peso = scan.nextDouble();
      
        
        System.out.println("O IMC da pessoa eh : " + pessoa.calcularImc());
    }
}

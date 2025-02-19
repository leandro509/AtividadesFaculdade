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
        double meuPeso = 0;
        double minhaAltura = 0;
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite a sua altura : " );
        minhaAltura = scan.nextDouble();
        System.out.println("Digite seu peso : ");
        meuPeso = scan.nextDouble();
        pessoa.altura = minhaAltura;
        pessoa.peso = meuPeso;
        
        System.out.println("O imc da pessoa eh : " + pessoa.calcularImc());
    }
}

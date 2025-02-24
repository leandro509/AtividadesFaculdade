/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Questao01;

/**
 *
 * @author lgonascimento
 */
public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.altura = 1.75;
        pessoa.peso = 78;
        
        System.out.println("O imc da pessoa eh : " + pessoa.calcularImc());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe02;
import lista01.Pessoa;
import java.util.Scanner;
/**
 *
 * @author leandro
 */
public class PessoaTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        pessoa.altura = scan.nextDouble();
        pessoa.peso = scan.nextDouble();
        
        System.out.println(pessoa.calcularImc());
               
    }
}

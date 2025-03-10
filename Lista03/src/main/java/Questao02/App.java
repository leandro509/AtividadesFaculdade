/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;
import java.util.Scanner;
import Questao01.*;

/**
 *
 * @author leandro
 */
public class App {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[5];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < funcionario.length; i++) {
        
            funcionario[i] = new Funcionario();
            System.out.println("Qual o nome do funcionario " + (i + 1) + " ?");
            funcionario[i].setNome(scan.next());
            System.out.println("Qual o salario do funcionario " + (i + 1) + " ?");
            funcionario[i].setSalario(scan.nextDouble());            
            
        
        }
        
        for(int j = 0; j < funcionario.length; j++) {
        
            System.out.println("Nome : " + funcionario[j].getNome() );
            System.out.println("Salario : " + funcionario[j].getSalario());
            System.out.println("Imposto a pagar : " + funcionario[j].calcularIrpf());
            System.out.println("--------------------------");
        
        }
    }
}

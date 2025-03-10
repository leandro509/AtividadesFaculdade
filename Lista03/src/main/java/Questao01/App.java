/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author leandro
 */
public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Leandro");
        funcionario.setSalario(2000);
        
        
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Impostos a pagar: " + funcionario.calcularIrpf());
    }
}

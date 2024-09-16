/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista02;
import lista02.ContaBancaria;
import java.util.Scanner;
/*
 *
 * @author leandro
 */
public class ContaBancariaTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta01 = new ContaBancaria();
        ContaBancaria conta02 = new ContaBancaria();
        
        System.out.println("Numero da conta: ");
        String numeroConta1 = scan.next();
        System.out.println("Nome titular: ");
        String nomeTitular1 = scan.next();
        double valorDeposito1 = scan.nextDouble();
        
        
        
        conta01.setNumero(numeroConta1);
        conta01.setTitular(nomeTitular1);
        conta01.depositar(valorDeposito1);
  
        
       
       System.out.println("Numero da conta: ");
       String numeroConta2 = scan.next();
       System.out.println("Nome titular: ");
       String nomeTitular2 = scan.next();
       
       conta02.setNumero(numeroConta2);
       conta02.setTitular(nomeTitular2);
       
       
       double valorConta2Deposito1 = scan.nextDouble();
       
       conta02.depositar(valorConta2Deposito1);
       
       double valorConta2Saque1 = scan.nextDouble();
       
       conta02.sacar(valorConta2Saque1);
       
       
        System.out.println("Titular conta: " + conta01.getTitular());    
        System.out.println(conta01.getSaldo());
        System.out.println("Titular conta: " + conta02.getTitular());    
        System.out.println(conta02.getSaldo());
        
        
        
       
        
    }
    
}

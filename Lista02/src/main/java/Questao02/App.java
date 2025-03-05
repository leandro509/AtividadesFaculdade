/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaBancaria[] conta = new ContaBancaria[2];

        for (int i = 0; i < 2; i++) {

            conta[i] = new ContaBancaria();

            System.out.println("Digite o numero da conta " + (i + 1));
            conta[i].setNumero(scan.next());

            System.out.println("Digite o nome do titular " + (i + 1));
            conta[i].setTitular(scan.next());

        }

        System.out.println("Digite o valor do deposito para a conta 1 ");
        conta[0].depositar(scan.nextDouble());

        System.out.println("Digite o valor do deposito para a conta 1 ");
        conta[0].depositar(scan.nextDouble());

        System.out.println("Digite o valor do deposito para a conta 2 ");
        conta[1].depositar(scan.nextDouble());

        System.out.println("Digite o valor do saque para a conta 2 ");
        conta[1].sacar(scan.nextDouble());

        System.out.println("Digite o valor da tranferencia bancaria da conta 2 para a conta 1 ");
        conta[1].transferir(conta[0], scan.nextDouble());

        for (int j = 0; j < 2; j++) {

            System.out.println("titular da conta " + (j + 1) + (" : ") + (conta[j].getTitular()));
            System.out.println("saldo da conta " + (conta[j].getSaldo()));
            System.out.println("------------------");

        }

        scan.close();

    }
}

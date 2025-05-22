/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12Q02.model;

import java.util.Scanner;

/**
 *
 * @author lgonascimento
 */
public class Teclado {

    private Scanner scanner;

    public Teclado() {

    }

    public int lerInt() {
        boolean ehInt = false;
        scanner.nextLine();

        while (ehInt == false) {
            System.out.println("Digite um numero inteiro");
            scanner.nextLine();

        }
    }

    public double lerDouble() {

    }

    public boolean lerBoolean() {
        String respostaUsuario = scanner.next();
        boolean verdadeiroOuFalso = false;
        while (verdadeiroOuFalso == false) {
            if (respostaUsuario == "sim" || respostaUsuario == "verdadeiro" || respostaUsuario == "positivo" || respostaUsuario == "s") {
               verdadeiroOuFalso = true; 
               return true;
            }else if(respostaUsuario == "nao" || respostaUsuario == "falso" || respostaUsuario == "negativo" || respostaUsuario == "n"){
               verdadeiroOuFalso = true;
               return false;
            }
                System.out.println("Digite novamente: ");
                respostaUsuario = scanner.next();
            
        }
        
    }

    public String lerString() {

    }
}

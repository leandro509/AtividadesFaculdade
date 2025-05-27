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
        this.scanner = new Scanner(System.in);
    }

    public int lerInt() {
        boolean ehInt = false;
        String lerInt = "";

        while (ehInt == false) {
            lerInt = scanner.nextLine();
            try {
                Integer.valueOf(lerInt);
                ehInt = true;
            } catch (NumberFormatException ex) {
                System.out.println("Nao eh um inteiro!");
            }

        }

        return Integer.parseInt(lerInt);
    }

    public double lerDouble() {
        boolean ehDouble = false;
        String lerDouble = "";

        while (ehDouble == false) {
            lerDouble = scanner.nextLine();
            try {
                Double.valueOf(lerDouble);
                ehDouble = true;
            } catch (NumberFormatException ex) {
                System.out.println("Nao eh um numero real");
            }

        }

        return Double.parseDouble(lerDouble);
    }

    public boolean lerBoolean() {
        String respostaUsuario = "";
        boolean verdadeiroOuFalso = false;
        while (verdadeiroOuFalso == false) {
            try{
                respostaUsuario = scanner.next().toLowerCase();
                if (respostaUsuario.equalsIgnoreCase("sim") || respostaUsuario.equalsIgnoreCase("verdadeiro") || respostaUsuario.equalsIgnoreCase("positivo") || respostaUsuario.equalsIgnoreCase("s")) {
                verdadeiroOuFalso = true;
                }else if (respostaUsuario.equalsIgnoreCase("nao") || respostaUsuario.equalsIgnoreCase("falso") || respostaUsuario.equalsIgnoreCase("negativo") || respostaUsuario.equalsIgnoreCase("n")) {
                verdadeiroOuFalso = true;
                }
            }catch(IllegalArgumentException ex){
                System.out.println("A resposta esperada deve ser um boolean");
            } 

        }
        
        switch(respostaUsuario){
            case "sim":
            case "verdadeiro":
            case "positivo":
            case "s":
                return true;
            case "nao":
            case "falso":
            case "negativo":
            case "n":
                return false;
            default:
               throw new IllegalArgumentException("Valor Invalido para booleano: " + respostaUsuario);
               
        }
        
    }

    public String lerString() {
        String lerString;
        lerString = scanner.nextLine();
        return lerString;
    }
}

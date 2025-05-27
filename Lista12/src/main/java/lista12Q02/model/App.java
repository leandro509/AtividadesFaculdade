/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12Q02.model;
import java.util.Scanner;
/**
 *
 * @author leandro
 */
public class App {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Scanner scan = new Scanner(System.in);
        
        boolean bool = teclado.lerBoolean();
        System.out.println("Você digitou booleano: " + bool);

        scan.nextLine();
        double d = teclado.lerDouble();
        System.out.println("Você digitou double: " + d);

        int i = teclado.lerInt();
        System.out.println("Você digitou inteiro: " + i);

        String s = teclado.lerString();
        System.out.println("Você digitou string: " + s);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12Q02.model;

/**
 *
 * @author leandro
 */
public class App {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        boolean bool = teclado.lerBoolean();
        System.out.println("Você digitou booleano: " + bool);

    }
}

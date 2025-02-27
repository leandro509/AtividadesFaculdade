/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploEncapsulamento;

/**
 *
 * @author lgonascimento
 */
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setAltura(1.86);
        pessoa.setPeso(80);
        
        System.out.println("Altura : " + pessoa.getAltura());
        System.out.println("Peso : " + pessoa.getPeso());
        
    }
}

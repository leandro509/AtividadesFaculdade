/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import lista01.Exe04.Pessoa02;
/**
 *
 * @author leandro
 */
public class PessoaTest04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa02 pessoa01 = new Pessoa02();
        Pessoa02 pessoa02 = new Pessoa02();
        Pessoa02 pessoa03 = new Pessoa02();
        
        pessoa01.setNome("leandro");
        pessoa01.setAltura(1.78);
        pessoa01.setPeso(70);
        
        pessoa02.setNome("bendini");
        pessoa02.setAltura(1.92);
        pessoa02.setPeso(125);
        
        pessoa03.setNome("luiz");
        pessoa03.setAltura(1.94);
        pessoa03.setPeso(102);
        
        
        System.out.println("Nome : "+ pessoa01.getNome());
        System.out.println("Altura : " + pessoa01.getAltura());
        System.out.println("Peso : " + pessoa01.getPeso());
        System.out.println("IMC : " + pessoa01.calcularImc());
        
        System.out.println("---------------");
        
        System.out.println("Nome : "+ pessoa02.getNome());
        System.out.println("Altura : " + pessoa02.getAltura());
        System.out.println("Peso : " + pessoa02.getPeso());
        System.out.println("IMC : " + pessoa02.calcularImc());
        
        System.out.println("----------------");
        
        System.out.println("Nome : "+ pessoa03.getNome());
        System.out.println("Altura : " + pessoa03.getAltura());
        System.out.println("Peso : " + pessoa03.getPeso());
        System.out.println("IMC : " + pessoa03.calcularImc());
        
        
               
    }
}

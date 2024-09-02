/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe01;
import lista01.Pessoa;
/**
 *
 * @author leandro
 */
public class PessoaTest01 {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 78;
        System.out.println(pessoa.calcularImc());
        
        
        
    }

}

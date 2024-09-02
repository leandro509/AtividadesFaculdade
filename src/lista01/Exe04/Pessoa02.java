/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01.Exe04;



/**
 *
 * @author leandro
 */
public class Pessoa02 {
   public String nome;
   public double altura;
   public double peso;
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
    
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(calcularImc());
    }
}

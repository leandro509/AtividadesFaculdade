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
   private String nome;
   private double altura;
   private double peso;
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
    
   
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
        }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

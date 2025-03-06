/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author lgonascimento
 */
public class Funcionario {
    private String nome;
    private double salario;
    private static final double FAIXA_01 = 0; 
    
    public void setNome(String nome) {
    
        this.nome = nome;
        
    }
    
    public String getNome() {
    
        return this.nome;
    
    }
    
    public void setSalario(double salario) {
    
        this.salario = salario;
        
    }
    
    public double getSalario() {
    
        return this.salario;
    
    }
    
    public double calcularIrpf() {
    
        if(this.salario <= 1903.98) {
        
            
        
        }
    
    }
}

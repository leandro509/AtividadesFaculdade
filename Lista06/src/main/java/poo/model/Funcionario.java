/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.model;

/**
 *
 * @author lgonascimento
 */
public class Funcionario {
    private String  nome;
    private double salario;
    
    public static final double IMPOSTO_2 = 0.0075;
    public static final double IMPOSTO_3 = 0.015;
    public static final double IMPOSTO_4 = 0.0225;
    public static final double IMPOSTO_5 = 0.0275;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Funcionario(String nome, double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }
    
    public FaixaIrpf identificarFaixaIrpf() {
    
        if(this.getSalario() < 1903.99) {
           
            return FaixaIrpf.PRIMEIRA;
           
        } else if(this.getSalario() > 1903.98 && this.getSalario() < 2826.66){
        
            return FaixaIrpf.SEGUNDA;
        
        }else if(this.getSalario() > 2826.65  && this.getSalario() < 3751.06){
            
            return FaixaIrpf.TERCEIRA;
            
        }else if(this.getSalario() > 3751.05 && this.getSalario() < 4664.69) {
            
            return FaixaIrpf.QUARTA;
            
        }else{
            
            return FaixaIrpf.QUINTA;
            
        }
    
    }
    
    
    public double calcularIrpf() {
        
        
        
    }
    
    
}

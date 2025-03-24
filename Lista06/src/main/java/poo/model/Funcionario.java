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
    
    public static final double IMPOSTO_2 = 0.075;
    public static final double IMPOSTO_3 = 0.15;
    public static final double IMPOSTO_4 = 0.225;
    public static final double IMPOSTO_5 = 0.275;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        if(nome.isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode estar em branco");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        
        if(salario <= 0) {
            throw new IllegalArgumentException("O salario deve ser maior que Zero");
        }
        
    }
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
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
        FaixaIrpf isento = identificarFaixaIrpf();
        
        switch(isento) {
            case PRIMEIRA:
                return 0;
            case SEGUNDA:
                return (this.salario - 1903.98) * IMPOSTO_2;
            case TERCEIRA:
                return ((2826.65 - 1903.98) * IMPOSTO_2) + ((this.salario - 2826.65) * IMPOSTO_3);
            case QUARTA:
                return ((2826.65 - 1903.98) * IMPOSTO_2) + ((3751.05 - 2826.65) * IMPOSTO_3) + ((this.salario - 3751.05) * IMPOSTO_4);
            case QUINTA:
                return ((2826.65 - 1903.98) * IMPOSTO_2) + ((3751.05 - 2826.65) * IMPOSTO_3) + ((4664.68 - 3751.05) * IMPOSTO_4) + ((this.salario - 4664.68) * IMPOSTO_5);
            default:
                throw new IllegalArgumentException("Valor de salario Invalido");
        }
        
        
        
    }
    
    
}

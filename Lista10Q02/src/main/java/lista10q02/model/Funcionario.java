/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10q02.model;

/**
 *
 * @author leandro
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode estar em branco!");
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase <= 0) {
            throw new IllegalArgumentException("O salario nao pode ser 0 ou negativo");
        }
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + "- salario : " + salarioBase;
    }
    
    
}

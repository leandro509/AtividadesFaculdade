/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10q02.model;

import java.util.ArrayList;

/**
 *
 * @author leandro
 */
public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Empresa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da empresa nao pode estar em branco!");
        }
        this.nome = nome;
    }
    
    public void incluirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    
    public ArrayList<Funcionario> getFuncionario() {
        return funcionarios;
    }
    
    public double calcularSalarios() {
        double salariosFuncionarios = 0;
        for(int i = 0; i < funcionarios.size(); i++) {
            salariosFuncionarios +=  funcionarios.get(i).calcularSalario();
        }
        return salariosFuncionarios;
    }
    
}

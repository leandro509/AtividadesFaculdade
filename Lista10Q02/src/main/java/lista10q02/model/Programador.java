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
public class Programador extends Funcionario {

    private ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public void removerLinguagem(String linguagem) {
        if (linguagens.contains(linguagem)) {
            linguagens.remove(linguagem);
        }
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    @Override
    public double calcularSalario() {
        if (linguagens.contains("Java") || linguagens.contains("JAVA") || linguagens.contains("java")) {
            return getSalarioBase() + (0.2 * getSalarioBase());
        }else {
            return getSalarioBase();
        }
    }

    @Override
    public String toString() {
        return "Programador: " + super.getNome() +  "- salario: " + calcularSalario() + "- Linguagens: " + getLinguagens();  
    }
    
    
}

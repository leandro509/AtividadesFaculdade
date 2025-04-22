/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista08.model;

/**
 *
 * @author leandro
 */
public class Aluno {
    private int matricula;
    private String nome;
    private double notaEnem;
    
    public Aluno(String nome, int matricula, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaEnem = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Matricula: " + matricula + " - Nota Enem: " + notaEnem;
    }
    
    
}

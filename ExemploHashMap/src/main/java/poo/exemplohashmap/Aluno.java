/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exemplohashmap;

import java.util.Objects;

/**
 *
 * @author lgonascimento
 */
public class Aluno {

    private int idade;
    private String nome;
    private int matricula;

    public Aluno(int idade, String nome, int matricula) {
        setIdade(idade);
        setNome(nome);
        setMatricula(matricula);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome : " + nome + " Idade : " + idade + 
                " Matricula : " + matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return this.matricula == other.matricula;
    }
    
    
    
 
    
    
    
}

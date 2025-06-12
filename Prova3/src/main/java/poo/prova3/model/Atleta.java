/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.prova3.model;

/**
 *
 * @author lgonascimento
 */
public class Atleta implements Comparable<Atleta>{
    private String nome;
    private int idade;

    public Atleta(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode estar vazio ou em branco");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0 ) {
            throw new IllegalArgumentException("A idade nao pode ser menor ou igual a zero");
        }
        this.idade = idade;
    }
    
    public float calcularDesempenho() {
        return 0;
    }

    @Override
    public int compareTo(Atleta o) {
        if(this.idade < o.idade) {
            return -1;
        }
        
        if(this.idade > o.idade) {
            return +1;
        }
        return 0;
    }
}

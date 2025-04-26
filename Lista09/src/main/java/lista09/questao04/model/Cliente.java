/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista09.questao04.model;

/**
 *
 * @author kleut
 */
public class Cliente {
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode estar em branco!"); 
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        if(endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("O endereco nao pode estar em branco!");
        }
    }
    
    
}

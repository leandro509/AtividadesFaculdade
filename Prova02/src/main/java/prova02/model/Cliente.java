/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova02.model;

import java.util.ArrayList;

/**
 *
 * @author lgonascimento
 */
public class Cliente {
    private String nome;
    private ArrayList<Ativo> carteira = new ArrayList<>();
    
    public Cliente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Valor para o campo nome esta incorreto");
        }
        this.nome = nome;
    }
    
    public void adicionarAtivo(Ativo ativo) {
        try{
        carteira.add(ativo);
        }catch(NullPointerException e) {
            System.out.println("Ativo nao pode ser nulo");
        }
    }
    
    public void removerAtivo(Ativo ativo) {
         if(carteira.isEmpty()) {
             throw new IllegalArgumentException("A carteira esta vazia, nao exite ativo para remover!");
         }
        
        try{
        carteira.remove(ativo);
        }catch(NullPointerException e) {
            System.out.println("Ativo nao pode ser nulo!");
        }
    }

    public ArrayList<Ativo> getCarteira() {
        return carteira;
    }
    
    public double calcularRendimentoCarteira() {
        if(carteira.isEmpty()) {
            return 0;
        }
        
        double totalRendimentos = 0;
        
        for(int i = 0; i < carteira.size(); i++) {
            totalRendimentos += carteira.get(i).calcularRendimento();
        }
        
        return totalRendimentos;
    }
    
    public double calcularValorInvestido() {
        
        if(carteira.isEmpty()) {
            return 0;
        }
        
        double totalInvestido = 0;
        
        for(int i = 0; i < carteira.size(); i++) {
            totalInvestido += carteira.get(i).calcularValorInvestido();
        }
        return totalInvestido;
        
        
    }
    
}

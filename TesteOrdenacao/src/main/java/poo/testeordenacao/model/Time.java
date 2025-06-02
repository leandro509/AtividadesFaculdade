/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.testeordenacao.model;

/**
 *
 * @author lgonascimento
 */
public class Time implements Comparable<Time>{
    private String nome;
    private int pontos;
    private int saldoGols;

    public Time(String nome, int pontos, int saldoGols) {
        setNome(nome);
        setPontos(pontos);
        setSaldoGols(saldoGols);
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    @Override
    public int compareTo(Time o) {
        if(this.pontos > o.getPontos()) {
            return 1;
        }
        
        if(this.pontos < o.getPontos()) {
            return -1;
        }
        
        if(this.saldoGols > o.getSaldoGols()) {
            return 1;
        }
        
        if(this.saldoGols < o.getSaldoGols()) {
            return -1;
        }
        
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        
        Time t2 = (Time) obj;
        if(!this.nome.equals(t2.getNome())) {
        return false;
        }
        
        if(this.pontos != t2.getPontos()) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return nome + " pts: " + pontos + " Sg: " + saldoGols;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.prova3.model;

/**
 *
 * @author lgonascimento
 */
public class AtletaBasquete extends Atleta {
    private int pontos;
    private int rebotes;

    public AtletaBasquete(String nome, int idade , int pontos, int rebotes) {
        super(nome, idade);
        setPontos(pontos);
        setRebotes(rebotes);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        if(pontos <= 0) {
            throw new IllegalArgumentException("O valor de pontos nao pode ser menor ou igual a zero");
        }
        this.pontos = pontos;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        if(rebotes <= 0) {
            throw new IllegalArgumentException("O valor de rebotes nao pode ser menor ou igual a zero");
        }
        this.rebotes = rebotes;
    }
    
    

    @Override
    public float calcularDesempenho() {
        return (float) (pontos + (rebotes * 3.5));
    }

    @Override
    public String toString() {
        return "Nome " +  super.getNome() + ",idade " + super.getIdade() + ", pontos" + pontos + ", rebotes " + rebotes; 
    }
    
    
    
    
    
}

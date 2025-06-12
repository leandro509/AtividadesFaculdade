/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.prova3.model;

/**
 *
 * @author lgonascimento
 */
public class AtletaVolei extends Atleta{
   
    private double saque;
    private double bloqueio;
    private double ataque;        

    public AtletaVolei(String nome, int idade, double saque, double bloqueio, double ataque) {
        super(nome, idade);
        setSaque(saque);
        setBloqueio(bloqueio);
        setAtaque(ataque);
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        if(saque <= 0) {
            throw new IllegalArgumentException("O valor de saque nao pode ser menor ou igual a zero");
        }
        this.saque = saque;
    }

    public double getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(double bloqueio) {
        if(bloqueio <= 0) {
            throw new IllegalArgumentException("O valor de bloqueio nao pode ser menor ou igual a zero");
        }
        this.bloqueio = bloqueio;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        if(ataque <= 0) {
            throw new IllegalArgumentException("O valor de ataque nao pode ser menor ou igual a zero");
        }
        this.ataque = ataque;
    }

    @Override
    public float calcularDesempenho() {
        return (float) ((saque * bloqueio) + ataque);
    }

    @Override
    public String toString() {
        return " Nome " + super.getNome() + ",idade " + super.getIdade() + " ,saque " + saque + ", bloqueio " + bloqueio + ", ataque " + ataque;
    }
 
       
    
    
}

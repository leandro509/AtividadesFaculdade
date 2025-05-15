/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

import java.util.ArrayList;

/**
 *
 * @author leandro
 */
public class Contas {
    private ArrayList<Pagavel> contas = new ArrayList<>();
    
    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }
    
    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
   public double calcularTotalContas() {
       double valorTotalPagar = 0;
       
       for(Pagavel p : contas) {
           valorTotalPagar += p.calcularValorPagar();
       }
       
       return valorTotalPagar;
       
   }
    
    
}

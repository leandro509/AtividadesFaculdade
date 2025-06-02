/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.testeordenacao.model;

import java.util.Comparator;

/**
 *
 * @author lgonascimento
 */
public class OrdenarPontosSaldo implements Comparator<Time> {
    
    @Override 
    public int compare(Time o1, Time o2) {
         if(o1.getPontos() > o2.getPontos()) {
            return 1;
        }
        
        if(o1.getPontos() < o2.getPontos()) {
            return -1;
        }
        
        if(o1.getSaldoGols() > o2.getSaldoGols()) {
            return 1;
        }
        
        if(o1.getSaldoGols() < o2.getSaldoGols()) {
            return -1;
        }
        
        return 0;
    }
}

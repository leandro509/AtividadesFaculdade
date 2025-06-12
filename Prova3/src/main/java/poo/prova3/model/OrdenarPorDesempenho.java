/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.prova3.model;

import java.util.Comparator;

/**
 *
 * @author lgonascimento
 */
public class OrdenarPorDesempenho implements Comparator<Atleta> {

    @Override
    public int compare(Atleta o1, Atleta o2) {
        
        if(o1.calcularDesempenho() > o2.calcularDesempenho()) {
            return 1;
        }
        
        if(o1.calcularDesempenho() < o2.calcularDesempenho()) {
            return -1;
        }
        
        return 0;
    }
    
}

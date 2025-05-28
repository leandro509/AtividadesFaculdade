/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exemploiterator;

import java.util.Comparator;

/**
 *
 * @author lgonascimento
 */
public class ComparadorNome implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.compareTo(o2);
    }
    
}

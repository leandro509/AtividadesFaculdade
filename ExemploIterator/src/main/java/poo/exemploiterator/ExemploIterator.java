/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.exemploiterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lgonascimento
 */
public class ExemploIterator {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        pessoas.add(new Pessoa("Jurandir", 10));
        pessoas.add(new Pessoa("Jeremias", 20));
        pessoas.add(new Pessoa("Jeremias", 23));
       pessoas.add(new Pessoa("Jucelino", 23));
       pessoas.add(new Pessoa("Esaclir", 22));

        System.out.println("Antes de ordenar");
        System.out.println(pessoas);
        
        pessoas.sort(new ComparadorNome());
        System.out.println("Depois de ordenar");
        System.out.println(pessoas);
        
        System.out.println("Antes de ordenar por idade");
        System.out.println(pessoas);
        
        pessoas.sort(new ComparadorIdade());
        System.out.println("Depois de ordenar por idade");
        System.out.println(pessoas);
        
        Iterator<Pessoa> iterator = pessoas.iterator();
        Pessoa p;
        
        System.out.println("Antes do filtro");
        System.out.println(pessoas);
        
        while (iterator.hasNext()) {
            p = iterator.next();
            if (p.getNome().endsWith("ir")){
            iterator.remove();
        }
        }
        System.out.println("Depois do filtro");
        System.out.println(pessoas);
        System.out.println("O tamanho da lista eh " + pessoas.size());
    }
}

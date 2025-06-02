/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.testeordenacao;

import java.util.ArrayList;
import java.util.Collections;
import poo.testeordenacao.model.OrdenarNome;
import poo.testeordenacao.model.OrdenarPontosSaldo;
import poo.testeordenacao.model.OrdenarSaldoGols;
import poo.testeordenacao.model.Time;

/**
 *
 * @author lgonascimento
 */
public class TesteOrdenacao {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList();
        times.add(new Time("Framengo", 5, -5));
        times.add(new Time("Vasco", 30, 10));
        times.add(new Time("Internacinal", 12, -2));
        times.add(new Time("Gremio", 15, 2));
        times.add(new Time("Chapecoense", 20, 8));
        times.add(new Time("Concordia", 11, 9));
        times.add(new Time("Atletico MG", 10,6));
        times.add(new Time("Corinthians", 5, -5));
        times.add(new Time("Santos", 20, 5));
        
        //times.sort(new OrdenarPontosSaldo());
        //times.sort(new OrdenarSaldoGols());
        
        times.sort(new OrdenarNome());
        
        for(Time t: times) {
            System.out.println(t);
        }
            
    }
}

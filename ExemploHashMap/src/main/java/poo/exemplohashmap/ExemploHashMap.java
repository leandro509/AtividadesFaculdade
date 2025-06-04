/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.exemplohashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author lgonascimento
 */
public class ExemploHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Aluno> alunos = new LinkedHashMap(); 
        Aluno a1 = new Aluno(12 , "Gilmar", 1234);
        alunos.put(1234, a1);
        alunos.put(3322, new Aluno(13, "Gumercindo", 3322));
        alunos.put(3526, new Aluno(13, "Jurandir", 3526));
        
        int consulta = 3322;
        System.out.println(alunos.containsKey(consulta));
        System.out.println("Consultando chave: " + consulta);
        System.out.println(alunos.get(consulta));
        
        HashMap<String, Integer> vegetais = new LinkedHashMap();
        
        vegetais.put("maca", 15);
        vegetais.put("banana", 3);
        vegetais.put("mamao", 5);
        vegetais.put("pera", 8);
        vegetais.put("bergamota", 12);
        
        vegetais.remove("maca");
        System.out.println("Buscando maca");
        System.out.println(vegetais.get("maca"));
        
        Aluno a2 = new Aluno(22, "Taylor", 5542);
        Aluno a3 = new Aluno(22, "Taylor", 8878);
        
        System.out.println(a2.equals(a3));
        
        
        System.out.println("Hash a2 :" + a2.hashCode());
        System.out.println("Hash a3 :" + a3.hashCode());
        
    }
}

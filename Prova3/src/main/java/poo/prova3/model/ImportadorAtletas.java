/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.prova3.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lgonascimento
 */
public class ImportadorAtletas {

    private ArrayList<Atleta> atletas;

    public ImportadorAtletas(String caminhoArquivo) throws FileNotFoundException {
        File arquivoCsv = new File(caminhoArquivo);
        atletas = new ArrayList<>();
    }

    
    
    public void incluirAtleta(Atleta atleta) {
        atletas.add(atleta);
    }
    
    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public Atleta getAtletaMaiorDesempenho() {
        return Atleta.class.cast(new OrdenarPorDesempenho());
    }

    
    /*
    public Atleta getAtletaMaisJovem() {
      // return Collections.sort(atletas);
    }
     */

    
}

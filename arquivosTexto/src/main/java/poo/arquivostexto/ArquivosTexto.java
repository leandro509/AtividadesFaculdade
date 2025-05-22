/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.arquivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lgonascimento
 */
public class ArquivosTexto {

    public static void main(String[] args) {
        File arquivo = new File("arquivo.texto.txt");
        try{
            arquivo.createNewFile();
            PrintWriter arquivosTexto = new PrintWriter(arquivo);
            arquivosTexto.write("Um texto qualquer");
            arquivosTexto.println("Outra linha de texto");
            arquivosTexto.println(42);
            
            
            arquivosTexto.close();
        }catch (IOException ex) {
            Logger.getLogger(ArquivosTexto.class.getName()).log(Level.SEVERE, msg);
        }
        
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer =  new BufferedReader(reader);
            
            String linha = buffer.readLine();
            while(linha != null) {
                System.out.println(linha);
                linha = buffer.readLine();
            }
        }catch(FileNotFoundException ex) {
            Logger.getLogger(ArquivosTexto.class.getName()).log(Level.SEVERE, msg);
        }catch(IOException ex) {
            Logger.getLogger(ArquivosTexto.class.getName()).log(Level.SEVERE, msg);
        }
    }
}

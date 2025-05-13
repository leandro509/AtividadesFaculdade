/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.exemploarquivosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author lgonascimento
 */

//OutputSream saida de dados ou escrita.
//InputStream entrada de dados ou leitura.

public class ExemploArquivosBinarios {

    public static void main(String[] args) throws IOException {
       File arquivo = new File("Teste.data");
       try{
           arquivo.createNewFile();
           FileOutputStream fos = new FileOutputStream(arquivo); 
           fos.write(65);
           fos.write(66);
           fos.write(67);
           fos.write(68);
           fos.write(49);
           fos.close();
           
           
       }catch (IOException ex) {
           Logger.getLogger(ExemploArquivosBinarios.class.getName());
       }
       
       try{
       FileInputStream fis = new FileInputStream(arquivo);
        int dado = fis.read();
        while (dado != -1){
            System.out.println("Byte lido: " +  dado);
        } 
        fis.close();
       }catch(FileNotFoundException ex) {
           Logger.getLogger(ExemploArquivosBinarios.class.getName());
       }
    }
}

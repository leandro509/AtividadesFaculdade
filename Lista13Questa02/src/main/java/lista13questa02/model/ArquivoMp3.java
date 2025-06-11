/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questa02.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author leandro
 */
public class ArquivoMp3 {

    private TagMp3 tag;

    public ArquivoMp3(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        try {
            
            FileInputStream fis = new FileInputStream(arquivo);
            
            while(fis.read() != -1) {
                fis.read();
            }
           
            if(fis.read() == -1) {
                fis.close();
            }
            
            
            
            DataInputStream dis = new DataInputStream(fis);
        } catch (ArquivoNaoTemTagMp3 | ArgumentoNaoEhArquivoException ex) {
            ex.getMessage();
            ex.printStackTrace();
        } catch(FileNotFoundException ex) {
            ex.getMessage();
            ex.printStackTrace();
        } catch(IllegalArgumentException ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    public TagMp3 getTagMp3() {
        return tag;
    }

}

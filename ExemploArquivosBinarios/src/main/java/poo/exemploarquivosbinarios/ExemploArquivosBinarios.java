/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.exemploarquivosbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lgonascimento
 */

//OutputSream saida de dados ou escrita.
//InputStream entrada de dados ou leitura.

public class ExemploArquivosBinarios {

        /*
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
    
         public static void main(String[] args) {
        File arquivo = new File("dados-primitivos.dat");
        try{
            arquivo.createNewFile();
            FileOutputStream fos =  new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(3.14);
            dos.writeUTF("Furb");
            dos.close();
        }catch(IOException ex){
             Logger.getLogger(ExemploArquivosBinarios.class.getName()).log(Level);
        }
        
        try{
           FileInputStream fis = new FileInputStream(arquivo);
           DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
        }catch(FileNotFoundException ex) {
             Logger.getLogger(ExemploArquivosBinarios.class.getName());
        }
        */
           
    //}
        
        public static void main(String[] args) {
        File arquivo = new File("objetos-data");
        Pessoa p = new Pessoa("Adelaide", 65);
        
        try{
            arquivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(arquivo);
            ObjectOutputStream ocs = new ObjectOutputStream(fos);
            ocs.writeObject(p);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        
        FileInputStream fis;
        
        /*
        try{
            fis = new FileInputStream (arquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Pessoa p = (Pessoa) ois.readObject();
            System.out.println("Nome : " + p.getNome());
            
        }
        */
    }
    
}

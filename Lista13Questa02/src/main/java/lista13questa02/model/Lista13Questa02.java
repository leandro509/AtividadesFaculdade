/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista13questa02.model;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author leandro
 */
public class Lista13Questa02 {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\Users\\leandro\\Downloads\\L13_musicaMP3.mp3");
        
        try(FileInputStream fis = new FileInputStream(arquivo)){
            System.out.println(fis.skip( ));
            
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

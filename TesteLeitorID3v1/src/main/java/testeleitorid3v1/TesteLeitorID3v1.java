/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testeleitorid3v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author leandro
 */
public class TesteLeitorID3v1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
         File mp3 = new File("C:\\Users\\leandro\\Downloads\\L13_musicaMP3.mp3");

        try (RandomAccessFile raf = new RandomAccessFile(mp3, "r")) {
            raf.seek(mp3.length() - 128); // Vai para os últimos 128 bytes
            byte[] tagBytes = new byte[128];
            raf.readFully(tagBytes);
            
           
            String tag = new String(tagBytes, 0, 3);
            if (!tag.equals("TAG")) {
                System.out.println("Não há tag ID3v1 no arquivo.");
                return;
            }

            String title = new String(tagBytes, 3, 30).trim();
            String artist = new String(tagBytes, 33, 30).trim();
            String album = new String(tagBytes, 63, 30).trim();
            String year = new String(tagBytes, 93, 4).trim();
            String comment = new String(tagBytes, 97, 30).trim();
            int genre = tagBytes[127] & 0xFF;

            System.out.println("Título: " + title);
            System.out.println("Artista: " + artist);
            System.out.println("Álbum: " + album);
            System.out.println("Ano: " + year);
            System.out.println("Comentário: " + comment);
            System.out.println("Gênero (código): " + genre);
        }
    }
}

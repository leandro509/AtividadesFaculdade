/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lista13questa02.model;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Lista13Questa02 {

    public static void main(String[] args) throws IOException {
       
      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo .mp3: ");
        String nomeArquivo = scanner.nextLine();
        try {
            
            
            
            ArquivoMp3 arquivoMp3 = new ArquivoMp3(nomeArquivo);
            arquivoMp3.exibirTags();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArgumentoNaoEhArquivoException e) {
            System.out.println(e.getMessage());
        } catch (ArquivoNaoTemTagMp3 e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

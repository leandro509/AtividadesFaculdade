package lista13.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Questao01 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite o nome do diretorio : ");
       String nomeDiretorio = scan.nextLine();
       
       File diretorio = new File(nomeDiretorio);
       
       if(!diretorio.isDirectory() || !diretorio.exists()) {
           throw new RuntimeException("O diretorio fornecido nao existe ou nao e um diretorio!");
       }

        long tamanhoTotal = calcularTamanhoTotal(diretorio);
        
        // Converte o tamanho total de bytes para megabytes
        double tamanhoEmMegabytes = tamanhoTotal / (1024.0 * 1024.0);
        
        // Exibe o tamanho total em megabytes
        System.out.printf("Tamanho total dos arquivos: %.2f MB%n", tamanhoEmMegabytes);
        
        scan.close(); // Fecha o scanner
    }

    // Método recursivo para calcular o tamanho total dos arquivos
    private static long calcularTamanhoTotal(File diretorio) {
        long tamanhoTotal = 0;

        // Lista todos os arquivos e diretórios dentro do diretório atual
        File[] arquivos = diretorio.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                // Se for um diretório, chama o método recursivamente
                if (arquivo.isDirectory()) {
                    tamanhoTotal += calcularTamanhoTotal(arquivo);
                } else {
                    // Se for um arquivo, adiciona seu tamanho ao total
                    tamanhoTotal += arquivo.length();
                }
            }
        }
        return tamanhoTotal;
    }
}

       
       
       
       
       
    


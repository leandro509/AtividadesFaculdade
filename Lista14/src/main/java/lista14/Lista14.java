/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lista14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Lista14 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        File arquivoCsv = new File("C:\\Users\\leandro\\Downloads\\L14_municipios.csv");

        ArrayList<Municipio> municipios = new ArrayList<>();
        
        try {
            String linhasArquivo = "";

            Scanner scan = new Scanner(new InputStreamReader(new FileInputStream(arquivoCsv), "UTF-8"));

            scan.nextLine();

            while (scan.hasNext()) {
                linhasArquivo = scan.nextLine();
                String[] valorEntreVirgulas = linhasArquivo.split(";");

                if (valorEntreVirgulas.length >= 4) {
                    int populacao = Integer.parseInt(valorEntreVirgulas[3]);
                    Municipio municipio = new Municipio(
                            valorEntreVirgulas[2],
                            valorEntreVirgulas[1],
                            valorEntreVirgulas[0],
                            populacao
                    );
                    municipios.add(municipio);
                    
                   
                }
            }
            
            
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        municipios.sort(new OrdenacaoPorPopulacao());
        int ultimoIndice = municipios.size() - 1;
        
        System.out.println("Ordenando pela mais populosa ");
        System.out.println(municipios.get(ultimoIndice).toString());
        
        municipios.sort(new OrdenacaoPorPopulacao().reversed());
        
        
        System.out.println("Ordenando pela menos populosa ");
        System.out.println(municipios.get(ultimoIndice).toString());
        
        System.out.println();
        
        
    }
}

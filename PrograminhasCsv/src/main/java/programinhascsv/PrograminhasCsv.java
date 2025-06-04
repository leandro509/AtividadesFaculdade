/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programinhascsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class PrograminhasCsv {

    public static void main(String[] args) {
        File arquivoCsv = new File("C:\\Users\\leandro\\Downloads\\arquivoCsv.csv");
        
        try{
            
            String linhasDoArquivo = "";
            
            Scanner scan = new Scanner(arquivoCsv);
            
            scan.nextLine();
            
            while(scan.hasNext()) {
                
                linhasDoArquivo = scan.nextLine();
                
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                
                System.out.println(valoresEntreVirgulas[2] + " " +  valoresEntreVirgulas[3]);
                
            }
                    
        }catch(FileNotFoundException e){
            
        }
    }
}

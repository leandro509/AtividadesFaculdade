/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questa03;
import javax.swing.JOptionPane;
/**
 *
 * @author lgonascimento
 */
public class AppQuesta03 {
    public static void main(String[] args) {
    
    int altura;
    int comprimento;
         
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
    comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a comprimento do retangulo"));
    
       
    Retangulo retangulo = new Retangulo(altura,comprimento);
    
    
    retangulo.setComprimento(comprimento);
    retangulo.setAltura(altura);
    
    
    
    JOptionPane.showMessageDialog(null, "O perimetro do retangulo eh " + retangulo.calcularPerimetro() + "\n" + "A area do retangulo eh " + retangulo.calcularArea());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;
import javax.swing.JOptionPane;
/**
 *
 * @author lgonascimento
 */
public class AppQuestao02 {
    public static void main(String[] args) {
    Retangulo retangulo = new Retangulo();
   
    int altura;
    int comprimento;
    
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
    comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a comprimento do retangulo"));
    
    retangulo.setAltura(altura);
    retangulo.setComprimento(comprimento);
    
    JOptionPane.showMessageDialog(null, "O perimetro do retangulo eh " + retangulo.calcularPerimetro() + "\n" + "A area do retangulo eh " + retangulo.calcularArea());
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PrimeiroProjeto;

/**
 *
 * @author lgonascimento
 */
public class App {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.nome = "Mingau";
        gato.cor = "marrom";
        gato.peso = 2f;
        
        System.out.println("O nome do gato eh : " + gato.nome);
        System.out.println(gato.miar());
        
    }
}

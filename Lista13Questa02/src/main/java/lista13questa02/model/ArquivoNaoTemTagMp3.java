/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questa02.model;

/**
 *
 * @author leandro
 */
public class ArquivoNaoTemTagMp3 extends IllegalArgumentException {
    public ArquivoNaoTemTagMp3(String arquivo) {
        super("O arquivo " + arquivo + " nao tem a tag .mp3");
    }
}

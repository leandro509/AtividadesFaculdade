/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questa02.model;


/**
 *
 * @author leandro
 */
public class ArgumentoNaoEhArquivoException extends IllegalArgumentException{
    public ArgumentoNaoEhArquivoException(String arquivo) {
        super("O arquivo lancado " + arquivo + " eh um diretorio!");
    }
}

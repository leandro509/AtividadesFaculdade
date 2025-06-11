/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questa02.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author leandro
 */
public class ArquivoMp3 {
    private File arquivo;
    private TagMp3 tag;

    // Construtor
    public ArquivoMp3(String nomeArquivo) throws IOException, ArgumentoNaoEhArquivoException, ArquivoNaoTemTagMp3 {
        arquivo = new File(nomeArquivo);
        verificarArquivo();
        extrairTag();
    }

    // Verifica se o arquivo existe e se é um arquivo
    private void verificarArquivo() throws FileNotFoundException, ArgumentoNaoEhArquivoException {
        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado: " + arquivo.getAbsolutePath());
        }
        if (!arquivo.isFile()) {
            throw new ArgumentoNaoEhArquivoException("O argumento fornecido não é um arquivo.");
        }
    }

    // Extrai as tags do arquivo MP3
    private void extrairTag() throws IOException, ArquivoNaoTemTagMp3 {
        try (FileInputStream fis = new FileInputStream(arquivo)) {
            fis.skip(arquivo.length() - 128); // Pular para os últimos 128 bytes
            byte[] tagBytes = new byte[128];
            fis.read(tagBytes);

            String cabecalho = new String(tagBytes, 0, 3);
            if (!cabecalho.equals("TAG")) {
                throw new ArquivoNaoTemTagMp3("O arquivo não contém tags MP3.");
            }

            String titulo = new String(tagBytes, 3, 30).trim();
            String artista = new String(tagBytes, 33, 30).trim();
            String album = new String(tagBytes, 63, 30).trim();
            int ano = Integer.parseInt(new String(tagBytes, 93, 4).trim());
            String comentario = new String(tagBytes, 97, 28).trim();
            String numeroFaixaStr = new String(tagBytes, 126, 1).trim();
            String generoStr = new String(tagBytes, 127, 1).trim();
            
             int numeroFaixa = numeroFaixaStr.isEmpty() ? 0 : Integer.parseInt(numeroFaixaStr);
             int genero = generoStr.isEmpty() ? 0 : Integer.parseInt(generoStr);

            tag = new TagMp3(titulo, artista, album, ano, comentario, numeroFaixa, genero);
        }
    }

    // Exibe as tags extraídas
    public void exibirTags() {
        System.out.println("Título: " + tag.getTitulo());
        System.out.println("Artista: " + tag.getArtista());
        System.out.println("Álbum: " + tag.getAlbum());
        System.out.println("Ano: " + tag.getAno());
        System.out.println("Comentário: " + tag.getComentario());
        System.out.println("Número da Faixa: " + tag.getNumeroFaixa()); // Exibe o número da faixa
        System.out.println("Gênero: " + tag.getGenero());               // Exibe o gênero
    }
}

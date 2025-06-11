/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13questa02.model;

/**
 *
 * @author leandro
 */
public class TagMp3 {

    private String titulo;
    private String artista;
    private String album;
    private int ano;
    private String comentario;
    private int numeroFaixa;
    private int genero;
    
    public TagMp3(String titulo, String artista, String album, int ano, String comentario, int numeroFaixa, int genero) {
        setTitulo(titulo);
        setArtista(artista);
        setAlbum(album);
        setAno(ano);
        setComentario(comentario);
        setNumeroFaixa(numeroFaixa);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo nao pode estar vazio ou em branco");
        }
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("O artista nao pode estar vazio ou em branco");
        }
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        if (album == null || album.trim().isEmpty()) {
            throw new IllegalArgumentException("O album nao pode estar vazio ou em branco");
        }
        this.album = album;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("O ano nao pode ser 0 ou negativo!");
        }
        this.ano = ano;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(int numeroFaixa) {
        if (numeroFaixa <= 0) {
            throw new IllegalArgumentException("O numero da faixa nao pode ser 0 ou negativo!");
        }
        this.numeroFaixa = numeroFaixa;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        if (genero <= 0) {
            throw new IllegalArgumentException("O genero nao pode ser 0 ou negativo!");
        }
        this.genero = genero;
    }

}

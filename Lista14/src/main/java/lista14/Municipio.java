/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista14;

/**
 *
 * @author leandro
 */
public class Municipio {
    String estado;
    String cidade;
    String codigoIbge;
    int populacao;

    public Municipio(String estado, String cidade, String codigoIbge, int populacao) {
        this.estado = estado;
        this.cidade = cidade;
        this.codigoIbge = codigoIbge;
        this.populacao = populacao;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return  "estado = " + estado + ", cidade = "  + cidade + ", codigoIbge = " + codigoIbge + ", populacao = " + populacao;
    }
    
    
}

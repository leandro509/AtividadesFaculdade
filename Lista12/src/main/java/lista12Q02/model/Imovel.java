/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12Q02.model;

import lista12.model.*;

/**
 *
 * @author leandro
 */
public class Imovel {
     private String endereco;
    private int area;
    private Finalidade finalidade;
    private Bairro bairro;
    
   
    public Imovel() {
        
    }

    public Imovel(String endereco, int area, Finalidade finalidade, Bairro bairro) {
        this.endereco = endereco;
        this.area = area;
        this.finalidade = finalidade;
        this.bairro = bairro;
    }
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("O endereco nao pode estar em branco!");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area <= 0) {
            throw new IllegalArgumentException("Area nao pode ser menor ou igual a 0!");
        }
        
        this.area = area;
    }
    
    public void setFinalidade(Finalidade finalidade) {
        if(finalidade == null) {
            throw new IllegalArgumentException("Finalidade nao pode ser nula!");
        }
        this.finalidade = finalidade;
    }
    
    public Finalidade getFinalidade() {
        return this.finalidade;
    }
    
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
        if(this.bairro == null ) {
            throw new IllegalArgumentException("Bairro nao pode ser nulo");
        }
    }
    
    public Bairro getBairro() {
        return this.bairro;
    }
    
    public double calcularIptu() throws IllegalArgumentException  {
        
        setArea(area);
        setEndereco(endereco);
        setFinalidade(finalidade);        
        setBairro(bairro);
        
            switch(finalidade) {
                case RESIDENCIAL:
                    return calculoResidencial();
                
                case COMERCIAL:
                    return calculoComercial();
            }
            
            return calculoIndustrial();
            
      
    }
    
    public double calculoResidencial() {
        return (this.area * 1) * bairro.getCoeficienteIptu();
    }
    
    public double calculoComercial() {
        if(this.area <= 100 ) {
            return 500 * bairro.getCoeficienteIptu();
        }
        
        if(this.area > 100 && this.area <= 400) {
            return 1000 * bairro.getCoeficienteIptu();
        }
        
        return (2.55 * this.area) * bairro.getCoeficienteIptu();
    }
    
    public double calculoIndustrial() {
        if(this.area <= 2000) {
            return 1000 * bairro.getCoeficienteIptu();
        }
        
        return (0.55 * this.area) * bairro.getCoeficienteIptu();
    }
}

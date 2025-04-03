/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista07.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ImovelTest {

    @Test
    public void testeAreaNegativa() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Imovel imovel = new Imovel();
            imovel.setArea(-5);
        });
        String esperado = ("Area nao pode ser menor ou igual a 0!");
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado);
    }

    @Test
    public void calculoIptuSemArea() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Imovel imovel = new Imovel();
            imovel.setEndereco("Rua 1");
            Bairro bairro = new Bairro();
            bairro.setNome("Centro");
            bairro.setCoeficienteIptu(1);
            imovel.calcularIptu();

        });
        String esperado = "Area nao pode ser menor ou igual a 0!";
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testeFinalidadeNula() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Imovel imovel = new Imovel();
            imovel.setEndereco("Rua 1");
            Bairro bairro = new Bairro();
            bairro.setNome("Centro");
            bairro.setCoeficienteIptu(1);
            imovel.setArea(250);
            imovel.calcularIptu();
        });
        String esperado = "Finalidade nao pode ser nula!";
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado);

    }

    @Test
    public void testeBairroNulo() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Imovel imovel = new Imovel();
            imovel.setEndereco("Rua 1");
            imovel.setFinalidade(Finalidade.RESIDENCIAL);
            imovel.setArea(400);
            imovel.calcularIptu();
        });

        String esperado = "Bairro nao pode ser nulo";
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado);

    }

    @Test
    public void calculoImpostoResidencial() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(400);
        int esperado = 400;
        assertEquals(esperado, imovel.calcularIptu());

    }

    @Test
    public void calculoImpostoComercialAte100() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(80);
        int esperado = 500;
        assertEquals(esperado, imovel.calcularIptu());
    }
    
    @Test
    public void calculoImpostoComercialEntre100E400() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(250);
        int esperado = 1000;
        assertEquals(esperado, imovel.calcularIptu());
    }
    
    @Test
    public void calculoImpostoComercialMaior400() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(500);
        int esperado = 1275;
        assertEquals(esperado, imovel.calcularIptu());
    }
    
     @Test
    public void calculoImpostoIndustrialAte2000() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(2000);
        int esperado = 1000;
        assertEquals(esperado, imovel.calcularIptu());
    }
    
     @Test
    public void calculoImpostoIndustrialMaior2000() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setArea(3000);
        int esperado = 1650;
        double tolerancia = 0.009;
        assertEquals(esperado, imovel.calcularIptu(), tolerancia);
    }
    
     @Test
    public void calculoImpostoCoeficienteIptuMaior1() {
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setEndereco("Rua 1");
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(2.5);
        imovel.setBairro(bairro);
        imovel.setArea(500);
        int esperado = 1250;
        double tolerancia = 0.009;
        assertEquals(esperado, imovel.calcularIptu(), tolerancia);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lgonascimento
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testeSomarInteiro() {
        int a = 2;
        int b = 6;
        int esperado = 8;
        
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(a, b);
        
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void testeSomarDecimal() {
        float a = 3;
        float b = 0.12f;
        float esperado = 3.123f;
        float tolerancia = 0.01f;
        
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.somar(a, b);
        
        assertEquals(esperado, resultado, tolerancia);
    }
    
    @Test
    public void testeDividir(){
        float a= 4;
        float b = 2;
        float esperado = 2;
        
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.dividir(a, b);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeDivisaoPorZero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora calculadora = new Calculadora();
            calculadora.dividir(4, 0);
        });
        
        String esperado = "Divisao por 0";
        assertEquals(esperado, ex.getMessage());
    
    }
}

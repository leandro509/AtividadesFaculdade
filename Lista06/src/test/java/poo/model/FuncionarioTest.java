/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class FuncionarioTest {
    
   

    @Test
    public void identifyStripe01() {
        Funcionario funcionario = new Funcionario("Leandro", 850);
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
        
    }
    
    @Test 
    public void identifyIrpf01() {
        Funcionario funcionario = new Funcionario("Leandro", 850);
        assertEquals(0, funcionario.calcularIrpf());
        
    }
    
     @Test
    public void identifyStripe02() {
        Funcionario funcionario = new Funcionario("Leandro", 1903.98);
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf02() {
        Funcionario funcionario = new Funcionario("Leandro", 1903.98);
        assertEquals(0, funcionario.calcularIrpf());
        
    }
    
     @Test
    public void identifyStripe03() {
        Funcionario funcionario = new Funcionario("Leandro", 1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf03() {
        Funcionario funcionario = new Funcionario("Leandro", 850);
        assertEquals(0, funcionario.calcularIrpf());
        
    }
    
     @Test
    public void identifyStripe04() {
        Funcionario funcionario = new Funcionario("Leandro", 2000);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf04() {
        Funcionario funcionario = new Funcionario("Leandro", 2000);
        double tolerancia = 0.009;
        assertEquals(7.20, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe05() {
        Funcionario funcionario = new Funcionario("Leandro", 2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf05() {
        Funcionario funcionario = new Funcionario("Leandro", 2826.65);
        double tolerancia = 0.009;
        assertEquals(69.20, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe06() {
        Funcionario funcionario = new Funcionario("Leandro", 2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
        
    }
     @Test
    public void identifyIrpf06() {
        Funcionario funcionario = new Funcionario("Leandro", 2826.66);
        double tolerancia = 0.009;
        assertEquals(69.20, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe07() {
        Funcionario funcionario = new Funcionario("Leandro", 3000);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf07() {
        Funcionario funcionario = new Funcionario("Leandro", 3000);
        double tolerancia = 0.009;
        assertEquals(95.20, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe08() {
        Funcionario funcionario = new Funcionario("Leandro", 3751.05);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf08() {
        Funcionario funcionario = new Funcionario("Leandro", 3751.05);
        double tolerancia = 0.009;
        assertEquals(207.86, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe09() {
        Funcionario funcionario = new Funcionario("Leandro", 3751.06);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf09() {
        Funcionario funcionario = new Funcionario("Leandro", 3751.06);
        double tolerancia = 0.009;
        assertEquals(207.86, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe10() {
        Funcionario funcionario = new Funcionario("Leandro", 4000);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf10() {
        Funcionario funcionario = new Funcionario("Leandro", 4000);
        double tolerancia = 0.009;
        assertEquals(263.87, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe11() {
        Funcionario funcionario = new Funcionario("Leandro", 4664.68);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
        
    }
     @Test
    public void identifyIrpf11() {
        Funcionario funcionario = new Funcionario("Leandro", 4664.68);
        double tolerancia = 0.009;
        assertEquals(413.42, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe12() {
        Funcionario funcionario = new Funcionario("Leandro", 4664.69);
        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf12() {
        Funcionario funcionario = new Funcionario("Leandro", 4664.69);
        double tolerancia = 0.009;
        assertEquals(413.42, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void identifyStripe13() {
        Funcionario funcionario = new Funcionario("Leandro", 5000);
        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
        
    }
    
     @Test
    public void identifyIrpf13() {
        Funcionario funcionario = new Funcionario("Leandro", 5000);
        double tolerancia = 0.009;
        assertEquals(505.64, funcionario.calcularIrpf(), tolerancia);
        
    }
    
     @Test
    public void IllegalException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            
        Funcionario funcionario = new Funcionario("Leandro", -100);
        String esperado = "O salario deve ser maior que Zero";
        String resultado = exception.getMessage();
        
        assertEquals(esperado, resultado);
            
        });
        
    }
    
    }

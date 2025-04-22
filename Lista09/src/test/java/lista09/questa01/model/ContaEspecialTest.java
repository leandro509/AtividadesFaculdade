/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista09.questa01.model;

import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lgonascimento
 */
public class ContaEspecialTest {
    
   

    @Test
    public void saqueSuperiorSaldo() {
        ContaEspecial conta01 = new ContaEspecial("1001", 0);
        
        conta01.setLimiteCredito(100);
        conta01.depositar(20);
        conta01.sacar(50);
        
        double esperado = -30;
        double limite = 0.009;
        assertEquals(esperado, conta01.getSaldo(), limite);
        
    }
    
    @Test    
    public void valorSuperiorSaldoInferiorLimite() {
        ContaEspecial conta01 = new ContaEspecial("1001", 0);
        conta01.setLimiteCredito(100);
        conta01.sacar(100);
        
        double esperado = -100;
        double limite = 0.009;
        assertEquals(esperado, conta01.getSaldo(), limite);
        
    } 
    
    
    
    
}

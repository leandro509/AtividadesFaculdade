/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prova01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ReservaTest {
    
      @Test
  public void testQuartoComumSemHospedes() {
      Reserva reserva = new Reserva(4, 2, TipoQuarto.COMUM);
      double valor = 880;
      double limite = 0.009;
      
      assertEquals(valor, reserva.calcularValorReserva(), limite);
      
  }
  
  @Test
  public void testQuartoComumHospedesExcedentes() {
      Reserva reserva = new Reserva(2, 4, TipoQuarto.COMUM);
      double valor = 680;
      double limite = 0.009;
      
      assertEquals(valor, reserva.calcularValorReserva(), limite);
      
  }
  
  @Test
  public void testQuartoFamiliaSemHospedes() {
      Reserva reserva = new Reserva(4, 4, TipoQuarto.FAMILIA);
      double valor = 1400;
      double limite = 0.009;
      
      assertEquals(valor, reserva.calcularValorReserva(), limite);
      
  }
  
  @Test
  public void testQuartoFamiliaHospedesExcedentes() {
      Reserva reserva = new Reserva(3, 5, TipoQuarto.FAMILIA);
      double valor = 1230;
      double limite = 0.009;
      
      assertEquals(valor, reserva.calcularValorReserva(), limite);
      
  }
  
  @Test
  public void testQuartoSuiteHospedesExcedentes() {
      Reserva reserva = new Reserva(5, 8, TipoQuarto.SUITE_PRESIDENCIAL);
      double valor = 5000;
      double limite = 0.009;
      
      assertEquals(valor, reserva.calcularValorReserva(), limite);
      
  }

   
    
}

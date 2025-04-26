/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista09.questao04.model;

import static lista09.questao03.model.TipoMovimento.CREDITO;
import static lista09.questao04.model.TipoMovimento.DEBITO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ContaEspecialTest {
    
   
  @Test
  public void validarCreditoDebito() {
      ContaEspecial conta01 = new ContaEspecial("1001", 0);
      conta01.depositar(1000);
      conta01.sacar(250);
      
      double esperado1 = 1000;
      double esperado2 = 250;
      TipoMovimento tipoEsperado1 = TipoMovimento.CREDITO;
      TipoMovimento tipoEsperado2 = TipoMovimento.DEBITO;
      
      double tolerancia = 0.009;
      assertEquals(esperado1,conta01.getMovimentos().get(0).getValor(), tolerancia);
      assertEquals(tipoEsperado1, conta01.getMovimentos().get(0).getTipoMovimento());
      assertEquals(tipoEsperado2, conta01.getMovimentos().get(1).getTipoMovimento());
      assertEquals(esperado2,conta01.getMovimentos().get(1).getValor(), tolerancia);
      
      
  }
    
}

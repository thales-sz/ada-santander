package model;

import org.junit.Assert;
import org.junit.Test;

import model.Calculadora;

public class CalculadoraTest {
  @Test
  public void deveIniciarDesligada() {
    Calculadora calculadora = new Calculadora();
    Assert.assertFalse(calculadora.getStatus());
  }

  @Test
  public void deveDesligarCorretamente() {
    Calculadora calculadora = new Calculadora();
    calculadora.ligar();
    calculadora.desligar();
    Assert.assertFalse(calculadora.getStatus());
  }

  @Test
  public void deveLigarCorretamente() {
    Calculadora calculadora = new Calculadora();
    calculadora.ligar();
    Assert.assertTrue(calculadora.getStatus());
  }

  @Test
  public void naoDeveSerPossivelDividirPorZero() {
    Calculadora calculadora = new Calculadora();
    
    calculadora.ligar();

    Throwable throwable = Assert.assertThrows(ArithmeticException.class, () -> {
      calculadora.divisao(10, 0);
    });

    Assert.assertEquals("Não existe divisão por zero!", throwable.getMessage());
  }

  @Test
  public void deveSomarDoisNumeros() {
    Calculadora calculadora = new Calculadora();
    
    calculadora.ligar();

    Assert.assertEquals(15, calculadora.soma(10, 5));
  }

  @Test
  public void deveSubtrairDoisNumeros() {
    Calculadora calculadora = new Calculadora();
    
    calculadora.ligar();

    Assert.assertEquals(5, calculadora.subtracao(10.72345, 5.7845));
  }
}

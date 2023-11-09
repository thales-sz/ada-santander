package model;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CalculadoraTest {
  @Test
  public void deveIniciarDesligada() {
    // Given
    Calculadora calculadora = new Calculadora();
    // When
    // Then
    Assert.assertFalse(calculadora.getStatus());
  }

  @Test
  public void deveDesligarCorretamente() {
    // Given
    Calculadora calculadora = new Calculadora();

    // When
    calculadora.ligar();
    calculadora.desligar();

    // Then
    Assert.assertFalse(calculadora.getStatus());
  }

  @Test
  public void deveLigarCorretamente() {
    // Given
    Calculadora calculadora = new Calculadora();

    // When
    calculadora.ligar();

    // Then
    Assert.assertTrue(calculadora.getStatus());
  }

  @Test
  public void naoDeveSerPossivelDividirPorZero() {
    // Given
    Calculadora calculadora = new Calculadora();
    
    // When
    calculadora.ligar();

    Throwable throwable = Assert.assertThrows(Exception.class, () -> {
      calculadora.divisao(10.0, 0.0);
    });

    // Then
    Assert.assertEquals("Não existe divisão por zero!", throwable.getMessage());
  }

  @Test
  public void deveSomarDoisNumeros() {
    // Given
    Calculadora calculadora = new Calculadora();
    
    // When
    calculadora.ligar();

    // Then
    Assert.assertEquals((Double) 15.0, calculadora.soma(10.0, 5.0));
  }

  @Test
  public void deveSubtrairDoisNumeros() {
    // Given
    Calculadora calculadora = new Calculadora();
    // When
    calculadora.ligar();
    // Then
    Assert.assertEquals((Double) 4.9389, calculadora.subtracao(10.72345, 5.7845), 0.0001);
  }

  @Test
  public void deveSerUmaCalculadora() {
    // Given
    Calculadora calculadora = new Calculadora();
    // When
    // Then
    Assert.assertThat(calculadora, is(instanceOf(Calculadora.class)));
  }

  @Test
  public void deveSerNull() {
    // Given
    Calculadora calculadora = null;
    // When
    // Then
    Assert.assertNull(calculadora);
  }

   @Test
  public void naoDeveSerNull() {
    // Given
    Calculadora calculadora = new Calculadora();
    // When
    // Then
    Assert.assertNotNull(calculadora);
  }

  @Test
  public void duasCalculadorasNaoDevemSerAsMesmas() {
    // Given
    Calculadora calculadora1 = new Calculadora();
    Calculadora calculadora2 = new Calculadora();
    // When
    // Then
    Assert.assertNotSame(calculadora1, calculadora2);
  }
}

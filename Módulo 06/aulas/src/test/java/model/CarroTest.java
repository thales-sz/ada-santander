package model;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
  
  @Test
  public void deveIniciarDesligado() {
    Carro carro_01 = new Carro();
    
    Assert.assertFalse(carro_01.getLigado());
  }

  @Test
  public void deveTerVelocidadeZeroAoIniciar() {
    // Given
    Carro carro_02 = new Carro();
    
    // When
    carro_02.ligar();

    // Then
    Assert.assertEquals((Integer) 0, carro_02.getVelocidadeAtual());
  }

  @Test
  public void deveAcelerarCorretamente() {
    // Given
    Carro carro = new Carro();
    
    // When
    carro.ligar();
    carro.acelerar(15);

    // Then
    Assert.assertEquals((Integer) 15, carro.getVelocidadeAtual());
  }


  @Test
  public void deveLigarCorretamente() {
    Carro carro_03 = new Carro();

    // When (Quando)
    carro_03.ligar();

    // Then (Então)
    Assert.assertTrue(carro_03.getLigado());
  }

  @Test
  public void deveDesligarCorretamente() {
    Carro carro_04 = new Carro();

    // When (Quando)
    carro_04.ligar();
    carro_04.desligar();

    Assert.assertFalse(carro_04.getLigado());
  }

  @Test
  public void deveSeManterNoLimiteDeVelocidade() {
    Carro carro_06 = new Carro();

    // When
    carro_06.ligar();
    carro_06.acelerar(100);
    carro_06.acelerar(100);
    carro_06.acelerar(100);

    // Then
    Assert.assertEquals(carro_06.getVelocidadeMaxima(), carro_06.getVelocidadeAtual());
  }

  @Test
  public void deveSeManterNoLimiteDeVelocidadeOutroAssert() {
    Carro carro_07 = new Carro();
    // //When(Quando)
    carro_07.ligar();
    carro_07.acelerar(100);
    carro_07.acelerar(150);

    // //Then(Então)
    Assert.assertEquals((Integer) 200, carro_07.getVelocidadeAtual());
  }

  @Test
  public void velocidadeNaoDeveSerMenorQueZero() {
    Carro carro_08 = new Carro();

    carro_08.ligar();
    carro_08.acelerar(50);
    carro_08.frear(100);

    Assert.assertEquals((Integer) 0, carro_08.getVelocidadeAtual());
  }
}

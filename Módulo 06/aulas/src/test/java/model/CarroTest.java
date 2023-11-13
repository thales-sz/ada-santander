package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarroTest {
  
  @Test
  public void deveIniciarDesligado() {
    Carro carro_01 = new Carro();
    
    assertFalse(carro_01.getLigado());
  }

  @Test
  public void deveTerVelocidadeZeroAoIniciar() {
    // Given
    Carro carro_02 = new Carro();
    
    // When
    carro_02.ligar();

    // Then
    assertEquals((Integer) 0, carro_02.getVelocidadeAtual());
  }

  @Test
  public void deveAcelerarCorretamente() throws Exception {
    // Given
    Carro carro = new Carro();
    
    // When
    carro.ligar();
    carro.acelerar(15);

    // Then
    assertEquals((Integer) 15, carro.getVelocidadeAtual());
  }


  @Test
  public void deveLigarCorretamente() {
    Carro carro_03 = new Carro();

    // When (Quando)
    carro_03.ligar();

    // Then (Então)
    assertTrue(carro_03.getLigado());
  }

  @Test
  public void deveDesligarCorretamente() {
    Carro carro_04 = new Carro();

    // When (Quando)
    carro_04.ligar();
    carro_04.desligar();

    assertFalse(carro_04.getLigado());
  }

  @Test
  public void deveSeManterNoLimiteDeVelocidade() throws Exception {
    Carro carro_06 = new Carro();

    // When
    carro_06.ligar();
    carro_06.acelerar(100);
    carro_06.acelerar(100);
    carro_06.acelerar(100);

    // Then
    assertEquals(carro_06.getVelocidadeMaxima(), carro_06.getVelocidadeAtual());
  }

  @Test
  public void deveSeManterNoLimiteDeVelocidadeOutroAssert() throws Exception {
    Carro carro_07 = new Carro();
    // //When(Quando)
    carro_07.ligar();
    carro_07.acelerar(100);
    carro_07.acelerar(150);

    // //Then(Então)
    assertEquals(200, carro_07.getVelocidadeAtual());
  }

  @Test
  public void velocidadeNaoDeveSerMenorQueZero() throws Exception {
    Carro carro_08 = new Carro();

    carro_08.ligar();
    carro_08.acelerar(50);
    carro_08.frear(100);

    assertEquals((Integer) 0, carro_08.getVelocidadeAtual());
  }

  @Test
  public void deveCriarUmCarroComOsAtributos() {
    Carro carro = new Carro("Roxo", "Lamborghini", "Urus", 450);

    assertAll("Testando atributos do carro",
            () -> assertEquals("Roxo", carro.getCor()),
            () -> assertEquals("Lamborghini", carro.getMarca()),
            () -> assertEquals("Urus", carro.getModelo()),
            () -> assertEquals(450, carro.getVelocidadeMaxima())
    );
  }

  @Test
  public void naoDeveTrancarUmCarroJaTrancado() {
    // Given
    Carro carro = new Carro();
    carro.ligar();

    // When
    carro.destrancar();
    carro.trancar();
    carro.trancar();
    carro.trancar();

    // Then
    assertEquals(true, carro.getTrancado());
  }

  @Test
  public void deveLancarExceptionEmCasoDeAceleracaoNegativa() {
    Carro carro = new Carro();
    carro.ligar();

    Throwable throwable = assertThrows(Exception.class, () -> carro.acelerar(-10));

    assertEquals("A aceleracao não pode ser menor que zero!", throwable.getMessage());
  }

  @Test
  public void deveSerPossivelAlterarOsAtributos() {
    Carro carro = new Carro("Roxo", "Lamborghini", "Urus", 450);

    carro.setCor("Azul");
    carro.setMarca("Volkswagen");
    carro.setModelo("Fusca");

    assertAll("Testando atributos do carro",
            () -> assertEquals("Azul", carro.getCor()),
            () -> assertEquals("Volkswagen", carro.getMarca()),
            () -> assertEquals("Fusca", carro.getModelo()));
  }

  @Test
  public void deveFrearCorretamente() throws Exception {
    Carro carro = new Carro();

    carro.ligar();
    carro.acelerar(50);
    carro.frear(20);

    assertEquals(30, carro.getVelocidadeAtual());
  }

  @Test
  public void deveCriarUmCarroComApenasVelocidadeMaxima() throws Exception {
    Carro carro = new Carro(300);

    assertEquals(300, carro.getVelocidadeMaxima());
  }

  @Test
  public void deveCriarUmCarroComOsAtributosMenosVelocidade() {
    Carro carro = new Carro("Roxo", "Lamborghini", "Urus");

    assertAll("Testando atributos do carro",
            () -> assertEquals("Roxo", carro.getCor()),
            () -> assertEquals("Lamborghini", carro.getMarca()),
            () -> assertEquals("Urus", carro.getModelo())
    );
  }

  @Test
  public void deveSerPossivelDestrancarUmCarro() {
    Carro carro = new Carro();

    carro.ligar();
    carro.destrancar();
    carro.trancar();
    carro.destrancar();

    assertFalse(carro.getTrancado());
  }

  @Test
  public void naoDeveFazerNadaAoDestrancarUmCarroDestrancado() {
    Carro carro = new Carro();

    carro.ligar();
    carro.destrancar();
    carro.destrancar();
    carro.destrancar();

    assertFalse(carro.getTrancado());
  }

  @Test
  public void umTipoCarroDeveSerIgualAoOutro() {
    Carro carro01 = new Carro();
    Carro carro02 = new Carro();


    assertTrue(carro01.equals(carro02));
  }
}

package model;

public class Calculadora {
  private Boolean status;
  private Double resultado;

  public Double soma(Double a, Double b) {
    resultado = a + b;
    return resultado;
  }

  public Double subtracao(Double a, Double b) {
    resultado = a - b;
    return resultado;
  }

  public Double multiplicacao(Double a, Double b) {
    resultado = a * b;
    return resultado;
  }

  public Double divisao(Double a, Double b) throws Exception {
    if (b == 0) {
      // Exception - desvio de uma regra ou de um padrão convencionalmente aceito.
      throw new Exception("Não existe divisão por zero!");
    }

    resultado = a / b;
    return resultado;
  }

  public void ligar() {
    status = true;
  }

  public void desligar() {
    status = true;
  }

  public Boolean getStatus() {
    return status;
  }
}

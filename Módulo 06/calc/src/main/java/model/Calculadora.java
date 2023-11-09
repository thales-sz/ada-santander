package model;

public class Calculadora {
  private Boolean status;
  private Double resultado;

  public Calculadora() {
    this.status = false;
    this.resultado = 0.0;
  }

  public Double soma(Double a, Double b) {
    this.resultado = a + b;
    return this.resultado;
  }

  public Double subtracao(Double a, Double b) {
    this.resultado = a - b;
    return this.resultado;
  }

  public Double multiplicacao(Double a, Double b) {
    this.resultado = a * b;
    return this.resultado;
  }

  public Double divisao(Double a, Double b) throws Exception {
    if (b == 0) {
      // Exception - desvio de uma regra ou de um padrão convencionalmente aceito.
      throw new Exception("Não existe divisão por zero!");
    }

    this.resultado = a / b;
    return this.resultado;
  }

  public void ligar() {
    this.status = true;
  }

  public void desligar() {
    this.status = false;
  }

  public Boolean getStatus() {
    return this.status;
  }
}

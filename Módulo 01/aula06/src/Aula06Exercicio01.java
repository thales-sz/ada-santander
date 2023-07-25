package aula06.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import aula06.src.utils.InvalidStateException;

public class Aula06Exercicio01 {
  public static void main(String[] args) throws InvalidStateException {

    System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
    System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
    System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);

    try {
      valorProdutoFinal(250.10, "RO");
    } catch (InvalidStateException e) {
      System.out.println(e.getMessage().equals("Estado inválido"));
    } 
  }

  public static double valorProdutoFinal(double valorProduto, String estado) throws InvalidStateException {
    Estado currentState;
    try {
      currentState = Estado.valueOf(estado);
    } catch (Exception e) {
      throw new InvalidStateException("Estado inválido");
    }
    
    double finalPrice = valorProduto * (currentState.getTax() + 1);
    return arredondar(finalPrice);
  }

  public static double arredondar(double numero) {
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
    return Double.parseDouble(decimalFormat.format(numero));
  }

  public enum Estado {
    MG(0.07), SP(0.12), RJ(0.15);

    private double tax;

    Estado(double tax) {
      this.tax = tax;
    }

    public double getTax() {
      return tax;
    }
  }
}

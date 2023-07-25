package aula06.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula06Exercicio01 {
  public static void main(String[] args) {

    System.out.println(valorProdutoFinal(250.10, Estado.MG) == 267.607);
    System.out.println(valorProdutoFinal(250.10, Estado.RJ) == 287.615);
    System.out.println(valorProdutoFinal(250.10, Estado.SP) == 280.112);
  }

  public static double valorProdutoFinal(double valorProduto, Estado estado) {
    double finalPrice = valorProduto * (estado.getTax() + 1);
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

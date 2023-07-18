public class Aula03Exercicio02 {
  public static void main(String[] args) {
    double[] input = { 10000, 28, 45 };

    System.out.println(custosCarro(input));
  }

  public static double[] custosCarro( double[] input) {

    double distributor = (input[1] * 100) / input[0];
    double tax = (input[2] * 100) / input[0];

    return new double[] { Math.round(distributor * 100) / 100.0, Math.round(tax * 100) / 100.0 };
  }
}
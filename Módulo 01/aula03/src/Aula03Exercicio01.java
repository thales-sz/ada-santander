public class Aula03Exercicio01 {
  public static void main(String[] args) {
    double input = 11;

    System.out.println(custoCompra(input));
  }

  public static double custoCompra(double input) {
    if (input > 10) {
      return input * 1.25;
    } return input * 1.45;
  }
}

import java.util.Scanner;

public class Aula03Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os lados do triângulo em cm:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    if (!isTriangle(a, b, c)) {
      System.out.println("Não é um triângulo");
      sc.close();
      return;
    }

    System.out.println("Área do triângulo: " + heronsFormula(a, b, c) + " cm²");

    sc.close();
  }

  public static boolean isTriangle(double a, double b, double c) {
    return a < b + c && b < a + c && c < a + b;
  }

  public static double heronsFormula(double a, double b, double c) {
    double p = (a + b + c) / 2;

    double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

    return Math.round(result * 100) / 100.0;
  }
}

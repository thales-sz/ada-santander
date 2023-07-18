import java.util.Scanner;

public class Aula03Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os lados do triângulo em cm:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    System.out.println("Área do triângulo: " + heronsFormula(a, b, c) + " cm²");

    sc.close();
  }

  public static double heronsFormula(double a, double b, double c) {
    double p = (a + b + c) / 2;

    return Math.sqrt(p * (p -a) * (p - b) * (p - c));
  }
}

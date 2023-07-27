import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    int[] input = { 1, 2, 3, 4, 5 };
    System.out.println(parImpar(input));
    System.out.println(numeroPertenceASequenciaFibonacci(20));
  }

  public static String[] soletrandoStr(String input) {
    return input.split("(?!^)");
  }

  public static String numeroPertenceASequenciaFibonacci(int input) {
    String result = "";
    for (int i = 0; i <= input; i++) {
      if (i == input) {
        result += fibonacciSequence(i);
        break;
      }
      result += fibonacciSequence(i) + ", ";
    }
    return result;
  }

  public static int fibonacciSequence(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
  }

  public static int[] ordenar(int[] input) {
    Arrays.sort(input);
    return input;
  }

  public static double salarioComComissao(double[] input) {
    double cars = input[0];
    double monthTotal = input[1] * 0.05;
    double salary = input[2];
    double comission = cars * input[3];

    return arredondar(monthTotal + salary + comission);
  }

  public static double arredondar(double numero) {
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
    return Double.parseDouble(decimalFormat.format(numero));
  }

  public static String parImpar(int[] input) {
    int par = 0;
    int impar = 0;

    for (int number : input) {
      if (number % 2 == 0)
        par++;
      else
        impar++;
    }
    return par + " pares, " + impar + " ímpares";
  }
}

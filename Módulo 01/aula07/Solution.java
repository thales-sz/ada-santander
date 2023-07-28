import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    int[] input = { 2, 3 };
    System.out.println(parImpar(input));
    System.out.println(numeroPertenceASequenciaFibonacci(8));
    System.out.println(somaAlgarismos(123));
  }

  public static String[] soletrandoStr(String input) {
    return input.split("(?!^)");
  }

  public static String numeroPertenceASequenciaFibonacci(int input) {
    if (input < 0) {
      return "Número inválido. A sequência de Fibonacci não é definida para números negativos.";
    }

    StringBuilder result = new StringBuilder();
    int prev1 = 0;
    int prev2 = 1;
    int fibValue = prev1 + prev2;

    result.append(prev1);
    
    if (input >= 1) {
      result.append(", ").append(prev2);
    }

    
    while (fibValue <= input) {
      result.append(", ").append(fibValue);
      prev1 = prev2;
      prev2 = fibValue;
      fibValue = prev1 + prev2;
    }

    return result.toString();
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

    if (par <= 1 && impar <= 1) {
      return par + " par " + impar + " ímpar ";
    } else if (par <= 1 && impar > 1) {
      return par + " par " + impar + " ímpares ";
    } else if (par > 1 && impar <= 1) {
      return par + " pares " + impar + " ímpar ";
    } else {
      return par + " pares " + impar + " ímpares ";
    }
  }

  public static int somaAlgarismos(int input) {
    String str = String.valueOf(input);
    int soma = 0;
    for (int i = 0; i < str.length(); i++) {
      soma += Integer.valueOf(str.charAt(i));
    }
    return soma;
  }
}

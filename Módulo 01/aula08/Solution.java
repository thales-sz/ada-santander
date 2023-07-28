import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    int input = 123;
    String[] input2 = { "lovour", "ovo", "lov", "paixão", "caixão", "xão" };
    String[] input2result = { "ovo", "lov", "xão" };
    System.out.println(somaAlgarismos(input));
    System.out.println(Arrays.toString(substringStr(input2)));
    System.out.println(Arrays.equals(substringStr(input2), input2result));
  }

  public static int somaAlgarismos(int input) {
    if (input < 0)
      return -1;

    int soma = 0;

    while (input != 0) {
      soma += input % 10;
      input /= 10;
    }

    return soma;
  }

  public static String[] substringStr(String[] input) {
    ArrayList<String> resultList = new ArrayList<>();

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input.length; j++) {
        if (input[i].contains(input[j]) && i != j && !resultList.contains(input[j])) {
          resultList.add(input[j]);
        }
      }
    }

    return resultList.toArray(new String[0]);
  }

  public static String[] soletrandoInvertidoStr(String input) {
    List<String> lista = Arrays.asList(input.split("(?!^)"));
    Collections.reverse(lista);
    return lista.toArray(new String[0]);
  }
}

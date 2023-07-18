public class Aula03Exercicio05 {
  public static void main(String[] args) {
    double[] input = { 10, 2, 1000, 10 };

    System.out.println(elementosRepetidos(input));
  }

  public static boolean elementosRepetidos(double[] input) {
    boolean isRepeated = false;

    for (int i = 0; i < input.length; i++) {
      double currentElement = input[i];

      for (int j = 0; j < input.length; j++) {
        if (i != j && currentElement == input[j]) {
          isRepeated = true;
        }
      }
    }
    return isRepeated;
  }
}
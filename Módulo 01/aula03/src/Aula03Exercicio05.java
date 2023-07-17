public class Aula03Exercicio05 {
  public static void main(String[] args) {
    double[] input = { 10, 2, 1000 };

    System.out.println(elementosRepetidos(input));
  }

  public static boolean elementosRepetidos(double[] input) {
    for (int i = 0; i < input.length; i++) {
      double currentElement = input[i];
      boolean isRepeated = false;

      for (int j = 0; j < input.length; j++) {
        if (i != j && currentElement == input[j]) {
          isRepeated = true;
          break;
        }
      }

      if (isRepeated) {
        return true;
      }
    }
  return false;
  }
}
package aula07.src;

public class AlgoritmoRecursivo {
  public static void main(String[] args) {
    int input = 1000;

    System.out.println(somar(input));
  }

  public static int somar(int value) {
    if (value == 0) {
      return 0;
    }
    return value + somar(value - 1);
  }
}

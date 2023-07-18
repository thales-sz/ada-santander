public class Aula03Exercicio04 {
  public static void main(String[] args) {
    String input = "thatles";

    System.out.println(primeiroCaractereUnico(input));
  }

  public static int primeiroCaractereUnico(String input) {
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      
      long count = input.chars().filter(ch -> ch == currentChar).count();

      if (count == 1) {
        return i;
      }
    }
    return -1;
  } 
}
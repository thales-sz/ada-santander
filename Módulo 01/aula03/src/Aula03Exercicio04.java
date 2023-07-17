public class Aula03Exercicio04 {
  public static void main(String[] args) {
    String input = "thatles";

    System.out.println(primeiroCaractereUnico(input));
  }

  public static int primeiroCaractereUnico(String input) {
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      boolean isUnique = true;

      for (int j = 0; j < input.length(); j++) {
        if (i != j && currentChar == input.charAt(j)) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        return i;
      } 
    }
    return -1;
  } 
}
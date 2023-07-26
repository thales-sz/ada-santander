package aula07.src;

import java.util.Scanner;

import aula07.src.utils.InvalidWeekDayException;

public class Aula07Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o dia da semana: ");
    String userInput = sc.nextLine();

    try {
      Semana.getWeekDay(userInput);
    } catch (InvalidWeekDayException e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }

    sc.close();
  }

}

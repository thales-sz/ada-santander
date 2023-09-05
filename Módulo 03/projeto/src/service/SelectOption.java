package service;

import java.util.Scanner;

public class SelectOption {
  public static int execute() {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a opção desejado: ");
    return input.nextInt();
  }
}

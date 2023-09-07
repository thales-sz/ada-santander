package service;

import java.util.Scanner;

public class SelectOption {
  public int execute() {
    System.out.println("\nSelecione a opção desejada:\n");
    System.out.println("1 - Cadastrar cliente");
    System.out.println("2 - Cadastrar veículo");
    System.out.println("3 - Listar clientes");
    System.out.println("4 - Listar veículos");
    System.out.println("5 - Alterar um veículo");
    System.out.println("6 - Encontrar um veículo");
    System.out.println("7 - Alterar um cliente");
    System.out.println("8 - Alugar um veículo");
    System.out.println("9 - Devolver um veículo");
    System.out.println("0 - Sair");

    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  public boolean tryAgain() {
    System.out.println("Opção inválida. Tente novamente.");
    return true;
  }
}

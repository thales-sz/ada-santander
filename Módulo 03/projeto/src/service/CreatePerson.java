package service;

import java.util.Scanner;
import domain.LegalPerson;
import domain.NaturalPerson;
import domain.Person;

public class CreatePerson {
  public static Person execute() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do cliente:");
    String name = sc.nextLine();
    System.out.println("Digite o tipo de cliente:");
    System.out.println("1 - Pessoa Física");
    System.out.println("2 - Pessoa Jurídica");
    int option = sc.nextInt();

    switch (option) {
      case 1:
        return createNaturalPerson(name);
      case 2:
        return createLegalPerson(name);
      default:
        System.out.println("Opção inválida. Tente novamente.");
        return execute();
    }
  }

  public static LegalPerson createLegalPerson(String name) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o CNPJ da pessoa:");
    String cnpj = sc.nextLine();
    return new LegalPerson(name, cnpj);
  }

  public static Person createNaturalPerson(String name) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o CPF da pessoa:");
    String cpf = sc.nextLine();
    return new NaturalPerson(name, cpf);
  }
}
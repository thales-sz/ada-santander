import java.util.Scanner;

import controller.CustomerController;
import repository.CustomerRepository;
import service.CustomerService;

public class Delivery {
  public static void main(String[] args) {
    final CustomerController customerController = new CustomerController(new CustomerService(new CustomerRepository()));
    Scanner sc = new Scanner(System.in);

    System.out.println("Bem vindo ao sistema de delivery!");
    System.out.println("Digite seu nome:");
    String name = sc.nextLine();
    System.out.println("Digite seu endereço:");
    String address = sc.nextLine();
    customerController.createCustomer(name, address);

    System.out.println("Olá, seu cadastro foi realizado com sucesso!\n");
    System.out.println("Selecione o restaurante que deseja fazer o pedido:");

    sc.close();
  }
}

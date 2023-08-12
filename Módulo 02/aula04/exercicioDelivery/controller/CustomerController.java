package controller;

import java.util.Scanner;

import service.CustomerService;

public class CustomerController {
  private CustomerService customerService;
  private Scanner scanner;
  
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
    this.scanner = new Scanner(System.in);
  }

  public void createCustomer() {
    System.out.println("Digite o nome do cliente:");
    String name = this.scanner.nextLine();
    System.out.println("Digite o endereço do cliente:");
    String address = this.scanner.nextLine();
    this.customerService.createCustomer(name, address);
    System.out.println("Cliente criado com sucesso!");
  }
}

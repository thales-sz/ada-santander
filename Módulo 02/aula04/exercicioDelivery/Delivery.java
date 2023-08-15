import java.util.Scanner;

import controller.CustomerController;
import repository.CustomerRepository;
import service.CustomerService;

public class Delivery {
  public static void main(String[] args) {
    CustomerRepository customerRepository = new CustomerRepository();
    CustomerService customerService = new CustomerService(customerRepository);
    CustomerController customerController = new CustomerController(customerService);
    Scanner sc = new Scanner(System.in);

    System.out.println("Bem vindo ao sistema de delivery!");
    customerController.createCustomer();

    sc.close();
  }
}

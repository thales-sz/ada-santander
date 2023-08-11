package repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import domain.Customer;

public class CustomerRepository {
  public void createCustomer(Customer customer) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("historico.txt", true))) {
      writer.write(customer.toString());
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

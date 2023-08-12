package repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import domain.Customer;

public class CustomerRepository {
  ArrayList<Customer> customers;

  public void createCustomer(Customer customer) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("customers.txt", true))) {
      this.customers.add(customer);
      writer.write(customer.toString());
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

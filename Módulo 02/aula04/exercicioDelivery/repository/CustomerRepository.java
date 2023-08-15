package repository;

import java.util.ArrayList;

import domain.Customer;

public class CustomerRepository {
  ArrayList<Customer> customers;

  public void createCustomer(Customer customer) {
    this.customers.add(customer);
  }

  public Customer getCustomer(int id) {
    for (Customer customer : this.customers) {
      if (customer.getId() == id) {
        return customer;
      }
    }
    return null;
  }

  public ArrayList<Customer> getAllCustomers() {
    return this.customers;
  }
}

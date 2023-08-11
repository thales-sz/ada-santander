package service;

import domain.Customer;
import repository.CustomerRepository;

public class CustomerService {
  private CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }
  
  public void createCustomer(String name, String address) {
    Customer customer = new Customer(name, address);
    this.customerRepository.createCustomer(customer);
  }
}

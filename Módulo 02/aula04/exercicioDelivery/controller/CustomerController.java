package controller;

import service.CustomerService;

public class CustomerController {
  private CustomerService customerService;
  
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void createCustomer(String name, String address) {
    try {
      customerService.createCustomer(name, address);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

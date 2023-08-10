package domain;

import java.util.ArrayList;

public class Customer {
  static int nextId = 1;
  int id;
  public String name;
  public String address;
  private ArrayList<Order> orders;

  Customer(String name, String address) {
    this.name = name;
    this.address = address;
    this.id = nextId;
    nextId++;
  }
}

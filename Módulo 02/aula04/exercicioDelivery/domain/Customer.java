package domain;

import java.util.ArrayList;

public class Customer {
  static int nextId = 1;
  int id;
  protected String name;
  protected String address;
  protected ArrayList<Order> orders;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
    this.id = nextId;
    nextId++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Customer { id: " + id + ", name: " + name + ", address: " + address + " }";
  }
}

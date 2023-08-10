package domain;

import java.util.ArrayList;

public class Order {
  static int nextId = 1;
  int id;
  Customer customer;
  String address;
  ArrayList<Dish> dishes;

  Order(Customer customer, String address, ArrayList<Dish> dishes) {
    this.customer = customer;
    this.address = address;
    this.dishes = dishes;
    this.id = nextId;
    nextId++;
  }
}

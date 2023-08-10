package domain;

import java.util.ArrayList;

public class Restaurant {
  static int nextId = 1;
  int id;
  String name;
  String address;
  ArrayList<Dish> menu;

  Restaurant(String name, String address, ArrayList<Dish> menu) {
    this.name = name;
    this.address = address;
    this.menu = menu;
    this.id = nextId;
    nextId++;
  }
}

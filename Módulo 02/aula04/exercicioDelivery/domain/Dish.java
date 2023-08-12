package domain;

public class Dish {
  static int nextId = 1;
  int id = 0;
  public String name;
  public String description;
  public double price;

  Dish(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.id = nextId;
    nextId++;
  }

  @Override
  public String toString() {
    return "Dish { id: " + id + ", name: " + name + ", description: " + description + ", price: " + price + " }";
  }

}

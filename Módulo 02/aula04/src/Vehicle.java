public class Vehicle {
  protected String model;
  protected String brand;
  protected String color;
  protected int year;
  protected double price;
  protected String plate;

  Vehicle(String model, String brand, String color, int year, double price, String plate) {
    this.model = model;
    this.brand = brand;
    this.color = color;
    this.year = year;
    this.price = price;
    this.plate = plate;
  }

  public void showData() {
    System.out.println("Modelo: " + this.model);
    System.out.println("Marca: " + this.brand);
    System.out.println("Cor: " + this.color);
    System.out.println("Ano: " + this.year);
    System.out.println("Preço: " + this.price);
  }
}

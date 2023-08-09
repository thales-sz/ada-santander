public class Car extends Vehicle {
  private int doorsQuantity;
  private String fuelType;

  public Car(String model, String brand, String color, int year, double price, int doorsQuantity, String fuelType, String plate) {
    super(model, brand, color, year, price, plate);
    this.doorsQuantity = doorsQuantity;
    this.fuelType = fuelType;
  }

  @Override
  public void showData() {
    super.showData();
    System.out.println("Quantidade de portas: " + this.doorsQuantity);
    System.out.println("Tipo de combustível: " + this.fuelType);
  }
}

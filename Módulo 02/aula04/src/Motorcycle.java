public class Motorcycle extends Vehicle {
  int cc;
  Motorcycle(String model, String brand, String color, int year, double price, String plate, int cc) {
    super(model, brand, color, year, price, plate);
    this.cc = cc;
  }

  @Override
  public void showData() {
    super.showData();
    System.out.println("Cilindradas: " + this.cc);
  }
}

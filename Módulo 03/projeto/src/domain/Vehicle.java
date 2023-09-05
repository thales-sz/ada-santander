package domain;

enum VehicleType {
  PEQUENO, MEDIO, SUV
}

public class Vehicle {
  protected int id;
  protected String color;
  protected String plate;
  protected String model;
  protected VehicleType type;
  

  public Vehicle(String color, String model, VehicleType type) {
    this.color = color;
    this.model = model;
    this.type = type;
  }

  @Override
  public String toString() {
    return "Vehicle {\nid: " + id + "\ncor: " + color + "\nmodelo: " + model + "\nplaca: " + plate + "\n}";
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getPlate() {
    return plate;
  }

  public int getId() {
    return id;
  }

  public String getColor() {
    return color;
  }

  public void setId(int id) {
    this.id = id;
  }
}

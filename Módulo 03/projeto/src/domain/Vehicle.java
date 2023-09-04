package domain;

public class Vehicle {
  protected int id;
  protected String color;
  protected String plate;
  

  Vehicle(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Vehicle [color=" + color + ", id=" + id + ", plate=" + plate + "]";
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

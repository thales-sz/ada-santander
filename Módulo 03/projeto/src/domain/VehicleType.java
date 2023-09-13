package domain;

import java.util.ArrayList;
import java.util.List;

public enum VehicleType {

  PEQUENO("PEQUENO", 100),
  MEDIO("MEDIO", 150),
  SUV("SUV", 200);

  private String type;
  private int value;

  private VehicleType(String nome, int value) {
    this.type = nome;
    this.value = value;
  }

  public String getType() {
    return type;
  }

  public int getValue() {
    return value;
  }

  public static List<String> getVehicleTypes() {
    List<String> types = new ArrayList<String>();

    for (VehicleType type : values())
      types.add(type.toString());

    return types;
  }
}

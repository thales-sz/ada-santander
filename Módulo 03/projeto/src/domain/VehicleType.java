package domain;

import java.util.ArrayList;
import java.util.List;

public enum VehicleType {

  PEQUENO("PEQUENO"),
  MEDIO("MEDIO"),
  SUV("SUV");

  private String type;

  private VehicleType(String nome) {
    this.type = nome;
  }

  public String getType() {
    return type;
  }

  public static List<String> getVehicleTypes() {
    List<String> types = new ArrayList<String>();

    for (VehicleType type : values())
      types.add(type.toString());

    return types;
  }
}

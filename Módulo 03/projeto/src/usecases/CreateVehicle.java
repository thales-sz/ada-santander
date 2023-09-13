package usecases;

import java.util.Scanner;

import domain.Vehicle;
import domain.VehicleType;

public class CreateVehicle {
  public static Vehicle execute() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cadastrar veículo");
    System.out.println("Informe o modelo do veículo:");
    String model = sc.nextLine();
    System.out.println("Informe a cor do veículo:");
    String color = sc.nextLine();
    System.out.println("Informe o tipo do veículo:");
    System.out.println(VehicleType.getVehicleTypes());
    String vehicleType = sc.nextLine();

    boolean isTypeValid = false;

    while (!isTypeValid) {
      if (VehicleType.getVehicleTypes().contains(vehicleType.toUpperCase())) {
        isTypeValid = true;
        break;
      } else {
        System.out.println("Tipo de veículo inválido. Tente novamente:");
        vehicleType = sc.nextLine();
      }
    }

    VehicleType type = VehicleType.valueOf(vehicleType.toUpperCase());
    
    return new Vehicle(model, color, type);
  }
}

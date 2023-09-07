package service;

import java.util.Scanner;

import controller.VehicleController;
import domain.Vehicle;
import domain.VehicleType;

public class VehicleRental {
  private final SelectOption selectOption;
  private final VehicleController vehicleController;

  public VehicleRental(SelectOption selectOption, VehicleController vehicleController) {
    this.selectOption = selectOption;
    this.vehicleController = vehicleController;
  }

  public boolean execute() {
    Scanner sc = new Scanner(System.in);
    int opcao = selectOption.execute();

    switch (opcao) {
      case 0:
        sc.close();
        return false;
      case 1:
        System.out.println("Cadastrar cliente");
        sc.close();
        return true;
      case 2:
        System.out.println("Cadastrar veículo");
        System.out.println("Informe o modelo do veículo:");
        String model = sc.nextLine();
        System.out.println("Informe a cor do veículo:");
        String color = sc.nextLine();
        System.out.println("Informe o tipo do veículo:");
        System.out.println(VehicleType.values());
        VehicleType type = VehicleType.valueOf(sc.nextLine());
        Vehicle vehicle = vehicleController.create(model, color, type);
        System.out.println(vehicle.toString());
        sc.close();
        return true;
      default:
        selectOption.tryAgain();
        sc.close();
        return true;
    }
  }
}

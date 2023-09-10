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
    int opcao = selectOption.execute();

    switch (opcao) {
      case 0:
        return false;
      case 1:
        System.out.println("Cadastrar cliente");
        return true;
      case 2:
        this.createVehicle();
        return true;
      case 3:
        return true;
      case 4:
        this.findAllVehicles();
        return true;
      default:
        selectOption.tryAgain();
        return true;
    }
  }

  private void createVehicle() {
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
    Vehicle vehicle = vehicleController.create(model, color, type);
    System.out.println(vehicle.toString());
  }

  private void findAllVehicles() {
    System.out.println("Listar veículos");
    if (vehicleController.findAll().isEmpty()) {
      System.out.println("Nenhum veículo cadastrado.");
      return;
    }
    System.out.println(vehicleController.findAll());
  }
}

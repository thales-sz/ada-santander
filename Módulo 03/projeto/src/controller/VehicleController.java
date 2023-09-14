package controller;

import java.util.List;
import java.util.Scanner;

import domain.Vehicle;
import domain.VehicleType;
import service.VehicleService;

public class VehicleController implements ControllerImp<Vehicle> {
  private final VehicleService vehicleService;

  public VehicleController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @Override
  public Vehicle create() {
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
  
    Vehicle createdVehicle = this.vehicleService.create(new Vehicle(model, color, type));
    System.out.println("Veículo criado: " + createdVehicle.toString());
    return createdVehicle;
  }

  @Override
  public Vehicle update(Vehicle entity) {
    return this.vehicleService.update(entity);
  }

  @Override
  public void delete(int id) {
    this.vehicleService.delete(id);
  }

  @Override
  public Vehicle findOneById(Vehicle entity) {
    return this.vehicleService.findOneById(entity);
  }

  @Override
  public Vehicle findOneBySearchTerm(String searchTerm) {
    return this.vehicleService.findOneBySearchTerm(searchTerm);
  }

  @Override
  public List<Vehicle> findAll() {
    return this.vehicleService.findAll();
  }
}

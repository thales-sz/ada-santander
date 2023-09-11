package controller;

import java.util.List;

import domain.Vehicle;
import domain.VehicleType;
import service.VehicleService;

public class VehicleController implements ControllerImp<Vehicle> {
  private final VehicleService vehicleService;

  public VehicleController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @Override
  public Vehicle create(Vehicle entity) {
    Vehicle createdVehicle = vehicleService.create(entity);
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

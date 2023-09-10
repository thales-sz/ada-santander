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
  public Vehicle create(String model, String color, VehicleType type) {
    return vehicleService.create(model,color, type);
  }

  @Override
  public Vehicle update(Vehicle entity) {
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(int id) {
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Vehicle findOne(Vehicle entity) {
    throw new UnsupportedOperationException("Unimplemented method 'findOne'");
  }

  @Override
  public List<Vehicle> findAll() {
    return this.vehicleService.findAll();
  }
}

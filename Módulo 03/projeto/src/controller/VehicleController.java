package controller;

import java.util.List;

import domain.Vehicle;
import service.VehicleService;

public class VehicleController implements ControllerImp<Vehicle> {
  private final VehicleService vehicleService;

  public VehicleController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @Override
  public Vehicle create(Vehicle entity) {
    return vehicleService.create(entity);
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
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }
}

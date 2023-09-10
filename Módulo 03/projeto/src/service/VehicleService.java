package service;

import java.util.List;

import domain.Vehicle;
import domain.VehicleType;
import repository.VehicleRepository;

public class VehicleService implements ServiceImp<Vehicle> {
  private final VehicleRepository vehicleRepository;

  public VehicleService(VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
  }

  @Override
  public Vehicle create(String model, String color, VehicleType type) {
    Vehicle vehicle = new Vehicle(model, color, type);
    vehicle.setPlate(GeneratePlate.newPlate());
    return this.vehicleRepository.create(vehicle);
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
    return this.vehicleRepository.findAll();
  }
}

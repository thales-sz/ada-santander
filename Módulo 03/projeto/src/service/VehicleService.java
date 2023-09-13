package service;

import java.util.List;

import domain.Vehicle;
import repository.VehicleRepository;
import utils.GeneratePlate;

public class VehicleService implements ServiceImp<Vehicle> {
  private final VehicleRepository vehicleRepository;

  public VehicleService(VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
  }

  @Override
  public Vehicle create(Vehicle entity) {
    entity.setPlate(GeneratePlate.newPlate());
    return this.vehicleRepository.create(entity);
  }

  @Override
  public Vehicle update(Vehicle entity) {
    boolean vehicle = this.vehicleRepository.findOneById(entity);

    if (!vehicle) {
      throw new RuntimeException("Vehicle not found");
    }

    return this.vehicleRepository.update(entity);
  }

  @Override
  public void delete(int id) {
    this.vehicleRepository.delete(id);
  }

  @Override
  public Vehicle findOneById(Vehicle entity) {
    boolean vehicle = this.vehicleRepository.findOneById(entity);

    if (!vehicle) {
      throw new RuntimeException("Vehicle not found");
    }

    return entity;
  }

  @Override
  public Vehicle findOneBySearchTerm(String searchTerm) {
    return this.vehicleRepository.findOneBySearchTerm(searchTerm);
  }

  @Override
  public List<Vehicle> findAll() {
    return this.vehicleRepository.findAll();
  }
}

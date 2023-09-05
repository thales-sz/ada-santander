package service;

import java.util.List;

import domain.Vehicle;
import repository.GeneratePlate;
import repository.VehicleRepository;

public class VehicleService implements ServiceImp<Vehicle> {
  private final VehicleRepository vehiclerRepository;

  public VehicleService(VehicleRepository vehiclerRepository) {
    this.vehiclerRepository = vehiclerRepository;
  }

  @Override
  public Vehicle create(Vehicle entity) {
    entity.setPlate(GeneratePlate.newPlate());
    return this.vehiclerRepository.create(entity);
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

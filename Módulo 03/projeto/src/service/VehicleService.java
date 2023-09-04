package service;

import java.util.List;

import domain.Vehicle;
import repository.GeneratePlate;

public class VehicleService implements ServiceImp<Vehicle> {

  @Override
  public Vehicle create(Vehicle entity) {
    entity.setPlate(GeneratePlate.newPlate());
    return entity;
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

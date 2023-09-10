package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Vehicle;

public class VehicleRepository implements RepositoryImp<Vehicle> {

  static private int id;

  List<Vehicle> vehicles = new ArrayList<Vehicle>();

  @Override
  public Vehicle create(Vehicle entity) {
    entity.setId(id++);
    vehicles.add(entity);
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
    return this.vehicles;
  }
}

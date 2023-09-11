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
    for(Vehicle vehicle : vehicles) {
      if(vehicle.getId() == entity.getId()) {
        vehicles.set(vehicles.indexOf(vehicle), entity);
      }
    }
    return vehicles.get(vehicles.indexOf(entity));
  }

  @Override
  public void delete(int id) {
    for(Vehicle vehicle : vehicles) {
      if(vehicle.getId() == id) {
        vehicles.remove(vehicle);
      }
    }
  }

  @Override
  public boolean findOneById(Vehicle entity) {
    for(Vehicle vehicle : vehicles) {
      if(vehicle.getId() == entity.getId()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Vehicle findOneBySearchTerm(String searchTerm) {
    for(Vehicle vehicle : vehicles) {
      if(vehicle.getModel().equalsIgnoreCase(searchTerm)) {
        return vehicle;
      }
    }
    return null;
  }

  @Override
  public List<Vehicle> findAll() {
    return this.vehicles;
  }
}

package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Rent;

public class RentRepository implements RepositoryImp<Rent> {

  static private int id;

  List<Rent> vehicles = new ArrayList<Rent>();

  @Override
  public Rent create(Rent entity) {
    entity.setId(id++);
    this.vehicles.add(entity);
    return entity;
  }

  @Override
  public void delete(int id) {
    for (Rent rent : vehicles) {
      if (rent.getId() == id) {
        vehicles.remove(id);
      }
    }
  }

  @Override
  public List<Rent> findAll() {
    return this.vehicles;
  }

  @Override
  public boolean findOneById(Rent entity) {
    for (Rent rent : vehicles) {
      if (rent.getId() == entity.getId()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Rent findOneBySearchTerm(String searchTerm) {
    return null;
  }

  @Override
  public Rent update(Rent entity) {
    for (Rent rent : vehicles) {
      if (rent.getId() == entity.getId()) {
        vehicles.set(vehicles.indexOf(rent), entity);
      }
    }
    return vehicles.get(vehicles.indexOf(entity));
  }
  
}

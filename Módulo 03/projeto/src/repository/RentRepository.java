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
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<Rent> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean findOneById(Rent entity) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Rent findOneBySearchTerm(String searchTerm) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Rent update(Rent entity) {
    // TODO Auto-generated method stub
    return null;
  }
  
}

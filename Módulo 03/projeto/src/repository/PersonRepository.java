package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Person;

public class PersonRepository implements RepositoryImp<Person>{

  static private int id;

  private List<Person> people = new ArrayList<Person>();

  @Override
  public Person create(Person entity) {
    entity.setId(id++);
    this.people.add(entity);
    return entity;
  }

  @Override
  public Person update(Person entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public boolean findOneById(Person entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findOneById'");
  }

  @Override
  public Person findOneBySearchTerm(String searchTerm) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findOneBySearchTerm'");
  }

  @Override
  public List<Person> findAll() {
    return this.people;
  }
  
}

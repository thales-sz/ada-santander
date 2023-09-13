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
    for(Person person : people) {
      if(person.getId() == entity.getId()) {
        people.set(people.indexOf(person), entity);
      }
    }
    return people.get(people.indexOf(entity));
  }

  @Override
  public void delete(int id) {
    for(Person person : people) {
      if(person.getId() == id) {
        people.remove(id);
      }
    }
  }

  @Override
  public boolean findOneById(Person entity) {
    for (Person person : people) {
      if (person.getId() == entity.getId()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Person findOneBySearchTerm(String searchTerm) {
    for(Person person : people) {
      if(person.getName().equalsIgnoreCase(searchTerm)) {
        return person;
      }
    }
    return null;
  }

  @Override
  public List<Person> findAll() {
    return this.people;
  }
  
}

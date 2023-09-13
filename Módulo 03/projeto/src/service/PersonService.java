package service;

import java.util.List;

import domain.Person;
import repository.PersonRepository;

public class PersonService implements ServiceImp<Person> {

  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public Person create(Person entity) {
    return this.personRepository.create(entity);
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
  public Person findOneById(Person entity) {
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
    return this.personRepository.findAll();
  }
  
}

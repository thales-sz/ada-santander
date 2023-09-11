package controller;

import java.util.List;

import domain.Person;
import service.PersonService;

public class PersonController implements ControllerImp<Person> {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }
  
  @Override
  public Person create(Person entity) {
    Person createdPerson = this.personService.create(entity);
    System.out.println("Pessoa cadastrada: " + createdPerson.toString());
    return createdPerson;
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }
  
}

package utils;

import domain.Person;
import repository.PersonRepository;

public class IsCPForCNPJUnique {

  protected PersonRepository personRepository;

  public IsCPForCNPJUnique(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public boolean execute(String searchTerm) {
    Person oldPerson = this.personRepository.findOneBySearchTerm(searchTerm);

    return oldPerson != null;
  }
}

package service;

import java.util.List;
import domain.LegalPerson;
import domain.NaturalPerson;
import domain.Person;
import repository.PersonRepository;
import utils.IsCPForCNPJUnique;

public class PersonService implements ServiceImp<Person> {
  private final PersonRepository personRepository;
  private final IsCPForCNPJUnique isCPForCNPJUnique;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
    this.isCPForCNPJUnique = new IsCPForCNPJUnique(personRepository);
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
    return this.personRepository.findOneBySearchTerm(searchTerm);
  }

  @Override
  public List<Person> findAll() {
    return this.personRepository.findAll();
  }

  public LegalPerson createLegalPerson(String name, String cnpj) {
    if (this.isCPForCNPJUnique.execute(cnpj)) {
      throw new RuntimeException("Já existe uma pessoa cadastrada com esse CNPJ. Tente novamente.");
    }
    return new LegalPerson(name, cnpj);
  }

  public Person createNaturalPerson(String name, String cpf) {
    if (this.isCPForCNPJUnique.execute(cpf)) {
      throw new RuntimeException("Já existe uma pessoa cadastrada com esse CNPJ. Tente novamente.");
    }
    return new NaturalPerson(name, cpf);
  }
  
}

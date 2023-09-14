package controller;

import java.util.List;
import java.util.Scanner;

import domain.LegalPerson;
import domain.NaturalPerson;
import domain.Person;
import service.PersonService;

public class PersonController implements ControllerImp<Person> {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }
  
  @Override
  public Person create() {
    Person createdPerson;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do cliente:");
    String name = sc.nextLine();
    System.out.println("Digite o tipo de cliente:");
    System.out.println("1 - Pessoa Física");
    System.out.println("2 - Pessoa Jurídica");
    int option = sc.nextInt();
    sc.nextLine();

    switch (option) {
      case 1:
        System.out.println("Digite o CPF da pessoa:");
        String cpf = sc.nextLine();
        createdPerson = this.personService.createNaturalPerson(name, cpf);
        break;
      case 2:
        System.out.println("Digite o CPF da pessoa:");
        String cnpj = sc.nextLine();
        createdPerson = this.personService.createLegalPerson(name, cnpj);
        break;
      default:
        System.out.println("Opção inválida. Tente novamente.");
        return create();
    }

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
    return this.personService.findAll();
  }
}

package domain;

public class NaturalPerson extends Person {
  String cpf;

  public NaturalPerson(String name, String cpf) {
    super(name);
    this.cpf = cpf;
  }
}

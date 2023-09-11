package domain;

public class LegalPerson extends Person {
  String cnpj;

  public LegalPerson(String name, String cnpj) {
    super(name);
    this.cnpj = cnpj;
  }
}


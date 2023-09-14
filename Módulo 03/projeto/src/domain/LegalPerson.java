package domain;

public class LegalPerson extends Person {
  String cnpj;

  public LegalPerson(String name, String cnpj) {
    super(name);
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "Natural Person {\nid: " + id + "\nnome: " + name + "\ncnpj: " + cnpj + "\n}";
  }

  public String getCnpj() {
    return this.cnpj;
  }
}


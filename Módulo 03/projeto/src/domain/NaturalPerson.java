package domain;

public class NaturalPerson extends Person {
  String cpf;

  public NaturalPerson(String name, String cpf) {
    super(name);
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "Natural Person {\nid: " + id + "\nnome: " + name + "\ncpf: " + cpf + "\n}";
  }
}

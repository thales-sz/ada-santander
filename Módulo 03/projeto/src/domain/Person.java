package domain;

public class Person {
  protected int id;
  protected String name;

  public Person(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person {\nid: " + id + "\nnome: " + name + "\n}";
  }
}

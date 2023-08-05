class Client {
  String name;
  String cpf;
  String email;

  Client(String name, String cpf, String email) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
  }

  public boolean equals(Client client) {
    return this.cpf == client.cpf;
  }

  public String toString() {
    return "Client {" +
      "name='" + this.name + '\'' +
      ", cpf='" + this.cpf + '\'' +
      ", email='" + this.email + '\'' +
      '}';
  }
}

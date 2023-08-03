public class Contact {
  String name, number, email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void callNumber() {
    System.out.println("Calling " + this.number + "...");
  }

  public void getContactDetails() {
    System.out.println("Contact name: " + this.name);
    System.out.println("Contact number: " + this.number);
    System.out.println("Contact email: " + this.email);
  }
}

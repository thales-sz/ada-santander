import java.util.ArrayList;

class Schedule {
  ArrayList<Contact> contactsList = new ArrayList<>();

  public void deleteContact(String name) {
    for (Contact contact : contactsList) {
      if (contact.getName().equals(name)) {
        contactsList.remove(contact);
        break;
      }
    }
  }

  public void addContact(Contact contact) {
    contactsList.add(contact);
  }

  public void findContact(String name) {
    for (Contact contact : contactsList) {
      if (contact.getName().equals(name)) {
        contact.getContactDetails();
      }
    }
  }

  public void getContactList() {
    int aux = 1;
    if (contactsList.size() == 0) {
      System.out.println("Nenhum contato cadastrado!");
      return;
    }
    for (Contact contact : contactsList) {
      System.out.println("Contato " + aux + " ================================");
      contact.getContactDetails();
      aux++;
    }
  }  
}


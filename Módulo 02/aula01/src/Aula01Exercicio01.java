import java.util.Scanner;

public class Aula01Exercicio01 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.println("Bem-vindo ao seu gerenciador de contatos!");
    printSeparator();
    System.out.println("Digite 1 para adicionar um contato");
    System.out.println("Digite 2 para remover um contato");
    System.out.println("Digite 3 para buscar um contato");
    System.out.println("Digite 4 para listar todos os contatos");
    System.out.println("Digite 5 para ligar para um contato");
    System.out.println("Digite 6 para sair do programa");
    

    Schedule schedule = new Schedule();

    boolean isRunning = true;

    String name = "";

    while (isRunning) {
      System.out.print("Digite o número da opção desejada: ");
      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case 1:
          Contact newContact = createNewContact();
          schedule.addContact(newContact);
          printSeparator();
          break;
        case 2:
          name = getContactName();
          schedule.deleteContact(name);
          printSeparator();
          break;
        case 3:
          name = getContactName();
          schedule.findContact(name);
          printSeparator();
          break;
        case 4:
          schedule.getContactList();
          printSeparator();
          break;
        case 5:
          name = getContactName();
          schedule.findContact(name);
          System.out.println("Ligando para " + name + "...");
          printSeparator();
          break;
        case 6:
          System.out.println("Saindo do programa...");
          isRunning = false;
          sc.close();
          printSeparator();
          break;
        default:
          System.out.println("Opção inválida!");
          printSeparator();
          break;
      }
    }
  }

  public static Contact createNewContact() {
    System.out.print("Digite o nome do contato: ");
    String name = sc.nextLine();

    System.out.print("Digite o número do contato: ");
    String number = sc.nextLine();

    System.out.print("Digite o email do contato: ");
    String email = sc.nextLine();

    Contact contact = new Contact(name);
    
    contact.setNumber(number);
    contact.setEmail(email);

    return contact;
  }

  public static String getContactName() {
    
    System.out.print("Digite o nome do contato: ");
    String name = sc.nextLine();

    return name;
  }

  public static void printSeparator() {
    System.out.println("========================================");
  }
}

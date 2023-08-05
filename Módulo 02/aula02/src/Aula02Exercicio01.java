import java.util.Scanner;

public class Aula02Exercicio01 {
  public static void main(String[] args) {
    System.out.println("Bem vinda ao Banco!");
    System.out.println("=========================");
    System.out.println("Digite 1 para criar uma conta");
    System.out.println("Digite 2 para fazer um depósito");
    System.out.println("Digite 3 para fazer um saque");
    System.out.println("Digite 4 para consultar uma conta");
    System.out.println("Digite 5 para sair do programa");
    System.out.println("=========================");

    Bank bank = new Bank();

    boolean isRunning = true;

    Scanner sc = new Scanner(System.in);

    while (isRunning) {
      System.out.println("Digite o número da opção desejada: ");
      int option = sc.nextInt();
      sc.nextLine();

      switch(option) {
        case 1:
          System.out.println("Digite o nome do cliente: ");
          String name = sc.nextLine();
          System.out.println("Digite o CPF do cliente: ");
          String cpf = sc.nextLine();
          System.out.println("Digite o email do cliente: ");
          String email = sc.nextLine();
          Client client = new Client(name, cpf, email);
          System.out.println("Digite o número da conta: ");
          int accountNumber = sc.nextInt();
          sc.nextLine();
          bank.createNewAccount(client, accountNumber);
          System.out.println("Conta criada com sucesso!");
          break;
        case 2:
          System.out.println("Digite o número da conta: ");
          accountNumber = sc.nextInt();
          sc.nextLine();
          System.out.println("Digite o valor do depósito: ");
          double value = sc.nextDouble();
          sc.nextLine();
          bank.deposit(accountNumber, value);
          System.out.println("Depósito realizado com sucesso!");
          break;
        case 3:
          System.out.println("Digite o número da conta: ");
          accountNumber = sc.nextInt();
          sc.nextLine();
          System.out.println("Digite o valor do saque: ");
          value = sc.nextDouble();
          sc.nextLine();
          try {
            bank.withdraw(accountNumber, value);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 4:
          System.out.println("Digite o número da conta: ");
          accountNumber = sc.nextInt();
          sc.nextLine();
          bank.findAccount(accountNumber);
          break;
        case 5:
          System.out.println("Saindo do programa...");
          isRunning = false;
          sc.close();
          break;
        default:
          System.out.println("Opção inválida!");
          break;
        }
    }
  }
}

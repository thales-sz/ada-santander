public class Main {

  private static void MainMenu() {
    System.out.println("\nSelecione a opção desejada:\n");
    System.out.println("1 - Cadastrar cliente");
    System.out.println("2 - Cadastrar veículo");
    System.out.println("3 - Listar clientes");
    System.out.println("4 - Listar veículos");
    System.out.println("5 - Alterar um veículo");
    System.out.println("6 - Encontrar um veículo");
    System.out.println("7 - Alterar um cliente");
    System.out.println("8 - Alugar um veículo");
    System.out.println("9 - Devolver um veículo");
    System.out.println("0 - Sair");
  }
  public static void main(String[] args) {
    lineBreak();
    System.out.println("Bem-vindo à ADA LocateCar - Locadora de veículos");
    lineBreak();
    MainMenu();
  }

  private static void lineBreak() {
    System.out.println("----------------------------------------------------");
  }
}

import java.util.Scanner;

import controller.VehicleController;
import repository.VehicleRepository;
import service.SelectOption;
import service.VehicleService;
import domain.Vehicle;

public class Main {
  public static void main(String[] args) {
    final VehicleRepository vehicleRepository = new VehicleRepository();
    final VehicleService vehicleService = new VehicleService(vehicleRepository);
    final VehicleController vehicleController = new VehicleController(vehicleService);

    lineBreak();
    System.out.println("Bem-vindo à ADA LocateCar - Locadora de veículos");
    lineBreak();
    MainMenu();
    lineBreak();
    int option = SelectOption.execute();
    lineBreak();

    switch (option) {
      case 1:
        System.out.println("Cadastrar cliente");
        break;
      case 2:
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastrar veículo");
        lineBreak();
        System.out.println("Digite o modelo do veículo:");
        String model = input.nextLine();
        lineBreak();
        System.out.println("Digite a cor do veículo:");
        String color = input.nextLine();

        Vehicle inputVehicle = new Vehicle(color, model);

        Vehicle car = vehicleController.create(inputVehicle);

        lineBreak();

        System.out.println(car.toString()); 

        input.close();
        break;
    }
  }

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

  private static void lineBreak() {
    System.out.println("----------------------------------------------------");
  }

}

import controller.VehicleController;
import repository.VehicleRepository;
import service.SelectOption;
import service.VehicleRental;
import service.VehicleService;

public class Main {
  public static void main(String[] args) {
    final VehicleRepository vehicleRepository = new VehicleRepository();
    final VehicleService vehicleService = new VehicleService(vehicleRepository);
    final VehicleController vehicleController = new VehicleController(vehicleService);
    final SelectOption selectOption = new SelectOption();
    final VehicleRental vehicleRental = new VehicleRental(selectOption, vehicleController);

    System.out.println("Bem-vindo à ADA LocateCar - Locadora de veículos");

    boolean isRunning = true;

    while (isRunning) {
      isRunning = vehicleRental.execute();
    }

    System.out.println("Obrigado por utilizar a ADA LocateCar - Locadora de veículos");
  }

  public static void lineBreak() {
    System.out.println("----------------------------------------------------");
  }

}

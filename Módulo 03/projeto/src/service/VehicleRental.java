package service;

import java.util.Scanner;

import controller.PersonController;
import controller.VehicleController;
import domain.Person;
import domain.Vehicle;
import domain.VehicleType;

public class VehicleRental {
  private final SelectOption selectOption;
  private final VehicleController vehicleController;
  private final PersonController personController;

  public VehicleRental(SelectOption selectOption, VehicleController vehicleController, PersonController personController) {
    this.selectOption = selectOption;
    this.vehicleController = vehicleController;
    this.personController = personController;
  }

  public boolean execute() {
    int opcao = selectOption.execute();

    switch (opcao) {
      case 0:
        return false;
      case 1:
        Person person = CreatePerson.execute();
        this.personController.create(person);
        return true;
      case 2: // criar veiculo
        Vehicle vehicle = CreateVehicle.execute();
        return true;
      case 3: // listar clientes
        return true;
      case 4: // listar veiculos
        this.findAllVehicles();
        return true;
      case 5: // alterar veiculo
        return true;
      case 6: // encontrar veiculo
        return true;
      case 7:
        return true;
      case 8:
        return true;
      case 9:
        return true;
      default:
        selectOption.tryAgain();
        return true;
    }
  }

  private void findAllVehicles() {
    System.out.println("Listar veículos");
    if (vehicleController.findAll().isEmpty()) {
      System.out.println("Nenhum veículo cadastrado.");
      return;
    }
    System.out.println(vehicleController.findAll());
  }
}

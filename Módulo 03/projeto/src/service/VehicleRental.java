package service;

import controller.PersonController;
import controller.VehicleController;
import domain.Person;
import domain.Vehicle;
import usecases.CreatePerson;
import usecases.CreateVehicle;
import utils.SelectOption;

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
        this.vehicleController.create(vehicle);
        return true;
      case 3: // listar clientes
        this.findAllPeople();
        return true;
      case 4: // listar veiculos
        this.findAllVehicles();
        return true;
      case 5: // alterar veiculo
        return true;
      case 6: // encontrar veiculo
        return true;
      case 7: // altera um cliente
        return true;
      case 8: // alugar um veiculo
        return true;
      case 9: // devolver um veiculo
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

  private void findAllPeople() {
    System.out.println("Listar pessoas");
    if (personController.findAll().isEmpty()) {
      System.out.println("Nenhuma pessoas cadastrada.");
      return;
    }
    System.out.println(personController.findAll());
  }
}

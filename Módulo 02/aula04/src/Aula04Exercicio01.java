public class Aula04Exercicio01 {
  public static void main(String[] args) {
    Vehicle car = new Car("Onix", "Chevrolet", "Prata", 2020, 50000.00, 4, "Gasolina e Etanol", "KYX12I0");
    Vehicle motorcycle = new Motorcycle("CG 300", "Honda", "Vermelho", 2020, 10000.00, "KXZ1234", 300);

    car.showData();
    motorcycle.showData();
  }
}

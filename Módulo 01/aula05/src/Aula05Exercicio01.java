import java.util.Scanner;

import utils.CannotBuyNegativeException;
import utils.CannotBuyZeroException;

public class Aula05Exercicio01 {
  public static void main(String[] args) {
    double finalPrice = 0.00;
    Scanner sc = new Scanner(System.in);
    String[] fruits = { "peras", "maçãs", "laranjas", "caquis", "tomates" };

    System.out.println("Bem-vindo ao Mercado do Seu Zé!");

    try {
      for (String fruit : fruits) {
        System.out.printf("Quantas %s você quer? ", fruit);
        int quantity = sc.nextInt();
        if (quantity == 0) {
          sc.close();
          throw new CannotBuyZeroException("Você não pode comprar 0 unidades de um produto!");
        }
        if (quantity < 0) {
          sc.close();
          throw new CannotBuyNegativeException("Você não pode comprar uma quantidade negativa!");
        }
        finalPrice += calculatePrice(quantity);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }

    sc.close();

    System.out.printf("O preço final é: R$ %.2f", finalPrice);
  }

  public static double calculatePrice(int quantity) {
    double price = 0.00;

    if (quantity > 10) {
      price += quantity * 1.25;
    } else {
      price += quantity * 1.45;
    }

    return price;
  }

}

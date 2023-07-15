import java.util.Scanner;

public class Aula02Exercicio01 {
    public static void main(String[] args) {
        double finalPrice = 0.00;
        Scanner sc = new Scanner(System.in);
        String[] fruits = { "peras", "maçãs", "laranjas", "caquis", "tomates" };

        System.out.println("Bem-vindo ao Mercado do Seu Zé!");
        
        for (String fruit : fruits) {
            System.out.printf("Quantas %s você quer? ", fruit);
            int quantity = sc.nextInt();
            finalPrice += calculatePrice(quantity);
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
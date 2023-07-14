import java.util.HashMap;
import java.util.Scanner;

public class Aula02Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = { "Peras", "Maçãs", "Laranjas", "Caquis", "Tomates" };
        HashMap<String, Integer> shoppingCart = new HashMap<>();

        for (String fruit : fruits) {
            System.out.printf("Quantas %s você quer? ", fruit);
            int quantity = sc.nextInt();
            shoppingCart.put(fruit, quantity);
        }

        sc.close();
    }

    public static double calculateDiscount() {

        return 0.00;
    }
}
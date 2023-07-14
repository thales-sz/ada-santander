import java.util.HashMap;
import java.util.Scanner;

public class Aula02Exercicio {
    public static void main(String[] args) {
        String[] fruits = { "peras", "maçãs", "laranjas", "caquis", "tomates" };
        HashMap<String, Integer> shoppingCart = new HashMap<>();

        populateShoppingCart(fruits, shoppingCart);

        double finalPrice = calculateFinalPrice(shoppingCart);

        System.out.printf("O preço final é: R$ %.2f", finalPrice);
    }

    public static double calculateFinalPrice(HashMap<String, Integer> shoppingCart) {
        double price = 0.00;

        for (int quantity : shoppingCart.values()) {
            if (quantity > 10) {
                price += quantity * 1.25;
            } else {
                price += quantity * 1.45;
            }
        }

        return price;
    }

    public static HashMap<String, Integer> populateShoppingCart(String[] fruits, HashMap<String, Integer> shoppingCart) {
        Scanner sc = new Scanner(System.in);

        for (String fruit : fruits) {
            System.out.printf("Quantas %s você quer? ", fruit);
            int quantity = sc.nextInt();
            shoppingCart.put(fruit, quantity);
        }

        sc.close();
        return shoppingCart;
    }
}
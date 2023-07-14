import java.util.Scanner;

public class Aula01Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        int temp = sc.nextInt();
        
        System.out.printf("A temperatura em Celsius é: %.2f", convertToCelsius(temp));

        sc.close();
    }

    public static double convertToCelsius(int temp) {
        return 5 * ((temp - 32) / 9);
    }
}
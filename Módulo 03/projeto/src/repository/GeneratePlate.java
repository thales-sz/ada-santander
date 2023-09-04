package repository;

import java.util.Random;

public class GeneratePlate {

    private static final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final Random random = new Random();

    public static String newPlate() {
        StringBuilder placa = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(letters.length);
            placa.append(letters[index]);
        }

        for (int i = 0; i < 4; i++) {
            int digito = random.nextInt(10);
            placa.append(digito);
        }

        return placa.toString();
    }

    public static String execute(String[] args) {
        return GeneratePlate.newPlate();
    }
}

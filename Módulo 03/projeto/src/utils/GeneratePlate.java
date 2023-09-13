package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePlate {

    private static final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final Random random = new Random();
    private static final List<String> plates = new ArrayList<>();

    public static String newPlate() {
        StringBuilder plate = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(letters.length);
            plate.append(letters[index]);
        }

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            plate.append(digit);
        }
        
        if(plates.contains(plate.toString())) {
            return newPlate();
        }

        plates.add(plate.toString());
        return plate.toString();
    }

    public static String execute(String[] args) {
        return GeneratePlate.newPlate();
    }
}

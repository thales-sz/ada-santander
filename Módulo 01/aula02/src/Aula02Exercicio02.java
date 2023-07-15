import java.util.Arrays;

public class Aula02Exercicio02 {
  public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        int[] oddNumbers = getOddNumbers(numbers);
        int[] evenNumbers = getEvenNumbers(numbers);

        System.out.println("Array original: " + Arrays.toString(numbers));
        System.out.println("Array ordem crescente: " + Arrays.toString(ascendingOrder));
        System.out.println("Array ordem decrescente: " +Arrays.toString(descendingOrder));
        System.out.println("Array impares: " + Arrays.toString(oddNumbers));
        System.out.println("Array pares: " + Arrays.toString(evenNumbers));
    }

    public static void swapNumber(int[] sortedArray, int j, int i) {
        int temp = sortedArray[j];
        sortedArray[j] = sortedArray[j + 1];
        sortedArray[j + 1] = temp;
    }


    public static int[] sortAscendingOrder(int[] array) {
        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    swapNumber(sortedArray, j, i);
                }
            }
        }

        return sortedArray;
    }

    public static int[] sortDescendingOrder(int[] array) {
        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    swapNumber(sortedArray, j, i);
                }
            }
        }

        return sortedArray;
    }

    public static int[] getOddNumbers(int[] array) {
        int[] oddNumbers = array.clone();

        for (int i = 0; i < oddNumbers.length; i++) {
            if (oddNumbers[i] % 2 == 0) {
                oddNumbers[i] = 0;
            }
        }

        return sortAscendingOrder(oddNumbers);
    }

    public static int[] getEvenNumbers(int[] array) {
        int[] evenNumbers = array.clone();

        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 != 0) {
                evenNumbers[i] = 0;
            }
        }

        return sortAscendingOrder(evenNumbers);
    }
}

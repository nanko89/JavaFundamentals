import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        int counter = 1;
        int maxCounter = 0;
        int digit = 0;

        for (int index = 1; index <numbers.length ; index++) {
            if (numbers[index] == numbers[index - 1]) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    digit = numbers[index];
                }
            } else {
                counter = 1;
            }
        }
            for (int i = 0; i < maxCounter ; i++) {
                System.out.print(digit + " ");
            }
        }

    }


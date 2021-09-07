import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        int countRotation = Integer.parseInt(scanner.nextLine());


        for (int rotation = 1; rotation <=countRotation; rotation++) {
            int firstNumber = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index]= numbers[index + 1];

            }
            numbers[numbers.length -1] = firstNumber;
        }
        for (int number:numbers){
            System.out.print(number + " ");
        }
    }
}

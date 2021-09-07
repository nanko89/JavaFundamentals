
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[countNumber];
        for (int i = countNumber-1; i >= 0; i--) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < countNumber; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

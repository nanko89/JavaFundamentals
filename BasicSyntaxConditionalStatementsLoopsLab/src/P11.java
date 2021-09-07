import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            int result = multiplier * number;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
            multiplier++;
        } while (multiplier <= 10);

    }
}

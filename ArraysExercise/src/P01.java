import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());
        String[] result = new String[countWagons];

        int totalPassengers = 0;
        for (int i = 0; i < countWagons; i++) {
            String countPassengers = scanner.nextLine();
            result[i] = countPassengers;
            totalPassengers += Integer.parseInt(countPassengers);
        }
        System.out.println(String.join(" ", result));
        System.out.println(totalPassengers);
    }
}

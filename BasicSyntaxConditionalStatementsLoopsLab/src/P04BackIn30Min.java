import java.util.Scanner;

public class P04BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;
        if (totalMinutes/60 < 23) {
            System.out.printf("%d:%02d", totalMinutes / 60, totalMinutes % 60);
        }else {
            System.out.printf("0:%02d", totalMinutes % 60);
        }

    }
}

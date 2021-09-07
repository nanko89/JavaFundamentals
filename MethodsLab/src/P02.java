import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        printWord(grade);

    }

    private static void printWord(double grate) {
        if (grate >= 2.00 && grate <= 2.99) {
            System.out.println("Fail");
        } else if (grate >= 3.00 && grate <= 3.49) {
            System.out.println("Poor");
        } else if (grate >= 3.50 && grate <= 4.49) {
            System.out.println("Good");
        } else if (grate >= 4.50 && grate <= 5.49) {
            System.out.println("Very good");
        } else if (grate >= 5.50 && grate <= 6.00) {
            System.out.println("Excellent");
        }
    }
}

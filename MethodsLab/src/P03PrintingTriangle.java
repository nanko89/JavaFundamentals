import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        upperPard(number);
        downPard(number);

    }

    private static void upperPard(int number) {
        for (int i = 1; i < number ; i++) {
            repeatPart(i);

        }
    }

    private static void downPard(int number) {
        for (int i = number; i > 0 ; i--) {
            repeatPart(i);

        }
    }


    private static void repeatPart(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

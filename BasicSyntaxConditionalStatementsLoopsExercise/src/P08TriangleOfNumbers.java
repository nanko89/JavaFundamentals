import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <=number ; row++) {
            for (int column= 1; column <=row ; column++) {
                System.out.print(row + " ");
            }

            System.out.println();

        }

    }
}

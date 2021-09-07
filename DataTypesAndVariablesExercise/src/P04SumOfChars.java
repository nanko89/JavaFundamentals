import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int totalSum =0;
        for (int i = 1; i <=number ; i++) {
            char currentCharacter = scanner.nextLine().charAt(0);
            totalSum += currentCharacter;
        }
        System.out.printf("The sum equals: %d", totalSum);
    }
}

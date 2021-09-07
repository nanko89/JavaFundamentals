import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = 2 * i + 1;
            System.out.println(current);
            sum += current;
        }
        System.out.printf("Sum: %d%n", sum);



    }
}

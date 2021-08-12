import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = factorial(firstNum);
        long secondFactorial = factorial(secondNum);

        double result = firstFactorial*1.0/secondFactorial;

        System.out.printf("%.2f", result);

    }

    private static long factorial(int firstNum) {
        long sum = 1;

        for (int i = 1; i <=firstNum ; i++) {
            sum *= i;
        }
        return sum;
    }
}

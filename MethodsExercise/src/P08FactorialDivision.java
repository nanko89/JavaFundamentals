import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = firstFactorial(firstNum);
        long secondFactorial = secondFactorial(secondNum);

        double result = resultFactorial(firstFactorial, secondFactorial);
        System.out.printf("%.2f", result);
    }

    private static long firstFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static long secondFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static double resultFactorial(long firstFactorial, long secondFactorial) {
        return firstFactorial*1.0 / secondFactorial;
    }
}

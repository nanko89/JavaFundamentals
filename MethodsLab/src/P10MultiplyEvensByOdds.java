import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        int multiply = multiplyEvenAndOdds(number);
        System.out.println(multiply);


    }

    private static int multiplyEvenAndOdds(int number) {
        int evenSum = evenSum(number);
        int oddSum = oddSum(number);
        return evenSum * oddSum;
    }

    private static int oddSum(int number) {
        int odd = 0;
        while (number > 0) {
            int currentNum = number % 10;
            if (currentNum % 2 == 1) {
                odd += currentNum;
            }
            number/= 10;
        }
        return odd;
    }


    private static int evenSum(int number) {
        int evenSum = 0;
        while (number > 0) {
            int currentNum = number % 10;
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
            number /= 10;
        }
        return evenSum;
    }
}


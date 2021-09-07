import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));
        int multipleOfEvenAndOdd = multipleOfEvenAndOdd(input);

        System.out.println(multipleOfEvenAndOdd);
    }

    private static int multipleOfEvenAndOdd(int number) {
        int eventNum = evenNumber(number);
        int oddSum = oddNumbers(number);
        return eventNum * oddSum;
    }

    private static int oddNumbers(int number) {
        int  oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1){
                oddSum += digit;
            }
            number /= 10;
        }
        return oddSum;
    }

    private static int evenNumber(int number) {
       int  evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0){
               evenSum += digit;
            }
            number /= 10;
        }
        return evenSum;
    }
}

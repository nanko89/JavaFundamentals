import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean isOneOddDigit = false;
        boolean isDivide = false;

        for (int i = 10; i <=number ; i++) {
            int currentNum = i;
            while (currentNum != 0) {
                int newCurrentNum = currentNum % 10;
                sum += newCurrentNum;
                if (newCurrentNum % 2 == 1) {
                    isOneOddDigit = true;
                         if (sum / 8 == 0) {
                             isDivide = true;
                         }
                }
                if (isDivide && isOneOddDigit) {
                    isDivide = false;
                    isOneOddDigit = false;
                    System.out.println(i);
                }
                currentNum /= 10;
            }
        }

        if (isDivide && isOneOddDigit){
            System.out.println();
        }
    }

}


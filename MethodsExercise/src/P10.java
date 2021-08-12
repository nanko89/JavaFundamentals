import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 8; i <=number ; i++) {
         boolean isDivisible = isDivisible(i);
         boolean isHaveOddNum = isHaveOddNum(i);
         if (isDivisible && isHaveOddNum){
             System.out.println(i);
         }
        }
    }

    private static boolean isHaveOddNum(int number) {
        int currentNum = number;
        while (currentNum > 0){
            int currentDigit = currentNum % 10;
            if (currentDigit % 2 == 1){
            return true;
            }
            currentNum /= 10;
        }
        return false;
    }

    private static boolean isDivisible(int number) {
        int sum = 0;
        int currentNum = number;
        while (currentNum > 0){
            int currentDigit = currentNum % 10;
            sum += currentDigit;
            currentNum /= 10;
        }
        return sum % 8 == 0;
    }
}

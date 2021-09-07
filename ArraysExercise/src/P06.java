import java.util.Arrays;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1){
            System.out.println("0");
            return;
        }
        boolean isEquals = false;
        int currentIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
        int leftSum = 0;
        int rightSum = 0;

            for (int leftResult = 0; leftResult < i; leftResult++) {
                if (i == 0){
                    leftSum = 0;
                }else {
                    leftSum += numbers[leftResult];
                }
            }

            for (int rightResult = i + 1; rightResult <numbers.length  ; rightResult++) {
                if (i == numbers.length - 1){
                    rightSum = 0;
                }else {
                    rightSum += numbers[rightResult];
                }
            }
            if (rightSum == leftSum){
                currentIndex = i;
                isEquals = true;
                break;
            }
        }
        if (isEquals){
             System.out.println(currentIndex);
        }else {
              System.out.println("no");
}
    }
}

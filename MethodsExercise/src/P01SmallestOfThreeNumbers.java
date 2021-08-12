import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirthNum = Integer.parseInt(scanner.nextLine());

        int number = smallestNumber(firstNum,secondNum,thirthNum);
        System.out.println(number);

    }

    private static int smallestNumber(int firstNum, int secondNum, int thirthNum) {
        int minimum =Integer.MAX_VALUE;;

        if (firstNum < minimum){
            minimum = firstNum;
        }
        if (secondNum < minimum){
            minimum = secondNum;
        }
        if (thirthNum < minimum){
            minimum = thirthNum;
        }
       return minimum;


    }
}

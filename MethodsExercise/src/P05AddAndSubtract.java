import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum =Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sumResult = sumResult(firstNum,secondNum);
        int subtractResult = subtractResult(sumResult,thirdNum);
        System.out.println(subtractResult);

    }

    private static int subtractResult(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static int sumResult(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}


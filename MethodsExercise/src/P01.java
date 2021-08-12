import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int minValue = minNumber(firstNum,secondNum,thirdNum);
        System.out.println(minValue);

    }

    private static int minNumber(int firstNum, int secondNum, int thirdNum) {

        return Math.min(thirdNum,Math.min(firstNum,secondNum));
    }
}

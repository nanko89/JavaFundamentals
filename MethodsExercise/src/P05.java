import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sumNumber(firstNum,secondNum);
        int subtract = subtractNumber(sum,thirdNum);
        System.out.println(subtract);

    }

    private static int subtractNumber(int sum, int thirdNum) {
        return sum - thirdNum;
    }

    private static int sumNumber(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}

import java.util.Scanner;

public class P04Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        switch (operation) {
            case "add":
                addOperation(firstNum, secondNum);
                break;
            case "multiply":
                multipyOperation(firstNum, secondNum);
                break;
            case "subtract":
                subtractOperation(firstNum, secondNum);
                break;
            default:
                divideOperation(firstNum, secondNum);
                break;
        }
    }

    private static void divideOperation(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }

    private static void subtractOperation(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    private static void multipyOperation(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    private static void addOperation(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}

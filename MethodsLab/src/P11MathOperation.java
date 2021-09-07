import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum =  Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = mathOperation(firstNum,operator,secondNum);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double mathOperation(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator) {

            case "/":
                 result = divideOperation(firstNum,secondNum);
                break;
            case "*":
                 result = multiplyOperation(firstNum,secondNum);
                break;
            case"+":
                result = addOperation(firstNum,secondNum);
                break;
            case "-":
                result = minusOperation(firstNum,secondNum);
                break;
        }

        return result;
    }

    private static double minusOperation(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static double addOperation(int firstNum, int secondNum) {
        return firstNum+secondNum;
    }

    private static double multiplyOperation(int firstNum, int secondNum) {
        return firstNum*secondNum;
    }

    private static double divideOperation(int firstNum, int secondNum) {
        return firstNum*1.0/secondNum;
    }
}

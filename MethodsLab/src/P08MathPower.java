import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        double result = resultMathPower(number,pow);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double resultMathPower(double number, int pow) {
        return Math.pow(number, pow);
    }
}


import java.text.DecimalFormat;
import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int mathPower = Integer.parseInt(scanner.nextLine());

        double result = mathPowerResult(number, mathPower);

        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double mathPowerResult(double number, int mathPower) {
        double result = Math.pow(number, mathPower);
        return result;
    }
}

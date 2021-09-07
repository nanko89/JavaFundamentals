import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        BigDecimal totalSum = new BigDecimal(0);
        for (int i = 0; i < n ; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());

            totalSum = totalSum.add(number);
        }
        System.out.println(totalSum);
    }
}

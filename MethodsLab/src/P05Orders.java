import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int countProduct = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                coffeeResult(countProduct);
                break;
            case "water":
                warterResult(countProduct);
                break;
            case "coke":
                cokeResult(countProduct);
                break;
            case "snacks":
                snacksResult(countProduct);
                break;
        }

    }

    private static void snacksResult(int countProduct) {

        double result = countProduct * 2.00;
        System.out.printf("%.2f", result);
    }

    private static void cokeResult(int countProduct) {
        double result = countProduct * 1.40;
        System.out.printf("%.2f", result);
    }

    private static void warterResult(int countProduct) {
        double result = countProduct * 1.00;
        System.out.printf("%.2f", result);

    }

    private static void coffeeResult(int countProduct) {
        double result = countProduct * 1.50;
        System.out.printf("%.2f", result);
    }
}

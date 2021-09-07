import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName= scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        switch (productName){
            case "coffee":
                coffee(count);
                break;
            case "water":
                water(count);
                break;
            case "coke":
                coke(count);
                break;
            case "snacks":
                snacks(count);
                break;
        }


    }

    private static void coffee(int count) {
        double result = count * 1.50;
        System.out.printf("%.2f", result);
    }

    private static void water(int count) {
        double result = count * 1.00;
        System.out.printf("%.2f", result);
    }

    private static void coke(int count) {
        double result = count * 1.40;
        System.out.printf("%.2f", result);
    }

    private static void snacks(int count) {
        double result = count * 2.00;
        System.out.printf("%.2f", result);
    }
}

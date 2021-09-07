import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalSum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();

        }
        String common = scanner.nextLine();
        double currentSum = 0;
        while (!common.equals("End")){
            String products = common;
            switch (products) {
                case "Nuts":
                    currentSum = 2.0;
                    break;
                case "Water":
                    currentSum = 0.70;
                    break;
                case "Crisps":
                    currentSum = 1.5;
                    break;
                case "Soda":
                    currentSum = 0.8;
                    break;
                case "Coke":
                    currentSum = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (totalSum >= currentSum){
                if (products.equals("Nuts") || products.equals("Water")|| products.equals("Crisps")|| products.equals("Soda")|| products.equals("Coke")) {
                    totalSum -= currentSum;
                    System.out.printf("Purchased %s%n", products);
                }
            }else {
                System.out.println("Sorry, not enough money");
            }
            common = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", totalSum);
    }

}


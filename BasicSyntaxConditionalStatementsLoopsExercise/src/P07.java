import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum= 0;

        while (!input.equals("Start")){
            double currentCoins = Double.parseDouble(input);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 ||
                    currentCoins == 1.0 || currentCoins == 2.0){
                totalSum += currentCoins;
            }else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            input = scanner.nextLine();

        }
        double currentPrice = 0;
        String common = scanner.nextLine();

        while (!common.equals("End")){
            String product = common;
            if (product.equals("Nuts")){
                currentPrice = 2.0;
            }else if (product.equals("Water")){
                currentPrice = 0.7;
            }else if (product.equals("Crisps")){
                currentPrice = 1.5;
            }else if (product.equals("Soda")){
                currentPrice = 0.8;
            }else if (product.equals("Coke")){
                currentPrice = 1.0;
            }else {
                System.out.println("Invalid product");
            }
            if (currentPrice > totalSum){
                System.out.println("Sorry, not enough money");
            }else {
                System.out.printf("Purchased %s%n", product);
                totalSum -= currentPrice;
            }
            common = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", totalSum);
    }
}

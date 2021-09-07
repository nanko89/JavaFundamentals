package MidExam01;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumWithoutTax = 0;

        while (!(input.equals("special")|| input.equals("regular"))){
            double currentPrice = Double.parseDouble(input);
            if (currentPrice < 0){
                System.out.println("Invalid price!");
            }else {
                sumWithoutTax += currentPrice;
            }
            input = scanner.nextLine();

        }
        if (sumWithoutTax == 0){
            System.out.println("Invalid order!");
            return;
        }else {
            double tax = sumWithoutTax * 0.20;
            double totalSum = tax + sumWithoutTax;
            if (input.equals("special")) {
                totalSum = totalSum * 0.90;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$%n",tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);
        }
    }
}
